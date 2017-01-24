package cn.upenny.service;

import cn.upenny.api.CarrierClient;
import cn.upenny.entity.CarrierReport;
import cn.upenny.entity.CarrierReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by user on 17/1/22.
 */
@Service
public class CarrierService {


    @Autowired
    private CarrierClient carrierClient;


    public CarrierReport getCarrierReport(CarrierReq carrierReq) throws IOException {



        return carrierClient.getCarrierReport(carrierReq.getMobile(),carrierReq.getName(),carrierReq.getIdcard(),carrierReq.getTask_id(),"");



    }
}
