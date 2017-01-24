package cn.upenny.dao;

import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

import java.util.Map;
import java.util.Set;

/**
 * Created by Kleene on 2017/1/5.
 */
public class HBaseDaoUtil {
    /**
     *
     * @param rowKey
     * @param map<key,value>  key列名, value值
     * @return
     */
    public static Put buildPut(String rowKey, Map<String, String> map){
        Put put = new Put(Bytes.toBytes(rowKey));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:
                entries) {
            if(entry.getValue()!=null){
                put.addColumn(Bytes.toBytes(TableOperationImp.DEFAULT_CF1),Bytes.toBytes
                        (entry.getKey()),Bytes.toBytes(entry.getValue()));
            }else {
                System.out.println("nullValueKey----------"+entry.getKey());
            }
        }
        return put;
    }

    public static String carrierKeyBuild(String id,String time){
        return id+"-"+time;
    }



}
