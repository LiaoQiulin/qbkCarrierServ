package cn.upenny.dao;

import cn.upenny.entity.CarrierReport;
import cn.upenny.entity.CarrierReq;
import cn.upenny.entity.ReportRecord;
import cn.upenny.utils.JsonTool;
import org.apache.commons.collections.map.HashedMap;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.BinaryPrefixComparator;
import org.apache.hadoop.hbase.filter.CompareFilter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.RowFilter;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by LiaoQiulin on 2017/1/19.
 */
public class CarrierTableOperate {

    /*
    //----------------------使用说明-----------------------------------
    public static void main(String[] args) {
        // 1   得到请求   json    ask
        String ask = "";
        CarrierReq carrierAsk = JsonTool.fromJson(ask, CarrierReq.class);
        String rowKey = carrierAsk.getTask_id();
        apend("appli_moxie_carrier_report",rowKey,carrierAsk);



        //2 请求报告, 得到    json report
        String report = "";
        CarrierReport carrierReport = JsonTool.fromJson(report, CarrierReport.class);

        apend("appli_moxie_carrier_report",rowKey,carrierReport);

    }
    */

    /**
     *
     * @param tableName table
     * @param userId userId
     * @return result
     */
    public static ArrayList<ReportRecord> query(String tableName, String
            userId) {
        ArrayList<ReportRecord> records = new ArrayList<ReportRecord>();

        Long hbaseUserId = Long.MAX_VALUE - Integer.valueOf(userId);

        Scan scan = new Scan();
        ResultScanner resultScanner = null;
        FilterList filterList = new FilterList(FilterList.Operator.MUST_PASS_ALL);
        BinaryPrefixComparator prefixComparator = new BinaryPrefixComparator(Bytes.toBytes(hbaseUserId.toString()));
        RowFilter rowFilter = new RowFilter(CompareFilter.CompareOp.EQUAL, prefixComparator);
        filterList.addFilter(rowFilter);
        scan.setFilter(filterList);

        try {

            TableOperationImp tableOperationImp = new TableOperationImp();
            resultScanner = tableOperationImp.queries(tableName, scan);
            for (Result result = resultScanner.next(); result != null; result = resultScanner.next()) {

                ReportRecord record = new ReportRecord();

                for (Cell cell : result.rawCells()) {
                    String rowkey = Bytes.toString(CellUtil.cloneRow(cell));
                    String qualifier = Bytes.toString(CellUtil.cloneQualifier(cell));
                    String value = Bytes.toString(CellUtil.cloneValue(cell));

                    if ("ask_user_id".equals(qualifier)){
                        record.setUserId(value);
                    }
                    if("ask_user_id".equals(qualifier)){
                        record.setTaskId(value);
                    }

                    record.putColumnValue(qualifier,value);


                }

                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    public static void apend(String tableName, String rowKey, CarrierReq
            carrierAsk) {

        HashedMap map = new HashedMap();
        map.put("ask_mobile", carrierAsk.getMobile());
        map.put("ask_name", carrierAsk.getName());
        map.put("ask_idcard", carrierAsk.getIdcard());
        map.put("ask_timestamp", String.valueOf(carrierAsk.getTimestamp()));
        map.put("ask_result", String.valueOf(carrierAsk.isResult()));
        map.put("ask_message", carrierAsk.getMessage());
        map.put("ask_task_id", carrierAsk.getTask_id());
        map.put("ask_user_id", carrierAsk.getUser_id());
        //存入 HBase
        HBaseDaoWrapper.save(tableName, rowKey, map);

    }

    public static void apend(String tableName, String rowKey, CarrierReport carrierReport) {
        HashedMap map = new HashedMap();

        if (carrierReport != null) {
            map.put("code", carrierReport.getCode());
            map.put("message", carrierReport.getMessage());
            map.put("update_time", carrierReport.getUpdate_time());

            if (carrierReport.getUser_basic_info() != null) {
                map.put("user_basic_info_name", carrierReport
                        .getUser_basic_info().getName());
                map.put("user_basic_info_idcard", carrierReport
                        .getUser_basic_info().getIdcard());
                map.put("user_basic_info_mobile", carrierReport
                        .getUser_basic_info().getMobile());
                map.put("user_basic_info_gender", carrierReport
                        .getUser_basic_info().getGender());
                map.put("user_basic_info_age", carrierReport
                        .getUser_basic_info().getAge());
                map.put("user_basic_info_constellation", carrierReport
                        .getUser_basic_info().getConstellation());
                map.put("user_basic_info_email", carrierReport
                        .getUser_basic_info().getEmail());
                map.put("user_basic_info_address", carrierReport
                        .getUser_basic_info().getAddress());
                map.put("user_basic_info_name_from_custom", carrierReport
                        .getUser_basic_info().getName_from_custom());
                map.put("user_basic_info_native_place", carrierReport
                        .getUser_basic_info().getNative_place());
                map.put("user_basic_info_live_address", carrierReport
                        .getUser_basic_info().getLive_address());
                map.put("user_basic_info_work_address", carrierReport
                        .getUser_basic_info().getWork_address());
            }
            if (carrierReport.getData_source() != null) {
                map.put("data_source_source_name", carrierReport
                        .getData_source().getSource_name());
                map.put("data_source_data_type", carrierReport.getData_source
                        ().getData_type());
                map.put("data_source_data_gain_time", carrierReport
                        .getData_source().getData_gain_time());
            }
            List<CarrierReport.BasicInfoCheckItemsBean> basic_info_check_items = carrierReport.getBasic_info_check_items();
            if (basic_info_check_items != null) {
                for (CarrierReport.BasicInfoCheckItemsBean item :
                        basic_info_check_items) {
                    String check_item = item.getCheck_item();
                    if ("idcard_check".equals(check_item)) {
                        map.put("basic_info_check_items_idcard_check",
                                item.getResult());
                    } else if ("email_check".equals(check_item)) {
                        map.put("basic_info_check_items_email_check", item.getResult());
                    } else if ("address_check".equals(check_item)) {
                        map.put("basic_info_check_items_address_check", item.getResult());
                    } else if ("idcard_match".equals(check_item)) {
                        map.put("basic_info_check_items_idcard_match", item.getResult());
                    } else if ("name_match".equals(check_item)) {
                        map.put("basic_info_check_items_name_match", item.getResult());
                    }

                }
            }
            CarrierReport.FriendCircleBean friend_circle = carrierReport.getFriend_circle();
            if (friend_circle != null) {
                map.put("friend_circle_friend_num_3m", friend_circle
                        .getFriend_num_3m());
                map.put("friend_circle_good_friend_num_3m", friend_circle
                        .getGood_friend_num_3m());
                map.put("friend_circle_friend_city_center_3m", friend_circle
                        .getFriend_city_center_3m());
                map.put("friend_circle_is_city_match_friend_city_center_3m", friend_circle
                        .getIs_city_match_friend_city_center_3m());
                map.put("friend_circle_inter_peer_num_3m", friend_circle.getInter_peer_num_3m());
                map.put("friend_circle_friend_num_6m", friend_circle
                        .getFriend_num_6m());
                map.put("friend_circle_good_friend_num_6m", friend_circle.getGood_friend_num_6m
                        ());
                map.put("friend_circle_is_city_match_friend_city_center_6m",
                        friend_circle.getIs_city_match_friend_city_center_6m());
                map.put("friend_circle_inter_peer_num_6m", friend_circle.getInter_peer_num_6m());
                map.put("friend_circle_call_num_top3_3m", JsonTool.toJson(friend_circle
                        .getCall_num_top3_3m()));
                map.put("friend_circle_call_num_top3_6m", JsonTool.toJson(friend_circle
                        .getCall_num_top3_6m()));
                map.put("friend_circle_call_location_top3_3m", JsonTool
                        .toJson(friend_circle
                                .getCall_location_top3_3m()));
                map.put("friend_circle_call_location_top3_6m", JsonTool
                        .toJson(friend_circle
                                .getCall_location_top3_6m()));
                map.put("friend_circle_designated_contact", JsonTool
                        .toJson(friend_circle
                                .getDesignated_contact()));
                CarrierReport.FriendCircleBean.RiskAnalysisBean risk_analysis = friend_circle.getRisk_analysis();
                if (risk_analysis != null) {
                    map.put("friend_circle_risk_analysis_in_time",
                            risk_analysis.getIn_time());
                    map.put("friend_circle_risk_analysis_mobile_silence_3m",
                            risk_analysis.getMobile_silence_3m());
                    map.put("friend_circle_risk_analysis_arrearage_risk_3m",
                            risk_analysis.getArrearage_risk_3m());
                    map.put("friend_circle_risk_analysis_binding_risk",
                            risk_analysis.getBinding_risk());
                    map.put("friend_circle_risk_analysis_mobile_silence_6m",
                            risk_analysis.getMobile_silence_6m());
                    map.put("friend_circle_risk_analysis_arrearage_risk_6m",
                            risk_analysis.getArrearage_risk_6m());
                    map.put("friend_circle_risk_analysis_is_name_and_idcard_in_court_black", risk_analysis.getIs_name_and_idcard_in_court_black());
                    map.put("friend_circle_risk_analysis_is_name_and_idcard_in_finance_black", risk_analysis.getIs_name_and_idcard_in_finance_black());
                    map.put("friend_circle_risk_analysis_is_name_and_mobile_in_finance_black", risk_analysis.getIs_name_and_mobile_in_finance_black());

                    List<CarrierReport.FriendCircleBean.RiskAnalysisBean.RiskCheckItemBean> risk_check_item = risk_analysis.getRisk_check_item();
                    if (risk_check_item != null) {
                        for (CarrierReport.FriendCircleBean.RiskAnalysisBean
                                .RiskCheckItemBean itemBean :
                                risk_check_item) {
                            map.put("friend_circle_risk_analysis_" + itemBean
                                    .getItem()
                                    + "_call_num_3m", itemBean
                                    .getCall_num_3m());
                            map.put("friend_circle_risk_analysis_" + itemBean
                                    .getItem()
                                    + "_call_time_3m", itemBean
                                    .getCall_time_3m());
                            map.put("friend_circle_risk_analysis_" + itemBean
                                    .getItem()
                                    + "_call_num_6m", itemBean
                                    .getCall_num_6m());
                            map.put("friend_circle_risk_analysis_" + itemBean
                                    .getItem()
                                    + "_call_time_6m", itemBean
                                    .getCall_time_6m());
                        }
                    }
                }
                CarrierReport.FriendCircleBean.ActiveDegreeBean active_degree = friend_circle.getActive_degree();
                if (active_degree != null) {
                    map.put("friend_circle_active_degree_call_day_3m",
                            active_degree.getCall_day_3m());
                    map.put("friend_circle_active_degree_dial_num_3m",
                            active_degree.getDial_num_3m());
                    map.put("friend_circle_active_degree_dialed_num_3m",
                            active_degree.getDialed_num_3m());
                    map.put("friend_circle_active_degree_dial_duration_3m",
                            active_degree.getDial_duration_3m());
                    map.put("friend_circle_active_degree_dialed_duration_3m",
                            active_degree.getDialed_duration_3m());
                    map.put("friend_circle_active_degree_call_day_6m",
                            active_degree.getCall_day_6m());
                    map.put("friend_circle_active_degree_dial_num_6m",
                            active_degree.getDial_num_6m());
                    map.put("friend_circle_active_degree_dialed_num_6m",
                            active_degree.getDialed_num_6m());
                    map.put("friend_circle_active_degree_dial_duration_6m",
                            active_degree.getDial_duration_6m());
                    map.put("friend_circle_active_degree_dialed_duration_6m",
                            active_degree.getDialed_duration_6m());
                }
                CarrierReport.FriendCircleBean.ConsumptionAnalysisBean consumption_analysis = friend_circle.getConsumption_analysis();
                if (consumption_analysis != null) {
                    map.put("friend_circle_consumption_analysis_total_fee_3m" +
                            "", consumption_analysis.getTotal_fee_3m());
                    map.put("friend_circle_consumption_analysis_total_fee_6m" +
                            "", consumption_analysis.getTotal_fee_6m());
                    map.put
                            ("friend_circle_consumption_analysis_recharge_time_3m", consumption_analysis.getRecharge_time_3m());
                    map.put
                            ("friend_circle_consumption_analysis_recharge_time_6m", consumption_analysis.getRecharge_time_6m());
                    map.put
                            ("friend_circle_consumption_analysis_recharge_max_amount_3m", consumption_analysis.getRecharge_max_amount_3m());
                    map.put
                            ("friend_circle_consumption_analysis_recharge_max_amount_6m", consumption_analysis.getRecharge_max_amount_6m());
                    map.put
                            ("friend_circle_consumption_analysis_bill_latest_certification_day", consumption_analysis.getBill_latest_certification_day());
                    map.put("friend_circle_consumption_analysis_web_fee_1m",
                            consumption_analysis.getWeb_fee_1m());
                    map.put("friend_circle_consumption_analysis_web_fee_3m",
                            consumption_analysis.getWeb_fee_3m());
                    map.put("friend_circle_consumption_analysis_web_fee_6m",
                            consumption_analysis.getWeb_fee_6m());
                    map.put
                            ("friend_circle_consumption_analysis_web_fee_avg_3m", consumption_analysis.getWeb_fee_avg_3m());
                    map.put
                            ("friend_circle_consumption_analysis_web_fee_avg_6m", consumption_analysis.getWeb_fee_avg_6m());
                    map.put("friend_circle_consumption_analysis_sms_fee_1m",
                            consumption_analysis.getSms_fee_1m());
                    map.put("friend_circle_consumption_analysis_sms_fee_3m",
                            consumption_analysis.getSms_fee_3m());
                    map.put("friend_circle_consumption_analysis_sms_fee_6m",
                            consumption_analysis.getSms_fee_6m());
                    map.put
                            ("friend_circle_consumption_analysis_sms_fee_avg_3m", consumption_analysis.getSms_fee_avg_3m());
                    map.put
                            ("friend_circle_consumption_analysis_sms_fee_avg_6m", consumption_analysis.getSms_fee_avg_6m());
                    map.put("friend_circle_consumption_analysis_call_fee_1m",
                            consumption_analysis.getCall_fee_1m());
                    map.put("friend_circle_consumption_analysis_call_fee_3m",
                            consumption_analysis.getCall_fee_3m());
                    map.put("friend_circle_consumption_analysis_call_fee_6m",
                            consumption_analysis.getCall_fee_6m());
                    map.put
                            ("friend_circle_consumption_analysis_call_fee_avg_3m", consumption_analysis.getCall_fee_avg_3m());
                    map.put
                            ("friend_circle_consumption_analysis_call_fee_avg_6m", consumption_analysis.getCall_fee_avg_6m());
                    map.put("friend_circle_consumption_analysis_vas_fee_1m",
                            consumption_analysis.getVas_fee_1m());
                    map.put("friend_circle_consumption_analysis_vas_fee_3m",
                            consumption_analysis.getVas_fee_6m());
                    map.put("friend_circle_consumption_analysis_vas_fee_6m",
                            consumption_analysis.getVas_fee_avg_6m());
                    map.put
                            ("friend_circle_consumption_analysis_vas_fee_avg_3m", consumption_analysis.getVas_fee_avg_3m());
                    map.put
                            ("friend_circle_consumption_analysis_vas_fee_avg_6m", consumption_analysis.getVas_fee_avg_6m());
                }

                map.put("friend_circle_roam_analysis", JsonTool.toJson(friend_circle
                        .getRoam_analysis()));
                CarrierReport.FriendCircleBean.CallAnalysisBean call_analysis = friend_circle.getCall_analysis();
                if (call_analysis != null) {
                    map.put("friend_circle_call_analysis_total_num_1m",
                            call_analysis.getTotal_num_1m());
                    map.put("friend_circle_call_analysis_total_num_3m",
                            call_analysis.getTotal_num_3m());
                    map.put("friend_circle_call_analysis_total_num_6m",
                            call_analysis.getTotal_num_6m());
                    map.put("friend_circle_call_analysis_total_num_avg_3m",
                            call_analysis.getTotal_num_avg_3m());
                    map.put("friend_circle_call_analysis_total_num_avg_6m",
                            call_analysis.getTotal_num_avg_6m());
                    map.put("friend_circle_call_analysis_total_time_1m",
                            call_analysis.getTotal_time_1m());
                    map.put("friend_circle_call_analysis_total_time_3m",
                            call_analysis.getTotal_time_3m());
                    map.put("friend_circle_call_analysis_total_time_6m",
                            call_analysis.getTotal_time_6m());
                    map.put("friend_circle_call_analysis_total_time_avg_3m",
                            call_analysis.getTotal_time_avg_3m());
                    map.put("friend_circle_call_analysis_total_time_avg_6m",
                            call_analysis.getTotal_time_avg_6m());
                    map.put("friend_circle_call_analysis_total_peer_num_1m",
                            call_analysis.getTotal_peer_num_1m());
                    map.put("friend_circle_call_analysis_total_peer_num_3m",
                            call_analysis.getTotal_peer_num_3m());
                    map.put("friend_circle_call_analysis_total_peer_num_6m",
                            call_analysis.getTotal_peer_num_6m());
                    map.put
                            ("friend_circle_call_analysis_total_peer_num_avg_3m", call_analysis.getTotal_peer_num_avg_3m());
                    map.put
                            ("friend_circle_call_analysis_total_peer_num_avg_6m", call_analysis.getTotal_peer_num_avg_6m());
                    map.put("friend_circle_call_analysis_total_city_num_1m",
                            call_analysis.getTotal_city_num_1m());
                    map.put("friend_circle_call_analysis_total_city_num_3m",
                            call_analysis.getTotal_city_num_3m());
                    map.put("friend_circle_call_analysis_total_city_num_6m",
                            call_analysis.getTotal_city_num_6m());
                    map.put
                            ("friend_circle_call_analysis_total_city_num_avg_3m", call_analysis.getTotal_city_num_avg_3m());
                    map.put
                            ("friend_circle_call_analysis_total_city_num_avg_6m", call_analysis.getTotal_city_num_avg_6m());
                    map.put("friend_circle_call_analysis_total_dial_num_1m",
                            call_analysis.getTotal_dial_num_1m());
                    map.put("friend_circle_call_analysis_total_dial_num_3m",
                            call_analysis.getTotal_dial_num_3m());
                    map.put("friend_circle_call_analysis_total_dial_num_6m",
                            call_analysis.getTotal_dial_num_6m());
                    map.put
                            ("friend_circle_call_analysis_total_dial_num_avg_3m", call_analysis.getTotal_dial_num_avg_3m());
                    map.put
                            ("friend_circle_call_analysis_total_dial_num_avg_6m", call_analysis.getTotal_dial_num_avg_6m());
                    map.put("friend_circle_call_analysis_total_dialed_num_1m" +
                            "", call_analysis.getTotal_dialed_num_1m());
                    map.put("friend_circle_call_analysis_total_dialed_num_3m" +
                            "", call_analysis.getTotal_dialed_num_3m());
                    map.put("friend_circle_call_analysis_total_dialed_num_6m" +
                            "", call_analysis.getTotal_dialed_num_6m());
                    map.put
                            ("friend_circle_call_analysis_total_dialed_num_avg_3m", call_analysis.getTotal_dialed_num_avg_3m());
                    map.put
                            ("friend_circle_call_analysis_total_dialed_num_avg_6m", call_analysis.getTotal_dialed_num_avg_6m());
                    map.put
                            ("friend_circle_call_analysis_total_dial_peer_num_1m", call_analysis.getTotal_dialed_peer_num_1m());
                    map.put
                            ("friend_circle_call_analysis_total_dial_peer_num_3m", call_analysis.getTotal_dialed_peer_num_3m());
                    map.put
                            ("friend_circle_call_analysis_total_dial_peer_num_6m", call_analysis.getTotal_dialed_peer_num_6m());
                    map.put
                            ("friend_circle_call_analysis_total_dial_peer_num_avg_3", call_analysis.getTotal_dialed_peer_num_avg_3m());
                    map.put
                            ("friend_circle_call_analysis_total_dial_peer_num_avg_6", call_analysis.getTotal_dialed_peer_num_avg_6m());
                    map.put
                            ("friend_circle_call_analysis_total_dialed_peer_num_1m", call_analysis.getTotal_dialed_peer_num_1m());
                    map.put
                            ("friend_circle_call_analysis_total_dialed_peer_num_3m", call_analysis.getTotal_dialed_peer_num_3m());
                    map.put
                            ("friend_circle_call_analysis_total_dialed_peer_num_6m", call_analysis.getTotal_dialed_peer_num_6m());
                    map.put
                            ("friend_circle_call_analysis_total_dialed_peer_num_avg_3m", call_analysis.getTotal_dialed_peer_num_avg_3m());
                    map.put
                            ("friend_circle_call_analysis_total_dialed_peer_num_avg_6m", call_analysis.getTotal_dialed_peer_num_avg_6m());
                }

                map.put("friend_circle_call_contact_detail", JsonTool
                        .toJson(friend_circle
                                .getCall_contact_detail()));
                map.put("friend_circle_call_duration_detail_3m", JsonTool
                        .toJson(friend_circle.getCall_duration_detail_3m()));
                map.put("friend_circle_call_duration_detail_6m", JsonTool
                        .toJson(friend_circle.getCall_duration_detail_6m()));
                map.put("friend_circle_call_location_detail_3m", JsonTool
                        .toJson(friend_circle.getCall_location_detail_3m()));
                map.put("friend_circle_call_location_detail_6m", JsonTool
                        .toJson(friend_circle.getCall_location_detail_6m()));
                CarrierReport.FriendCircleBean.CallTimeDetailBean call_time_detail = friend_circle.getCall_time_detail();
                if (call_time_detail != null) {
                    map.put("friend_circle_call_time_detail_max_time_1m",
                            call_time_detail.getMax_time_1m());
                    map.put("friend_circle_call_time_detail_max_time_3m",
                            call_time_detail.getMax_time_3m());
                    map.put("friend_circle_call_time_detail_max_time_6m",
                            call_time_detail.getMax_time_6m());
                    map.put("friend_circle_call_time_detail_min_time_1m",
                            call_time_detail.getMin_time_1m());
                    map.put("friend_circle_call_time_detail_min_time_3m",
                            call_time_detail.getMin_time_3m());
                    map.put("friend_circle_call_time_detail_min_time_6m",
                            call_time_detail.getMin_time_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_1_min_1m", call_time_detail.getCall_time_in_1_min_1m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_1_min_3m", call_time_detail.getCall_time_in_1_min_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_1_min_6m", call_time_detail.getCall_time_in_1_min_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_1_min_avg_3m", call_time_detail.getCall_time_in_1_min_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_1_min_avg_6m", call_time_detail.getCall_time_in_1_min_avg_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_5_min_1m", call_time_detail.getCall_time_in_5_min_1m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_5_min_3m", call_time_detail.getCall_time_in_5_min_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_5_min_6m", call_time_detail.getCall_time_in_5_min_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_5_min_avg_3m", call_time_detail.getCall_time_in_5_min_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_5_min_avg_6m", call_time_detail.getCall_time_in_5_min_avg_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_10_min_1m", call_time_detail.getCall_time_in_10_min_1m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_10_min_3m", call_time_detail.getCall_time_in_10_min_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_10_min_6m", call_time_detail.getCall_time_in_10_min_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_10_min_avg_3m", call_time_detail.getCall_time_in_10_min_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_in_10_min_avg_6m", call_time_detail.getCall_time_in_10_min_avg_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_over_10_min_1m", call_time_detail.getCall_time_over_10_min_1m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_over_10_min_3m", call_time_detail.getCall_time_over_10_min_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_over_10_min_6m", call_time_detail.getCall_time_over_10_min_6m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_over_10_min_avg_3m", call_time_detail.getCall_time_over_10_min_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_call_time_over_10_min_avg_6m", call_time_detail.getCall_time_over_10_min_avg_6m());
                    map.put("friend_circle_call_time_detail_in_day_time_1m",
                            call_time_detail.getIn_day_time_1m());
                    map.put("friend_circle_call_time_detail_in_day_time_3m",
                            call_time_detail.getIn_day_time_3m());
                    map.put("friend_circle_call_time_detail_in_day_time_6m",
                            call_time_detail.getIn_day_time_6m());
                    map.put
                            ("friend_circle_call_time_detail_in_day_time_avg_3m", call_time_detail.getIn_day_time_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_in_day_time_avg_6m", call_time_detail.getIn_day_time_avg_6m());
                    map.put("friend_circle_call_time_detail_in_night_time_1m" +
                            "", call_time_detail.getIn_night_time_1m());
                    map.put("friend_circle_call_time_detail_in_night_time_3m" +
                            "", call_time_detail.getIn_night_time_3m());
                    map.put("friend_circle_call_time_detail_in_night_time_6m" +
                            "", call_time_detail.getIn_night_time_6m());
                    map.put
                            ("friend_circle_call_time_detail_in_night_time_avg_3m", call_time_detail.getIn_night_time_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_in_night_time_avg_6m", call_time_detail.getIn_night_time_avg_6m());
                    map.put("friend_circle_call_time_detail_local_time_1m",
                            call_time_detail.getLocal_time_1m());
                    map.put("friend_circle_call_time_detail_local_time_3m",
                            call_time_detail.getLocal_time_3m());
                    map.put("friend_circle_call_time_detail_local_time_6m",
                            call_time_detail.getLocal_time_6m());
                    map.put("friend_circle_call_time_detail_local_time_avg_3m" +
                            "", call_time_detail.getLocal_time_avg_3m());
                    map.put("friend_circle_call_time_detail_local_time_avg_6m" +
                            "", call_time_detail.getLocal_time_avg_6m());
                    map.put("friend_circle_call_time_detail_remote_time_1m",
                            call_time_detail.getRemote_time_1m());
                    map.put("friend_circle_call_time_detail_remote_time_3m",
                            call_time_detail.getRemote_time_3m());
                    map.put("friend_circle_call_time_detail_remote_time_6m",
                            call_time_detail.getRemote_time_6m());
                    map.put
                            ("friend_circle_call_time_detail_remote_time_avg_3m", call_time_detail.getRemote_time_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_remote_time_avg_6m", call_time_detail.getRemote_time_avg_6m());
                    map.put("friend_circle_call_time_detail_in_day_num_1m",
                            call_time_detail.getIn_day_num_1m());
                    map.put("friend_circle_call_time_detail_in_day_num_3m",
                            call_time_detail.getIn_day_num_3m());
                    map.put("friend_circle_call_time_detail_in_day_num_6m",
                            call_time_detail.getIn_day_num_6m());
                    map.put("friend_circle_call_time_detail_in_day_num_avg_3m" +
                            "", call_time_detail.getIn_day_num_avg_3m());
                    map.put("friend_circle_call_time_detail_in_day_num_avg_6m" +
                            "", call_time_detail.getIn_day_num_avg_6m());
                    map.put("friend_circle_call_time_detail_in_night_num_1m",
                            call_time_detail.getIn_night_num_1m());
                    map.put("friend_circle_call_time_detail_in_night_num_3m",
                            call_time_detail.getIn_night_num_3m());
                    map.put("friend_circle_call_time_detail_in_night_num_6m",
                            call_time_detail.getIn_night_num_6m());
                    map.put
                            ("friend_circle_call_time_detail_in_night_num_avg_3m", call_time_detail.getIn_night_num_avg_3m());
                    map.put
                            ("friend_circle_call_time_detail_in_night_num_avg_6m", call_time_detail.getIn_night_num_avg_6m());
                    map.put("friend_circle_call_time_detail_local_num_1m",
                            call_time_detail.getLocal_num_1m());
                    map.put("friend_circle_call_time_detail_local_num_3m",
                            call_time_detail.getLocal_num_3m());
                    map.put("friend_circle_call_time_detail_local_num_6m",
                            call_time_detail.getLocal_num_6m());
                    map.put("friend_circle_call_time_detail_local_num_avg_3m" +
                            "", call_time_detail.getLocal_num_avg_3m());
                    map.put("friend_circle_call_time_detail_local_num_avg_6m" +
                            "", call_time_detail.getLocal_num_avg_6m());
                    map.put("friend_circle_call_time_detail_remote_num_1m",
                            call_time_detail.getRemote_num_1m());
                    map.put("friend_circle_call_time_detail_remote_num_3m",
                            call_time_detail.getRemote_num_3m());
                    map.put("friend_circle_call_time_detail_remote_num_6m",
                            call_time_detail.getRemote_num_6m());
                    map.put("friend_circle_call_time_detail_remote_num_avg_3m" +
                            "", call_time_detail.getRemote_num_avg_3m());
                    map.put("friend_circle_call_time_detail_remote_num_avg_6m" +
                            "", call_time_detail.getRemote_num_avg_6m());
                }
                CarrierReport.FriendCircleBean.CallThirdPartDetailBean call_third_part_detail = friend_circle.getCall_third_part_detail();
                if (call_third_part_detail != null) {
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_num_1m", call_third_part_detail.getCall_110_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_num_3m", call_third_part_detail.getCall_110_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_num_6m", call_third_part_detail.getCall_110_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_num_avg_3m", call_third_part_detail.getCall_110_num_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_num_avg_6m", call_third_part_detail.getCall_110_num_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_time_1m", call_third_part_detail.getCall_110_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_time_3m", call_third_part_detail.getCall_110_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_time_6m", call_third_part_detail.getCall_110_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_time_avg_3m", call_third_part_detail.getCall_110_time_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_110_time_avg_6m", call_third_part_detail.getCall_110_time_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_num_1m", call_third_part_detail.getCall_120_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_num_3m", call_third_part_detail.getCall_120_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_num_6m", call_third_part_detail.getCall_120_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_num_avg_3m", call_third_part_detail.getCall_120_num_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_num_avg_6m", call_third_part_detail.getCall_120_num_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_time_1m", call_third_part_detail.getCall_120_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_time_3m", call_third_part_detail.getCall_120_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_time_6m", call_third_part_detail.getCall_120_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_time_avg_3m", call_third_part_detail.getCall_120_time_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_120_time_avg_6m", call_third_part_detail.getCall_120_time_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_num_1m", call_third_part_detail.getCall_loan_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_num_3m", call_third_part_detail.getCall_loan_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_num_6m", call_third_part_detail.getCall_loan_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_num_avg_3m", call_third_part_detail.getCall_loan_num_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_num_avg_6m", call_third_part_detail.getCall_loan_num_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_time_1m", call_third_part_detail.getCall_loan_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_time_3m", call_third_part_detail.getCall_loan_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_time_6m", call_third_part_detail.getCall_loan_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_time_avg_3m", call_third_part_detail.getCall_loan_time_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_loan_time_avg_6m", call_third_part_detail.getCall_loan_time_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_num_1m", call_third_part_detail.getCall_credit_card_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_num_3m", call_third_part_detail.getCall_credit_card_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_num_6m", call_third_part_detail.getCall_credit_card_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_num_avg_3m", call_third_part_detail.getCall_credit_card_num_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_num_avg_6m", call_third_part_detail.getCall_credit_card_num_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_time_1m", call_third_part_detail.getCall_credit_card_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_time_3m", call_third_part_detail.getCall_credit_card_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_time_6m", call_third_part_detail.getCall_credit_card_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_time_avg_3m", call_third_part_detail.getCall_credit_card_time_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_credit_card_time_avg_6m", call_third_part_detail.getCall_credit_card_time_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_num_1m", call_third_part_detail.getCall_macon_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_num_3m", call_third_part_detail.getCall_macon_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_num_6m ", call_third_part_detail.getCall_macon_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_num_avg_3m", call_third_part_detail.getCall_macon_num_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_num_avg_6m", call_third_part_detail.getCall_macon_num_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_time_1m", call_third_part_detail.getCall_macon_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_time_3m", call_third_part_detail.getCall_macon_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_time_6m", call_third_part_detail.getCall_macon_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_time_avg_3m", call_third_part_detail.getCall_macon_time_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_macon_time_avg_6m", call_third_part_detail.getCall_macon_time_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_num_1m", call_third_part_detail.getCall_collection_firm_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_num_3m", call_third_part_detail.getCall_collection_firm_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_num_6m", call_third_part_detail.getCall_collection_firm_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_num_avg_3m", call_third_part_detail.getCall_collection_firm_num_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_num_avg_6m", call_third_part_detail.getCall_collection_firm_num_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_time_1m", call_third_part_detail.getCall_collection_firm_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_time_3m", call_third_part_detail.getCall_collection_firm_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_time_6m", call_third_part_detail.getCall_collection_firm_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_time_avg_3m", call_third_part_detail.getCall_collection_firm_time_avg_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_collection_firm_time_avg_6m", call_third_part_detail.getCall_collection_firm_time_avg_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_lawyer_num_1m", call_third_part_detail.getCall_lawyer_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_lawyer_num_3m", call_third_part_detail.getCall_lawyer_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_lawyer_num_6m", call_third_part_detail.getCall_lawyer_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_lawyer_time_1m", call_third_part_detail.getCall_lawyer_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_lawyer_time_3m", call_third_part_detail.getCall_lawyer_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_lawyer_time_6m", call_third_part_detail.getCall_lawyer_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_bank_num_1m", call_third_part_detail.getCall_bank_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_bank_num_3m", call_third_part_detail.getCall_bank_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_bank_num_6m", call_third_part_detail.getCall_bank_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_bank_time_1m", call_third_part_detail.getCall_bank_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_bank_time_3m", call_third_part_detail.getCall_bank_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_bank_time_6m", call_third_part_detail.getCall_bank_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_agency_num_1m", call_third_part_detail.getCall_agency_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_agency_num_3m", call_third_part_detail.getCall_agency_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_agency_num_6m", call_third_part_detail.getCall_agency_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_agency_time_1m", call_third_part_detail.getCall_agency_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_agency_time_3m", call_third_part_detail.getCall_agency_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_agency_time_6m", call_third_part_detail.getCall_agency_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_fraud_num_1m", call_third_part_detail.getCall_fraud_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_fraud_num_3m", call_third_part_detail.getCall_fraud_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_fraud_num_6m", call_third_part_detail.getCall_fraud_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_fraud_time_1m", call_third_part_detail.getCall_fraud_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_fraud_time_3m", call_third_part_detail.getCall_fraud_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_fraud_time_6m", call_third_part_detail.getCall_fraud_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_nuisance_num_1m", call_third_part_detail.getCall_nuisance_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_nuisance_num_3m", call_third_part_detail.getCall_nuisance_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_nuisance_num_6m", call_third_part_detail.getCall_nuisance_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_nuisance_time_1m", call_third_part_detail.getCall_nuisance_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_nuisance_time_3m", call_third_part_detail.getCall_nuisance_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_nuisance_time_6m", call_third_part_detail.getCall_nuisance_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_railway_airway_num_1m", call_third_part_detail.getCall_railway_airway_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_railway_airway_num_3m", call_third_part_detail.getCall_railway_airway_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_railway_airway_num_6m", call_third_part_detail.getCall_railway_airway_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_railway_airway_time_1m", call_third_part_detail.getCall_railway_airway_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_railway_airway_time_3m", call_third_part_detail.getCall_railway_airway_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_railway_airway_time_6m", call_third_part_detail.getCall_railway_airway_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_special_service_num_1m", call_third_part_detail.getCall_special_service_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_special_service_num_3m", call_third_part_detail.getCall_special_service_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_special_service_num_6m", call_third_part_detail.getCall_special_service_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_special_service_time_1m", call_third_part_detail.getCall_special_service_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_special_service_time_3m", call_third_part_detail.getCall_special_service_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_special_service_time_6m", call_third_part_detail.getCall_special_service_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_express_num_1m", call_third_part_detail.getCall_express_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_express_num_3m", call_third_part_detail.getCall_express_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_express_num_6m", call_third_part_detail.getCall_express_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_express_time_1m", call_third_part_detail.getCall_express_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_express_time_3m", call_third_part_detail.getCall_express_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_express_time_6m", call_third_part_detail.getCall_express_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_ins_fin_num_1m", call_third_part_detail.getCall_ins_fin_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_ins_fin_num_3m", call_third_part_detail.getCall_ins_fin_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_ins_fin_num_6m", call_third_part_detail.getCall_ins_fin_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_ins_fin_time_1m", call_third_part_detail.getCall_ins_fin_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_ins_fin_time_3m", call_third_part_detail.getCall_ins_fin_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_ins_fin_time_6m", call_third_part_detail.getCall_ins_fin_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_car_firm_num_1m", call_third_part_detail.getCall_car_firm_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_car_firm_num_3m", call_third_part_detail.getCall_car_firm_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_car_firm_num_6m", call_third_part_detail.getCall_car_firm_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_car_firm_time_1m", call_third_part_detail.getCall_car_firm_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_car_firm_time_3m", call_third_part_detail.getCall_car_firm_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_car_firm_time_6m", call_third_part_detail.getCall_car_firm_time_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_carrier_num_1m", call_third_part_detail.getCall_carrier_num_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_carrier_num_3m", call_third_part_detail.getCall_carrier_num_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_carrier_num_6m", call_third_part_detail.getCall_carrier_num_6m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_carrier_time_1m", call_third_part_detail.getCall_carrier_time_1m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_carrier_time_3m", call_third_part_detail.getCall_carrier_time_3m());
                    map.put
                            ("friend_circle_call_third_part_detail_call_carrier_time_6m", call_third_part_detail.getCall_carrier_time_6m());
                }
                CarrierReport.FriendCircleBean.CallFamilyDetailBean call_family_detail = friend_circle.getCall_family_detail();
                if (call_family_detail != null) {
                    map.put
                            ("friend_circle_call_family_detail_is_family_net_member_1m", call_family_detail.getIs_family_net_member_1m());
                    map.put
                            ("friend_circle_call_family_detail_is_family_net_member_3m", call_family_detail.getIs_family_net_member_3m());
                    map.put
                            ("friend_circle_call_family_detail_is_family_net_member_6m", call_family_detail.getIs_family_net_member_6m());
                    map.put
                            ("friend_circle_call_family_detail_is_family_net_master_1m", call_family_detail.getIs_family_net_master_1m());
                    map.put
                            ("friend_circle_call_family_detail_is_family_net_master_3m", call_family_detail.getIs_family_net_master_3m());
                    map.put
                            ("friend_circle_call_family_detail_is_family_net_master_6m", call_family_detail.getIs_family_net_master_6m());
                    map.put
                            ("friend_circle_call_family_detail_recharge_month_1m", call_family_detail.getRecharge_month_1m());
                    map.put
                            ("friend_circle_call_family_detail_recharge_month_3m", call_family_detail.getRecharge_month_3m());
                    map.put
                            ("friend_circle_call_family_detail_recharge_month_6m", call_family_detail.getRecharge_month_6m());
                    map.put
                            ("friend_circle_call_family_detail_is_address_match_phone_1m", call_family_detail.getIs_address_match_phone_1m());
                    map.put
                            ("friend_circle_call_family_detail_is_address_match_phone_3m", call_family_detail.getIs_address_match_phone_3m());
                    map.put
                            ("friend_circle_call_family_detail_is_address_match_phone_6m", call_family_detail.getIs_address_match_phone_6m());
                    map.put
                            ("friend_circle_call_family_detail_num_of_call_less_1m", call_family_detail.getNum_of_call_less_1m());
                    map.put
                            ("friend_circle_call_family_detail_num_of_call_less_3m", call_family_detail.getNum_of_call_less_3m());
                    map.put
                            ("friend_circle_call_family_detail_num_of_call_less_6m", call_family_detail.getNum_of_call_less_6m());
                    map.put
                            ("friend_circle_call_family_detail_num_of_call_more_1m", call_family_detail.getNum_of_call_more_1m());
                    map.put
                            ("friend_circle_call_family_detail_num_of_call_more_3m", call_family_detail.getNum_of_call_more_3m());
                    map.put
                            ("friend_circle_call_family_detail_num_of_call_more_6m", call_family_detail.getNum_of_call_more_6m());
                    map.put("friend_circle_call_family_detail_unpaid_month_1m" +
                            "", call_family_detail.getUnpaid_month_1m());
                    map.put("friend_circle_call_family_detail_unpaid_month_3m" +
                            "", call_family_detail.getUnpaid_month_3m());
                    map.put("friend_circle_call_family_detail_unpaid_month_6m" +
                            "", call_family_detail.getUnpaid_month_6m());
                    map.put("friend_circle_call_family_detail_live_month_1m",
                            call_family_detail.getLive_month_1m());
                    map.put("friend_circle_call_family_detail_live_month_3m",
                            call_family_detail.getLive_month_3m());
                    map.put("friend_circle_call_family_detail_live_month_6m",
                            call_family_detail.getLive_month_6m());
                }

            }
            List<CarrierReport.CallServiceDetailBean> call_service_detail = carrierReport.getCall_service_detail();
            if (call_service_detail != null) {
                map.put("call_service_detail", JsonTool.toJson(call_service_detail));
            }
            CarrierReport.ActiveDegreeDetailBean active_degree_detail = carrierReport.getActive_degree_detail();
            if (active_degree_detail != null) {
                map.put("active_degree_detail_call_day_1m",
                        active_degree_detail.getCall_day_1m());
                map.put("active_degree_detail_call_day_3m",
                        active_degree_detail.getCall_day_3m());
                map.put("active_degree_detail_call_day_6m",
                        active_degree_detail.getCall_day_6m());
                map.put("active_degree_detail_call_day_avg_3m",
                        active_degree_detail.getCall_day_avg_3m());
                map.put("active_degree_detail_call_day_avg_6m",
                        active_degree_detail.getCall_day_avg_6m());
                map.put("active_degree_detail_sms_day_1m",
                        active_degree_detail.getSms_day_1m());
                map.put("active_degree_detail_sms_day_3m",
                        active_degree_detail.getSms_day_3m());
                map.put("active_degree_detail_sms_day_6m",
                        active_degree_detail.getSms_day_6m());
                map.put("active_degree_detail_sms_day_avg_3m",
                        active_degree_detail.getSms_day_avg_3m());
                map.put("active_degree_detail_sms_day_avg_6m",
                        active_degree_detail.getSms_day_avg_6m());
                map.put("active_degree_detail_recharge_time_1m",
                        active_degree_detail.getRecharge_time_1m());
                map.put("active_degree_detail_recharge_time_3m",
                        active_degree_detail.getRecharge_time_3m());
                map.put("active_degree_detail_recharge_time_6m",
                        active_degree_detail.getRecharge_time_6m());
                map.put("active_degree_detail_recharge_time_avg_3m",
                        active_degree_detail.getRecharge_time_avg_3m());
                map.put("active_degree_detail_recharge_time_avg_6m",
                        active_degree_detail.getRecharge_time_avg_6m());
                map.put("active_degree_detail_call_time_1m",
                        active_degree_detail.getCall_time_1m());
                map.put("active_degree_detail_call_time_3m",
                        active_degree_detail.getCall_time_3m());
                map.put("active_degree_detail_call_time_6m",
                        active_degree_detail.getCall_time_6m());
                map.put("active_degree_detail_call_time_avg_3m",
                        active_degree_detail.getCall_time_avg_3m());
                map.put("active_degree_detail_call_time_avg_6m",
                        active_degree_detail.getCall_time_avg_6m());
                map.put("active_degree_detail_sms_time_1m",
                        active_degree_detail.getSms_time_1m());
                map.put("active_degree_detail_sms_time_3m",
                        active_degree_detail.getSms_time_3m());
                map.put("active_degree_detail_sms_time_6m",
                        active_degree_detail.getSms_time_6m());
                map.put("active_degree_detail_sms_time_avg_3m",
                        active_degree_detail.getSms_time_avg_3m());
                map.put("active_degree_detail_sms_time_avg_6m",
                        active_degree_detail.getSms_time_avg_6m());
                map.put("active_degree_detail_flow_total_1m",
                        active_degree_detail.getFlow_total_1m());
                map.put("active_degree_detail_flow_total_3m",
                        active_degree_detail.getFlow_total_3m());
                map.put("active_degree_detail_flow_total_6m",
                        active_degree_detail.getFlow_total_6m());
                map.put("active_degree_detail_flow_total_avg_3m",
                        active_degree_detail.getFlow_total_avg_3m());
                map.put("active_degree_detail_flow_total_avg_6m",
                        active_degree_detail.getFlow_total_avg_6m());
                map.put("active_degree_detail_flow_used_1m",
                        active_degree_detail.getFlow_used_1m());
                map.put("active_degree_detail_flow_used_3m",
                        active_degree_detail.getFlow_used_3m());
                map.put("active_degree_detail_flow_used_6m",
                        active_degree_detail.getFlow_used_6m());
                map.put("active_degree_detail_flow_used_avg_3m",
                        active_degree_detail.getFlow_used_avg_3m());
                map.put("active_degree_detail_flow_used_avg_6m",
                        active_degree_detail.getFlow_used_avg_6m());
                map.put("active_degree_detail_call_avg_duration_1m",
                        active_degree_detail.getCall_avg_duration_1m());
                map.put("active_degree_detail_call_avg_duration_3m",
                        active_degree_detail.getCall_avg_duration_3m());
                map.put("active_degree_detail_call_avg_duration_6m",
                        active_degree_detail.getCall_avg_duration_6m());
                map.put("active_degree_detail_no_dial_day_1m",
                        active_degree_detail.getNo_dial_day_1m());
                map.put("active_degree_detail_no_dial_day_3m",
                        active_degree_detail.getNo_dial_day_3m());
                map.put("active_degree_detail_no_dial_day_6m",
                        active_degree_detail.getNo_dial_day_6m());
                map.put("active_degree_detail_no_dial_day_avg_3m",
                        active_degree_detail.getNo_dial_day_avg_3m());
                map.put("active_degree_detail_no_dial_day_avg_6m",
                        active_degree_detail.getNo_dial_day_avg_6m());
                map.put("active_degree_detail_no_dial_day_percent_1m",
                        active_degree_detail.getNo_dial_day_percent_1m());
                map.put("active_degree_detail_no_dial_day_percent_3m",
                        active_degree_detail.getNo_dial_day_percent_3m());
                map.put("active_degree_detail_no_dial_day_percent_6m",
                        active_degree_detail.getNo_dial_day_percent_6m());
                map.put("active_degree_detail_no_call_day_1m",
                        active_degree_detail.getNo_call_day_1m());
                map.put("active_degree_detail_no_call_day_3m",
                        active_degree_detail.getNo_call_day_3m());
                map.put("active_degree_detail_no_call_day_6m",
                        active_degree_detail.getNo_call_day_6m());
                map.put("active_degree_detail_no_call_day_avg_3m",
                        active_degree_detail.getNo_call_day_avg_3m());
                map.put("active_degree_detail_no_call_day_avg_6m",
                        active_degree_detail.getNo_call_day_avg_6m());
                map.put("active_degree_detail_no_call_day_percent_1m",
                        active_degree_detail.getNo_call_day_percent_1m());
                map.put("active_degree_detail_no_call_day_percent_3m",
                        active_degree_detail.getNo_call_day_percent_3m());
                map.put("active_degree_detail_no_call_day_percent_6m",
                        active_degree_detail.getNo_call_day_percent_6m());
                map.put("active_degree_detail_power_on_max_day_1m",
                        active_degree_detail.getPower_on_max_day_1m());
                map.put("active_degree_detail_power_on_max_day_3m",
                        active_degree_detail.getPower_on_max_day_3m());
                map.put("active_degree_detail_power_on_max_day_6m",
                        active_degree_detail.getPower_on_max_day_6m());
                map.put("active_degree_detail_power_off_day_1m",
                        active_degree_detail.getPower_off_day_1m());
                map.put("active_degree_detail_power_off_day_3m",
                        active_degree_detail.getPower_off_day_3m());
                map.put("active_degree_detail_power_off_day_6m",
                        active_degree_detail.getPower_off_day_6m());
                map.put("active_degree_detail_power_off_day_percent_1m",
                        active_degree_detail.getPower_off_day_percent_1m());
                map.put("active_degree_detail_power_off_day_percent_3m",
                        active_degree_detail.getPower_off_day_percent_3m());
                map.put("active_degree_detail_power_off_day_percent_6m",
                        active_degree_detail.getPower_off_day_percent_6m());
                map.put("active_degree_detail_continue_power_off_num_1m",
                        active_degree_detail.getContinue_power_off_num_1m());
                map.put("active_degree_detail_continue_power_off_num_3m",
                        active_degree_detail.getContinue_power_off_num_1m());
                map.put("active_degree_detail_continue_power_off_num_6m",
                        active_degree_detail.getContinue_power_off_num_6m());
            }
            CarrierReport.ConsumptionDetailBean consumption_detail = carrierReport.getConsumption_detail();
            if (consumption_detail != null) {
                map.put("consumption_detail_total_fee_1m", consumption_detail
                        .getTotal_fee_1m());
                map.put("consumption_detail_total_fee_3m", consumption_detail
                        .getTotal_fee_3m());
                map.put("consumption_detail_total_fee_6m", consumption_detail
                        .getTotal_fee_6m());
                map.put("consumption_detail_total_fee_avg_3m",
                        consumption_detail.getTotal_fee_avg_3m());
                map.put("consumption_detail_total_fee_avg_6m",
                        consumption_detail.getTotal_fee_avg_6m());
                map.put("consumption_detail_web_fee_1m", consumption_detail
                        .getWeb_fee_1m());
                map.put("consumption_detail_web_fee_3m", consumption_detail
                        .getWeb_fee_3m());
                map.put("consumption_detail_web_fee_6m", consumption_detail
                        .getWeb_fee_6m());
                map.put("consumption_detail_web_fee_avg_3m",
                        consumption_detail.getWeb_fee_avg_3m());
                map.put("consumption_detail_web_fee_avg_6m",
                        consumption_detail.getWeb_fee_avg_6m());
                map.put("consumption_detail_call_fee_1m", consumption_detail
                        .getCall_fee_1m());
                map.put("consumption_detail_call_fee_3m", consumption_detail
                        .getCall_fee_3m());
                map.put("consumption_detail_call_fee_6m", consumption_detail
                        .getCall_fee_6m());
                map.put("consumption_detail_call_fee_avg_3m",
                        consumption_detail.getCall_fee_avg_3m());
                map.put("consumption_detail_call_fee_avg_6m",
                        consumption_detail.getCall_fee_avg_6m());
                map.put("consumption_detail_sms_fee_1m", consumption_detail
                        .getSms_fee_1m());
                map.put("consumption_detail_sms_fee_3m", consumption_detail
                        .getSms_fee_3m());
                map.put("consumption_detail_sms_fee_6m", consumption_detail
                        .getSms_fee_6m());
                map.put("consumption_detail_sms_fee_avg_3m",
                        consumption_detail.getSms_fee_avg_3m());
                map.put("consumption_detail_sms_fee_avg_6m",
                        consumption_detail.getSms_fee_avg_6m());
                map.put("consumption_detail_vas_fee_1m", consumption_detail
                        .getVas_fee_1m());
                map.put("consumption_detail_vas_fee_3m", consumption_detail
                        .getVas_fee_3m());
                map.put("consumption_detail_vas_fee_6m", consumption_detail
                        .getVas_fee_6m());
                map.put("consumption_detail_vas_fee_avg_3m",
                        consumption_detail.getVas_fee_avg_3m());
                map.put("consumption_detail_vas_fee_avg_6m",
                        consumption_detail.getVas_fee_avg_6m());
                map.put("consumption_detail_extra_fee_1m", consumption_detail
                        .getExtra_fee_1m());
                map.put("consumption_detail_extra_fee_3m", consumption_detail
                        .getExtra_fee_3m());
                map.put("consumption_detail_extra_fee_6m", consumption_detail
                        .getExtra_fee_6m());
                map.put("consumption_detail_extra_fee_avg_3m",
                        consumption_detail.getExtra_fee_avg_3m());
                map.put("consumption_detail_extra_fee_avg_6m",
                        consumption_detail.getExtra_fee_avg_6m());
                map.put("consumption_detail_recharge_amount_1m",
                        consumption_detail.getRecharge_amount_1m());
                map.put("consumption_detail_recharge_amount_3m",
                        consumption_detail.getRecharge_amount_3m());
                map.put("consumption_detail_recharge_amount_6m",
                        consumption_detail.getRecharge_amount_6m());
                map.put("consumption_detail_recharge_amount_avg_3m",
                        consumption_detail.getRecharge_amount_avg_3m());
                map.put("consumption_detail_recharge_amount_avg_6m",
                        consumption_detail.getRecharge_amount_avg_6m());
            }
            List<CarrierReport.RoamDetailBean> roam_detail = carrierReport.getRoam_detail();
            if (roam_detail != null) {
                map.put("roam_detail", JsonTool.toJson(roam_detail));
            }
        }

        HBaseDaoWrapper.save(tableName, rowKey, map);
    }

}
