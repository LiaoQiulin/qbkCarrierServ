package cn.upenny.dao;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.List;

/**
 * Created by Kleene on 2017/1/5.
 *
 *
 *
 */
public class TableOperationImp {
    private static String mZkList = "192.168.1.53,192.168.1.52,192.168.1.49";//默认值, 用之前建议重新赋值, static变量赋值一次即可
    private static String mZkPort= "24002";//同上(mZkList)

    private static Configuration mConf ;
    public final static String DEFAULT_CF1 = "basic_info";
    /**
     * 多个客户端线程共用一个 mConn
     */
    private static Connection mConn;

    public TableOperationImp() {
    }
    static {
        try {
            mConf = HBaseConfiguration.create();
            mConf.set("hbase.zookeeper.quorum", mZkList);
            mConf.set("hbase.zookeeper.property.clientPort",mZkPort);
            mConn = ConnectionFactory.createConnection(mConf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置zookeeper地址
     * @param zkList 例如:"192.168.1.53,192.168.1.52,192.168.1.49"
     * @param zkPort 例如:"24002"
     */
    public static void setZookeeper(String zkList, String zkPort){
        mConf = HBaseConfiguration.create();
        mZkList = zkList;
        mZkPort = zkPort;
        mConf.set("hbase.zookeeper.quorum", mZkList);
        mConf.set("hbase.zookeeper.property.clientPort",mZkPort);
        try {
            mConn = ConnectionFactory.createConnection(mConf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //--------------DDL-------------------

    /**
     *
     * @param name
     * @param family
     * @throws IOException
     */
    public void createTable(String name, String family) throws IOException {
        TableName tableName = TableName.valueOf(name);
        HTableDescriptor hTableDescriptor = new HTableDescriptor(tableName);
        HColumnDescriptor hColumnDescriptor = new HColumnDescriptor(family);
        hTableDescriptor.addFamily(hColumnDescriptor);
        byte[][] splitKey = {
                Bytes.toBytes("3"),
                Bytes.toBytes("6"),
                Bytes.toBytes("9"),
                Bytes.toBytes("B"),
                Bytes.toBytes("H"),
                Bytes.toBytes("S"),
                Bytes.toBytes("a"),
                Bytes.toBytes("j"),
                Bytes.toBytes("t")
        };
        Admin admin = mConn.getAdmin();
        if (!admin.tableExists(tableName)){
            admin.createTable(hTableDescriptor,splitKey);
            closeAdmin(admin);
        }
    }

    /**
     * 创建表
     * @param name tableName
     * @throws IOException  创建表失败, 原因:可能表已经存在, 或其他原因
     */
    public void createTable(String name) throws IOException {
        createTable(name,DEFAULT_CF1);
    }

    /**
     * 删除表
     * @param name
     * @throws IOException
     */
    public void dropTable(String name) throws IOException {
        TableName tableName = TableName.valueOf(name);
        Admin admin = null;
        try{
            admin = mConn.getAdmin();
            if (admin.tableExists(tableName)){
                admin.disableTable(tableName);
                admin.deleteTable(tableName);
            }
        }finally {
            closeAdmin(admin);
        }
    }

    //------------DML--------------------------

    /**
     *
     * @param tableName
     * @param put
     */
    public void apend(String tableName, Put put) {
        Table table = null;
        try {
            table = mConn.getTable(TableName.valueOf(tableName));
            table.put(put);
        } catch (Exception e) {
            e.printStackTrace() ;
        }finally{
            closeTable(table);
        }
    }

    /**
     *
     * @param tableName
     * @param puts
     */
    public void apend(String tableName, List<Put> puts){
        Table table = null;
        try {
            table = mConn.getTable(TableName.valueOf(tableName));
            table.put(puts);
        } catch (Exception e) {
            e.printStackTrace() ;
        }finally{
            closeTable(table);
        }
    }

    /**
     *
     * @param tableName
     * @param rowKey
     * @param family
     * @param quailifer
     * @param value
     */
    public void apend(String tableName, String rowKey, String family,
                      String quailifer, String value){

        Put put = new Put(s2Bytes(rowKey));
        put.addColumn(s2Bytes(family),s2Bytes(quailifer),s2Bytes(value));
        apend(tableName,put);
    }

    /**
     *
     * @param tableName
     * @param delete
     */
    public void delete(String tableName, Delete delete){
        Table table = null;
        try {
            table = mConn.getTable(TableName.valueOf(tableName));
            table.delete(delete);
        } catch (Exception e) {
            e.printStackTrace() ;
        }finally{
            closeTable(table);
        }
    }

    /**
     *
     * @param tableName
     * @param rowKey
     * @param family
     * @param quailifer
     */
    public void delete(String tableName, String rowKey, String family,
                       String quailifer){
        Delete delete = new Delete(s2Bytes(rowKey));
        delete.addColumn(s2Bytes(family),s2Bytes(quailifer));
        delete(tableName,delete);
    }

    /**
     *
     * @param tableName
     * @param get
     * @return result
    for (Cell cell : result.rawCells()) {
    String rowKey = Bytes.toString(CellUtil.cloneRow(cell));
    String family = Bytes.toString(CellUtil.cloneFamily(cell));
    String qualifier = Bytes.toString(CellUtil.cloneQualifier(cell));
    String value = Bytes.toString(CellUtil.cloneValue(cell));
    }
     */
    public Result query(String tableName,Get get){
        Table table = null;
        try {
            table = mConn.getTable(TableName.valueOf(tableName));
            Result result = table.get(get);

            if (result==null){
                return null;
            }else {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace() ;
        }finally{
            closeTable(table);
        }
        return null;
    }
    /**
     *
     * @param tableName
     * @param rowKey
     * @param family
     * @return
     */
    public Result query(String tableName, String rowKey, String family){
        Get get = new Get(s2Bytes(rowKey));
        get.addFamily(s2Bytes(family));
        return query(tableName, get);
    }

    /**
     *
     * @param tableName
     * @param rowKey
     * @param family
     * @param qualifiers
     * @return
     */
    public Result query(String tableName, String rowKey, String family, List<String> qualifiers){
        Get get = new Get(s2Bytes(rowKey));
        for (String qualifier :
                qualifiers) {
            if(qualifier!=null){
                get.addColumn(s2Bytes(family), s2Bytes(qualifier));
            }
        }
        get.addFamily(s2Bytes(family));
        return query(tableName, get);
    }

    /**
     *
     * @param tableName
     * @param scan
     * @return scanner
    for (Result result = scanner.next(); result != null; result = scanner.next()) {
    for (Cell cell:result.rawCells()) {
    String rowKey = Bytes.toString(CellUtil.cloneRow(cell));
    String family = Bytes.toString(CellUtil.cloneFamily(cell));
    String qualifier = Bytes.toString(CellUtil.cloneQualifier(cell));
    String value = Bytes.toString(CellUtil.cloneValue(cell));
    }
    }
     */
    public ResultScanner queries(String tableName, Scan scan){
        Table table = null;
        ResultScanner scanner = null;
        try {
            table = mConn.getTable(TableName.valueOf(tableName));
            scan.setCaching(1000);
            scanner = table.getScanner(scan);
            if (scanner==null){
                return null;
            }else {
                return scanner;
            }
        } catch (Exception e) {
            e.printStackTrace() ;
        }finally{
            closeTable(table);
        }
        return null;
    }

    /**
     *
     * @param tableName
     * @param startRow
     * @param stopRow
     * @return
     */
    public ResultScanner queries(String tableName, String startRow,String stopRow){
        Scan scan = new Scan();
        scan.setStartRow(s2Bytes(startRow));
        scan.setStopRow(s2Bytes(stopRow));
        return queries(tableName, scan);
    }



    /**
     * 查询结果
     * @param strTableName
     * @param rowKey
     * @param columns 需要查取得列, 必须填!
     * @return null或者Result
     */
    public Result getResultByKey(String strTableName, String rowKey,String family, List<String> columns){
        Table table = null;
        Result result = null;
        try {
            table = mConn.getTable(TableName.valueOf(strTableName));
            Get get = new Get(s2Bytes(rowKey));
            for (String column :
                    columns) {
                get.addColumn(s2Bytes(family), s2Bytes(column));
            }
            result = table.get(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  result;
    }

    private void closeAdmin(Admin admin) {
        if (admin!=null){
            try {
                admin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeTable(Table table) {
        if (table!=null){
            try {
                table.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private byte[] s2Bytes(String s){
        if(s==null){
            System.out.println("-------------s2Bytes--------------");
            return "".getBytes();
        }else {
            return Bytes.toBytes(s);
        }
    }






}
