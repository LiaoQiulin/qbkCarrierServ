package cn.upenny.entity;

import java.util.HashMap;

/**
 * Created by LiaoQiulin on 2017/1/23.
 */
public class ReportRecord {
    private String userId;
    private String taskId;
    private HashMap<String,String> columsValues;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ReportRecord() {
        columsValues = new HashMap<>();
    }

    public void putColumnValue(String k, String v){
        columsValues.put(k,v);
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public HashMap<String, String> getColumsValues() {
        return columsValues;
    }

    public void setColumsValues(HashMap<String, String> columsValues) {
        this.columsValues = columsValues;
    }
}
