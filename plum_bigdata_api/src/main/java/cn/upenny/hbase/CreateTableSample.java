package cn.upenny.hbase;

/**
 * Created by Administrator on 2016/12/27.
 */
import java.io.IOException;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.log4j.Logger;

public class CreateTableSample extends TableOperationImpl
{
    Logger LOG = Logger.getLogger(ConfigurationSample.class);

    public void process()
    {
        TableName tableName = TableName.valueOf("lhg_user_info");
        HTableDescriptor htd = new HTableDescriptor(tableName);
        HColumnDescriptor hcd = new HColumnDescriptor("lhg_basic_info");
        htd.addFamily(hcd);
        try {
            if (!this.admin.tableExists(tableName)) {
                this.admin.createTable(htd);
                this.LOG.info("Create table " + tableName.getNameAsString() + " successfule!");
            } else {
                this.LOG.warn("Table already exists!");
            }
        } catch (IOException e) {
            this.LOG.error("Failed to create table " + tableName.getNameAsString() + ".", e);
        }
    }
}