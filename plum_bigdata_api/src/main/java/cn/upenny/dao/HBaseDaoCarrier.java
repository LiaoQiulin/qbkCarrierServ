package cn.upenny.dao;


import cn.upenny.bean.CarriersInsertBean;
import cn.upenny.bean.CarriersQueryParams;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by SEELE on 2017/1/13.
 */
public class HBaseDaoCarrier {




    public HBaseDaoCarrier() {

    }




    public static boolean createTable(String name){
        TableOperationImp dao  = new TableOperationImp();
        try {
            dao.createTable(name);
            return true;
        } catch (IOException e) {
            return false;
        }
    }



    /**
     *
     * @param tableName 要插入的表名
     * @param bean  值
     */
    public static void save(String tableName, CarriersInsertBean bean){

        String rowKey = HBaseDaoUtil.carrierKeyBuild(bean.getUserId(),bean.getTimeStamp());
        TableOperationImp dao  = new TableOperationImp();
        dao.apend(tableName,HBaseDaoUtil.buildPut(rowKey,bean.getColumnsValues()));
    }


    /**
     *
     * @param tableName table
     * @param params 查询的参数
     * @return
     */
    public static HashMap<String,String> getResult(String tableName, CarriersQueryParams params){
        String rowKey = HBaseDaoUtil.carrierKeyBuild(params.getUserId(),params.getTimeStamp());
        TableOperationImp dao  = new TableOperationImp();
        Result result = dao.getResultByKey(tableName, rowKey, TableOperationImp.DEFAULT_CF1,params.getColumes());
        if(result==null){
            return null;
        }
        HashMap<String,String> map = new HashMap<String,String> ();
        for (Cell cell :
                result.rawCells()) {
            map.put(Bytes.toString(CellUtil.cloneQualifier(cell)),Bytes.toString(CellUtil.cloneValue(cell)));
        }
        return map;
    }



}
