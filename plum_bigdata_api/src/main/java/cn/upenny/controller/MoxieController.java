package cn.upenny.controller;

import cn.upenny.entity.CarrierReq;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.eventbus.EventBus;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static cn.upenny.utils.EncryptTool.getMD5;

@Controller
public class MoxieController {

    Logger LOG = Logger.getLogger(MoxieController.class);

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private EventBus eventBus;

    static String tableName = "appli_moxie_carrier_report";
    static String column_reqest = "reqest";
    static String column_response = "response";

    @RequestMapping(value = "/moxie", method = RequestMethod.GET)
    public String index(){

		return "Hello Spring Boot!";
    }


    @RequestMapping(value = "/recevive", method = RequestMethod.POST)
    @ResponseBody
    public void recevive(ServletRequest request, ServletResponse response, @RequestBody CarrierReq carrierReq){

        this.LOG.info("Successfully recevive" +carrierReq);

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;



        try {
//            Object object = objectMapper.readValue(carrierReq,CarrierReq.class);
            eventBus.post(carrierReq);
        } catch (Exception e) {

        }

        writeMessage(httpServletResponse, HttpServletResponse.SC_CREATED, "default eventtype");
    }

    private void writeMessage(HttpServletResponse response, int status, String content) {
        response.setStatus(status);
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.write(content);
        } catch (IOException ignored) {
        }
    }

    @RequestMapping(value = "/recevive2", method = RequestMethod.POST)
    public void recevive2(HttpServletRequest request, @RequestBody CarrierReq carrierReq){




        String rowKey = "";

        //报告生成好了, 收到信息, 并存入Hbase
        String value_req =  null;//IOUtils.toString("", "utf-8");

        String idcard = carrierReq.getIdcard();
        String md5 = getMD5(idcard);
        String substring = md5.substring(0, 1);//散列化
        rowKey = substring + idcard;

//        HBaseDaoWrapper dao = new HBaseDaoWrapper();
//        dao.saveCell(tableName,rowKey,column_reqest,value_req);

        //根据信息, 主动请求report, 收到report,存入Hbase



        String strReport = "";
//        HBaseDaoWrapper dao1 = new HBaseDaoWrapper();
//        dao.saveCell(tableName,rowKey,column_response,strReport);



    }



}
