package cn.upenny.entity;

/**
 * Created by SEELE on 2017/1/11.
 */
public class CarrierAsk {

    /**
     *{"mobile":"18668122978","name":"袁冬","idcard":"371428198709024034","timestamp":1484031744508,"result":true,"message":"aX92rOy5T05K%2BfKzoM6ZokYjXQ%2BgwMhda6vzI89N%2BEgvgPhkGZqkigFGMZhvZTdw2DCmWoQGfakTpg5ulIU9rODoyKsbtZpEjfFg13hM5w3g466H4fCrxuvDQyVHymhlCbjJ1Lbr2PkCGLgjRDxXXmc%2BROacQh81","task_id":"9f626130-d702-11e6-b940-00163e0cb266","user_id":"1111"}
     *
     * mobile : 18668122978
     * name : 袁冬
     * idcard : 371428198709024034
     * timestamp : 1484031744508
     * result : true
     * message : aX92rOy5T05K%2BfKzoM6ZokYjXQ%2BgwMhda6vzI89N%2BEgvgPhkGZqkigFGMZhvZTdw2DCmWoQGfakTpg5ulIU9rODoyKsbtZpEjfFg13hM5w3g466H4fCrxuvDQyVHymhlCbjJ1Lbr2PkCGLgjRDxXXmc%2BROacQh81
     * task_id : 9f626130-d702-11e6-b940-00163e0cb266
     * user_id : 1111
     */

    private String mobile;
    private String name;
    private String idcard;
    private long timestamp;
    private boolean result;
    private String message;
    private String task_id;
    private String user_id;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
