package cn.upenny.dao;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SEELE on 2017/1/13.
 */
public class HBaseDaoWrapper {




    public HBaseDaoWrapper() {

    }




    /**
     *
     * @param tableName 要插入的表名
     * @param rowKey    key
     * @param columnsValues key代表列名, value代表key对应的值
     */
    public static void save(String tableName, String rowKey, Map<String,
            String >
            columnsValues){
        TableOperationImp dao  = new TableOperationImp();
        dao.apend(tableName,HBaseDaoUtil.buildPut(rowKey,columnsValues));
    }

    /**
     *
     * @param tableName  table
     * @param rowKey    key
     * @param columns   要查找的列, 不能为空
     * @return 如果有值都在map里
     */
    public HashMap<String,String> getResult(String tableName, String rowKey, List<String> columns){
        TableOperationImp dao  = new TableOperationImp();
        Result result = dao.getResultByKey(tableName, rowKey,
                TableOperationImp.DEFAULT_CF1,columns);
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
