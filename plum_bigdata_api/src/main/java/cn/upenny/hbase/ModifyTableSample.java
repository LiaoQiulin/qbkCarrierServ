package cn.upenny.hbase;

/**
 * Created by Administrator on 2016/12/29.
 */
import java.io.IOException;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;

public class ModifyTableSample extends TableOperationImpl
{
    Logger LOG = Logger.getLogger(ConfigurationSample.class);

    public void process()
    {
        TableName tableName = TableName.valueOf("lhg_user_info");
        byte[] familyName = Bytes.toBytes("lhg_job_info");
        try {
            HTableDescriptor htd = this.admin.getTableDescriptor(tableName);
            if (!htd.hasFamily(familyName)) {
                HColumnDescriptor hcd = new HColumnDescriptor(familyName);
                htd.addFamily(hcd);
                this.admin.disableTable(tableName);
                this.admin.modifyTable(tableName, htd);
                this.admin.enableTable(tableName);
                this.LOG.info("Modify table " + tableName.getNameAsString() + " successful!");
            }
        } catch (IOException e) {
            this.LOG.error("Failed to modify table " + tableName.getNameAsString() + "!", e);
        }
    }
}