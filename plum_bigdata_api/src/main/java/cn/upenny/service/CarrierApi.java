package cn.upenny.service;

import cn.upenny.entity.CarrierReport;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by user on 17/1/22.
 */
public interface CarrierApi {

    /*
    mobile	string	path	申请人的手机号
    name	string	query	申请人的姓名
    idcard	string	query	申请人的证件号码
    task_id	string	query	创建任务时，魔蝎平台返回的唯一标识
    contact	string	query	指定联系人号码，以‘,’分隔
    */
    @GET("/carrier/v3/mobiles/{mobile}/report")
    Call<CarrierReport> getCarrierReport(@Path("mobile") String mobile,@Query("name") String name,@Query("idcard") String idcard,@Query("task_id") String task_id,@Query("contact") String contact);


}
