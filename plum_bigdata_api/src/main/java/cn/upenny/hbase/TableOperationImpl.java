package cn.upenny.hbase;

/**
 * Created by Administrator on 2016/12/27.
 */

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public abstract class TableOperationImpl
        implements TableOperatoin
{
    public Configuration conf = null;
    public Connection conn = null;
    public Admin admin = null;

    public TableOperationImpl() {
        init();
    }

    public void init() {
        this.conf = ConfigurationSample.getConfiguration();
        try {
            this.conn = ConnectionFactory.createConnection();
            this.admin = this.conn.getAdmin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init1()
    {
    }

    public void close() {
        if (this.admin != null) {
            try {
                this.admin.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                this.admin = null;
            }
        }
        if (this.conn != null)
            try {
                this.conn.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                this.conn = null;
            }
    }

    public void operate()
    {
        process();
        close();
    }
}