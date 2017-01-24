package cn.upenny.bean;

import java.util.HashMap;

/**
 * Created by user on 17/1/23.
 */
public class CarriersInsertBean {
    private String userId;

    private String timeStamp;

    private HashMap<String,String> columnsValues;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public HashMap<String, String> getColumnsValues() {
        return columnsValues;
    }

    public void setColumnsValues(HashMap<String, String> columnsValues) {
        this.columnsValues = columnsValues;
    }

    public CarriersInsertBean() {
    }

    public CarriersInsertBean(String userId, String timeStamp, HashMap<String, String> columnsValues) {

        this.userId = userId;
        this.timeStamp = timeStamp;
        this.columnsValues = columnsValues;
    }
}
