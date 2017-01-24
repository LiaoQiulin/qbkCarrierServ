package cn.upenny.bean;

import java.util.ArrayList;

/**
 * Created by user on 17/1/23.
 */
public class CarriersQueryParams {


    private String userId;
    /**
     * 时间戳
     */
    private String timeStamp;
    /**
     * 要查询的列名字
     */
    private ArrayList<String> columes;


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

    public ArrayList<String> getColumes() {
        return columes;
    }

    public void setColumes(ArrayList<String> columes) {
        this.columes = columes;
    }

    public CarriersQueryParams() {
    }

    public CarriersQueryParams(String userId, String timeStamp, ArrayList<String> columes) {

        this.userId = userId;
        this.timeStamp = timeStamp;
        this.columes = columes;
    }


}
