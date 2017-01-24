package cn.upenny.hbase;

/**
 * Created by Administrator on 2016/12/27.
 */
public abstract interface TableOperatoin
{
    public abstract void init();

    public abstract void process();

    public abstract void close();

    public abstract void operate();
}