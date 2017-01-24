package cn.upenny.api;

import cn.upenny.entity.CarrierReport;
import cn.upenny.service.CarrierApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by user on 17/1/22.
 */
@Component
public class CarrierClient extends MoxieClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarrierClient.class);


    private CarrierApi api;

    @Autowired
    public CarrierClient(@Value("${moxie.api.baseUrl}") String apiBaseUrl, @Value("${moxie.api.token}") String apiToken) {
        super(apiBaseUrl, apiToken);
        api = retrofit.create(CarrierApi.class);
    }



    public CarrierReport getCarrierReport(String mobile, String name, String idcard, String task_id,  String contact) throws IOException {
        Call<CarrierReport> call = api.getCarrierReport(mobile,name,idcard,task_id,contact);
        Response<CarrierReport> response = call.execute();
        if (response.code() == 200) {
            return response.body();
        } else {
            LOGGER.info("getCarrierReport, status:{}, message:{}", response.code(), response.message());
        }
        return null;
    }




}
