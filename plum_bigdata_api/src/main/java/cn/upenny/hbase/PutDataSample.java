package cn.upenny.hbase;

/**
 * Created by Administrator on 2016/12/29.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;

public class PutDataSample extends TableOperationImpl
{
    Logger LOG = Logger.getLogger(ConfigurationSample.class);

    public void process()
    {
        TableName tableName = TableName.valueOf("lhg_user_info");
        byte[] familyName = Bytes.toBytes("lhg_basic_info");

        byte[][] basicQualifiers = { Bytes.toBytes("name"),
                Bytes.toBytes("gender"),
                Bytes.toBytes("age"),
                Bytes.toBytes("address") };

        Table table = null;
        try
        {
            table = this.conn.getTable(tableName);
            List puts = new ArrayList();

            Put put = new Put(Bytes.toBytes("A0001001"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Zhang San"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Male"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(19L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Shenzhen, Guangdong"));
            puts.add(put);

            put = new Put(Bytes.toBytes("A0001002"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Li Wanting"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Female"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(23L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Shijiazhuang, Hebei"));
            puts.add(put);

            put = new Put(Bytes.toBytes("B0001001"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Wang Ming"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Male"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(26L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Ningbo, Zhejiang"));
            puts.add(put);

            put = new Put(Bytes.toBytes("B0001002"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Li Gang"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Male"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(18L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Xiangyang, Hubei"));
            puts.add(put);

            put = new Put(Bytes.toBytes("C0001001"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Zhao Enru"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Female"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(21L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Shangrao, Jiangxi"));
            puts.add(put);

            put = new Put(Bytes.toBytes("C0001003"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Chen Long"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Male"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(32L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Zhuzhou, hunan"));
            puts.add(put);

            put = new Put(Bytes.toBytes("H0001001"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Zhou wei"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Female"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(29L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Nanyang, Henan"));
            puts.add(put);

            put = new Put(Bytes.toBytes("J0001001"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Yang Yiwen"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Female"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(30L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Kaixian, Chongqing"));
            puts.add(put);

            put = new Put(Bytes.toBytes("K0001001"));
            put.addColumn(familyName, basicQualifiers[0], Bytes.toBytes("Xu Bing"));
            put.addColumn(familyName, basicQualifiers[1], Bytes.toBytes("Male"));
            put.addColumn(familyName, basicQualifiers[2], Bytes.toBytes(new Long(26L).longValue()));
            put.addColumn(familyName, basicQualifiers[3], Bytes.toBytes("Weinan, Shaanxi"));
            puts.add(put);

            table.put(puts);
            this.LOG.info("Successfully put 9 items data into table" + tableName.getNameAsString() + ".");
        } catch (IOException e) {
            this.LOG.error("Failed to put data into table " + tableName.getNameAsString() + ".", e);
        } finally {
            if (table != null)
                try {
                    table.close();
                } catch (IOException e) {
                    table = null;
                }
        }
    }
}