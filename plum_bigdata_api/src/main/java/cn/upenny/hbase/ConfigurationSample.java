package cn.upenny.hbase;

/**
 * Created by Administrator on 2016/12/27.
 */

import java.io.File;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;

public class ConfigurationSample
{
    private static Configuration innerConf = null;

    public static Configuration getConfiguration()
    {
        if (innerConf == null) {
            init();
        }
        return innerConf;
    }

    public static void init()
    {
        innerConf = HBaseConfiguration.create();
        String confDir = System.getProperty("user.dir") + File.separator + "conf";
//        innerConf.addResource(confDir + File.separator + "hbase-site.xml");
//        innerConf.addResource(confDir + File.separator + "core-site.xml");
//        innerConf.addResource(confDir + File.separator + "hdfs-site.xml");
    }
}