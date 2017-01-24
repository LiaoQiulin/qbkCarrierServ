package cn.upenny.listener;

import cn.upenny.dao.CarrierTableOperate;
import cn.upenny.entity.CarrierReport;
import cn.upenny.entity.CarrierReq;
import cn.upenny.service.CarrierService;
import com.google.common.eventbus.Subscribe;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by user on 17/1/20.
 */
@Component
public class EventListener {

    Logger LOG = Logger.getLogger(EventListener.class);

    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    @Subscribe
    public void carrierListener(CarrierReq carrierReq) {


        try{
            testhttp(carrierReq);
        }catch (Exception e){

        }


    }



    @Async("mySimpleAsync")
    public void testhttp(CarrierReq carrierReq)throws Exception{

        this.LOG.info("Successfully carrierListener" );

        LOG.info("Task2 started.");





        try {




            // 1   得到请求   json    ask
//            String ask = "";
//        CarrierReq CarrierReq = JsonTool.fromJson(ask, CarrierReq.class);
            String rowKey = Long.MAX_VALUE-Integer.valueOf(carrierReq
                    .getUser_id())+"---"
                    +carrierReq
                    .getTask_id();
            CarrierTableOperate.apend("appli_moxie_carrier_report",rowKey,carrierReq);



            CarrierService carrierService = (CarrierService)applicationContext.getBean("carrierService");

            //2 请求报告, 得到    json report
//            String report = "";
            CarrierReport carrierReport =  carrierService.getCarrierReport(carrierReq);

            CarrierTableOperate.apend("appli_moxie_carrier_report",rowKey,carrierReport);


        } catch (Exception e) {
            e.printStackTrace();
        }


        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();

        LOG.info("Task2 finished, time elapsed: {} ms.");

    }



    @Async("mySimpleAsync")
    public void testhttp1()throws Exception{

        this.LOG.info("Successfully carrierListener" );

        LOG.info("Task2 started.");


        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();

        LOG.info("Task2 finished, time elapsed: {} ms.");

    }

}
