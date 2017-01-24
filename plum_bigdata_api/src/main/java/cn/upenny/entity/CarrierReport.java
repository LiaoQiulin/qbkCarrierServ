package cn.upenny.entity;

import java.util.List;

/**
 * Created by LiaoQiulin on 2017/1/18.
 */
public class CarrierReport {

    /**
     * code : 0
     * message : 运营商报告获取成功
     * update_time : 2017-01-16 17:51:04
     * user_basic_info : {"name":"朱爱月","idcard":"342622199309298186","mobile":"18066212532","gender":"女","age":"24","constellation":"天秤座","email":"未知","address":"安徽省庐江县泥河镇河南村底屯1广屯1组38号","name_from_custom":"朱爱月","idcard_from_custom":"342622199309298186","native_place":"安徽省庐江县","live_address":"浙江金华","work_address":"金华"}
     * data_source : {"source_name":"浙江电信","data_type":"运营商","data_gain_time":"2017-01-16"}
     * basic_info_check_items : [{"result":"有效实名制客户","check_item":"idcard_check"},{"result":"缺失","check_item":"email_check"},{"result":"有效","check_item":"address_check"},{"result":"是","check_item":"idcard_match"},{"result":"是","check_item":"name_match"}]
     * friend_circle : {"friend_num_3m":"47","good_friend_num_3m":"2","friend_city_center_3m":"合肥","is_city_match_friend_city_center_3m":"否","inter_peer_num_3m":"11","friend_num_6m":"126","good_friend_num_6m":"11","friend_city_center_6m":"金华","is_city_match_friend_city_center_6m":"是","inter_peer_num_6m":"26","call_num_top3_3m":[{"city":"合肥","peer_number":"15256943459","call_num":"14","call_time":"5433","dial_num":"7","dialed_num":"7"},{"city":"金华","peer_number":"15267349871","call_num":"12","call_time":"1444","dial_num":"7","dialed_num":"5"},{"city":"","peer_number":"4008580580","call_num":"8","call_time":"3440","dial_num":"8","dialed_num":"0"}],"call_num_top3_6m":[{"city":"金华","peer_number":"18072693133","call_num":"52","call_time":"1544","dial_num":"18","dialed_num":"34"},{"city":"合肥","peer_number":"18256594193","call_num":"49","call_time":"7020","dial_num":"20","dialed_num":"29"},{"city":"金华","peer_number":"15267349871","call_num":"47","call_time":"4419","dial_num":"29","dialed_num":"18"}],"call_location_top3_3m":[{"city":"合肥","call_num":"35","peer_number_count":"5","call_time":"9705","dial_num":"16","dialed_num":"19"},{"city":"金华","call_num":"22","peer_number_count":"7","call_time":"4200","dial_num":"16","dialed_num":"6"},{"city":"上海","call_num":"11","peer_number_count":"5","call_time":"1788","dial_num":"2","dialed_num":"9"}],"call_location_top3_6m":[{"city":"金华","call_num":"183","peer_number_count":"39","call_time":"15673","dial_num":"97","dialed_num":"86"},{"city":"合肥","call_num":"149","peer_number_count":"10","call_time":"33339","dial_num":"76","dialed_num":"73"},{"city":"上海","call_num":"26","peer_number_count":"10","call_time":"3228","dial_num":"9","dialed_num":"17"}],"designated_contact":[{"peer_num":"string","city":"string","call_num_1w":"string","call_num_1m":"string","call_num_3m":"string","call_num_6m":"string","call_time_3m":"string","call_time_6m":"string","dial_num_3m":"string","dial_num_6m":"string","dialed_num_3m":"string","dialed_num_6m":"string","call_num_morning_3m":"string","call_num_morning_6m":"string","call_num_noon_3m":"string","call_num_noon_6m":"string","call_num_afternoon_3m":"string","call_num_afternoon_6m":"string","call_num_evening_3m":"string","call_num_evening_6m":"string","call_num_night_3m":"string","call_num_night_6m":"string","call_num_weekday_3m":"string","call_num_weekday_6m":"string","call_num_weekend_3m":"string","call_num_weekend_6m":"string","call_num_holiday_3m":"string","call_num_holiday_6m":"string","call_if_whole_day_3m":"string","call_if_whole_day_6m":"string"}],"risk_analysis":{"in_time":"20","mobile_silence_3m":"0","arrearage_risk_3m":"0","binding_risk":"10","mobile_silence_6m":"0","arrearage_risk_6m":"1","is_name_and_idcard_in_court_black":"否","is_name_and_idcard_in_finance_black":"否","is_name_and_mobile_in_finance_black":"否","risk_check_item":[{"item":"call_credit_card","call_num_3m":"1","call_time_3m":"288","call_num_6m":"1","call_time_6m":"288"},{"item":"call_loan","call_num_3m":"2","call_time_3m":"144","call_num_6m":"3","call_time_6m":"264"},{"item":"call_collection","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"},{"item":"call_110","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"},{"item":"call_120","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"}]},"active_degree":{"call_day_3m":"31","dial_num_3m":"95","dialed_num_3m":"47","dial_duration_3m":"24642","dialed_duration_3m":"10414","call_day_6m":"112","dial_num_6m":"286","dialed_num_6m":"231","dial_duration_6m":"55571","dialed_duration_6m":"25995"},"consumption_analysis":{"total_fee_3m":"105961","total_fee_6m":"142656","recharge_time_3m":"12","recharge_time_6m":"21","recharge_max_amount_3m":"10000","recharge_max_amount_6m":"10000","bill_latest_certification_day":"2017-01-16","web_fee_1m":"0","web_fee_3m":"70496","web_fee_6m":"70496","web_fee_avg_3m":"23499","web_fee_avg_6m":"11749","sms_fee_1m":"0","sms_fee_3m":"490","sms_fee_6m":"900","sms_fee_avg_3m":"163","sms_fee_avg_6m":"150","call_fee_1m":"0","call_fee_3m":"4365","call_fee_6m":"6630","call_fee_avg_3m":"1455","call_fee_avg_6m":"1105","vas_fee_1m":"0","vas_fee_3m":"0","vas_fee_6m":"0","vas_fee_avg_3m":"0","vas_fee_avg_6m":"0"},"roam_analysis":[{"roam_location":"合肥","roam_day_num_3m":"0","roam_day_num_6m":"3","continue_roam_num_3m":"0","continue_roam_num_6m":"1","max_roam_day_num_3m":"0","max_roam_day_num_6m":"2"},{"roam_location":"滁州","roam_day_num_3m":"0","roam_day_num_6m":"1","continue_roam_num_3m":"0","continue_roam_num_6m":"0","max_roam_day_num_3m":"0","max_roam_day_num_6m":"1"},{"roam_location":"湖州","roam_day_num_3m":"0","roam_day_num_6m":"1","continue_roam_num_3m":"0","continue_roam_num_6m":"0","max_roam_day_num_3m":"0","max_roam_day_num_6m":"1"}],"call_analysis":{"total_num_1m":"50","total_num_3m":"142","total_num_6m":"517","total_num_avg_3m":"47.33","total_num_avg_6m":"86.17","total_time_1m":"11490","total_time_3m":"35056","total_time_6m":"81566","total_time_avg_3m":"11685","total_time_avg_6m":"13594","total_peer_num_1m":"15","total_peer_num_3m":"47","total_peer_num_6m":"126","total_peer_num_avg_3m":"15.67","total_peer_num_avg_6m":"21.00","total_city_num_1m":"5","total_city_num_3m":"14","total_city_num_6m":"30","total_city_num_avg_3m":"4.67","total_city_num_avg_6m":"5.00","total_dial_num_1m":"31","total_dial_num_3m":"95","total_dial_num_6m":"286","total_dial_num_avg_3m":"31.67","total_dial_num_avg_6m":"47.67","total_dialed_num_1m":"19","total_dialed_num_3m":"47","total_dialed_num_6m":"231","total_dialed_num_avg_3m":"15.67","total_dialed_num_avg_6m":"38.50","total_dial_peer_num_1m":"12","total_dial_peer_num_3m":"35","total_dial_peer_num_6m":"75","total_dial_peer_num_avg_3":"11.67","total_dial_peer_num_avg_6":"12.50","total_dialed_peer_num_1m":"8","total_dialed_peer_num_3m":"23","total_dialed_peer_num_6m":"77","total_dialed_peer_num_avg_3m":"7.67","total_dialed_peer_num_avg_6m":"12.83"},"call_contact_detail":[{"city":"金华","peer_num":"18072693133","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"52","call_time_3m":"0","call_time_6m":"1544","dial_num_3m":"0","dial_num_6m":"18","dialed_num_3m":"0","dialed_num_6m":"34","call_num_morning_3m":"0","call_num_morning_6m":"15","call_num_noon_3m":"0","call_num_noon_6m":"4","call_num_afternoon_3m":"0","call_num_afternoon_6m":"13","call_num_evening_3m":"0","call_num_evening_6m":"8","call_num_night_3m":"0","call_num_night_6m":"12","call_num_weekday_3m":"0","call_num_weekday_6m":"40","call_num_weekend_3m":"0","call_num_weekend_6m":"10","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18256594193","call_num_1w":"1","call_num_1m":"2","call_num_3m":"4","call_num_6m":"49","call_time_3m":"941","call_time_6m":"7020","dial_num_3m":"2","dial_num_6m":"20","dialed_num_3m":"2","dialed_num_6m":"29","call_num_morning_3m":"0","call_num_morning_6m":"11","call_num_noon_3m":"1","call_num_noon_6m":"9","call_num_afternoon_3m":"1","call_num_afternoon_6m":"9","call_num_evening_3m":"2","call_num_evening_6m":"17","call_num_night_3m":"0","call_num_night_6m":"3","call_num_weekday_3m":"2","call_num_weekday_6m":"35","call_num_weekend_3m":"2","call_num_weekend_6m":"8","call_num_holiday_3m":"0","call_num_holiday_6m":"6","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15267349871","call_num_1w":"7","call_num_1m":"8","call_num_3m":"12","call_num_6m":"47","call_time_3m":"1444","call_time_6m":"4419","dial_num_3m":"7","dial_num_6m":"29","dialed_num_3m":"5","dialed_num_6m":"18","call_num_morning_3m":"1","call_num_morning_6m":"3","call_num_noon_3m":"4","call_num_noon_6m":"5","call_num_afternoon_3m":"4","call_num_afternoon_6m":"17","call_num_evening_3m":"3","call_num_evening_6m":"22","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"9","call_num_weekday_6m":"32","call_num_weekend_3m":"2","call_num_weekend_6m":"9","call_num_holiday_3m":"1","call_num_holiday_6m":"6","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"15056580271","call_num_1w":"3","call_num_1m":"4","call_num_3m":"8","call_num_6m":"33","call_time_3m":"1550","call_time_6m":"7125","dial_num_3m":"4","dial_num_6m":"21","dialed_num_3m":"4","dialed_num_6m":"12","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"5","call_num_afternoon_3m":"2","call_num_afternoon_6m":"3","call_num_evening_3m":"6","call_num_evening_6m":"25","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"4","call_num_weekday_6m":"20","call_num_weekend_3m":"4","call_num_weekend_6m":"11","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18256534246","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"25","call_time_3m":"0","call_time_6m":"8327","dial_num_3m":"0","dial_num_6m":"13","dialed_num_3m":"0","dialed_num_6m":"12","call_num_morning_3m":"0","call_num_morning_6m":"2","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"6","call_num_evening_3m":"0","call_num_evening_6m":"17","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"17","call_num_weekend_3m":"0","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"4","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18096685219","call_num_1w":"4","call_num_1m":"5","call_num_3m":"8","call_num_6m":"15","call_time_3m":"1628","call_time_6m":"2758","dial_num_3m":"3","dial_num_6m":"10","dialed_num_3m":"5","dialed_num_6m":"5","call_num_morning_3m":"0","call_num_morning_6m":"2","call_num_noon_3m":"2","call_num_noon_6m":"4","call_num_afternoon_3m":"4","call_num_afternoon_6m":"5","call_num_evening_3m":"2","call_num_evening_6m":"4","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"5","call_num_weekday_6m":"10","call_num_weekend_3m":"3","call_num_weekend_6m":"3","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"15256943459","call_num_1w":"2","call_num_1m":"8","call_num_3m":"14","call_num_6m":"14","call_time_3m":"5433","call_time_6m":"5433","dial_num_3m":"7","dial_num_6m":"7","dialed_num_3m":"7","dialed_num_6m":"7","call_num_morning_3m":"1","call_num_morning_6m":"1","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"11","call_num_evening_6m":"11","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"9","call_num_weekday_6m":"9","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"1","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008200588","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"14","call_time_3m":"76","call_time_6m":"2288","dial_num_3m":"1","dial_num_6m":"14","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"11","call_num_evening_3m":"1","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"14","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"广州","peer_num":"18666004655","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"14","call_time_3m":"0","call_time_6m":"1121","dial_num_3m":"0","dial_num_6m":"9","dialed_num_3m":"0","dialed_num_6m":"5","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"9","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"12","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15325907868","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"12","call_time_3m":"0","call_time_6m":"2838","dial_num_3m":"0","dial_num_6m":"10","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"4","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"5","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"9","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15397500435","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"12","call_time_3m":"0","call_time_6m":"507","dial_num_3m":"0","dial_num_6m":"6","dialed_num_3m":"0","dialed_num_6m":"6","call_num_morning_3m":"0","call_num_morning_6m":"7","call_num_noon_3m":"0","call_num_noon_6m":"4","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"7","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"3","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18110910311","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"9","call_time_3m":"0","call_time_6m":"2162","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"6","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"3","call_num_evening_3m":"0","call_num_evening_6m":"4","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"4","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008580580","call_num_1w":"5","call_num_1m":"5","call_num_3m":"8","call_num_6m":"8","call_time_3m":"3440","call_time_6m":"3440","dial_num_3m":"8","dial_num_6m":"8","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"2","call_num_noon_6m":"2","call_num_afternoon_3m":"5","call_num_afternoon_6m":"5","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"6","call_num_weekend_6m":"6","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95511","call_num_1w":"6","call_num_1m":"6","call_num_3m":"6","call_num_6m":"8","call_time_3m":"1586","call_time_6m":"2543","dial_num_3m":"6","dial_num_6m":"8","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"2","call_num_afternoon_6m":"3","call_num_evening_3m":"4","call_num_evening_6m":"5","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"3","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"嘉兴","peer_num":"15356736616","call_num_1w":"0","call_num_1m":"0","call_num_3m":"6","call_num_6m":"6","call_time_3m":"2576","call_time_6m":"2576","dial_num_3m":"4","dial_num_6m":"4","dialed_num_3m":"2","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"5","call_num_evening_6m":"5","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"6","call_num_weekday_6m":"6","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"02195511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"3","call_num_6m":"6","call_time_3m":"1466","call_time_6m":"1577","dial_num_3m":"2","dial_num_6m":"3","dialed_num_3m":"1","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"5","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"13472769214","call_num_1w":"0","call_num_1m":"0","call_num_3m":"6","call_num_6m":"6","call_time_3m":"1226","call_time_6m":"1226","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"4","dialed_num_6m":"4","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"4","call_num_afternoon_6m":"4","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"4","call_num_weekday_6m":"4","call_num_weekend_3m":"2","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15268647494","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"6","call_time_3m":"0","call_time_6m":"570","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"5","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"衢州","peer_num":"17858597592","call_num_1w":"0","call_num_1m":"0","call_num_3m":"5","call_num_6m":"5","call_time_3m":"629","call_time_6m":"629","dial_num_3m":"5","dial_num_6m":"5","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"4","call_num_evening_6m":"4","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"5","call_num_weekday_6m":"5","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95533","call_num_1w":"5","call_num_1m":"5","call_num_3m":"5","call_num_6m":"5","call_time_3m":"428","call_time_6m":"428","dial_num_3m":"5","dial_num_6m":"5","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"3","call_num_afternoon_6m":"3","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"18019384689","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"5","call_time_3m":"0","call_time_6m":"325","dial_num_3m":"0","dial_num_6m":"5","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"4","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"鹤岗","peer_num":"13339585567","call_num_1w":"0","call_num_1m":"0","call_num_3m":"4","call_num_6m":"4","call_time_3m":"689","call_time_6m":"689","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"2","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"3","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"4","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008208788","call_num_1w":"0","call_num_1m":"0","call_num_3m":"4","call_num_6m":"4","call_time_3m":"667","call_time_6m":"667","dial_num_3m":"4","dial_num_6m":"4","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"3","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4006965858","call_num_1w":"0","call_num_1m":"0","call_num_3m":"4","call_num_6m":"4","call_time_3m":"363","call_time_6m":"363","dial_num_3m":"4","dial_num_6m":"4","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"3","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728219781","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"4","call_time_3m":"0","call_time_6m":"189","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"4","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657948334","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"4","call_time_3m":"0","call_time_6m":"151","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"4","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95188","call_num_1w":"0","call_num_1m":"0","call_num_3m":"3","call_num_6m":"3","call_time_3m":"1081","call_time_6m":"1081","dial_num_3m":"3","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"1","call_num_night_6m":"1","call_num_weekday_3m":"3","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"揭阳","peer_num":"18128312660","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"724","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4006095511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"461","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"3","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02110100000","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"420","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02164262933","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"3","call_time_3m":"224","call_time_6m":"347","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"2","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"1","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"温州","peer_num":"15057337955","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"253","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13857965583","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"130","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"3","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18066237918","call_num_1w":"0","call_num_1m":"0","call_num_3m":"3","call_num_6m":"3","call_time_3m":"108","call_time_6m":"108","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"3","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18057940251","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"86","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"15384064025","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"78","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"2","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13735729122","call_num_1w":"0","call_num_1m":"1","call_num_3m":"1","call_num_6m":"3","call_time_3m":"16","call_time_6m":"55","dial_num_3m":"1","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"1","call_num_morning_6m":"2","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"1","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15868931157","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"2499","call_time_6m":"2499","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18066239082","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"1496","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008267710","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"730","call_time_6m":"730","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"宁波","peer_num":"18958321333","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"555","call_time_6m":"555","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"15868102662","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"503","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"宜春","peer_num":"13870561918","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"447","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"北京","peer_num":"17180051797","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"434","call_time_6m":"434","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"嘉兴","peer_num":"18405736668","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"396","call_time_6m":"396","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"1","call_num_night_6m":"1","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"宁波","peer_num":"17077883232","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"296","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"15921215368","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"257","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02131570006","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"2","call_time_3m":"4","call_time_6m":"216","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4006099400","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"144","call_time_6m":"144","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"2","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"广州","peer_num":"13825117723","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"91","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728018217","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"79","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"中山","peer_num":"18666170846","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"78","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13757941780","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"2","call_time_3m":"49","call_time_6m":"74","dial_num_3m":"1","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"1","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18058986466","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"72","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15988539779","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"68","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"17769931226","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"55","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02131599587","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"53","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15967943481","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"51","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4000271262","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"46","call_time_6m":"46","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"2","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18157939715","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"35","call_time_6m":"35","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"2","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13705791514","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"32","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"南京","peer_num":"15951904533","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"2492","call_time_6m":"2492","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"057188158198","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"506","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"15000306493","call_num_1w":"0","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"297","call_time_6m":"297","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95528","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"288","call_time_6m":"288","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"深圳","peer_num":"075532983321","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"267","call_time_6m":"267","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"1","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"10000","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"248","call_time_6m":"248","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"13909695058","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"230","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"051295511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"192","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728219117","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"191","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4000271265","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"171","call_time_6m":"171","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"89897777","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"159","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"朝阳","peer_num":"15042836212","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"155","call_time_6m":"155","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"15655180347","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"153","call_time_6m":"153","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"常州","peer_num":"051969868500","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"140","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"02112329","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"129","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15381790198","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"128","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"深圳","peer_num":"075533987194","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"127","call_time_6m":"127","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4001848888","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"120","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"台州","peer_num":"18857651662","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"117","call_time_6m":"117","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95595","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"116","call_time_6m":"116","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"075595511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"95","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"13865912855","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"95","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"赣州","peer_num":"13607971067","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"86","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"台州","peer_num":"13073893496","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"85","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"057982069302","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"81","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"成都","peer_num":"02868369240","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"81","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13065964873","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"76","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"吕梁","peer_num":"18534871020","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"73","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"濮阳","peer_num":"13949711776","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"70","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"郑州","peer_num":"15638863586","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"69","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"05711183180","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"68","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"北京","peer_num":"01085557019","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"56","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"呼和浩特","peer_num":"15034791876","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"56","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"85261827","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"55","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"北京","peer_num":"13611172679","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"55","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02131835228","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"50","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"85851081","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"49","call_time_6m":"49","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13735721113","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"49","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"岳阳","peer_num":"18975054977","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"47","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657942424","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"46","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95508","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"46","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728018830","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"45","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"057985261827","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"43","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"中山","peer_num":"13392921817","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"43","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"济南","peer_num":"13176017458","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"42","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"达州","peer_num":"13982880261","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"37","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02180217042","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"37","call_time_6m":"37","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18100509031","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"36","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"057126204215","call_num_1w":"0","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"36","call_time_6m":"36","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13575958181","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"28","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18367980954","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"25","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15267941189","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"23","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657938054","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"22","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657937544","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"21","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"苏州","peer_num":"15050180313","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"20","call_time_6m":"20","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18395966598","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"19","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13967493375","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"17","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"揭阳","peer_num":"18718611168","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"16","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"12329","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"15","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657948274","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"15","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13064656565","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"14","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"10100000","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"13","call_time_6m":"13","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13777906711","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"8","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95518","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"7","call_time_6m":"7","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"9551143","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"5","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"}],"call_duration_detail_3m":[{"time_step":"早晨[5:30-9:00]","total_num":"0","peer_num":"0","total_time":"0","dial_num":"0","dialed_num":"0","latest_call_time":"-","farthest_call_time":"-"},{"time_step":"上午[9:00-11:30]","total_num":"5","peer_num":"5","total_time":"846","dial_num":"3","dialed_num":"2","latest_call_time":"20170110-112338","farthest_call_time":"20170101-100326"},{"time_step":"中午[11:30-13:30]","total_num":"20","peer_num":"14","total_time":"3855","dial_num":"13","dialed_num":"7","latest_call_time":"20170114-131348","farthest_call_time":"20161116-121445"},{"time_step":"下午[13:30-17:30]","total_num":"47","peer_num":"28","total_time":"9287","dial_num":"30","dialed_num":"17","latest_call_time":"20170115-144726","farthest_call_time":"20161101-163114"},{"time_step":"傍晚[17:30-19:30]","total_num":"28","peer_num":"13","total_time":"8908","dial_num":"18","dialed_num":"10","latest_call_time":"20170110-191204","farthest_call_time":"20161103-173949"},{"time_step":"晚上[19:30-23:30]","total_num":"40","peer_num":"20","total_time":"11931","dial_num":"29","dialed_num":"11","latest_call_time":"20170115-223636","farthest_call_time":"20161102-203943"},{"time_step":"凌晨[23:30-1:30]","total_num":"2","peer_num":"2","total_time":"229","dial_num":"2","dialed_num":"0","latest_call_time":"20161124-002921","farthest_call_time":"20161116-001153"},{"time_step":"深夜[1:30-5:30]","total_num":"0","peer_num":"0","total_time":"0","dial_num":"0","dialed_num":"0","latest_call_time":"-","farthest_call_time":"-"}],"call_duration_detail_6m":[{"time_step":"早晨[5:30-9:00]","total_num":"20","peer_num":"8","total_time":"3748","dial_num":"10","dialed_num":"10","latest_call_time":"20160913-071127","farthest_call_time":"20160805-085912"},{"time_step":"上午[9:00-11:30]","total_num":"57","peer_num":"25","total_time":"3787","dial_num":"26","dialed_num":"31","latest_call_time":"20170110-112338","farthest_call_time":"20160801-092155"},{"time_step":"中午[11:30-13:30]","total_num":"64","peer_num":"34","total_time":"7401","dial_num":"36","dialed_num":"28","latest_call_time":"20170114-131348","farthest_call_time":"20160802-132358"},{"time_step":"下午[13:30-17:30]","total_num":"180","peer_num":"78","total_time":"22954","dial_num":"92","dialed_num":"88","latest_call_time":"20170115-144726","farthest_call_time":"20160802-133039"},{"time_step":"傍晚[17:30-19:30]","total_num":"66","peer_num":"22","total_time":"15947","dial_num":"39","dialed_num":"27","latest_call_time":"20170110-191204","farthest_call_time":"20160802-173555"},{"time_step":"晚上[19:30-23:30]","total_num":"109","peer_num":"35","total_time":"24120","dial_num":"72","dialed_num":"37","latest_call_time":"20170115-223636","farthest_call_time":"20160801-193423"},{"time_step":"凌晨[23:30-1:30]","total_num":"14","peer_num":"6","total_time":"3345","dial_num":"7","dialed_num":"7","latest_call_time":"20161124-002921","farthest_call_time":"20160808-010042"},{"time_step":"深夜[1:30-5:30]","total_num":"7","peer_num":"4","total_time":"264","dial_num":"4","dialed_num":"3","latest_call_time":"20160920-052941","farthest_call_time":"20160808-024951"}],"call_location_detail_3m":[{"city":"合肥","total_num":"35","peer_num":"5","total_time":"9705","dial_num":"16","dialed_num":"19","dialed_time":"4180","dial_time":"5525","dial_time_avg":"345","dialed_time_avg":"220","dial_num_percent":"0.46","dialed_num_percent":"0.54","dial_time_percent":"0.57","dialed_time_percent":"0.43"},{"city":"金华","total_num":"22","peer_num":"7","total_time":"4200","dial_num":"16","dialed_num":"6","dialed_time":"308","dial_time":"3892","dial_time_avg":"243","dialed_time_avg":"51","dial_num_percent":"0.73","dialed_num_percent":"0.27","dial_time_percent":"0.93","dialed_time_percent":"0.07"},{"city":"上海","total_num":"11","peer_num":"5","total_time":"1788","dial_num":"2","dialed_num":"9","dialed_time":"1052","dial_time":"736","dial_time_avg":"368","dialed_time_avg":"117","dial_num_percent":"0.18","dialed_num_percent":"0.82","dial_time_percent":"0.41","dialed_time_percent":"0.59"},{"city":"嘉兴","total_num":"8","peer_num":"2","total_time":"2972","dial_num":"6","dialed_num":"2","dialed_time":"342","dial_time":"2630","dial_time_avg":"438","dialed_time_avg":"171","dial_num_percent":"0.75","dialed_num_percent":"0.25","dial_time_percent":"0.88","dialed_time_percent":"0.12"},{"city":"衢州","total_num":"5","peer_num":"1","total_time":"629","dial_num":"5","dialed_num":"0","dialed_time":"0","dial_time":"629","dial_time_avg":"126","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"鹤岗","total_num":"4","peer_num":"1","total_time":"689","dial_num":"2","dialed_num":"2","dialed_time":"178","dial_time":"511","dial_time_avg":"256","dialed_time_avg":"89","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.74","dialed_time_percent":"0.26"},{"city":"宁波","total_num":"2","peer_num":"1","total_time":"555","dial_num":"1","dialed_num":"1","dialed_time":"97","dial_time":"458","dial_time_avg":"458","dialed_time_avg":"97","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.83","dialed_time_percent":"0.17"},{"city":"北京","total_num":"2","peer_num":"1","total_time":"434","dial_num":"2","dialed_num":"0","dialed_time":"0","dial_time":"434","dial_time_avg":"217","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"深圳","total_num":"2","peer_num":"2","total_time":"394","dial_num":"0","dialed_num":"2","dialed_time":"394","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"197","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"南京","total_num":"1","peer_num":"1","total_time":"2492","dial_num":"0","dialed_num":"1","dialed_time":"2492","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"2492","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"朝阳","total_num":"1","peer_num":"1","total_time":"155","dial_num":"0","dialed_num":"1","dialed_time":"155","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"155","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"台州","total_num":"1","peer_num":"1","total_time":"117","dial_num":"0","dialed_num":"1","dialed_time":"117","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"117","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"杭州","total_num":"1","peer_num":"1","total_time":"36","dial_num":"0","dialed_num":"1","dialed_time":"36","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"36","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"苏州","total_num":"1","peer_num":"1","total_time":"20","dial_num":"0","dialed_num":"1","dialed_time":"20","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"20","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"}],"call_location_detail_6m":[{"city":"金华","total_num":"183","peer_num":"39","total_time":"15673","dial_num":"97","dialed_num":"86","dialed_time":"3620","dial_time":"12053","dial_time_avg":"124","dialed_time_avg":"42","dial_num_percent":"0.53","dialed_num_percent":"0.47","dial_time_percent":"0.77","dialed_time_percent":"0.23"},{"city":"合肥","total_num":"149","peer_num":"10","total_time":"33339","dial_num":"76","dialed_num":"73","dialed_time":"11758","dial_time":"21581","dial_time_avg":"284","dialed_time_avg":"161","dial_num_percent":"0.51","dialed_num_percent":"0.49","dial_time_percent":"0.65","dialed_time_percent":"0.35"},{"city":"上海","total_num":"26","peer_num":"10","total_time":"3228","dial_num":"9","dialed_num":"17","dialed_time":"1910","dial_time":"1318","dial_time_avg":"146","dialed_time_avg":"112","dial_num_percent":"0.35","dialed_num_percent":"0.65","dial_time_percent":"0.41","dialed_time_percent":"0.59"},{"city":"广州","total_num":"16","peer_num":"2","total_time":"1212","dial_num":"9","dialed_num":"7","dialed_time":"522","dial_time":"690","dial_time_avg":"77","dialed_time_avg":"75","dial_num_percent":"0.56","dialed_num_percent":"0.44","dial_time_percent":"0.57","dialed_time_percent":"0.43"},{"city":"嘉兴","total_num":"8","peer_num":"2","total_time":"2972","dial_num":"6","dialed_num":"2","dialed_time":"342","dial_time":"2630","dial_time_avg":"438","dialed_time_avg":"171","dial_num_percent":"0.75","dialed_num_percent":"0.25","dial_time_percent":"0.88","dialed_time_percent":"0.12"},{"city":"湖州","total_num":"8","peer_num":"4","total_time":"504","dial_num":"1","dialed_num":"7","dialed_time":"466","dial_time":"38","dial_time_avg":"38","dialed_time_avg":"67","dial_num_percent":"0.13","dialed_num_percent":"0.88","dial_time_percent":"0.08","dialed_time_percent":"0.92"},{"city":"杭州","total_num":"7","peer_num":"4","total_time":"1123","dial_num":"3","dialed_num":"4","dialed_time":"114","dial_time":"1009","dial_time_avg":"336","dialed_time_avg":"29","dial_num_percent":"0.43","dialed_num_percent":"0.57","dial_time_percent":"0.90","dialed_time_percent":"0.10"},{"city":"衢州","total_num":"5","peer_num":"1","total_time":"629","dial_num":"5","dialed_num":"0","dialed_time":"0","dial_time":"629","dial_time_avg":"126","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"宁波","total_num":"4","peer_num":"2","total_time":"851","dial_num":"2","dialed_num":"2","dialed_time":"246","dial_time":"605","dial_time_avg":"303","dialed_time_avg":"123","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.71","dialed_time_percent":"0.29"},{"city":"揭阳","total_num":"4","peer_num":"2","total_time":"740","dial_num":"0","dialed_num":"4","dialed_time":"740","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"185","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"鹤岗","total_num":"4","peer_num":"1","total_time":"689","dial_num":"2","dialed_num":"2","dialed_time":"178","dial_time":"511","dial_time_avg":"256","dialed_time_avg":"89","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.74","dialed_time_percent":"0.26"},{"city":"北京","total_num":"4","peer_num":"3","total_time":"545","dial_num":"3","dialed_num":"1","dialed_time":"56","dial_time":"489","dial_time_avg":"163","dialed_time_avg":"56","dial_num_percent":"0.75","dialed_num_percent":"0.25","dial_time_percent":"0.90","dialed_time_percent":"0.10"},{"city":"温州","total_num":"3","peer_num":"1","total_time":"253","dial_num":"3","dialed_num":"0","dialed_time":"0","dial_time":"253","dial_time_avg":"84","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"中山","total_num":"3","peer_num":"2","total_time":"121","dial_num":"1","dialed_num":"2","dialed_time":"78","dial_time":"43","dial_time_avg":"43","dialed_time_avg":"39","dial_num_percent":"0.33","dialed_num_percent":"0.67","dial_time_percent":"0.36","dialed_time_percent":"0.64"},{"city":"宜春","total_num":"2","peer_num":"1","total_time":"447","dial_num":"0","dialed_num":"2","dialed_time":"447","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"224","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"深圳","total_num":"2","peer_num":"2","total_time":"394","dial_num":"0","dialed_num":"2","dialed_time":"394","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"197","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"台州","total_num":"2","peer_num":"2","total_time":"202","dial_num":"0","dialed_num":"2","dialed_time":"202","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"101","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"南京","total_num":"1","peer_num":"1","total_time":"2492","dial_num":"0","dialed_num":"1","dialed_time":"2492","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"2492","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"朝阳","total_num":"1","peer_num":"1","total_time":"155","dial_num":"0","dialed_num":"1","dialed_time":"155","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"155","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"常州","total_num":"1","peer_num":"1","total_time":"140","dial_num":"0","dialed_num":"1","dialed_time":"140","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"140","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"赣州","total_num":"1","peer_num":"1","total_time":"86","dial_num":"0","dialed_num":"1","dialed_time":"86","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"86","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"成都","total_num":"1","peer_num":"1","total_time":"81","dial_num":"0","dialed_num":"1","dialed_time":"81","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"81","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"吕梁","total_num":"1","peer_num":"1","total_time":"73","dial_num":"0","dialed_num":"1","dialed_time":"73","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"73","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"濮阳","total_num":"1","peer_num":"1","total_time":"70","dial_num":"0","dialed_num":"1","dialed_time":"70","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"70","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"郑州","total_num":"1","peer_num":"1","total_time":"69","dial_num":"0","dialed_num":"1","dialed_time":"69","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"69","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"呼和浩特","total_num":"1","peer_num":"1","total_time":"56","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"56","dial_time_avg":"56","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"岳阳","total_num":"1","peer_num":"1","total_time":"47","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"47","dial_time_avg":"47","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"济南","total_num":"1","peer_num":"1","total_time":"42","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"42","dial_time_avg":"42","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"达州","total_num":"1","peer_num":"1","total_time":"37","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"37","dial_time_avg":"37","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"苏州","total_num":"1","peer_num":"1","total_time":"20","dial_num":"0","dialed_num":"1","dialed_time":"20","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"20","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"}],"call_time_detail":{"max_time_1m":"1577","max_time_3m":"2492","max_time_6m":"2492","min_time_1m":"7","min_time_3m":"2","min_time_6m":"2","call_time_in_1_min_1m":"14","call_time_in_1_min_3m":"35","call_time_in_1_min_6m":"228","call_time_in_1_min_avg_3m":"11.67","call_time_in_1_min_avg_6m":"38.00","call_time_in_5_min_1m":"24","call_time_in_5_min_3m":"73","call_time_in_5_min_6m":"215","call_time_in_5_min_avg_3m":"24.33","call_time_in_5_min_avg_6m":"35.83","call_time_in_10_min_1m":"7","call_time_in_10_min_3m":"20","call_time_in_10_min_6m":"46","call_time_in_10_min_avg_3m":"6.67","call_time_in_10_min_avg_6m":"7.67","call_time_over_10_min_1m":"5","call_time_over_10_min_3m":"14","call_time_over_10_min_6m":"28","call_time_over_10_min_avg_3m":"4.67","call_time_over_10_min_avg_6m":"4.67","in_day_time_1m":"5554","in_day_time_3m":"14806","in_day_time_6m":"38988","in_day_time_avg_3m":"4935","in_day_time_avg_6m":"6498","in_night_time_1m":"5936","in_night_time_3m":"20250","in_night_time_6m":"42578","in_night_time_avg_3m":"6750","in_night_time_avg_6m":"7096","local_time_1m":"11490","local_time_3m":"35056","local_time_6m":"80932","local_time_avg_3m":"11685","local_time_avg_6m":"13489","remote_time_1m":"0","remote_time_3m":"0","remote_time_6m":"634","remote_time_avg_3m":"0","remote_time_avg_6m":"106","in_day_num_1m":"28","in_day_num_3m":"79","in_day_num_6m":"335","in_day_num_avg_3m":"26.33","in_day_num_avg_6m":"55.83","in_night_num_1m":"22","in_night_num_3m":"63","in_night_num_6m":"182","in_night_num_avg_3m":"21.00","in_night_num_avg_6m":"30.33","local_num_1m":"50","local_num_3m":"142","local_num_6m":"507","local_num_avg_3m":"47.33","local_num_avg_6m":"84.50","remote_num_1m":"0","remote_num_3m":"0","remote_num_6m":"10","remote_num_avg_3m":"0.00","remote_num_avg_6m":"1.67"},"call_third_part_detail":{"call_110_num_1m":"0","call_110_num_3m":"0","call_110_num_6m":"0","call_110_num_avg_3m":"0.00","call_110_num_avg_6m":"0.00","call_110_time_1m":"0","call_110_time_3m":"0","call_110_time_6m":"0","call_110_time_avg_3m":"0","call_110_time_avg_6m":"0","call_120_num_1m":"0","call_120_num_3m":"0","call_120_num_6m":"0","call_120_num_avg_3m":"0.00","call_120_num_avg_6m":"0.00","call_120_time_1m":"0","call_120_time_3m":"0","call_120_time_6m":"0","call_120_time_avg_3m":"0","call_120_time_avg_6m":"0","call_loan_num_1m":"0","call_loan_num_3m":"2","call_loan_num_6m":"3","call_loan_num_avg_3m":"0.67","call_loan_num_avg_6m":"0.50","call_loan_time_1m":"0","call_loan_time_3m":"144","call_loan_time_6m":"264","call_loan_time_avg_3m":"48","call_loan_time_avg_6m":"44","call_credit_card_num_1m":"0","call_credit_card_num_3m":"1","call_credit_card_num_6m":"1","call_credit_card_num_avg_3m":"0.33","call_credit_card_num_avg_6m":"0.17","call_credit_card_time_1m":"0","call_credit_card_time_3m":"288","call_credit_card_time_6m":"288","call_credit_card_time_avg_3m":"96","call_credit_card_time_avg_6m":"48","call_macon_num_1m":"0","call_macon_num_3m":"0","call_macon_num_6m":"0","call_macon_num_avg_3m":"0.00","call_macon_num_avg_6m":"0.00","call_macon_time_1m":"0","call_macon_time_3m":"0","call_macon_time_6m":"0","call_macon_time_avg_3m":"0","call_macon_time_avg_6m":"0","call_collection_firm_num_1m":"0","call_collection_firm_num_3m":"0","call_collection_firm_num_6m":"0","call_collection_firm_num_avg_3m":"0.00","call_collection_firm_num_avg_6m":"0.00","call_collection_firm_time_1m":"0","call_collection_firm_time_3m":"0","call_collection_firm_time_6m":"0","call_collection_firm_time_avg_3m":"0","call_collection_firm_time_avg_6m":"0","call_lawyer_num_1m":"0","call_lawyer_num_3m":"0","call_lawyer_num_6m":"0","call_lawyer_time_1m":"0","call_lawyer_time_3m":"0","call_lawyer_time_6m":"0","call_bank_num_1m":"6","call_bank_num_3m":"7","call_bank_num_6m":"8","call_bank_time_1m":"544","call_bank_time_3m":"832","call_bank_time_6m":"878","call_agency_num_1m":"0","call_agency_num_3m":"0","call_agency_num_6m":"0","call_agency_time_1m":"0","call_agency_time_3m":"0","call_agency_time_6m":"0","call_fraud_num_1m":"0","call_fraud_num_3m":"0","call_fraud_num_6m":"0","call_fraud_time_1m":"0","call_fraud_time_3m":"0","call_fraud_time_6m":"0","call_nuisance_num_1m":"0","call_nuisance_num_3m":"0","call_nuisance_num_6m":"0","call_nuisance_time_1m":"0","call_nuisance_time_3m":"0","call_nuisance_time_6m":"0","call_railway_airway_num_1m":"0","call_railway_airway_num_3m":"0","call_railway_airway_num_6m":"0","call_railway_airway_time_1m":"0","call_railway_airway_time_3m":"0","call_railway_airway_time_6m":"0","call_special_service_num_1m":"0","call_special_service_num_3m":"0","call_special_service_num_6m":"0","call_special_service_time_1m":"0","call_special_service_time_3m":"0","call_special_service_time_6m":"0","call_express_num_1m":"0","call_express_num_3m":"0","call_express_num_6m":"0","call_express_time_1m":"0","call_express_time_3m":"0","call_express_time_6m":"0","call_ins_fin_num_1m":"6","call_ins_fin_num_3m":"7","call_ins_fin_num_6m":"9","call_ins_fin_time_1m":"1586","call_ins_fin_time_3m":"1593","call_ins_fin_time_6m":"2550","call_car_firm_num_1m":"0","call_car_firm_num_3m":"0","call_car_firm_num_6m":"0","call_car_firm_time_1m":"0","call_car_firm_time_3m":"0","call_car_firm_time_6m":"0","call_carrier_num_1m":"0","call_carrier_num_3m":"0","call_carrier_num_6m":"0","call_carrier_time_1m":"0","call_carrier_time_3m":"0","call_carrier_time_6m":"0"},"call_family_detail":{"is_family_net_member_1m":"否","is_family_net_member_3m":"否","is_family_net_member_6m":"否","is_family_net_master_1m":"否","is_family_net_master_3m":"否","is_family_net_master_6m":"否","recharge_month_1m":"1","recharge_month_3m":"3","recharge_month_6m":"6","is_address_match_phone_1m":"否","is_address_match_phone_3m":"否","is_address_match_phone_6m":"是","num_of_call_less_1m":"否","num_of_call_less_3m":"否","num_of_call_less_6m":"否","num_of_call_more_1m":"否","num_of_call_more_3m":"否","num_of_call_more_6m":"否","unpaid_month_1m":"0","unpaid_month_3m":"1","unpaid_month_6m":"2","live_month_1m":"1","live_month_3m":"2","live_month_6m":"5"}}
     * call_service_detail : [{"months":"2016-11","service_num":"95528","total_num":"1","total_time":"288","dial_num":"1","dialed_num":"0","dial_time":"288","dialed_time":"0"},{"months":"2016-11","service_num":"10000","total_num":"1","total_time":"248","dial_num":"1","dialed_num":"0","dial_time":"248","dialed_time":"0"},{"months":"2017-01","service_num":"95533","total_num":"5","total_time":"428","dial_num":"5","dialed_num":"0","dial_time":"428","dialed_time":"0"},{"months":"2017-01","service_num":"95595","total_num":"1","total_time":"116","dial_num":"1","dialed_num":"0","dial_time":"116","dialed_time":"0"},{"months":"2016-10","service_num":"95508","total_num":"1","total_time":"46","dial_num":"0","dialed_num":"1","dial_time":"0","dialed_time":"46"},{"months":"2016-11","service_num":"95188","total_num":"3","total_time":"1081","dial_num":"3","dialed_num":"0","dial_time":"1081","dialed_time":"0"}]
     * active_degree_detail : {"call_day_1m":"11","call_day_3m":"31","call_day_6m":"112","call_day_avg_3m":"10.33","call_day_avg_6m":"18.67","sms_day_1m":"7","sms_day_3m":"23","sms_day_6m":"49","sms_day_avg_3m":"7.67","sms_day_avg_6m":"8.17","recharge_time_1m":"4","recharge_time_3m":"12","recharge_time_6m":"21","recharge_time_avg_3m":"4.00","recharge_time_avg_6m":"3.50","call_time_1m":"50","call_time_3m":"142","call_time_6m":"517","call_time_avg_3m":"47.33","call_time_avg_6m":"86.17","sms_time_1m":"20","sms_time_3m":"56","sms_time_6m":"113","sms_time_avg_3m":"18.67","sms_time_avg_6m":"18.83","flow_total_1m":"10997760","flow_total_3m":"12231168","flow_total_6m":"12231168","flow_total_avg_3m":"4077056","flow_total_avg_6m":"2038528","flow_used_1m":"1111050","flow_used_3m":"4641443","flow_used_6m":"4641443","flow_used_avg_3m":"1547148","flow_used_avg_6m":"773574","call_avg_duration_1m":"230","call_avg_duration_3m":"247","call_avg_duration_6m":"158","no_dial_day_1m":"6","no_dial_day_3m":"52","no_dial_day_6m":"79","no_dial_day_avg_3m":"17.33","no_dial_day_avg_6m":"13.17","no_dial_day_percent_1m":"0.38","no_dial_day_percent_3m":"0.68","no_dial_day_percent_6m":"0.47","no_call_day_1m":"5","no_call_day_3m":"46","no_call_day_6m":"57","no_call_day_avg_3m":"15.33","no_call_day_avg_6m":"9.50","no_call_day_percent_1m":"0.31","no_call_day_percent_3m":"0.60","no_call_day_percent_6m":"0.34","power_on_max_day_1m":"16","power_on_max_day_3m":"22","power_on_max_day_6m":"23","power_off_day_1m":"0","power_off_day_3m":"33","power_off_day_6m":"44","power_off_day_percent_1m":"0.00","power_off_day_percent_3m":"0.43","power_off_day_percent_6m":"0.26","continue_power_off_num_1m":"0","continue_power_off_num_3m":"1","continue_power_off_num_6m":"1"}
     * consumption_detail : {"total_fee_1m":"7660","total_fee_3m":"105961","total_fee_6m":"142656","total_fee_avg_3m":"35320","total_fee_avg_6m":"23776","web_fee_1m":"0","web_fee_3m":"70496","web_fee_6m":"70496","web_fee_avg_3m":"23499","web_fee_avg_6m":"11749","call_fee_1m":"0","call_fee_3m":"4365","call_fee_6m":"6630","call_fee_avg_3m":"1455","call_fee_avg_6m":"1105","sms_fee_1m":"0","sms_fee_3m":"490","sms_fee_6m":"900","sms_fee_avg_3m":"163","sms_fee_avg_6m":"150","vas_fee_1m":"0","vas_fee_3m":"0","vas_fee_6m":"0","vas_fee_avg_3m":"0","vas_fee_avg_6m":"0","extra_fee_1m":"0","extra_fee_3m":"11150","extra_fee_6m":"27470","extra_fee_avg_3m":"3717","extra_fee_avg_6m":"4578","recharge_amount_1m":"10000","recharge_amount_3m":"47000","recharge_amount_6m":"86200","recharge_amount_avg_3m":"15667","recharge_amount_avg_6m":"14367"}
     * roam_detail : [{"roam_day":"2016-08-18","roam_location":"合肥"},{"roam_day":"2016-08-16","roam_location":"合肥"},{"roam_day":"2016-08-15","roam_location":"滁州"},{"roam_day":"2016-08-15","roam_location":"湖州"},{"roam_day":"2016-08-15","roam_location":"合肥"}]
     */

    private String code;
    private String message;
    private String update_time;
    private UserBasicInfoBean user_basic_info;
    private DataSourceBean data_source;
    private FriendCircleBean friend_circle;
    private ActiveDegreeDetailBean active_degree_detail;
    private ConsumptionDetailBean consumption_detail;
    private List<BasicInfoCheckItemsBean> basic_info_check_items;
    private List<CallServiceDetailBean> call_service_detail;
    private List<RoamDetailBean> roam_detail;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public UserBasicInfoBean getUser_basic_info() {
        return user_basic_info;
    }

    public void setUser_basic_info(UserBasicInfoBean user_basic_info) {
        this.user_basic_info = user_basic_info;
    }

    public DataSourceBean getData_source() {
        return data_source;
    }

    public void setData_source(DataSourceBean data_source) {
        this.data_source = data_source;
    }

    public FriendCircleBean getFriend_circle() {
        return friend_circle;
    }

    public void setFriend_circle(FriendCircleBean friend_circle) {
        this.friend_circle = friend_circle;
    }

    public ActiveDegreeDetailBean getActive_degree_detail() {
        return active_degree_detail;
    }

    public void setActive_degree_detail(ActiveDegreeDetailBean active_degree_detail) {
        this.active_degree_detail = active_degree_detail;
    }

    public ConsumptionDetailBean getConsumption_detail() {
        return consumption_detail;
    }

    public void setConsumption_detail(ConsumptionDetailBean consumption_detail) {
        this.consumption_detail = consumption_detail;
    }

    public List<BasicInfoCheckItemsBean> getBasic_info_check_items() {
        return basic_info_check_items;
    }

    public void setBasic_info_check_items(List<BasicInfoCheckItemsBean> basic_info_check_items) {
        this.basic_info_check_items = basic_info_check_items;
    }

    public List<CallServiceDetailBean> getCall_service_detail() {
        return call_service_detail;
    }

    public void setCall_service_detail(List<CallServiceDetailBean> call_service_detail) {
        this.call_service_detail = call_service_detail;
    }

    public List<RoamDetailBean> getRoam_detail() {
        return roam_detail;
    }

    public void setRoam_detail(List<RoamDetailBean> roam_detail) {
        this.roam_detail = roam_detail;
    }

    public static class UserBasicInfoBean {
        /**
         * name : 朱爱月
         * idcard : 342622199309298186
         * mobile : 18066212532
         * gender : 女
         * age : 24
         * constellation : 天秤座
         * email : 未知
         * address : 安徽省庐江县泥河镇河南村底屯1广屯1组38号
         * name_from_custom : 朱爱月
         * idcard_from_custom : 342622199309298186
         * native_place : 安徽省庐江县
         * live_address : 浙江金华
         * work_address : 金华
         */

        private String name;
        private String idcard;
        private String mobile;
        private String gender;
        private String age;
        private String constellation;
        private String email;
        private String address;
        private String name_from_custom;
        private String idcard_from_custom;
        private String native_place;
        private String live_address;
        private String work_address;

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

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getConstellation() {
            return constellation;
        }

        public void setConstellation(String constellation) {
            this.constellation = constellation;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName_from_custom() {
            return name_from_custom;
        }

        public void setName_from_custom(String name_from_custom) {
            this.name_from_custom = name_from_custom;
        }

        public String getIdcard_from_custom() {
            return idcard_from_custom;
        }

        public void setIdcard_from_custom(String idcard_from_custom) {
            this.idcard_from_custom = idcard_from_custom;
        }

        public String getNative_place() {
            return native_place;
        }

        public void setNative_place(String native_place) {
            this.native_place = native_place;
        }

        public String getLive_address() {
            return live_address;
        }

        public void setLive_address(String live_address) {
            this.live_address = live_address;
        }

        public String getWork_address() {
            return work_address;
        }

        public void setWork_address(String work_address) {
            this.work_address = work_address;
        }
    }

    public static class DataSourceBean {
        /**
         * source_name : 浙江电信
         * data_type : 运营商
         * data_gain_time : 2017-01-16
         */

        private String source_name;
        private String data_type;
        private String data_gain_time;

        public String getSource_name() {
            return source_name;
        }

        public void setSource_name(String source_name) {
            this.source_name = source_name;
        }

        public String getData_type() {
            return data_type;
        }

        public void setData_type(String data_type) {
            this.data_type = data_type;
        }

        public String getData_gain_time() {
            return data_gain_time;
        }

        public void setData_gain_time(String data_gain_time) {
            this.data_gain_time = data_gain_time;
        }
    }

    public static class FriendCircleBean {
        /**
         * friend_num_3m : 47
         * good_friend_num_3m : 2
         * friend_city_center_3m : 合肥
         * is_city_match_friend_city_center_3m : 否
         * inter_peer_num_3m : 11
         * friend_num_6m : 126
         * good_friend_num_6m : 11
         * friend_city_center_6m : 金华
         * is_city_match_friend_city_center_6m : 是
         * inter_peer_num_6m : 26
         * call_num_top3_3m : [{"city":"合肥","peer_number":"15256943459","call_num":"14","call_time":"5433","dial_num":"7","dialed_num":"7"},{"city":"金华","peer_number":"15267349871","call_num":"12","call_time":"1444","dial_num":"7","dialed_num":"5"},{"city":"","peer_number":"4008580580","call_num":"8","call_time":"3440","dial_num":"8","dialed_num":"0"}]
         * call_num_top3_6m : [{"city":"金华","peer_number":"18072693133","call_num":"52","call_time":"1544","dial_num":"18","dialed_num":"34"},{"city":"合肥","peer_number":"18256594193","call_num":"49","call_time":"7020","dial_num":"20","dialed_num":"29"},{"city":"金华","peer_number":"15267349871","call_num":"47","call_time":"4419","dial_num":"29","dialed_num":"18"}]
         * call_location_top3_3m : [{"city":"合肥","call_num":"35","peer_number_count":"5","call_time":"9705","dial_num":"16","dialed_num":"19"},{"city":"金华","call_num":"22","peer_number_count":"7","call_time":"4200","dial_num":"16","dialed_num":"6"},{"city":"上海","call_num":"11","peer_number_count":"5","call_time":"1788","dial_num":"2","dialed_num":"9"}]
         * call_location_top3_6m : [{"city":"金华","call_num":"183","peer_number_count":"39","call_time":"15673","dial_num":"97","dialed_num":"86"},{"city":"合肥","call_num":"149","peer_number_count":"10","call_time":"33339","dial_num":"76","dialed_num":"73"},{"city":"上海","call_num":"26","peer_number_count":"10","call_time":"3228","dial_num":"9","dialed_num":"17"}]
         * designated_contact : [{"peer_num":"string","city":"string","call_num_1w":"string","call_num_1m":"string","call_num_3m":"string","call_num_6m":"string","call_time_3m":"string","call_time_6m":"string","dial_num_3m":"string","dial_num_6m":"string","dialed_num_3m":"string","dialed_num_6m":"string","call_num_morning_3m":"string","call_num_morning_6m":"string","call_num_noon_3m":"string","call_num_noon_6m":"string","call_num_afternoon_3m":"string","call_num_afternoon_6m":"string","call_num_evening_3m":"string","call_num_evening_6m":"string","call_num_night_3m":"string","call_num_night_6m":"string","call_num_weekday_3m":"string","call_num_weekday_6m":"string","call_num_weekend_3m":"string","call_num_weekend_6m":"string","call_num_holiday_3m":"string","call_num_holiday_6m":"string","call_if_whole_day_3m":"string","call_if_whole_day_6m":"string"}]
         * risk_analysis : {"in_time":"20","mobile_silence_3m":"0","arrearage_risk_3m":"0","binding_risk":"10","mobile_silence_6m":"0","arrearage_risk_6m":"1","is_name_and_idcard_in_court_black":"否","is_name_and_idcard_in_finance_black":"否","is_name_and_mobile_in_finance_black":"否","risk_check_item":[{"item":"call_credit_card","call_num_3m":"1","call_time_3m":"288","call_num_6m":"1","call_time_6m":"288"},{"item":"call_loan","call_num_3m":"2","call_time_3m":"144","call_num_6m":"3","call_time_6m":"264"},{"item":"call_collection","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"},{"item":"call_110","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"},{"item":"call_120","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"}]}
         * active_degree : {"call_day_3m":"31","dial_num_3m":"95","dialed_num_3m":"47","dial_duration_3m":"24642","dialed_duration_3m":"10414","call_day_6m":"112","dial_num_6m":"286","dialed_num_6m":"231","dial_duration_6m":"55571","dialed_duration_6m":"25995"}
         * consumption_analysis : {"total_fee_3m":"105961","total_fee_6m":"142656","recharge_time_3m":"12","recharge_time_6m":"21","recharge_max_amount_3m":"10000","recharge_max_amount_6m":"10000","bill_latest_certification_day":"2017-01-16","web_fee_1m":"0","web_fee_3m":"70496","web_fee_6m":"70496","web_fee_avg_3m":"23499","web_fee_avg_6m":"11749","sms_fee_1m":"0","sms_fee_3m":"490","sms_fee_6m":"900","sms_fee_avg_3m":"163","sms_fee_avg_6m":"150","call_fee_1m":"0","call_fee_3m":"4365","call_fee_6m":"6630","call_fee_avg_3m":"1455","call_fee_avg_6m":"1105","vas_fee_1m":"0","vas_fee_3m":"0","vas_fee_6m":"0","vas_fee_avg_3m":"0","vas_fee_avg_6m":"0"}
         * roam_analysis : [{"roam_location":"合肥","roam_day_num_3m":"0","roam_day_num_6m":"3","continue_roam_num_3m":"0","continue_roam_num_6m":"1","max_roam_day_num_3m":"0","max_roam_day_num_6m":"2"},{"roam_location":"滁州","roam_day_num_3m":"0","roam_day_num_6m":"1","continue_roam_num_3m":"0","continue_roam_num_6m":"0","max_roam_day_num_3m":"0","max_roam_day_num_6m":"1"},{"roam_location":"湖州","roam_day_num_3m":"0","roam_day_num_6m":"1","continue_roam_num_3m":"0","continue_roam_num_6m":"0","max_roam_day_num_3m":"0","max_roam_day_num_6m":"1"}]
         * call_analysis : {"total_num_1m":"50","total_num_3m":"142","total_num_6m":"517","total_num_avg_3m":"47.33","total_num_avg_6m":"86.17","total_time_1m":"11490","total_time_3m":"35056","total_time_6m":"81566","total_time_avg_3m":"11685","total_time_avg_6m":"13594","total_peer_num_1m":"15","total_peer_num_3m":"47","total_peer_num_6m":"126","total_peer_num_avg_3m":"15.67","total_peer_num_avg_6m":"21.00","total_city_num_1m":"5","total_city_num_3m":"14","total_city_num_6m":"30","total_city_num_avg_3m":"4.67","total_city_num_avg_6m":"5.00","total_dial_num_1m":"31","total_dial_num_3m":"95","total_dial_num_6m":"286","total_dial_num_avg_3m":"31.67","total_dial_num_avg_6m":"47.67","total_dialed_num_1m":"19","total_dialed_num_3m":"47","total_dialed_num_6m":"231","total_dialed_num_avg_3m":"15.67","total_dialed_num_avg_6m":"38.50","total_dial_peer_num_1m":"12","total_dial_peer_num_3m":"35","total_dial_peer_num_6m":"75","total_dial_peer_num_avg_3":"11.67","total_dial_peer_num_avg_6":"12.50","total_dialed_peer_num_1m":"8","total_dialed_peer_num_3m":"23","total_dialed_peer_num_6m":"77","total_dialed_peer_num_avg_3m":"7.67","total_dialed_peer_num_avg_6m":"12.83"}
         * call_contact_detail : [{"city":"金华","peer_num":"18072693133","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"52","call_time_3m":"0","call_time_6m":"1544","dial_num_3m":"0","dial_num_6m":"18","dialed_num_3m":"0","dialed_num_6m":"34","call_num_morning_3m":"0","call_num_morning_6m":"15","call_num_noon_3m":"0","call_num_noon_6m":"4","call_num_afternoon_3m":"0","call_num_afternoon_6m":"13","call_num_evening_3m":"0","call_num_evening_6m":"8","call_num_night_3m":"0","call_num_night_6m":"12","call_num_weekday_3m":"0","call_num_weekday_6m":"40","call_num_weekend_3m":"0","call_num_weekend_6m":"10","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18256594193","call_num_1w":"1","call_num_1m":"2","call_num_3m":"4","call_num_6m":"49","call_time_3m":"941","call_time_6m":"7020","dial_num_3m":"2","dial_num_6m":"20","dialed_num_3m":"2","dialed_num_6m":"29","call_num_morning_3m":"0","call_num_morning_6m":"11","call_num_noon_3m":"1","call_num_noon_6m":"9","call_num_afternoon_3m":"1","call_num_afternoon_6m":"9","call_num_evening_3m":"2","call_num_evening_6m":"17","call_num_night_3m":"0","call_num_night_6m":"3","call_num_weekday_3m":"2","call_num_weekday_6m":"35","call_num_weekend_3m":"2","call_num_weekend_6m":"8","call_num_holiday_3m":"0","call_num_holiday_6m":"6","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15267349871","call_num_1w":"7","call_num_1m":"8","call_num_3m":"12","call_num_6m":"47","call_time_3m":"1444","call_time_6m":"4419","dial_num_3m":"7","dial_num_6m":"29","dialed_num_3m":"5","dialed_num_6m":"18","call_num_morning_3m":"1","call_num_morning_6m":"3","call_num_noon_3m":"4","call_num_noon_6m":"5","call_num_afternoon_3m":"4","call_num_afternoon_6m":"17","call_num_evening_3m":"3","call_num_evening_6m":"22","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"9","call_num_weekday_6m":"32","call_num_weekend_3m":"2","call_num_weekend_6m":"9","call_num_holiday_3m":"1","call_num_holiday_6m":"6","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"15056580271","call_num_1w":"3","call_num_1m":"4","call_num_3m":"8","call_num_6m":"33","call_time_3m":"1550","call_time_6m":"7125","dial_num_3m":"4","dial_num_6m":"21","dialed_num_3m":"4","dialed_num_6m":"12","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"5","call_num_afternoon_3m":"2","call_num_afternoon_6m":"3","call_num_evening_3m":"6","call_num_evening_6m":"25","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"4","call_num_weekday_6m":"20","call_num_weekend_3m":"4","call_num_weekend_6m":"11","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18256534246","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"25","call_time_3m":"0","call_time_6m":"8327","dial_num_3m":"0","dial_num_6m":"13","dialed_num_3m":"0","dialed_num_6m":"12","call_num_morning_3m":"0","call_num_morning_6m":"2","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"6","call_num_evening_3m":"0","call_num_evening_6m":"17","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"17","call_num_weekend_3m":"0","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"4","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18096685219","call_num_1w":"4","call_num_1m":"5","call_num_3m":"8","call_num_6m":"15","call_time_3m":"1628","call_time_6m":"2758","dial_num_3m":"3","dial_num_6m":"10","dialed_num_3m":"5","dialed_num_6m":"5","call_num_morning_3m":"0","call_num_morning_6m":"2","call_num_noon_3m":"2","call_num_noon_6m":"4","call_num_afternoon_3m":"4","call_num_afternoon_6m":"5","call_num_evening_3m":"2","call_num_evening_6m":"4","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"5","call_num_weekday_6m":"10","call_num_weekend_3m":"3","call_num_weekend_6m":"3","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"15256943459","call_num_1w":"2","call_num_1m":"8","call_num_3m":"14","call_num_6m":"14","call_time_3m":"5433","call_time_6m":"5433","dial_num_3m":"7","dial_num_6m":"7","dialed_num_3m":"7","dialed_num_6m":"7","call_num_morning_3m":"1","call_num_morning_6m":"1","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"11","call_num_evening_6m":"11","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"9","call_num_weekday_6m":"9","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"1","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008200588","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"14","call_time_3m":"76","call_time_6m":"2288","dial_num_3m":"1","dial_num_6m":"14","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"11","call_num_evening_3m":"1","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"14","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"广州","peer_num":"18666004655","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"14","call_time_3m":"0","call_time_6m":"1121","dial_num_3m":"0","dial_num_6m":"9","dialed_num_3m":"0","dialed_num_6m":"5","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"9","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"12","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15325907868","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"12","call_time_3m":"0","call_time_6m":"2838","dial_num_3m":"0","dial_num_6m":"10","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"4","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"5","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"9","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15397500435","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"12","call_time_3m":"0","call_time_6m":"507","dial_num_3m":"0","dial_num_6m":"6","dialed_num_3m":"0","dialed_num_6m":"6","call_num_morning_3m":"0","call_num_morning_6m":"7","call_num_noon_3m":"0","call_num_noon_6m":"4","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"7","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"3","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18110910311","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"9","call_time_3m":"0","call_time_6m":"2162","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"6","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"3","call_num_evening_3m":"0","call_num_evening_6m":"4","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"4","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008580580","call_num_1w":"5","call_num_1m":"5","call_num_3m":"8","call_num_6m":"8","call_time_3m":"3440","call_time_6m":"3440","dial_num_3m":"8","dial_num_6m":"8","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"2","call_num_noon_6m":"2","call_num_afternoon_3m":"5","call_num_afternoon_6m":"5","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"6","call_num_weekend_6m":"6","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95511","call_num_1w":"6","call_num_1m":"6","call_num_3m":"6","call_num_6m":"8","call_time_3m":"1586","call_time_6m":"2543","dial_num_3m":"6","dial_num_6m":"8","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"2","call_num_afternoon_6m":"3","call_num_evening_3m":"4","call_num_evening_6m":"5","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"3","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"嘉兴","peer_num":"15356736616","call_num_1w":"0","call_num_1m":"0","call_num_3m":"6","call_num_6m":"6","call_time_3m":"2576","call_time_6m":"2576","dial_num_3m":"4","dial_num_6m":"4","dialed_num_3m":"2","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"5","call_num_evening_6m":"5","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"6","call_num_weekday_6m":"6","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"02195511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"3","call_num_6m":"6","call_time_3m":"1466","call_time_6m":"1577","dial_num_3m":"2","dial_num_6m":"3","dialed_num_3m":"1","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"5","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"13472769214","call_num_1w":"0","call_num_1m":"0","call_num_3m":"6","call_num_6m":"6","call_time_3m":"1226","call_time_6m":"1226","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"4","dialed_num_6m":"4","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"4","call_num_afternoon_6m":"4","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"4","call_num_weekday_6m":"4","call_num_weekend_3m":"2","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15268647494","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"6","call_time_3m":"0","call_time_6m":"570","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"5","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"衢州","peer_num":"17858597592","call_num_1w":"0","call_num_1m":"0","call_num_3m":"5","call_num_6m":"5","call_time_3m":"629","call_time_6m":"629","dial_num_3m":"5","dial_num_6m":"5","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"4","call_num_evening_6m":"4","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"5","call_num_weekday_6m":"5","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95533","call_num_1w":"5","call_num_1m":"5","call_num_3m":"5","call_num_6m":"5","call_time_3m":"428","call_time_6m":"428","dial_num_3m":"5","dial_num_6m":"5","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"3","call_num_afternoon_6m":"3","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"18019384689","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"5","call_time_3m":"0","call_time_6m":"325","dial_num_3m":"0","dial_num_6m":"5","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"4","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"鹤岗","peer_num":"13339585567","call_num_1w":"0","call_num_1m":"0","call_num_3m":"4","call_num_6m":"4","call_time_3m":"689","call_time_6m":"689","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"2","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"3","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"4","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008208788","call_num_1w":"0","call_num_1m":"0","call_num_3m":"4","call_num_6m":"4","call_time_3m":"667","call_time_6m":"667","dial_num_3m":"4","dial_num_6m":"4","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"3","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4006965858","call_num_1w":"0","call_num_1m":"0","call_num_3m":"4","call_num_6m":"4","call_time_3m":"363","call_time_6m":"363","dial_num_3m":"4","dial_num_6m":"4","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"3","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"4","call_num_weekend_6m":"4","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728219781","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"4","call_time_3m":"0","call_time_6m":"189","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"4","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657948334","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"4","call_time_3m":"0","call_time_6m":"151","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"4","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"4","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95188","call_num_1w":"0","call_num_1m":"0","call_num_3m":"3","call_num_6m":"3","call_time_3m":"1081","call_time_6m":"1081","dial_num_3m":"3","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"1","call_num_night_6m":"1","call_num_weekday_3m":"3","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"揭阳","peer_num":"18128312660","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"724","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"3","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4006095511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"461","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"3","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02110100000","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"420","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02164262933","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"3","call_time_3m":"224","call_time_6m":"347","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"2","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"1","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"温州","peer_num":"15057337955","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"253","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13857965583","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"130","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"3","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18066237918","call_num_1w":"0","call_num_1m":"0","call_num_3m":"3","call_num_6m":"3","call_time_3m":"108","call_time_6m":"108","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"3","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18057940251","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"86","dial_num_3m":"0","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"3","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"15384064025","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"3","call_time_3m":"0","call_time_6m":"78","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"3","call_num_morning_3m":"0","call_num_morning_6m":"2","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"3","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13735729122","call_num_1w":"0","call_num_1m":"1","call_num_3m":"1","call_num_6m":"3","call_time_3m":"16","call_time_6m":"55","dial_num_3m":"1","dial_num_6m":"3","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"1","call_num_morning_6m":"2","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"1","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15868931157","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"2499","call_time_6m":"2499","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"2","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18066239082","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"1496","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4008267710","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"730","call_time_6m":"730","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"宁波","peer_num":"18958321333","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"555","call_time_6m":"555","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"15868102662","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"503","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"宜春","peer_num":"13870561918","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"447","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"2","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"北京","peer_num":"17180051797","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"434","call_time_6m":"434","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"嘉兴","peer_num":"18405736668","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"396","call_time_6m":"396","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"1","call_num_night_6m":"1","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"宁波","peer_num":"17077883232","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"296","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"15921215368","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"257","dial_num_3m":"0","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02131570006","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"2","call_time_3m":"4","call_time_6m":"216","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4006099400","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"144","call_time_6m":"144","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"2","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"广州","peer_num":"13825117723","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"91","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728018217","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"79","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"中山","peer_num":"18666170846","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"78","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13757941780","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"2","call_time_3m":"49","call_time_6m":"74","dial_num_3m":"1","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"1","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18058986466","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"72","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15988539779","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"68","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"2","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"2","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"17769931226","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"55","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02131599587","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"53","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15967943481","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"51","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4000271262","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"46","call_time_6m":"46","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"2","call_num_afternoon_6m":"2","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18157939715","call_num_1w":"0","call_num_1m":"0","call_num_3m":"2","call_num_6m":"2","call_time_3m":"35","call_time_6m":"35","dial_num_3m":"2","dial_num_6m":"2","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"2","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"2","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13705791514","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"2","call_time_3m":"0","call_time_6m":"32","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"2","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"2","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"2","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"南京","peer_num":"15951904533","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"2492","call_time_6m":"2492","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"057188158198","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"506","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"15000306493","call_num_1w":"0","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"297","call_time_6m":"297","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95528","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"288","call_time_6m":"288","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"深圳","peer_num":"075532983321","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"267","call_time_6m":"267","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"1","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"10000","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"248","call_time_6m":"248","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"13909695058","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"230","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"051295511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"192","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728219117","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"191","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4000271265","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"171","call_time_6m":"171","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"89897777","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"159","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"1","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"朝阳","peer_num":"15042836212","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"155","call_time_6m":"155","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"15655180347","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"153","call_time_6m":"153","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"常州","peer_num":"051969868500","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"140","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"02112329","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"129","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15381790198","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"128","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"深圳","peer_num":"075533987194","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"127","call_time_6m":"127","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"4001848888","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"120","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"台州","peer_num":"18857651662","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"117","call_time_6m":"117","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95595","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"116","call_time_6m":"116","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"075595511","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"95","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"13865912855","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"95","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"赣州","peer_num":"13607971067","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"86","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"台州","peer_num":"13073893496","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"85","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"057982069302","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"81","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"成都","peer_num":"02868369240","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"81","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13065964873","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"76","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"吕梁","peer_num":"18534871020","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"73","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"濮阳","peer_num":"13949711776","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"70","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"郑州","peer_num":"15638863586","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"69","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"05711183180","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"68","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"北京","peer_num":"01085557019","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"56","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"呼和浩特","peer_num":"15034791876","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"56","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"85261827","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"55","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"北京","peer_num":"13611172679","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"55","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02131835228","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"50","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"85851081","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"49","call_time_6m":"49","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13735721113","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"49","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"岳阳","peer_num":"18975054977","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"47","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657942424","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"46","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95508","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"46","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"湖州","peer_num":"05728018830","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"45","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"057985261827","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"43","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"中山","peer_num":"13392921817","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"43","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"济南","peer_num":"13176017458","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"42","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"达州","peer_num":"13982880261","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"37","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"上海","peer_num":"02180217042","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"37","call_time_6m":"37","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"1","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"合肥","peer_num":"18100509031","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"36","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"杭州","peer_num":"057126204215","call_num_1w":"0","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"36","call_time_6m":"36","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"1","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13575958181","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"28","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18367980954","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"25","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"15267941189","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"23","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"1","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"0","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657938054","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"22","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"1","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657937544","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"21","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"苏州","peer_num":"15050180313","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"20","call_time_6m":"20","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"1","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18395966598","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"19","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13967493375","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"17","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"揭阳","peer_num":"18718611168","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"16","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"12329","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"15","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"18657948274","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"15","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13064656565","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"14","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"1","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"10100000","call_num_1w":"1","call_num_1m":"1","call_num_3m":"1","call_num_6m":"1","call_time_3m":"13","call_time_6m":"13","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"0","call_num_weekend_3m":"1","call_num_weekend_6m":"1","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"13777906711","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"8","dial_num_3m":"0","dial_num_6m":"0","dialed_num_3m":"0","dialed_num_6m":"1","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"","peer_num":"95518","call_num_1w":"0","call_num_1m":"0","call_num_3m":"1","call_num_6m":"1","call_time_3m":"7","call_time_6m":"7","dial_num_3m":"1","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"0","call_num_evening_3m":"1","call_num_evening_6m":"1","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"1","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"},{"city":"金华","peer_num":"9551143","call_num_1w":"0","call_num_1m":"0","call_num_3m":"0","call_num_6m":"1","call_time_3m":"0","call_time_6m":"5","dial_num_3m":"0","dial_num_6m":"1","dialed_num_3m":"0","dialed_num_6m":"0","call_num_morning_3m":"0","call_num_morning_6m":"0","call_num_noon_3m":"0","call_num_noon_6m":"0","call_num_afternoon_3m":"0","call_num_afternoon_6m":"1","call_num_evening_3m":"0","call_num_evening_6m":"0","call_num_night_3m":"0","call_num_night_6m":"0","call_num_weekday_3m":"0","call_num_weekday_6m":"1","call_num_weekend_3m":"0","call_num_weekend_6m":"0","call_num_holiday_3m":"0","call_num_holiday_6m":"0","call_if_whole_day_3m":"否","call_if_whole_day_6m":"否"}]
         * call_duration_detail_3m : [{"time_step":"早晨[5:30-9:00]","total_num":"0","peer_num":"0","total_time":"0","dial_num":"0","dialed_num":"0","latest_call_time":"-","farthest_call_time":"-"},{"time_step":"上午[9:00-11:30]","total_num":"5","peer_num":"5","total_time":"846","dial_num":"3","dialed_num":"2","latest_call_time":"20170110-112338","farthest_call_time":"20170101-100326"},{"time_step":"中午[11:30-13:30]","total_num":"20","peer_num":"14","total_time":"3855","dial_num":"13","dialed_num":"7","latest_call_time":"20170114-131348","farthest_call_time":"20161116-121445"},{"time_step":"下午[13:30-17:30]","total_num":"47","peer_num":"28","total_time":"9287","dial_num":"30","dialed_num":"17","latest_call_time":"20170115-144726","farthest_call_time":"20161101-163114"},{"time_step":"傍晚[17:30-19:30]","total_num":"28","peer_num":"13","total_time":"8908","dial_num":"18","dialed_num":"10","latest_call_time":"20170110-191204","farthest_call_time":"20161103-173949"},{"time_step":"晚上[19:30-23:30]","total_num":"40","peer_num":"20","total_time":"11931","dial_num":"29","dialed_num":"11","latest_call_time":"20170115-223636","farthest_call_time":"20161102-203943"},{"time_step":"凌晨[23:30-1:30]","total_num":"2","peer_num":"2","total_time":"229","dial_num":"2","dialed_num":"0","latest_call_time":"20161124-002921","farthest_call_time":"20161116-001153"},{"time_step":"深夜[1:30-5:30]","total_num":"0","peer_num":"0","total_time":"0","dial_num":"0","dialed_num":"0","latest_call_time":"-","farthest_call_time":"-"}]
         * call_duration_detail_6m : [{"time_step":"早晨[5:30-9:00]","total_num":"20","peer_num":"8","total_time":"3748","dial_num":"10","dialed_num":"10","latest_call_time":"20160913-071127","farthest_call_time":"20160805-085912"},{"time_step":"上午[9:00-11:30]","total_num":"57","peer_num":"25","total_time":"3787","dial_num":"26","dialed_num":"31","latest_call_time":"20170110-112338","farthest_call_time":"20160801-092155"},{"time_step":"中午[11:30-13:30]","total_num":"64","peer_num":"34","total_time":"7401","dial_num":"36","dialed_num":"28","latest_call_time":"20170114-131348","farthest_call_time":"20160802-132358"},{"time_step":"下午[13:30-17:30]","total_num":"180","peer_num":"78","total_time":"22954","dial_num":"92","dialed_num":"88","latest_call_time":"20170115-144726","farthest_call_time":"20160802-133039"},{"time_step":"傍晚[17:30-19:30]","total_num":"66","peer_num":"22","total_time":"15947","dial_num":"39","dialed_num":"27","latest_call_time":"20170110-191204","farthest_call_time":"20160802-173555"},{"time_step":"晚上[19:30-23:30]","total_num":"109","peer_num":"35","total_time":"24120","dial_num":"72","dialed_num":"37","latest_call_time":"20170115-223636","farthest_call_time":"20160801-193423"},{"time_step":"凌晨[23:30-1:30]","total_num":"14","peer_num":"6","total_time":"3345","dial_num":"7","dialed_num":"7","latest_call_time":"20161124-002921","farthest_call_time":"20160808-010042"},{"time_step":"深夜[1:30-5:30]","total_num":"7","peer_num":"4","total_time":"264","dial_num":"4","dialed_num":"3","latest_call_time":"20160920-052941","farthest_call_time":"20160808-024951"}]
         * call_location_detail_3m : [{"city":"合肥","total_num":"35","peer_num":"5","total_time":"9705","dial_num":"16","dialed_num":"19","dialed_time":"4180","dial_time":"5525","dial_time_avg":"345","dialed_time_avg":"220","dial_num_percent":"0.46","dialed_num_percent":"0.54","dial_time_percent":"0.57","dialed_time_percent":"0.43"},{"city":"金华","total_num":"22","peer_num":"7","total_time":"4200","dial_num":"16","dialed_num":"6","dialed_time":"308","dial_time":"3892","dial_time_avg":"243","dialed_time_avg":"51","dial_num_percent":"0.73","dialed_num_percent":"0.27","dial_time_percent":"0.93","dialed_time_percent":"0.07"},{"city":"上海","total_num":"11","peer_num":"5","total_time":"1788","dial_num":"2","dialed_num":"9","dialed_time":"1052","dial_time":"736","dial_time_avg":"368","dialed_time_avg":"117","dial_num_percent":"0.18","dialed_num_percent":"0.82","dial_time_percent":"0.41","dialed_time_percent":"0.59"},{"city":"嘉兴","total_num":"8","peer_num":"2","total_time":"2972","dial_num":"6","dialed_num":"2","dialed_time":"342","dial_time":"2630","dial_time_avg":"438","dialed_time_avg":"171","dial_num_percent":"0.75","dialed_num_percent":"0.25","dial_time_percent":"0.88","dialed_time_percent":"0.12"},{"city":"衢州","total_num":"5","peer_num":"1","total_time":"629","dial_num":"5","dialed_num":"0","dialed_time":"0","dial_time":"629","dial_time_avg":"126","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"鹤岗","total_num":"4","peer_num":"1","total_time":"689","dial_num":"2","dialed_num":"2","dialed_time":"178","dial_time":"511","dial_time_avg":"256","dialed_time_avg":"89","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.74","dialed_time_percent":"0.26"},{"city":"宁波","total_num":"2","peer_num":"1","total_time":"555","dial_num":"1","dialed_num":"1","dialed_time":"97","dial_time":"458","dial_time_avg":"458","dialed_time_avg":"97","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.83","dialed_time_percent":"0.17"},{"city":"北京","total_num":"2","peer_num":"1","total_time":"434","dial_num":"2","dialed_num":"0","dialed_time":"0","dial_time":"434","dial_time_avg":"217","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"深圳","total_num":"2","peer_num":"2","total_time":"394","dial_num":"0","dialed_num":"2","dialed_time":"394","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"197","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"南京","total_num":"1","peer_num":"1","total_time":"2492","dial_num":"0","dialed_num":"1","dialed_time":"2492","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"2492","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"朝阳","total_num":"1","peer_num":"1","total_time":"155","dial_num":"0","dialed_num":"1","dialed_time":"155","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"155","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"台州","total_num":"1","peer_num":"1","total_time":"117","dial_num":"0","dialed_num":"1","dialed_time":"117","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"117","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"杭州","total_num":"1","peer_num":"1","total_time":"36","dial_num":"0","dialed_num":"1","dialed_time":"36","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"36","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"苏州","total_num":"1","peer_num":"1","total_time":"20","dial_num":"0","dialed_num":"1","dialed_time":"20","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"20","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"}]
         * call_location_detail_6m : [{"city":"金华","total_num":"183","peer_num":"39","total_time":"15673","dial_num":"97","dialed_num":"86","dialed_time":"3620","dial_time":"12053","dial_time_avg":"124","dialed_time_avg":"42","dial_num_percent":"0.53","dialed_num_percent":"0.47","dial_time_percent":"0.77","dialed_time_percent":"0.23"},{"city":"合肥","total_num":"149","peer_num":"10","total_time":"33339","dial_num":"76","dialed_num":"73","dialed_time":"11758","dial_time":"21581","dial_time_avg":"284","dialed_time_avg":"161","dial_num_percent":"0.51","dialed_num_percent":"0.49","dial_time_percent":"0.65","dialed_time_percent":"0.35"},{"city":"上海","total_num":"26","peer_num":"10","total_time":"3228","dial_num":"9","dialed_num":"17","dialed_time":"1910","dial_time":"1318","dial_time_avg":"146","dialed_time_avg":"112","dial_num_percent":"0.35","dialed_num_percent":"0.65","dial_time_percent":"0.41","dialed_time_percent":"0.59"},{"city":"广州","total_num":"16","peer_num":"2","total_time":"1212","dial_num":"9","dialed_num":"7","dialed_time":"522","dial_time":"690","dial_time_avg":"77","dialed_time_avg":"75","dial_num_percent":"0.56","dialed_num_percent":"0.44","dial_time_percent":"0.57","dialed_time_percent":"0.43"},{"city":"嘉兴","total_num":"8","peer_num":"2","total_time":"2972","dial_num":"6","dialed_num":"2","dialed_time":"342","dial_time":"2630","dial_time_avg":"438","dialed_time_avg":"171","dial_num_percent":"0.75","dialed_num_percent":"0.25","dial_time_percent":"0.88","dialed_time_percent":"0.12"},{"city":"湖州","total_num":"8","peer_num":"4","total_time":"504","dial_num":"1","dialed_num":"7","dialed_time":"466","dial_time":"38","dial_time_avg":"38","dialed_time_avg":"67","dial_num_percent":"0.13","dialed_num_percent":"0.88","dial_time_percent":"0.08","dialed_time_percent":"0.92"},{"city":"杭州","total_num":"7","peer_num":"4","total_time":"1123","dial_num":"3","dialed_num":"4","dialed_time":"114","dial_time":"1009","dial_time_avg":"336","dialed_time_avg":"29","dial_num_percent":"0.43","dialed_num_percent":"0.57","dial_time_percent":"0.90","dialed_time_percent":"0.10"},{"city":"衢州","total_num":"5","peer_num":"1","total_time":"629","dial_num":"5","dialed_num":"0","dialed_time":"0","dial_time":"629","dial_time_avg":"126","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"宁波","total_num":"4","peer_num":"2","total_time":"851","dial_num":"2","dialed_num":"2","dialed_time":"246","dial_time":"605","dial_time_avg":"303","dialed_time_avg":"123","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.71","dialed_time_percent":"0.29"},{"city":"揭阳","total_num":"4","peer_num":"2","total_time":"740","dial_num":"0","dialed_num":"4","dialed_time":"740","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"185","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"鹤岗","total_num":"4","peer_num":"1","total_time":"689","dial_num":"2","dialed_num":"2","dialed_time":"178","dial_time":"511","dial_time_avg":"256","dialed_time_avg":"89","dial_num_percent":"0.50","dialed_num_percent":"0.50","dial_time_percent":"0.74","dialed_time_percent":"0.26"},{"city":"北京","total_num":"4","peer_num":"3","total_time":"545","dial_num":"3","dialed_num":"1","dialed_time":"56","dial_time":"489","dial_time_avg":"163","dialed_time_avg":"56","dial_num_percent":"0.75","dialed_num_percent":"0.25","dial_time_percent":"0.90","dialed_time_percent":"0.10"},{"city":"温州","total_num":"3","peer_num":"1","total_time":"253","dial_num":"3","dialed_num":"0","dialed_time":"0","dial_time":"253","dial_time_avg":"84","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"中山","total_num":"3","peer_num":"2","total_time":"121","dial_num":"1","dialed_num":"2","dialed_time":"78","dial_time":"43","dial_time_avg":"43","dialed_time_avg":"39","dial_num_percent":"0.33","dialed_num_percent":"0.67","dial_time_percent":"0.36","dialed_time_percent":"0.64"},{"city":"宜春","total_num":"2","peer_num":"1","total_time":"447","dial_num":"0","dialed_num":"2","dialed_time":"447","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"224","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"深圳","total_num":"2","peer_num":"2","total_time":"394","dial_num":"0","dialed_num":"2","dialed_time":"394","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"197","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"台州","total_num":"2","peer_num":"2","total_time":"202","dial_num":"0","dialed_num":"2","dialed_time":"202","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"101","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"南京","total_num":"1","peer_num":"1","total_time":"2492","dial_num":"0","dialed_num":"1","dialed_time":"2492","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"2492","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"朝阳","total_num":"1","peer_num":"1","total_time":"155","dial_num":"0","dialed_num":"1","dialed_time":"155","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"155","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"常州","total_num":"1","peer_num":"1","total_time":"140","dial_num":"0","dialed_num":"1","dialed_time":"140","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"140","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"赣州","total_num":"1","peer_num":"1","total_time":"86","dial_num":"0","dialed_num":"1","dialed_time":"86","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"86","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"成都","total_num":"1","peer_num":"1","total_time":"81","dial_num":"0","dialed_num":"1","dialed_time":"81","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"81","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"吕梁","total_num":"1","peer_num":"1","total_time":"73","dial_num":"0","dialed_num":"1","dialed_time":"73","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"73","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"濮阳","total_num":"1","peer_num":"1","total_time":"70","dial_num":"0","dialed_num":"1","dialed_time":"70","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"70","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"郑州","total_num":"1","peer_num":"1","total_time":"69","dial_num":"0","dialed_num":"1","dialed_time":"69","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"69","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"},{"city":"呼和浩特","total_num":"1","peer_num":"1","total_time":"56","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"56","dial_time_avg":"56","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"岳阳","total_num":"1","peer_num":"1","total_time":"47","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"47","dial_time_avg":"47","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"济南","total_num":"1","peer_num":"1","total_time":"42","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"42","dial_time_avg":"42","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"达州","total_num":"1","peer_num":"1","total_time":"37","dial_num":"1","dialed_num":"0","dialed_time":"0","dial_time":"37","dial_time_avg":"37","dialed_time_avg":"0","dial_num_percent":"1.00","dialed_num_percent":"0","dial_time_percent":"1.00","dialed_time_percent":"0"},{"city":"苏州","total_num":"1","peer_num":"1","total_time":"20","dial_num":"0","dialed_num":"1","dialed_time":"20","dial_time":"0","dial_time_avg":"0","dialed_time_avg":"20","dial_num_percent":"0","dialed_num_percent":"1.00","dial_time_percent":"0","dialed_time_percent":"1.00"}]
         * call_time_detail : {"max_time_1m":"1577","max_time_3m":"2492","max_time_6m":"2492","min_time_1m":"7","min_time_3m":"2","min_time_6m":"2","call_time_in_1_min_1m":"14","call_time_in_1_min_3m":"35","call_time_in_1_min_6m":"228","call_time_in_1_min_avg_3m":"11.67","call_time_in_1_min_avg_6m":"38.00","call_time_in_5_min_1m":"24","call_time_in_5_min_3m":"73","call_time_in_5_min_6m":"215","call_time_in_5_min_avg_3m":"24.33","call_time_in_5_min_avg_6m":"35.83","call_time_in_10_min_1m":"7","call_time_in_10_min_3m":"20","call_time_in_10_min_6m":"46","call_time_in_10_min_avg_3m":"6.67","call_time_in_10_min_avg_6m":"7.67","call_time_over_10_min_1m":"5","call_time_over_10_min_3m":"14","call_time_over_10_min_6m":"28","call_time_over_10_min_avg_3m":"4.67","call_time_over_10_min_avg_6m":"4.67","in_day_time_1m":"5554","in_day_time_3m":"14806","in_day_time_6m":"38988","in_day_time_avg_3m":"4935","in_day_time_avg_6m":"6498","in_night_time_1m":"5936","in_night_time_3m":"20250","in_night_time_6m":"42578","in_night_time_avg_3m":"6750","in_night_time_avg_6m":"7096","local_time_1m":"11490","local_time_3m":"35056","local_time_6m":"80932","local_time_avg_3m":"11685","local_time_avg_6m":"13489","remote_time_1m":"0","remote_time_3m":"0","remote_time_6m":"634","remote_time_avg_3m":"0","remote_time_avg_6m":"106","in_day_num_1m":"28","in_day_num_3m":"79","in_day_num_6m":"335","in_day_num_avg_3m":"26.33","in_day_num_avg_6m":"55.83","in_night_num_1m":"22","in_night_num_3m":"63","in_night_num_6m":"182","in_night_num_avg_3m":"21.00","in_night_num_avg_6m":"30.33","local_num_1m":"50","local_num_3m":"142","local_num_6m":"507","local_num_avg_3m":"47.33","local_num_avg_6m":"84.50","remote_num_1m":"0","remote_num_3m":"0","remote_num_6m":"10","remote_num_avg_3m":"0.00","remote_num_avg_6m":"1.67"}
         * call_third_part_detail : {"call_110_num_1m":"0","call_110_num_3m":"0","call_110_num_6m":"0","call_110_num_avg_3m":"0.00","call_110_num_avg_6m":"0.00","call_110_time_1m":"0","call_110_time_3m":"0","call_110_time_6m":"0","call_110_time_avg_3m":"0","call_110_time_avg_6m":"0","call_120_num_1m":"0","call_120_num_3m":"0","call_120_num_6m":"0","call_120_num_avg_3m":"0.00","call_120_num_avg_6m":"0.00","call_120_time_1m":"0","call_120_time_3m":"0","call_120_time_6m":"0","call_120_time_avg_3m":"0","call_120_time_avg_6m":"0","call_loan_num_1m":"0","call_loan_num_3m":"2","call_loan_num_6m":"3","call_loan_num_avg_3m":"0.67","call_loan_num_avg_6m":"0.50","call_loan_time_1m":"0","call_loan_time_3m":"144","call_loan_time_6m":"264","call_loan_time_avg_3m":"48","call_loan_time_avg_6m":"44","call_credit_card_num_1m":"0","call_credit_card_num_3m":"1","call_credit_card_num_6m":"1","call_credit_card_num_avg_3m":"0.33","call_credit_card_num_avg_6m":"0.17","call_credit_card_time_1m":"0","call_credit_card_time_3m":"288","call_credit_card_time_6m":"288","call_credit_card_time_avg_3m":"96","call_credit_card_time_avg_6m":"48","call_macon_num_1m":"0","call_macon_num_3m":"0","call_macon_num_6m":"0","call_macon_num_avg_3m":"0.00","call_macon_num_avg_6m":"0.00","call_macon_time_1m":"0","call_macon_time_3m":"0","call_macon_time_6m":"0","call_macon_time_avg_3m":"0","call_macon_time_avg_6m":"0","call_collection_firm_num_1m":"0","call_collection_firm_num_3m":"0","call_collection_firm_num_6m":"0","call_collection_firm_num_avg_3m":"0.00","call_collection_firm_num_avg_6m":"0.00","call_collection_firm_time_1m":"0","call_collection_firm_time_3m":"0","call_collection_firm_time_6m":"0","call_collection_firm_time_avg_3m":"0","call_collection_firm_time_avg_6m":"0","call_lawyer_num_1m":"0","call_lawyer_num_3m":"0","call_lawyer_num_6m":"0","call_lawyer_time_1m":"0","call_lawyer_time_3m":"0","call_lawyer_time_6m":"0","call_bank_num_1m":"6","call_bank_num_3m":"7","call_bank_num_6m":"8","call_bank_time_1m":"544","call_bank_time_3m":"832","call_bank_time_6m":"878","call_agency_num_1m":"0","call_agency_num_3m":"0","call_agency_num_6m":"0","call_agency_time_1m":"0","call_agency_time_3m":"0","call_agency_time_6m":"0","call_fraud_num_1m":"0","call_fraud_num_3m":"0","call_fraud_num_6m":"0","call_fraud_time_1m":"0","call_fraud_time_3m":"0","call_fraud_time_6m":"0","call_nuisance_num_1m":"0","call_nuisance_num_3m":"0","call_nuisance_num_6m":"0","call_nuisance_time_1m":"0","call_nuisance_time_3m":"0","call_nuisance_time_6m":"0","call_railway_airway_num_1m":"0","call_railway_airway_num_3m":"0","call_railway_airway_num_6m":"0","call_railway_airway_time_1m":"0","call_railway_airway_time_3m":"0","call_railway_airway_time_6m":"0","call_special_service_num_1m":"0","call_special_service_num_3m":"0","call_special_service_num_6m":"0","call_special_service_time_1m":"0","call_special_service_time_3m":"0","call_special_service_time_6m":"0","call_express_num_1m":"0","call_express_num_3m":"0","call_express_num_6m":"0","call_express_time_1m":"0","call_express_time_3m":"0","call_express_time_6m":"0","call_ins_fin_num_1m":"6","call_ins_fin_num_3m":"7","call_ins_fin_num_6m":"9","call_ins_fin_time_1m":"1586","call_ins_fin_time_3m":"1593","call_ins_fin_time_6m":"2550","call_car_firm_num_1m":"0","call_car_firm_num_3m":"0","call_car_firm_num_6m":"0","call_car_firm_time_1m":"0","call_car_firm_time_3m":"0","call_car_firm_time_6m":"0","call_carrier_num_1m":"0","call_carrier_num_3m":"0","call_carrier_num_6m":"0","call_carrier_time_1m":"0","call_carrier_time_3m":"0","call_carrier_time_6m":"0"}
         * call_family_detail : {"is_family_net_member_1m":"否","is_family_net_member_3m":"否","is_family_net_member_6m":"否","is_family_net_master_1m":"否","is_family_net_master_3m":"否","is_family_net_master_6m":"否","recharge_month_1m":"1","recharge_month_3m":"3","recharge_month_6m":"6","is_address_match_phone_1m":"否","is_address_match_phone_3m":"否","is_address_match_phone_6m":"是","num_of_call_less_1m":"否","num_of_call_less_3m":"否","num_of_call_less_6m":"否","num_of_call_more_1m":"否","num_of_call_more_3m":"否","num_of_call_more_6m":"否","unpaid_month_1m":"0","unpaid_month_3m":"1","unpaid_month_6m":"2","live_month_1m":"1","live_month_3m":"2","live_month_6m":"5"}
         */

        private String friend_num_3m;
        private String good_friend_num_3m;
        private String friend_city_center_3m;
        private String is_city_match_friend_city_center_3m;
        private String inter_peer_num_3m;
        private String friend_num_6m;
        private String good_friend_num_6m;
        private String friend_city_center_6m;
        private String is_city_match_friend_city_center_6m;
        private String inter_peer_num_6m;
        private RiskAnalysisBean risk_analysis;
        private ActiveDegreeBean active_degree;
        private ConsumptionAnalysisBean consumption_analysis;
        private CallAnalysisBean call_analysis;
        private CallTimeDetailBean call_time_detail;
        private CallThirdPartDetailBean call_third_part_detail;
        private CallFamilyDetailBean call_family_detail;
        private List<CallNumTop33mBean> call_num_top3_3m;
        private List<CallNumTop36mBean> call_num_top3_6m;
        private List<CallLocationTop33mBean> call_location_top3_3m;
        private List<CallLocationTop36mBean> call_location_top3_6m;
        private List<DesignatedContactBean> designated_contact;
        private List<RoamAnalysisBean> roam_analysis;
        private List<CallContactDetailBean> call_contact_detail;
        private List<CallDurationDetail3mBean> call_duration_detail_3m;
        private List<CallDurationDetail6mBean> call_duration_detail_6m;
        private List<CallLocationDetail3mBean> call_location_detail_3m;
        private List<CallLocationDetail6mBean> call_location_detail_6m;

        public String getFriend_num_3m() {
            return friend_num_3m;
        }

        public void setFriend_num_3m(String friend_num_3m) {
            this.friend_num_3m = friend_num_3m;
        }

        public String getGood_friend_num_3m() {
            return good_friend_num_3m;
        }

        public void setGood_friend_num_3m(String good_friend_num_3m) {
            this.good_friend_num_3m = good_friend_num_3m;
        }

        public String getFriend_city_center_3m() {
            return friend_city_center_3m;
        }

        public void setFriend_city_center_3m(String friend_city_center_3m) {
            this.friend_city_center_3m = friend_city_center_3m;
        }

        public String getIs_city_match_friend_city_center_3m() {
            return is_city_match_friend_city_center_3m;
        }

        public void setIs_city_match_friend_city_center_3m(String is_city_match_friend_city_center_3m) {
            this.is_city_match_friend_city_center_3m = is_city_match_friend_city_center_3m;
        }

        public String getInter_peer_num_3m() {
            return inter_peer_num_3m;
        }

        public void setInter_peer_num_3m(String inter_peer_num_3m) {
            this.inter_peer_num_3m = inter_peer_num_3m;
        }

        public String getFriend_num_6m() {
            return friend_num_6m;
        }

        public void setFriend_num_6m(String friend_num_6m) {
            this.friend_num_6m = friend_num_6m;
        }

        public String getGood_friend_num_6m() {
            return good_friend_num_6m;
        }

        public void setGood_friend_num_6m(String good_friend_num_6m) {
            this.good_friend_num_6m = good_friend_num_6m;
        }

        public String getFriend_city_center_6m() {
            return friend_city_center_6m;
        }

        public void setFriend_city_center_6m(String friend_city_center_6m) {
            this.friend_city_center_6m = friend_city_center_6m;
        }

        public String getIs_city_match_friend_city_center_6m() {
            return is_city_match_friend_city_center_6m;
        }

        public void setIs_city_match_friend_city_center_6m(String is_city_match_friend_city_center_6m) {
            this.is_city_match_friend_city_center_6m = is_city_match_friend_city_center_6m;
        }

        public String getInter_peer_num_6m() {
            return inter_peer_num_6m;
        }

        public void setInter_peer_num_6m(String inter_peer_num_6m) {
            this.inter_peer_num_6m = inter_peer_num_6m;
        }

        public RiskAnalysisBean getRisk_analysis() {
            return risk_analysis;
        }

        public void setRisk_analysis(RiskAnalysisBean risk_analysis) {
            this.risk_analysis = risk_analysis;
        }

        public ActiveDegreeBean getActive_degree() {
            return active_degree;
        }

        public void setActive_degree(ActiveDegreeBean active_degree) {
            this.active_degree = active_degree;
        }

        public ConsumptionAnalysisBean getConsumption_analysis() {
            return consumption_analysis;
        }

        public void setConsumption_analysis(ConsumptionAnalysisBean consumption_analysis) {
            this.consumption_analysis = consumption_analysis;
        }

        public CallAnalysisBean getCall_analysis() {
            return call_analysis;
        }

        public void setCall_analysis(CallAnalysisBean call_analysis) {
            this.call_analysis = call_analysis;
        }

        public CallTimeDetailBean getCall_time_detail() {
            return call_time_detail;
        }

        public void setCall_time_detail(CallTimeDetailBean call_time_detail) {
            this.call_time_detail = call_time_detail;
        }

        public CallThirdPartDetailBean getCall_third_part_detail() {
            return call_third_part_detail;
        }

        public void setCall_third_part_detail(CallThirdPartDetailBean call_third_part_detail) {
            this.call_third_part_detail = call_third_part_detail;
        }

        public CallFamilyDetailBean getCall_family_detail() {
            return call_family_detail;
        }

        public void setCall_family_detail(CallFamilyDetailBean call_family_detail) {
            this.call_family_detail = call_family_detail;
        }

        public List<CallNumTop33mBean> getCall_num_top3_3m() {
            return call_num_top3_3m;
        }

        public void setCall_num_top3_3m(List<CallNumTop33mBean> call_num_top3_3m) {
            this.call_num_top3_3m = call_num_top3_3m;
        }

        public List<CallNumTop36mBean> getCall_num_top3_6m() {
            return call_num_top3_6m;
        }

        public void setCall_num_top3_6m(List<CallNumTop36mBean> call_num_top3_6m) {
            this.call_num_top3_6m = call_num_top3_6m;
        }

        public List<CallLocationTop33mBean> getCall_location_top3_3m() {
            return call_location_top3_3m;
        }

        public void setCall_location_top3_3m(List<CallLocationTop33mBean> call_location_top3_3m) {
            this.call_location_top3_3m = call_location_top3_3m;
        }

        public List<CallLocationTop36mBean> getCall_location_top3_6m() {
            return call_location_top3_6m;
        }

        public void setCall_location_top3_6m(List<CallLocationTop36mBean> call_location_top3_6m) {
            this.call_location_top3_6m = call_location_top3_6m;
        }

        public List<DesignatedContactBean> getDesignated_contact() {
            return designated_contact;
        }

        public void setDesignated_contact(List<DesignatedContactBean> designated_contact) {
            this.designated_contact = designated_contact;
        }

        public List<RoamAnalysisBean> getRoam_analysis() {
            return roam_analysis;
        }

        public void setRoam_analysis(List<RoamAnalysisBean> roam_analysis) {
            this.roam_analysis = roam_analysis;
        }

        public List<CallContactDetailBean> getCall_contact_detail() {
            return call_contact_detail;
        }

        public void setCall_contact_detail(List<CallContactDetailBean> call_contact_detail) {
            this.call_contact_detail = call_contact_detail;
        }

        public List<CallDurationDetail3mBean> getCall_duration_detail_3m() {
            return call_duration_detail_3m;
        }

        public void setCall_duration_detail_3m(List<CallDurationDetail3mBean> call_duration_detail_3m) {
            this.call_duration_detail_3m = call_duration_detail_3m;
        }

        public List<CallDurationDetail6mBean> getCall_duration_detail_6m() {
            return call_duration_detail_6m;
        }

        public void setCall_duration_detail_6m(List<CallDurationDetail6mBean> call_duration_detail_6m) {
            this.call_duration_detail_6m = call_duration_detail_6m;
        }

        public List<CallLocationDetail3mBean> getCall_location_detail_3m() {
            return call_location_detail_3m;
        }

        public void setCall_location_detail_3m(List<CallLocationDetail3mBean> call_location_detail_3m) {
            this.call_location_detail_3m = call_location_detail_3m;
        }

        public List<CallLocationDetail6mBean> getCall_location_detail_6m() {
            return call_location_detail_6m;
        }

        public void setCall_location_detail_6m(List<CallLocationDetail6mBean> call_location_detail_6m) {
            this.call_location_detail_6m = call_location_detail_6m;
        }

        public static class RiskAnalysisBean {
            /**
             * in_time : 20
             * mobile_silence_3m : 0
             * arrearage_risk_3m : 0
             * binding_risk : 10
             * mobile_silence_6m : 0
             * arrearage_risk_6m : 1
             * is_name_and_idcard_in_court_black : 否
             * is_name_and_idcard_in_finance_black : 否
             * is_name_and_mobile_in_finance_black : 否
             * risk_check_item : [{"item":"call_credit_card","call_num_3m":"1","call_time_3m":"288","call_num_6m":"1","call_time_6m":"288"},{"item":"call_loan","call_num_3m":"2","call_time_3m":"144","call_num_6m":"3","call_time_6m":"264"},{"item":"call_collection","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"},{"item":"call_110","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"},{"item":"call_120","call_num_3m":"0","call_time_3m":"0","call_num_6m":"0","call_time_6m":"0"}]
             */

            private String in_time;
            private String mobile_silence_3m;
            private String arrearage_risk_3m;
            private String binding_risk;
            private String mobile_silence_6m;
            private String arrearage_risk_6m;
            private String is_name_and_idcard_in_court_black;
            private String is_name_and_idcard_in_finance_black;
            private String is_name_and_mobile_in_finance_black;
            private List<RiskCheckItemBean> risk_check_item;

            public String getIn_time() {
                return in_time;
            }

            public void setIn_time(String in_time) {
                this.in_time = in_time;
            }

            public String getMobile_silence_3m() {
                return mobile_silence_3m;
            }

            public void setMobile_silence_3m(String mobile_silence_3m) {
                this.mobile_silence_3m = mobile_silence_3m;
            }

            public String getArrearage_risk_3m() {
                return arrearage_risk_3m;
            }

            public void setArrearage_risk_3m(String arrearage_risk_3m) {
                this.arrearage_risk_3m = arrearage_risk_3m;
            }

            public String getBinding_risk() {
                return binding_risk;
            }

            public void setBinding_risk(String binding_risk) {
                this.binding_risk = binding_risk;
            }

            public String getMobile_silence_6m() {
                return mobile_silence_6m;
            }

            public void setMobile_silence_6m(String mobile_silence_6m) {
                this.mobile_silence_6m = mobile_silence_6m;
            }

            public String getArrearage_risk_6m() {
                return arrearage_risk_6m;
            }

            public void setArrearage_risk_6m(String arrearage_risk_6m) {
                this.arrearage_risk_6m = arrearage_risk_6m;
            }

            public String getIs_name_and_idcard_in_court_black() {
                return is_name_and_idcard_in_court_black;
            }

            public void setIs_name_and_idcard_in_court_black(String is_name_and_idcard_in_court_black) {
                this.is_name_and_idcard_in_court_black = is_name_and_idcard_in_court_black;
            }

            public String getIs_name_and_idcard_in_finance_black() {
                return is_name_and_idcard_in_finance_black;
            }

            public void setIs_name_and_idcard_in_finance_black(String is_name_and_idcard_in_finance_black) {
                this.is_name_and_idcard_in_finance_black = is_name_and_idcard_in_finance_black;
            }

            public String getIs_name_and_mobile_in_finance_black() {
                return is_name_and_mobile_in_finance_black;
            }

            public void setIs_name_and_mobile_in_finance_black(String is_name_and_mobile_in_finance_black) {
                this.is_name_and_mobile_in_finance_black = is_name_and_mobile_in_finance_black;
            }

            public List<RiskCheckItemBean> getRisk_check_item() {
                return risk_check_item;
            }

            public void setRisk_check_item(List<RiskCheckItemBean> risk_check_item) {
                this.risk_check_item = risk_check_item;
            }

            public static class RiskCheckItemBean {
                /**
                 * item : call_credit_card
                 * call_num_3m : 1
                 * call_time_3m : 288
                 * call_num_6m : 1
                 * call_time_6m : 288
                 */

                private String item;
                private String call_num_3m;
                private String call_time_3m;
                private String call_num_6m;
                private String call_time_6m;

                public String getItem() {
                    return item;
                }

                public void setItem(String item) {
                    this.item = item;
                }

                public String getCall_num_3m() {
                    return call_num_3m;
                }

                public void setCall_num_3m(String call_num_3m) {
                    this.call_num_3m = call_num_3m;
                }

                public String getCall_time_3m() {
                    return call_time_3m;
                }

                public void setCall_time_3m(String call_time_3m) {
                    this.call_time_3m = call_time_3m;
                }

                public String getCall_num_6m() {
                    return call_num_6m;
                }

                public void setCall_num_6m(String call_num_6m) {
                    this.call_num_6m = call_num_6m;
                }

                public String getCall_time_6m() {
                    return call_time_6m;
                }

                public void setCall_time_6m(String call_time_6m) {
                    this.call_time_6m = call_time_6m;
                }
            }
        }

        public static class ActiveDegreeBean {
            /**
             * call_day_3m : 31
             * dial_num_3m : 95
             * dialed_num_3m : 47
             * dial_duration_3m : 24642
             * dialed_duration_3m : 10414
             * call_day_6m : 112
             * dial_num_6m : 286
             * dialed_num_6m : 231
             * dial_duration_6m : 55571
             * dialed_duration_6m : 25995
             */

            private String call_day_3m;
            private String dial_num_3m;
            private String dialed_num_3m;
            private String dial_duration_3m;
            private String dialed_duration_3m;
            private String call_day_6m;
            private String dial_num_6m;
            private String dialed_num_6m;
            private String dial_duration_6m;
            private String dialed_duration_6m;

            public String getCall_day_3m() {
                return call_day_3m;
            }

            public void setCall_day_3m(String call_day_3m) {
                this.call_day_3m = call_day_3m;
            }

            public String getDial_num_3m() {
                return dial_num_3m;
            }

            public void setDial_num_3m(String dial_num_3m) {
                this.dial_num_3m = dial_num_3m;
            }

            public String getDialed_num_3m() {
                return dialed_num_3m;
            }

            public void setDialed_num_3m(String dialed_num_3m) {
                this.dialed_num_3m = dialed_num_3m;
            }

            public String getDial_duration_3m() {
                return dial_duration_3m;
            }

            public void setDial_duration_3m(String dial_duration_3m) {
                this.dial_duration_3m = dial_duration_3m;
            }

            public String getDialed_duration_3m() {
                return dialed_duration_3m;
            }

            public void setDialed_duration_3m(String dialed_duration_3m) {
                this.dialed_duration_3m = dialed_duration_3m;
            }

            public String getCall_day_6m() {
                return call_day_6m;
            }

            public void setCall_day_6m(String call_day_6m) {
                this.call_day_6m = call_day_6m;
            }

            public String getDial_num_6m() {
                return dial_num_6m;
            }

            public void setDial_num_6m(String dial_num_6m) {
                this.dial_num_6m = dial_num_6m;
            }

            public String getDialed_num_6m() {
                return dialed_num_6m;
            }

            public void setDialed_num_6m(String dialed_num_6m) {
                this.dialed_num_6m = dialed_num_6m;
            }

            public String getDial_duration_6m() {
                return dial_duration_6m;
            }

            public void setDial_duration_6m(String dial_duration_6m) {
                this.dial_duration_6m = dial_duration_6m;
            }

            public String getDialed_duration_6m() {
                return dialed_duration_6m;
            }

            public void setDialed_duration_6m(String dialed_duration_6m) {
                this.dialed_duration_6m = dialed_duration_6m;
            }
        }

        public static class ConsumptionAnalysisBean {
            /**
             * total_fee_3m : 105961
             * total_fee_6m : 142656
             * recharge_time_3m : 12
             * recharge_time_6m : 21
             * recharge_max_amount_3m : 10000
             * recharge_max_amount_6m : 10000
             * bill_latest_certification_day : 2017-01-16
             * web_fee_1m : 0
             * web_fee_3m : 70496
             * web_fee_6m : 70496
             * web_fee_avg_3m : 23499
             * web_fee_avg_6m : 11749
             * sms_fee_1m : 0
             * sms_fee_3m : 490
             * sms_fee_6m : 900
             * sms_fee_avg_3m : 163
             * sms_fee_avg_6m : 150
             * call_fee_1m : 0
             * call_fee_3m : 4365
             * call_fee_6m : 6630
             * call_fee_avg_3m : 1455
             * call_fee_avg_6m : 1105
             * vas_fee_1m : 0
             * vas_fee_3m : 0
             * vas_fee_6m : 0
             * vas_fee_avg_3m : 0
             * vas_fee_avg_6m : 0
             */

            private String total_fee_3m;
            private String total_fee_6m;
            private String recharge_time_3m;
            private String recharge_time_6m;
            private String recharge_max_amount_3m;
            private String recharge_max_amount_6m;
            private String bill_latest_certification_day;
            private String web_fee_1m;
            private String web_fee_3m;
            private String web_fee_6m;
            private String web_fee_avg_3m;
            private String web_fee_avg_6m;
            private String sms_fee_1m;
            private String sms_fee_3m;
            private String sms_fee_6m;
            private String sms_fee_avg_3m;
            private String sms_fee_avg_6m;
            private String call_fee_1m;
            private String call_fee_3m;
            private String call_fee_6m;
            private String call_fee_avg_3m;
            private String call_fee_avg_6m;
            private String vas_fee_1m;
            private String vas_fee_3m;
            private String vas_fee_6m;
            private String vas_fee_avg_3m;
            private String vas_fee_avg_6m;

            public String getTotal_fee_3m() {
                return total_fee_3m;
            }

            public void setTotal_fee_3m(String total_fee_3m) {
                this.total_fee_3m = total_fee_3m;
            }

            public String getTotal_fee_6m() {
                return total_fee_6m;
            }

            public void setTotal_fee_6m(String total_fee_6m) {
                this.total_fee_6m = total_fee_6m;
            }

            public String getRecharge_time_3m() {
                return recharge_time_3m;
            }

            public void setRecharge_time_3m(String recharge_time_3m) {
                this.recharge_time_3m = recharge_time_3m;
            }

            public String getRecharge_time_6m() {
                return recharge_time_6m;
            }

            public void setRecharge_time_6m(String recharge_time_6m) {
                this.recharge_time_6m = recharge_time_6m;
            }

            public String getRecharge_max_amount_3m() {
                return recharge_max_amount_3m;
            }

            public void setRecharge_max_amount_3m(String recharge_max_amount_3m) {
                this.recharge_max_amount_3m = recharge_max_amount_3m;
            }

            public String getRecharge_max_amount_6m() {
                return recharge_max_amount_6m;
            }

            public void setRecharge_max_amount_6m(String recharge_max_amount_6m) {
                this.recharge_max_amount_6m = recharge_max_amount_6m;
            }

            public String getBill_latest_certification_day() {
                return bill_latest_certification_day;
            }

            public void setBill_latest_certification_day(String bill_latest_certification_day) {
                this.bill_latest_certification_day = bill_latest_certification_day;
            }

            public String getWeb_fee_1m() {
                return web_fee_1m;
            }

            public void setWeb_fee_1m(String web_fee_1m) {
                this.web_fee_1m = web_fee_1m;
            }

            public String getWeb_fee_3m() {
                return web_fee_3m;
            }

            public void setWeb_fee_3m(String web_fee_3m) {
                this.web_fee_3m = web_fee_3m;
            }

            public String getWeb_fee_6m() {
                return web_fee_6m;
            }

            public void setWeb_fee_6m(String web_fee_6m) {
                this.web_fee_6m = web_fee_6m;
            }

            public String getWeb_fee_avg_3m() {
                return web_fee_avg_3m;
            }

            public void setWeb_fee_avg_3m(String web_fee_avg_3m) {
                this.web_fee_avg_3m = web_fee_avg_3m;
            }

            public String getWeb_fee_avg_6m() {
                return web_fee_avg_6m;
            }

            public void setWeb_fee_avg_6m(String web_fee_avg_6m) {
                this.web_fee_avg_6m = web_fee_avg_6m;
            }

            public String getSms_fee_1m() {
                return sms_fee_1m;
            }

            public void setSms_fee_1m(String sms_fee_1m) {
                this.sms_fee_1m = sms_fee_1m;
            }

            public String getSms_fee_3m() {
                return sms_fee_3m;
            }

            public void setSms_fee_3m(String sms_fee_3m) {
                this.sms_fee_3m = sms_fee_3m;
            }

            public String getSms_fee_6m() {
                return sms_fee_6m;
            }

            public void setSms_fee_6m(String sms_fee_6m) {
                this.sms_fee_6m = sms_fee_6m;
            }

            public String getSms_fee_avg_3m() {
                return sms_fee_avg_3m;
            }

            public void setSms_fee_avg_3m(String sms_fee_avg_3m) {
                this.sms_fee_avg_3m = sms_fee_avg_3m;
            }

            public String getSms_fee_avg_6m() {
                return sms_fee_avg_6m;
            }

            public void setSms_fee_avg_6m(String sms_fee_avg_6m) {
                this.sms_fee_avg_6m = sms_fee_avg_6m;
            }

            public String getCall_fee_1m() {
                return call_fee_1m;
            }

            public void setCall_fee_1m(String call_fee_1m) {
                this.call_fee_1m = call_fee_1m;
            }

            public String getCall_fee_3m() {
                return call_fee_3m;
            }

            public void setCall_fee_3m(String call_fee_3m) {
                this.call_fee_3m = call_fee_3m;
            }

            public String getCall_fee_6m() {
                return call_fee_6m;
            }

            public void setCall_fee_6m(String call_fee_6m) {
                this.call_fee_6m = call_fee_6m;
            }

            public String getCall_fee_avg_3m() {
                return call_fee_avg_3m;
            }

            public void setCall_fee_avg_3m(String call_fee_avg_3m) {
                this.call_fee_avg_3m = call_fee_avg_3m;
            }

            public String getCall_fee_avg_6m() {
                return call_fee_avg_6m;
            }

            public void setCall_fee_avg_6m(String call_fee_avg_6m) {
                this.call_fee_avg_6m = call_fee_avg_6m;
            }

            public String getVas_fee_1m() {
                return vas_fee_1m;
            }

            public void setVas_fee_1m(String vas_fee_1m) {
                this.vas_fee_1m = vas_fee_1m;
            }

            public String getVas_fee_3m() {
                return vas_fee_3m;
            }

            public void setVas_fee_3m(String vas_fee_3m) {
                this.vas_fee_3m = vas_fee_3m;
            }

            public String getVas_fee_6m() {
                return vas_fee_6m;
            }

            public void setVas_fee_6m(String vas_fee_6m) {
                this.vas_fee_6m = vas_fee_6m;
            }

            public String getVas_fee_avg_3m() {
                return vas_fee_avg_3m;
            }

            public void setVas_fee_avg_3m(String vas_fee_avg_3m) {
                this.vas_fee_avg_3m = vas_fee_avg_3m;
            }

            public String getVas_fee_avg_6m() {
                return vas_fee_avg_6m;
            }

            public void setVas_fee_avg_6m(String vas_fee_avg_6m) {
                this.vas_fee_avg_6m = vas_fee_avg_6m;
            }
        }

        public static class CallAnalysisBean {
            /**
             * total_num_1m : 50
             * total_num_3m : 142
             * total_num_6m : 517
             * total_num_avg_3m : 47.33
             * total_num_avg_6m : 86.17
             * total_time_1m : 11490
             * total_time_3m : 35056
             * total_time_6m : 81566
             * total_time_avg_3m : 11685
             * total_time_avg_6m : 13594
             * total_peer_num_1m : 15
             * total_peer_num_3m : 47
             * total_peer_num_6m : 126
             * total_peer_num_avg_3m : 15.67
             * total_peer_num_avg_6m : 21.00
             * total_city_num_1m : 5
             * total_city_num_3m : 14
             * total_city_num_6m : 30
             * total_city_num_avg_3m : 4.67
             * total_city_num_avg_6m : 5.00
             * total_dial_num_1m : 31
             * total_dial_num_3m : 95
             * total_dial_num_6m : 286
             * total_dial_num_avg_3m : 31.67
             * total_dial_num_avg_6m : 47.67
             * total_dialed_num_1m : 19
             * total_dialed_num_3m : 47
             * total_dialed_num_6m : 231
             * total_dialed_num_avg_3m : 15.67
             * total_dialed_num_avg_6m : 38.50
             * total_dial_peer_num_1m : 12
             * total_dial_peer_num_3m : 35
             * total_dial_peer_num_6m : 75
             * total_dial_peer_num_avg_3 : 11.67
             * total_dial_peer_num_avg_6 : 12.50
             * total_dialed_peer_num_1m : 8
             * total_dialed_peer_num_3m : 23
             * total_dialed_peer_num_6m : 77
             * total_dialed_peer_num_avg_3m : 7.67
             * total_dialed_peer_num_avg_6m : 12.83
             */

            private String total_num_1m;
            private String total_num_3m;
            private String total_num_6m;
            private String total_num_avg_3m;
            private String total_num_avg_6m;
            private String total_time_1m;
            private String total_time_3m;
            private String total_time_6m;
            private String total_time_avg_3m;
            private String total_time_avg_6m;
            private String total_peer_num_1m;
            private String total_peer_num_3m;
            private String total_peer_num_6m;
            private String total_peer_num_avg_3m;
            private String total_peer_num_avg_6m;
            private String total_city_num_1m;
            private String total_city_num_3m;
            private String total_city_num_6m;
            private String total_city_num_avg_3m;
            private String total_city_num_avg_6m;
            private String total_dial_num_1m;
            private String total_dial_num_3m;
            private String total_dial_num_6m;
            private String total_dial_num_avg_3m;
            private String total_dial_num_avg_6m;
            private String total_dialed_num_1m;
            private String total_dialed_num_3m;
            private String total_dialed_num_6m;
            private String total_dialed_num_avg_3m;
            private String total_dialed_num_avg_6m;
            private String total_dial_peer_num_1m;
            private String total_dial_peer_num_3m;
            private String total_dial_peer_num_6m;
            private String total_dial_peer_num_avg_3;
            private String total_dial_peer_num_avg_6;
            private String total_dialed_peer_num_1m;
            private String total_dialed_peer_num_3m;
            private String total_dialed_peer_num_6m;
            private String total_dialed_peer_num_avg_3m;
            private String total_dialed_peer_num_avg_6m;

            public String getTotal_num_1m() {
                return total_num_1m;
            }

            public void setTotal_num_1m(String total_num_1m) {
                this.total_num_1m = total_num_1m;
            }

            public String getTotal_num_3m() {
                return total_num_3m;
            }

            public void setTotal_num_3m(String total_num_3m) {
                this.total_num_3m = total_num_3m;
            }

            public String getTotal_num_6m() {
                return total_num_6m;
            }

            public void setTotal_num_6m(String total_num_6m) {
                this.total_num_6m = total_num_6m;
            }

            public String getTotal_num_avg_3m() {
                return total_num_avg_3m;
            }

            public void setTotal_num_avg_3m(String total_num_avg_3m) {
                this.total_num_avg_3m = total_num_avg_3m;
            }

            public String getTotal_num_avg_6m() {
                return total_num_avg_6m;
            }

            public void setTotal_num_avg_6m(String total_num_avg_6m) {
                this.total_num_avg_6m = total_num_avg_6m;
            }

            public String getTotal_time_1m() {
                return total_time_1m;
            }

            public void setTotal_time_1m(String total_time_1m) {
                this.total_time_1m = total_time_1m;
            }

            public String getTotal_time_3m() {
                return total_time_3m;
            }

            public void setTotal_time_3m(String total_time_3m) {
                this.total_time_3m = total_time_3m;
            }

            public String getTotal_time_6m() {
                return total_time_6m;
            }

            public void setTotal_time_6m(String total_time_6m) {
                this.total_time_6m = total_time_6m;
            }

            public String getTotal_time_avg_3m() {
                return total_time_avg_3m;
            }

            public void setTotal_time_avg_3m(String total_time_avg_3m) {
                this.total_time_avg_3m = total_time_avg_3m;
            }

            public String getTotal_time_avg_6m() {
                return total_time_avg_6m;
            }

            public void setTotal_time_avg_6m(String total_time_avg_6m) {
                this.total_time_avg_6m = total_time_avg_6m;
            }

            public String getTotal_peer_num_1m() {
                return total_peer_num_1m;
            }

            public void setTotal_peer_num_1m(String total_peer_num_1m) {
                this.total_peer_num_1m = total_peer_num_1m;
            }

            public String getTotal_peer_num_3m() {
                return total_peer_num_3m;
            }

            public void setTotal_peer_num_3m(String total_peer_num_3m) {
                this.total_peer_num_3m = total_peer_num_3m;
            }

            public String getTotal_peer_num_6m() {
                return total_peer_num_6m;
            }

            public void setTotal_peer_num_6m(String total_peer_num_6m) {
                this.total_peer_num_6m = total_peer_num_6m;
            }

            public String getTotal_peer_num_avg_3m() {
                return total_peer_num_avg_3m;
            }

            public void setTotal_peer_num_avg_3m(String total_peer_num_avg_3m) {
                this.total_peer_num_avg_3m = total_peer_num_avg_3m;
            }

            public String getTotal_peer_num_avg_6m() {
                return total_peer_num_avg_6m;
            }

            public void setTotal_peer_num_avg_6m(String total_peer_num_avg_6m) {
                this.total_peer_num_avg_6m = total_peer_num_avg_6m;
            }

            public String getTotal_city_num_1m() {
                return total_city_num_1m;
            }

            public void setTotal_city_num_1m(String total_city_num_1m) {
                this.total_city_num_1m = total_city_num_1m;
            }

            public String getTotal_city_num_3m() {
                return total_city_num_3m;
            }

            public void setTotal_city_num_3m(String total_city_num_3m) {
                this.total_city_num_3m = total_city_num_3m;
            }

            public String getTotal_city_num_6m() {
                return total_city_num_6m;
            }

            public void setTotal_city_num_6m(String total_city_num_6m) {
                this.total_city_num_6m = total_city_num_6m;
            }

            public String getTotal_city_num_avg_3m() {
                return total_city_num_avg_3m;
            }

            public void setTotal_city_num_avg_3m(String total_city_num_avg_3m) {
                this.total_city_num_avg_3m = total_city_num_avg_3m;
            }

            public String getTotal_city_num_avg_6m() {
                return total_city_num_avg_6m;
            }

            public void setTotal_city_num_avg_6m(String total_city_num_avg_6m) {
                this.total_city_num_avg_6m = total_city_num_avg_6m;
            }

            public String getTotal_dial_num_1m() {
                return total_dial_num_1m;
            }

            public void setTotal_dial_num_1m(String total_dial_num_1m) {
                this.total_dial_num_1m = total_dial_num_1m;
            }

            public String getTotal_dial_num_3m() {
                return total_dial_num_3m;
            }

            public void setTotal_dial_num_3m(String total_dial_num_3m) {
                this.total_dial_num_3m = total_dial_num_3m;
            }

            public String getTotal_dial_num_6m() {
                return total_dial_num_6m;
            }

            public void setTotal_dial_num_6m(String total_dial_num_6m) {
                this.total_dial_num_6m = total_dial_num_6m;
            }

            public String getTotal_dial_num_avg_3m() {
                return total_dial_num_avg_3m;
            }

            public void setTotal_dial_num_avg_3m(String total_dial_num_avg_3m) {
                this.total_dial_num_avg_3m = total_dial_num_avg_3m;
            }

            public String getTotal_dial_num_avg_6m() {
                return total_dial_num_avg_6m;
            }

            public void setTotal_dial_num_avg_6m(String total_dial_num_avg_6m) {
                this.total_dial_num_avg_6m = total_dial_num_avg_6m;
            }

            public String getTotal_dialed_num_1m() {
                return total_dialed_num_1m;
            }

            public void setTotal_dialed_num_1m(String total_dialed_num_1m) {
                this.total_dialed_num_1m = total_dialed_num_1m;
            }

            public String getTotal_dialed_num_3m() {
                return total_dialed_num_3m;
            }

            public void setTotal_dialed_num_3m(String total_dialed_num_3m) {
                this.total_dialed_num_3m = total_dialed_num_3m;
            }

            public String getTotal_dialed_num_6m() {
                return total_dialed_num_6m;
            }

            public void setTotal_dialed_num_6m(String total_dialed_num_6m) {
                this.total_dialed_num_6m = total_dialed_num_6m;
            }

            public String getTotal_dialed_num_avg_3m() {
                return total_dialed_num_avg_3m;
            }

            public void setTotal_dialed_num_avg_3m(String total_dialed_num_avg_3m) {
                this.total_dialed_num_avg_3m = total_dialed_num_avg_3m;
            }

            public String getTotal_dialed_num_avg_6m() {
                return total_dialed_num_avg_6m;
            }

            public void setTotal_dialed_num_avg_6m(String total_dialed_num_avg_6m) {
                this.total_dialed_num_avg_6m = total_dialed_num_avg_6m;
            }

            public String getTotal_dial_peer_num_1m() {
                return total_dial_peer_num_1m;
            }

            public void setTotal_dial_peer_num_1m(String total_dial_peer_num_1m) {
                this.total_dial_peer_num_1m = total_dial_peer_num_1m;
            }

            public String getTotal_dial_peer_num_3m() {
                return total_dial_peer_num_3m;
            }

            public void setTotal_dial_peer_num_3m(String total_dial_peer_num_3m) {
                this.total_dial_peer_num_3m = total_dial_peer_num_3m;
            }

            public String getTotal_dial_peer_num_6m() {
                return total_dial_peer_num_6m;
            }

            public void setTotal_dial_peer_num_6m(String total_dial_peer_num_6m) {
                this.total_dial_peer_num_6m = total_dial_peer_num_6m;
            }

            public String getTotal_dial_peer_num_avg_3() {
                return total_dial_peer_num_avg_3;
            }

            public void setTotal_dial_peer_num_avg_3(String total_dial_peer_num_avg_3) {
                this.total_dial_peer_num_avg_3 = total_dial_peer_num_avg_3;
            }

            public String getTotal_dial_peer_num_avg_6() {
                return total_dial_peer_num_avg_6;
            }

            public void setTotal_dial_peer_num_avg_6(String total_dial_peer_num_avg_6) {
                this.total_dial_peer_num_avg_6 = total_dial_peer_num_avg_6;
            }

            public String getTotal_dialed_peer_num_1m() {
                return total_dialed_peer_num_1m;
            }

            public void setTotal_dialed_peer_num_1m(String total_dialed_peer_num_1m) {
                this.total_dialed_peer_num_1m = total_dialed_peer_num_1m;
            }

            public String getTotal_dialed_peer_num_3m() {
                return total_dialed_peer_num_3m;
            }

            public void setTotal_dialed_peer_num_3m(String total_dialed_peer_num_3m) {
                this.total_dialed_peer_num_3m = total_dialed_peer_num_3m;
            }

            public String getTotal_dialed_peer_num_6m() {
                return total_dialed_peer_num_6m;
            }

            public void setTotal_dialed_peer_num_6m(String total_dialed_peer_num_6m) {
                this.total_dialed_peer_num_6m = total_dialed_peer_num_6m;
            }

            public String getTotal_dialed_peer_num_avg_3m() {
                return total_dialed_peer_num_avg_3m;
            }

            public void setTotal_dialed_peer_num_avg_3m(String total_dialed_peer_num_avg_3m) {
                this.total_dialed_peer_num_avg_3m = total_dialed_peer_num_avg_3m;
            }

            public String getTotal_dialed_peer_num_avg_6m() {
                return total_dialed_peer_num_avg_6m;
            }

            public void setTotal_dialed_peer_num_avg_6m(String total_dialed_peer_num_avg_6m) {
                this.total_dialed_peer_num_avg_6m = total_dialed_peer_num_avg_6m;
            }
        }

        public static class CallTimeDetailBean {
            /**
             * max_time_1m : 1577
             * max_time_3m : 2492
             * max_time_6m : 2492
             * min_time_1m : 7
             * min_time_3m : 2
             * min_time_6m : 2
             * call_time_in_1_min_1m : 14
             * call_time_in_1_min_3m : 35
             * call_time_in_1_min_6m : 228
             * call_time_in_1_min_avg_3m : 11.67
             * call_time_in_1_min_avg_6m : 38.00
             * call_time_in_5_min_1m : 24
             * call_time_in_5_min_3m : 73
             * call_time_in_5_min_6m : 215
             * call_time_in_5_min_avg_3m : 24.33
             * call_time_in_5_min_avg_6m : 35.83
             * call_time_in_10_min_1m : 7
             * call_time_in_10_min_3m : 20
             * call_time_in_10_min_6m : 46
             * call_time_in_10_min_avg_3m : 6.67
             * call_time_in_10_min_avg_6m : 7.67
             * call_time_over_10_min_1m : 5
             * call_time_over_10_min_3m : 14
             * call_time_over_10_min_6m : 28
             * call_time_over_10_min_avg_3m : 4.67
             * call_time_over_10_min_avg_6m : 4.67
             * in_day_time_1m : 5554
             * in_day_time_3m : 14806
             * in_day_time_6m : 38988
             * in_day_time_avg_3m : 4935
             * in_day_time_avg_6m : 6498
             * in_night_time_1m : 5936
             * in_night_time_3m : 20250
             * in_night_time_6m : 42578
             * in_night_time_avg_3m : 6750
             * in_night_time_avg_6m : 7096
             * local_time_1m : 11490
             * local_time_3m : 35056
             * local_time_6m : 80932
             * local_time_avg_3m : 11685
             * local_time_avg_6m : 13489
             * remote_time_1m : 0
             * remote_time_3m : 0
             * remote_time_6m : 634
             * remote_time_avg_3m : 0
             * remote_time_avg_6m : 106
             * in_day_num_1m : 28
             * in_day_num_3m : 79
             * in_day_num_6m : 335
             * in_day_num_avg_3m : 26.33
             * in_day_num_avg_6m : 55.83
             * in_night_num_1m : 22
             * in_night_num_3m : 63
             * in_night_num_6m : 182
             * in_night_num_avg_3m : 21.00
             * in_night_num_avg_6m : 30.33
             * local_num_1m : 50
             * local_num_3m : 142
             * local_num_6m : 507
             * local_num_avg_3m : 47.33
             * local_num_avg_6m : 84.50
             * remote_num_1m : 0
             * remote_num_3m : 0
             * remote_num_6m : 10
             * remote_num_avg_3m : 0.00
             * remote_num_avg_6m : 1.67
             */

            private String max_time_1m;
            private String max_time_3m;
            private String max_time_6m;
            private String min_time_1m;
            private String min_time_3m;
            private String min_time_6m;
            private String call_time_in_1_min_1m;
            private String call_time_in_1_min_3m;
            private String call_time_in_1_min_6m;
            private String call_time_in_1_min_avg_3m;
            private String call_time_in_1_min_avg_6m;
            private String call_time_in_5_min_1m;
            private String call_time_in_5_min_3m;
            private String call_time_in_5_min_6m;
            private String call_time_in_5_min_avg_3m;
            private String call_time_in_5_min_avg_6m;
            private String call_time_in_10_min_1m;
            private String call_time_in_10_min_3m;
            private String call_time_in_10_min_6m;
            private String call_time_in_10_min_avg_3m;
            private String call_time_in_10_min_avg_6m;
            private String call_time_over_10_min_1m;
            private String call_time_over_10_min_3m;
            private String call_time_over_10_min_6m;
            private String call_time_over_10_min_avg_3m;
            private String call_time_over_10_min_avg_6m;
            private String in_day_time_1m;
            private String in_day_time_3m;
            private String in_day_time_6m;
            private String in_day_time_avg_3m;
            private String in_day_time_avg_6m;
            private String in_night_time_1m;
            private String in_night_time_3m;
            private String in_night_time_6m;
            private String in_night_time_avg_3m;
            private String in_night_time_avg_6m;
            private String local_time_1m;
            private String local_time_3m;
            private String local_time_6m;
            private String local_time_avg_3m;
            private String local_time_avg_6m;
            private String remote_time_1m;
            private String remote_time_3m;
            private String remote_time_6m;
            private String remote_time_avg_3m;
            private String remote_time_avg_6m;
            private String in_day_num_1m;
            private String in_day_num_3m;
            private String in_day_num_6m;
            private String in_day_num_avg_3m;
            private String in_day_num_avg_6m;
            private String in_night_num_1m;
            private String in_night_num_3m;
            private String in_night_num_6m;
            private String in_night_num_avg_3m;
            private String in_night_num_avg_6m;
            private String local_num_1m;
            private String local_num_3m;
            private String local_num_6m;
            private String local_num_avg_3m;
            private String local_num_avg_6m;
            private String remote_num_1m;
            private String remote_num_3m;
            private String remote_num_6m;
            private String remote_num_avg_3m;
            private String remote_num_avg_6m;

            public String getMax_time_1m() {
                return max_time_1m;
            }

            public void setMax_time_1m(String max_time_1m) {
                this.max_time_1m = max_time_1m;
            }

            public String getMax_time_3m() {
                return max_time_3m;
            }

            public void setMax_time_3m(String max_time_3m) {
                this.max_time_3m = max_time_3m;
            }

            public String getMax_time_6m() {
                return max_time_6m;
            }

            public void setMax_time_6m(String max_time_6m) {
                this.max_time_6m = max_time_6m;
            }

            public String getMin_time_1m() {
                return min_time_1m;
            }

            public void setMin_time_1m(String min_time_1m) {
                this.min_time_1m = min_time_1m;
            }

            public String getMin_time_3m() {
                return min_time_3m;
            }

            public void setMin_time_3m(String min_time_3m) {
                this.min_time_3m = min_time_3m;
            }

            public String getMin_time_6m() {
                return min_time_6m;
            }

            public void setMin_time_6m(String min_time_6m) {
                this.min_time_6m = min_time_6m;
            }

            public String getCall_time_in_1_min_1m() {
                return call_time_in_1_min_1m;
            }

            public void setCall_time_in_1_min_1m(String call_time_in_1_min_1m) {
                this.call_time_in_1_min_1m = call_time_in_1_min_1m;
            }

            public String getCall_time_in_1_min_3m() {
                return call_time_in_1_min_3m;
            }

            public void setCall_time_in_1_min_3m(String call_time_in_1_min_3m) {
                this.call_time_in_1_min_3m = call_time_in_1_min_3m;
            }

            public String getCall_time_in_1_min_6m() {
                return call_time_in_1_min_6m;
            }

            public void setCall_time_in_1_min_6m(String call_time_in_1_min_6m) {
                this.call_time_in_1_min_6m = call_time_in_1_min_6m;
            }

            public String getCall_time_in_1_min_avg_3m() {
                return call_time_in_1_min_avg_3m;
            }

            public void setCall_time_in_1_min_avg_3m(String call_time_in_1_min_avg_3m) {
                this.call_time_in_1_min_avg_3m = call_time_in_1_min_avg_3m;
            }

            public String getCall_time_in_1_min_avg_6m() {
                return call_time_in_1_min_avg_6m;
            }

            public void setCall_time_in_1_min_avg_6m(String call_time_in_1_min_avg_6m) {
                this.call_time_in_1_min_avg_6m = call_time_in_1_min_avg_6m;
            }

            public String getCall_time_in_5_min_1m() {
                return call_time_in_5_min_1m;
            }

            public void setCall_time_in_5_min_1m(String call_time_in_5_min_1m) {
                this.call_time_in_5_min_1m = call_time_in_5_min_1m;
            }

            public String getCall_time_in_5_min_3m() {
                return call_time_in_5_min_3m;
            }

            public void setCall_time_in_5_min_3m(String call_time_in_5_min_3m) {
                this.call_time_in_5_min_3m = call_time_in_5_min_3m;
            }

            public String getCall_time_in_5_min_6m() {
                return call_time_in_5_min_6m;
            }

            public void setCall_time_in_5_min_6m(String call_time_in_5_min_6m) {
                this.call_time_in_5_min_6m = call_time_in_5_min_6m;
            }

            public String getCall_time_in_5_min_avg_3m() {
                return call_time_in_5_min_avg_3m;
            }

            public void setCall_time_in_5_min_avg_3m(String call_time_in_5_min_avg_3m) {
                this.call_time_in_5_min_avg_3m = call_time_in_5_min_avg_3m;
            }

            public String getCall_time_in_5_min_avg_6m() {
                return call_time_in_5_min_avg_6m;
            }

            public void setCall_time_in_5_min_avg_6m(String call_time_in_5_min_avg_6m) {
                this.call_time_in_5_min_avg_6m = call_time_in_5_min_avg_6m;
            }

            public String getCall_time_in_10_min_1m() {
                return call_time_in_10_min_1m;
            }

            public void setCall_time_in_10_min_1m(String call_time_in_10_min_1m) {
                this.call_time_in_10_min_1m = call_time_in_10_min_1m;
            }

            public String getCall_time_in_10_min_3m() {
                return call_time_in_10_min_3m;
            }

            public void setCall_time_in_10_min_3m(String call_time_in_10_min_3m) {
                this.call_time_in_10_min_3m = call_time_in_10_min_3m;
            }

            public String getCall_time_in_10_min_6m() {
                return call_time_in_10_min_6m;
            }

            public void setCall_time_in_10_min_6m(String call_time_in_10_min_6m) {
                this.call_time_in_10_min_6m = call_time_in_10_min_6m;
            }

            public String getCall_time_in_10_min_avg_3m() {
                return call_time_in_10_min_avg_3m;
            }

            public void setCall_time_in_10_min_avg_3m(String call_time_in_10_min_avg_3m) {
                this.call_time_in_10_min_avg_3m = call_time_in_10_min_avg_3m;
            }

            public String getCall_time_in_10_min_avg_6m() {
                return call_time_in_10_min_avg_6m;
            }

            public void setCall_time_in_10_min_avg_6m(String call_time_in_10_min_avg_6m) {
                this.call_time_in_10_min_avg_6m = call_time_in_10_min_avg_6m;
            }

            public String getCall_time_over_10_min_1m() {
                return call_time_over_10_min_1m;
            }

            public void setCall_time_over_10_min_1m(String call_time_over_10_min_1m) {
                this.call_time_over_10_min_1m = call_time_over_10_min_1m;
            }

            public String getCall_time_over_10_min_3m() {
                return call_time_over_10_min_3m;
            }

            public void setCall_time_over_10_min_3m(String call_time_over_10_min_3m) {
                this.call_time_over_10_min_3m = call_time_over_10_min_3m;
            }

            public String getCall_time_over_10_min_6m() {
                return call_time_over_10_min_6m;
            }

            public void setCall_time_over_10_min_6m(String call_time_over_10_min_6m) {
                this.call_time_over_10_min_6m = call_time_over_10_min_6m;
            }

            public String getCall_time_over_10_min_avg_3m() {
                return call_time_over_10_min_avg_3m;
            }

            public void setCall_time_over_10_min_avg_3m(String call_time_over_10_min_avg_3m) {
                this.call_time_over_10_min_avg_3m = call_time_over_10_min_avg_3m;
            }

            public String getCall_time_over_10_min_avg_6m() {
                return call_time_over_10_min_avg_6m;
            }

            public void setCall_time_over_10_min_avg_6m(String call_time_over_10_min_avg_6m) {
                this.call_time_over_10_min_avg_6m = call_time_over_10_min_avg_6m;
            }

            public String getIn_day_time_1m() {
                return in_day_time_1m;
            }

            public void setIn_day_time_1m(String in_day_time_1m) {
                this.in_day_time_1m = in_day_time_1m;
            }

            public String getIn_day_time_3m() {
                return in_day_time_3m;
            }

            public void setIn_day_time_3m(String in_day_time_3m) {
                this.in_day_time_3m = in_day_time_3m;
            }

            public String getIn_day_time_6m() {
                return in_day_time_6m;
            }

            public void setIn_day_time_6m(String in_day_time_6m) {
                this.in_day_time_6m = in_day_time_6m;
            }

            public String getIn_day_time_avg_3m() {
                return in_day_time_avg_3m;
            }

            public void setIn_day_time_avg_3m(String in_day_time_avg_3m) {
                this.in_day_time_avg_3m = in_day_time_avg_3m;
            }

            public String getIn_day_time_avg_6m() {
                return in_day_time_avg_6m;
            }

            public void setIn_day_time_avg_6m(String in_day_time_avg_6m) {
                this.in_day_time_avg_6m = in_day_time_avg_6m;
            }

            public String getIn_night_time_1m() {
                return in_night_time_1m;
            }

            public void setIn_night_time_1m(String in_night_time_1m) {
                this.in_night_time_1m = in_night_time_1m;
            }

            public String getIn_night_time_3m() {
                return in_night_time_3m;
            }

            public void setIn_night_time_3m(String in_night_time_3m) {
                this.in_night_time_3m = in_night_time_3m;
            }

            public String getIn_night_time_6m() {
                return in_night_time_6m;
            }

            public void setIn_night_time_6m(String in_night_time_6m) {
                this.in_night_time_6m = in_night_time_6m;
            }

            public String getIn_night_time_avg_3m() {
                return in_night_time_avg_3m;
            }

            public void setIn_night_time_avg_3m(String in_night_time_avg_3m) {
                this.in_night_time_avg_3m = in_night_time_avg_3m;
            }

            public String getIn_night_time_avg_6m() {
                return in_night_time_avg_6m;
            }

            public void setIn_night_time_avg_6m(String in_night_time_avg_6m) {
                this.in_night_time_avg_6m = in_night_time_avg_6m;
            }

            public String getLocal_time_1m() {
                return local_time_1m;
            }

            public void setLocal_time_1m(String local_time_1m) {
                this.local_time_1m = local_time_1m;
            }

            public String getLocal_time_3m() {
                return local_time_3m;
            }

            public void setLocal_time_3m(String local_time_3m) {
                this.local_time_3m = local_time_3m;
            }

            public String getLocal_time_6m() {
                return local_time_6m;
            }

            public void setLocal_time_6m(String local_time_6m) {
                this.local_time_6m = local_time_6m;
            }

            public String getLocal_time_avg_3m() {
                return local_time_avg_3m;
            }

            public void setLocal_time_avg_3m(String local_time_avg_3m) {
                this.local_time_avg_3m = local_time_avg_3m;
            }

            public String getLocal_time_avg_6m() {
                return local_time_avg_6m;
            }

            public void setLocal_time_avg_6m(String local_time_avg_6m) {
                this.local_time_avg_6m = local_time_avg_6m;
            }

            public String getRemote_time_1m() {
                return remote_time_1m;
            }

            public void setRemote_time_1m(String remote_time_1m) {
                this.remote_time_1m = remote_time_1m;
            }

            public String getRemote_time_3m() {
                return remote_time_3m;
            }

            public void setRemote_time_3m(String remote_time_3m) {
                this.remote_time_3m = remote_time_3m;
            }

            public String getRemote_time_6m() {
                return remote_time_6m;
            }

            public void setRemote_time_6m(String remote_time_6m) {
                this.remote_time_6m = remote_time_6m;
            }

            public String getRemote_time_avg_3m() {
                return remote_time_avg_3m;
            }

            public void setRemote_time_avg_3m(String remote_time_avg_3m) {
                this.remote_time_avg_3m = remote_time_avg_3m;
            }

            public String getRemote_time_avg_6m() {
                return remote_time_avg_6m;
            }

            public void setRemote_time_avg_6m(String remote_time_avg_6m) {
                this.remote_time_avg_6m = remote_time_avg_6m;
            }

            public String getIn_day_num_1m() {
                return in_day_num_1m;
            }

            public void setIn_day_num_1m(String in_day_num_1m) {
                this.in_day_num_1m = in_day_num_1m;
            }

            public String getIn_day_num_3m() {
                return in_day_num_3m;
            }

            public void setIn_day_num_3m(String in_day_num_3m) {
                this.in_day_num_3m = in_day_num_3m;
            }

            public String getIn_day_num_6m() {
                return in_day_num_6m;
            }

            public void setIn_day_num_6m(String in_day_num_6m) {
                this.in_day_num_6m = in_day_num_6m;
            }

            public String getIn_day_num_avg_3m() {
                return in_day_num_avg_3m;
            }

            public void setIn_day_num_avg_3m(String in_day_num_avg_3m) {
                this.in_day_num_avg_3m = in_day_num_avg_3m;
            }

            public String getIn_day_num_avg_6m() {
                return in_day_num_avg_6m;
            }

            public void setIn_day_num_avg_6m(String in_day_num_avg_6m) {
                this.in_day_num_avg_6m = in_day_num_avg_6m;
            }

            public String getIn_night_num_1m() {
                return in_night_num_1m;
            }

            public void setIn_night_num_1m(String in_night_num_1m) {
                this.in_night_num_1m = in_night_num_1m;
            }

            public String getIn_night_num_3m() {
                return in_night_num_3m;
            }

            public void setIn_night_num_3m(String in_night_num_3m) {
                this.in_night_num_3m = in_night_num_3m;
            }

            public String getIn_night_num_6m() {
                return in_night_num_6m;
            }

            public void setIn_night_num_6m(String in_night_num_6m) {
                this.in_night_num_6m = in_night_num_6m;
            }

            public String getIn_night_num_avg_3m() {
                return in_night_num_avg_3m;
            }

            public void setIn_night_num_avg_3m(String in_night_num_avg_3m) {
                this.in_night_num_avg_3m = in_night_num_avg_3m;
            }

            public String getIn_night_num_avg_6m() {
                return in_night_num_avg_6m;
            }

            public void setIn_night_num_avg_6m(String in_night_num_avg_6m) {
                this.in_night_num_avg_6m = in_night_num_avg_6m;
            }

            public String getLocal_num_1m() {
                return local_num_1m;
            }

            public void setLocal_num_1m(String local_num_1m) {
                this.local_num_1m = local_num_1m;
            }

            public String getLocal_num_3m() {
                return local_num_3m;
            }

            public void setLocal_num_3m(String local_num_3m) {
                this.local_num_3m = local_num_3m;
            }

            public String getLocal_num_6m() {
                return local_num_6m;
            }

            public void setLocal_num_6m(String local_num_6m) {
                this.local_num_6m = local_num_6m;
            }

            public String getLocal_num_avg_3m() {
                return local_num_avg_3m;
            }

            public void setLocal_num_avg_3m(String local_num_avg_3m) {
                this.local_num_avg_3m = local_num_avg_3m;
            }

            public String getLocal_num_avg_6m() {
                return local_num_avg_6m;
            }

            public void setLocal_num_avg_6m(String local_num_avg_6m) {
                this.local_num_avg_6m = local_num_avg_6m;
            }

            public String getRemote_num_1m() {
                return remote_num_1m;
            }

            public void setRemote_num_1m(String remote_num_1m) {
                this.remote_num_1m = remote_num_1m;
            }

            public String getRemote_num_3m() {
                return remote_num_3m;
            }

            public void setRemote_num_3m(String remote_num_3m) {
                this.remote_num_3m = remote_num_3m;
            }

            public String getRemote_num_6m() {
                return remote_num_6m;
            }

            public void setRemote_num_6m(String remote_num_6m) {
                this.remote_num_6m = remote_num_6m;
            }

            public String getRemote_num_avg_3m() {
                return remote_num_avg_3m;
            }

            public void setRemote_num_avg_3m(String remote_num_avg_3m) {
                this.remote_num_avg_3m = remote_num_avg_3m;
            }

            public String getRemote_num_avg_6m() {
                return remote_num_avg_6m;
            }

            public void setRemote_num_avg_6m(String remote_num_avg_6m) {
                this.remote_num_avg_6m = remote_num_avg_6m;
            }
        }

        public static class CallThirdPartDetailBean {
            /**
             * call_110_num_1m : 0
             * call_110_num_3m : 0
             * call_110_num_6m : 0
             * call_110_num_avg_3m : 0.00
             * call_110_num_avg_6m : 0.00
             * call_110_time_1m : 0
             * call_110_time_3m : 0
             * call_110_time_6m : 0
             * call_110_time_avg_3m : 0
             * call_110_time_avg_6m : 0
             * call_120_num_1m : 0
             * call_120_num_3m : 0
             * call_120_num_6m : 0
             * call_120_num_avg_3m : 0.00
             * call_120_num_avg_6m : 0.00
             * call_120_time_1m : 0
             * call_120_time_3m : 0
             * call_120_time_6m : 0
             * call_120_time_avg_3m : 0
             * call_120_time_avg_6m : 0
             * call_loan_num_1m : 0
             * call_loan_num_3m : 2
             * call_loan_num_6m : 3
             * call_loan_num_avg_3m : 0.67
             * call_loan_num_avg_6m : 0.50
             * call_loan_time_1m : 0
             * call_loan_time_3m : 144
             * call_loan_time_6m : 264
             * call_loan_time_avg_3m : 48
             * call_loan_time_avg_6m : 44
             * call_credit_card_num_1m : 0
             * call_credit_card_num_3m : 1
             * call_credit_card_num_6m : 1
             * call_credit_card_num_avg_3m : 0.33
             * call_credit_card_num_avg_6m : 0.17
             * call_credit_card_time_1m : 0
             * call_credit_card_time_3m : 288
             * call_credit_card_time_6m : 288
             * call_credit_card_time_avg_3m : 96
             * call_credit_card_time_avg_6m : 48
             * call_macon_num_1m : 0
             * call_macon_num_3m : 0
             * call_macon_num_6m : 0
             * call_macon_num_avg_3m : 0.00
             * call_macon_num_avg_6m : 0.00
             * call_macon_time_1m : 0
             * call_macon_time_3m : 0
             * call_macon_time_6m : 0
             * call_macon_time_avg_3m : 0
             * call_macon_time_avg_6m : 0
             * call_collection_firm_num_1m : 0
             * call_collection_firm_num_3m : 0
             * call_collection_firm_num_6m : 0
             * call_collection_firm_num_avg_3m : 0.00
             * call_collection_firm_num_avg_6m : 0.00
             * call_collection_firm_time_1m : 0
             * call_collection_firm_time_3m : 0
             * call_collection_firm_time_6m : 0
             * call_collection_firm_time_avg_3m : 0
             * call_collection_firm_time_avg_6m : 0
             * call_lawyer_num_1m : 0
             * call_lawyer_num_3m : 0
             * call_lawyer_num_6m : 0
             * call_lawyer_time_1m : 0
             * call_lawyer_time_3m : 0
             * call_lawyer_time_6m : 0
             * call_bank_num_1m : 6
             * call_bank_num_3m : 7
             * call_bank_num_6m : 8
             * call_bank_time_1m : 544
             * call_bank_time_3m : 832
             * call_bank_time_6m : 878
             * call_agency_num_1m : 0
             * call_agency_num_3m : 0
             * call_agency_num_6m : 0
             * call_agency_time_1m : 0
             * call_agency_time_3m : 0
             * call_agency_time_6m : 0
             * call_fraud_num_1m : 0
             * call_fraud_num_3m : 0
             * call_fraud_num_6m : 0
             * call_fraud_time_1m : 0
             * call_fraud_time_3m : 0
             * call_fraud_time_6m : 0
             * call_nuisance_num_1m : 0
             * call_nuisance_num_3m : 0
             * call_nuisance_num_6m : 0
             * call_nuisance_time_1m : 0
             * call_nuisance_time_3m : 0
             * call_nuisance_time_6m : 0
             * call_railway_airway_num_1m : 0
             * call_railway_airway_num_3m : 0
             * call_railway_airway_num_6m : 0
             * call_railway_airway_time_1m : 0
             * call_railway_airway_time_3m : 0
             * call_railway_airway_time_6m : 0
             * call_special_service_num_1m : 0
             * call_special_service_num_3m : 0
             * call_special_service_num_6m : 0
             * call_special_service_time_1m : 0
             * call_special_service_time_3m : 0
             * call_special_service_time_6m : 0
             * call_express_num_1m : 0
             * call_express_num_3m : 0
             * call_express_num_6m : 0
             * call_express_time_1m : 0
             * call_express_time_3m : 0
             * call_express_time_6m : 0
             * call_ins_fin_num_1m : 6
             * call_ins_fin_num_3m : 7
             * call_ins_fin_num_6m : 9
             * call_ins_fin_time_1m : 1586
             * call_ins_fin_time_3m : 1593
             * call_ins_fin_time_6m : 2550
             * call_car_firm_num_1m : 0
             * call_car_firm_num_3m : 0
             * call_car_firm_num_6m : 0
             * call_car_firm_time_1m : 0
             * call_car_firm_time_3m : 0
             * call_car_firm_time_6m : 0
             * call_carrier_num_1m : 0
             * call_carrier_num_3m : 0
             * call_carrier_num_6m : 0
             * call_carrier_time_1m : 0
             * call_carrier_time_3m : 0
             * call_carrier_time_6m : 0
             */

            private String call_110_num_1m;
            private String call_110_num_3m;
            private String call_110_num_6m;
            private String call_110_num_avg_3m;
            private String call_110_num_avg_6m;
            private String call_110_time_1m;
            private String call_110_time_3m;
            private String call_110_time_6m;
            private String call_110_time_avg_3m;
            private String call_110_time_avg_6m;
            private String call_120_num_1m;
            private String call_120_num_3m;
            private String call_120_num_6m;
            private String call_120_num_avg_3m;
            private String call_120_num_avg_6m;
            private String call_120_time_1m;
            private String call_120_time_3m;
            private String call_120_time_6m;
            private String call_120_time_avg_3m;
            private String call_120_time_avg_6m;
            private String call_loan_num_1m;
            private String call_loan_num_3m;
            private String call_loan_num_6m;
            private String call_loan_num_avg_3m;
            private String call_loan_num_avg_6m;
            private String call_loan_time_1m;
            private String call_loan_time_3m;
            private String call_loan_time_6m;
            private String call_loan_time_avg_3m;
            private String call_loan_time_avg_6m;
            private String call_credit_card_num_1m;
            private String call_credit_card_num_3m;
            private String call_credit_card_num_6m;
            private String call_credit_card_num_avg_3m;
            private String call_credit_card_num_avg_6m;
            private String call_credit_card_time_1m;
            private String call_credit_card_time_3m;
            private String call_credit_card_time_6m;
            private String call_credit_card_time_avg_3m;
            private String call_credit_card_time_avg_6m;
            private String call_macon_num_1m;
            private String call_macon_num_3m;
            private String call_macon_num_6m;
            private String call_macon_num_avg_3m;
            private String call_macon_num_avg_6m;
            private String call_macon_time_1m;
            private String call_macon_time_3m;
            private String call_macon_time_6m;
            private String call_macon_time_avg_3m;
            private String call_macon_time_avg_6m;
            private String call_collection_firm_num_1m;
            private String call_collection_firm_num_3m;
            private String call_collection_firm_num_6m;
            private String call_collection_firm_num_avg_3m;
            private String call_collection_firm_num_avg_6m;
            private String call_collection_firm_time_1m;
            private String call_collection_firm_time_3m;
            private String call_collection_firm_time_6m;
            private String call_collection_firm_time_avg_3m;
            private String call_collection_firm_time_avg_6m;
            private String call_lawyer_num_1m;
            private String call_lawyer_num_3m;
            private String call_lawyer_num_6m;
            private String call_lawyer_time_1m;
            private String call_lawyer_time_3m;
            private String call_lawyer_time_6m;
            private String call_bank_num_1m;
            private String call_bank_num_3m;
            private String call_bank_num_6m;
            private String call_bank_time_1m;
            private String call_bank_time_3m;
            private String call_bank_time_6m;
            private String call_agency_num_1m;
            private String call_agency_num_3m;
            private String call_agency_num_6m;
            private String call_agency_time_1m;
            private String call_agency_time_3m;
            private String call_agency_time_6m;
            private String call_fraud_num_1m;
            private String call_fraud_num_3m;
            private String call_fraud_num_6m;
            private String call_fraud_time_1m;
            private String call_fraud_time_3m;
            private String call_fraud_time_6m;
            private String call_nuisance_num_1m;
            private String call_nuisance_num_3m;
            private String call_nuisance_num_6m;
            private String call_nuisance_time_1m;
            private String call_nuisance_time_3m;
            private String call_nuisance_time_6m;
            private String call_railway_airway_num_1m;
            private String call_railway_airway_num_3m;
            private String call_railway_airway_num_6m;
            private String call_railway_airway_time_1m;
            private String call_railway_airway_time_3m;
            private String call_railway_airway_time_6m;
            private String call_special_service_num_1m;
            private String call_special_service_num_3m;
            private String call_special_service_num_6m;
            private String call_special_service_time_1m;
            private String call_special_service_time_3m;
            private String call_special_service_time_6m;
            private String call_express_num_1m;
            private String call_express_num_3m;
            private String call_express_num_6m;
            private String call_express_time_1m;
            private String call_express_time_3m;
            private String call_express_time_6m;
            private String call_ins_fin_num_1m;
            private String call_ins_fin_num_3m;
            private String call_ins_fin_num_6m;
            private String call_ins_fin_time_1m;
            private String call_ins_fin_time_3m;
            private String call_ins_fin_time_6m;
            private String call_car_firm_num_1m;
            private String call_car_firm_num_3m;
            private String call_car_firm_num_6m;
            private String call_car_firm_time_1m;
            private String call_car_firm_time_3m;
            private String call_car_firm_time_6m;
            private String call_carrier_num_1m;
            private String call_carrier_num_3m;
            private String call_carrier_num_6m;
            private String call_carrier_time_1m;
            private String call_carrier_time_3m;
            private String call_carrier_time_6m;

            public String getCall_110_num_1m() {
                return call_110_num_1m;
            }

            public void setCall_110_num_1m(String call_110_num_1m) {
                this.call_110_num_1m = call_110_num_1m;
            }

            public String getCall_110_num_3m() {
                return call_110_num_3m;
            }

            public void setCall_110_num_3m(String call_110_num_3m) {
                this.call_110_num_3m = call_110_num_3m;
            }

            public String getCall_110_num_6m() {
                return call_110_num_6m;
            }

            public void setCall_110_num_6m(String call_110_num_6m) {
                this.call_110_num_6m = call_110_num_6m;
            }

            public String getCall_110_num_avg_3m() {
                return call_110_num_avg_3m;
            }

            public void setCall_110_num_avg_3m(String call_110_num_avg_3m) {
                this.call_110_num_avg_3m = call_110_num_avg_3m;
            }

            public String getCall_110_num_avg_6m() {
                return call_110_num_avg_6m;
            }

            public void setCall_110_num_avg_6m(String call_110_num_avg_6m) {
                this.call_110_num_avg_6m = call_110_num_avg_6m;
            }

            public String getCall_110_time_1m() {
                return call_110_time_1m;
            }

            public void setCall_110_time_1m(String call_110_time_1m) {
                this.call_110_time_1m = call_110_time_1m;
            }

            public String getCall_110_time_3m() {
                return call_110_time_3m;
            }

            public void setCall_110_time_3m(String call_110_time_3m) {
                this.call_110_time_3m = call_110_time_3m;
            }

            public String getCall_110_time_6m() {
                return call_110_time_6m;
            }

            public void setCall_110_time_6m(String call_110_time_6m) {
                this.call_110_time_6m = call_110_time_6m;
            }

            public String getCall_110_time_avg_3m() {
                return call_110_time_avg_3m;
            }

            public void setCall_110_time_avg_3m(String call_110_time_avg_3m) {
                this.call_110_time_avg_3m = call_110_time_avg_3m;
            }

            public String getCall_110_time_avg_6m() {
                return call_110_time_avg_6m;
            }

            public void setCall_110_time_avg_6m(String call_110_time_avg_6m) {
                this.call_110_time_avg_6m = call_110_time_avg_6m;
            }

            public String getCall_120_num_1m() {
                return call_120_num_1m;
            }

            public void setCall_120_num_1m(String call_120_num_1m) {
                this.call_120_num_1m = call_120_num_1m;
            }

            public String getCall_120_num_3m() {
                return call_120_num_3m;
            }

            public void setCall_120_num_3m(String call_120_num_3m) {
                this.call_120_num_3m = call_120_num_3m;
            }

            public String getCall_120_num_6m() {
                return call_120_num_6m;
            }

            public void setCall_120_num_6m(String call_120_num_6m) {
                this.call_120_num_6m = call_120_num_6m;
            }

            public String getCall_120_num_avg_3m() {
                return call_120_num_avg_3m;
            }

            public void setCall_120_num_avg_3m(String call_120_num_avg_3m) {
                this.call_120_num_avg_3m = call_120_num_avg_3m;
            }

            public String getCall_120_num_avg_6m() {
                return call_120_num_avg_6m;
            }

            public void setCall_120_num_avg_6m(String call_120_num_avg_6m) {
                this.call_120_num_avg_6m = call_120_num_avg_6m;
            }

            public String getCall_120_time_1m() {
                return call_120_time_1m;
            }

            public void setCall_120_time_1m(String call_120_time_1m) {
                this.call_120_time_1m = call_120_time_1m;
            }

            public String getCall_120_time_3m() {
                return call_120_time_3m;
            }

            public void setCall_120_time_3m(String call_120_time_3m) {
                this.call_120_time_3m = call_120_time_3m;
            }

            public String getCall_120_time_6m() {
                return call_120_time_6m;
            }

            public void setCall_120_time_6m(String call_120_time_6m) {
                this.call_120_time_6m = call_120_time_6m;
            }

            public String getCall_120_time_avg_3m() {
                return call_120_time_avg_3m;
            }

            public void setCall_120_time_avg_3m(String call_120_time_avg_3m) {
                this.call_120_time_avg_3m = call_120_time_avg_3m;
            }

            public String getCall_120_time_avg_6m() {
                return call_120_time_avg_6m;
            }

            public void setCall_120_time_avg_6m(String call_120_time_avg_6m) {
                this.call_120_time_avg_6m = call_120_time_avg_6m;
            }

            public String getCall_loan_num_1m() {
                return call_loan_num_1m;
            }

            public void setCall_loan_num_1m(String call_loan_num_1m) {
                this.call_loan_num_1m = call_loan_num_1m;
            }

            public String getCall_loan_num_3m() {
                return call_loan_num_3m;
            }

            public void setCall_loan_num_3m(String call_loan_num_3m) {
                this.call_loan_num_3m = call_loan_num_3m;
            }

            public String getCall_loan_num_6m() {
                return call_loan_num_6m;
            }

            public void setCall_loan_num_6m(String call_loan_num_6m) {
                this.call_loan_num_6m = call_loan_num_6m;
            }

            public String getCall_loan_num_avg_3m() {
                return call_loan_num_avg_3m;
            }

            public void setCall_loan_num_avg_3m(String call_loan_num_avg_3m) {
                this.call_loan_num_avg_3m = call_loan_num_avg_3m;
            }

            public String getCall_loan_num_avg_6m() {
                return call_loan_num_avg_6m;
            }

            public void setCall_loan_num_avg_6m(String call_loan_num_avg_6m) {
                this.call_loan_num_avg_6m = call_loan_num_avg_6m;
            }

            public String getCall_loan_time_1m() {
                return call_loan_time_1m;
            }

            public void setCall_loan_time_1m(String call_loan_time_1m) {
                this.call_loan_time_1m = call_loan_time_1m;
            }

            public String getCall_loan_time_3m() {
                return call_loan_time_3m;
            }

            public void setCall_loan_time_3m(String call_loan_time_3m) {
                this.call_loan_time_3m = call_loan_time_3m;
            }

            public String getCall_loan_time_6m() {
                return call_loan_time_6m;
            }

            public void setCall_loan_time_6m(String call_loan_time_6m) {
                this.call_loan_time_6m = call_loan_time_6m;
            }

            public String getCall_loan_time_avg_3m() {
                return call_loan_time_avg_3m;
            }

            public void setCall_loan_time_avg_3m(String call_loan_time_avg_3m) {
                this.call_loan_time_avg_3m = call_loan_time_avg_3m;
            }

            public String getCall_loan_time_avg_6m() {
                return call_loan_time_avg_6m;
            }

            public void setCall_loan_time_avg_6m(String call_loan_time_avg_6m) {
                this.call_loan_time_avg_6m = call_loan_time_avg_6m;
            }

            public String getCall_credit_card_num_1m() {
                return call_credit_card_num_1m;
            }

            public void setCall_credit_card_num_1m(String call_credit_card_num_1m) {
                this.call_credit_card_num_1m = call_credit_card_num_1m;
            }

            public String getCall_credit_card_num_3m() {
                return call_credit_card_num_3m;
            }

            public void setCall_credit_card_num_3m(String call_credit_card_num_3m) {
                this.call_credit_card_num_3m = call_credit_card_num_3m;
            }

            public String getCall_credit_card_num_6m() {
                return call_credit_card_num_6m;
            }

            public void setCall_credit_card_num_6m(String call_credit_card_num_6m) {
                this.call_credit_card_num_6m = call_credit_card_num_6m;
            }

            public String getCall_credit_card_num_avg_3m() {
                return call_credit_card_num_avg_3m;
            }

            public void setCall_credit_card_num_avg_3m(String call_credit_card_num_avg_3m) {
                this.call_credit_card_num_avg_3m = call_credit_card_num_avg_3m;
            }

            public String getCall_credit_card_num_avg_6m() {
                return call_credit_card_num_avg_6m;
            }

            public void setCall_credit_card_num_avg_6m(String call_credit_card_num_avg_6m) {
                this.call_credit_card_num_avg_6m = call_credit_card_num_avg_6m;
            }

            public String getCall_credit_card_time_1m() {
                return call_credit_card_time_1m;
            }

            public void setCall_credit_card_time_1m(String call_credit_card_time_1m) {
                this.call_credit_card_time_1m = call_credit_card_time_1m;
            }

            public String getCall_credit_card_time_3m() {
                return call_credit_card_time_3m;
            }

            public void setCall_credit_card_time_3m(String call_credit_card_time_3m) {
                this.call_credit_card_time_3m = call_credit_card_time_3m;
            }

            public String getCall_credit_card_time_6m() {
                return call_credit_card_time_6m;
            }

            public void setCall_credit_card_time_6m(String call_credit_card_time_6m) {
                this.call_credit_card_time_6m = call_credit_card_time_6m;
            }

            public String getCall_credit_card_time_avg_3m() {
                return call_credit_card_time_avg_3m;
            }

            public void setCall_credit_card_time_avg_3m(String call_credit_card_time_avg_3m) {
                this.call_credit_card_time_avg_3m = call_credit_card_time_avg_3m;
            }

            public String getCall_credit_card_time_avg_6m() {
                return call_credit_card_time_avg_6m;
            }

            public void setCall_credit_card_time_avg_6m(String call_credit_card_time_avg_6m) {
                this.call_credit_card_time_avg_6m = call_credit_card_time_avg_6m;
            }

            public String getCall_macon_num_1m() {
                return call_macon_num_1m;
            }

            public void setCall_macon_num_1m(String call_macon_num_1m) {
                this.call_macon_num_1m = call_macon_num_1m;
            }

            public String getCall_macon_num_3m() {
                return call_macon_num_3m;
            }

            public void setCall_macon_num_3m(String call_macon_num_3m) {
                this.call_macon_num_3m = call_macon_num_3m;
            }

            public String getCall_macon_num_6m() {
                return call_macon_num_6m;
            }

            public void setCall_macon_num_6m(String call_macon_num_6m) {
                this.call_macon_num_6m = call_macon_num_6m;
            }

            public String getCall_macon_num_avg_3m() {
                return call_macon_num_avg_3m;
            }

            public void setCall_macon_num_avg_3m(String call_macon_num_avg_3m) {
                this.call_macon_num_avg_3m = call_macon_num_avg_3m;
            }

            public String getCall_macon_num_avg_6m() {
                return call_macon_num_avg_6m;
            }

            public void setCall_macon_num_avg_6m(String call_macon_num_avg_6m) {
                this.call_macon_num_avg_6m = call_macon_num_avg_6m;
            }

            public String getCall_macon_time_1m() {
                return call_macon_time_1m;
            }

            public void setCall_macon_time_1m(String call_macon_time_1m) {
                this.call_macon_time_1m = call_macon_time_1m;
            }

            public String getCall_macon_time_3m() {
                return call_macon_time_3m;
            }

            public void setCall_macon_time_3m(String call_macon_time_3m) {
                this.call_macon_time_3m = call_macon_time_3m;
            }

            public String getCall_macon_time_6m() {
                return call_macon_time_6m;
            }

            public void setCall_macon_time_6m(String call_macon_time_6m) {
                this.call_macon_time_6m = call_macon_time_6m;
            }

            public String getCall_macon_time_avg_3m() {
                return call_macon_time_avg_3m;
            }

            public void setCall_macon_time_avg_3m(String call_macon_time_avg_3m) {
                this.call_macon_time_avg_3m = call_macon_time_avg_3m;
            }

            public String getCall_macon_time_avg_6m() {
                return call_macon_time_avg_6m;
            }

            public void setCall_macon_time_avg_6m(String call_macon_time_avg_6m) {
                this.call_macon_time_avg_6m = call_macon_time_avg_6m;
            }

            public String getCall_collection_firm_num_1m() {
                return call_collection_firm_num_1m;
            }

            public void setCall_collection_firm_num_1m(String call_collection_firm_num_1m) {
                this.call_collection_firm_num_1m = call_collection_firm_num_1m;
            }

            public String getCall_collection_firm_num_3m() {
                return call_collection_firm_num_3m;
            }

            public void setCall_collection_firm_num_3m(String call_collection_firm_num_3m) {
                this.call_collection_firm_num_3m = call_collection_firm_num_3m;
            }

            public String getCall_collection_firm_num_6m() {
                return call_collection_firm_num_6m;
            }

            public void setCall_collection_firm_num_6m(String call_collection_firm_num_6m) {
                this.call_collection_firm_num_6m = call_collection_firm_num_6m;
            }

            public String getCall_collection_firm_num_avg_3m() {
                return call_collection_firm_num_avg_3m;
            }

            public void setCall_collection_firm_num_avg_3m(String call_collection_firm_num_avg_3m) {
                this.call_collection_firm_num_avg_3m = call_collection_firm_num_avg_3m;
            }

            public String getCall_collection_firm_num_avg_6m() {
                return call_collection_firm_num_avg_6m;
            }

            public void setCall_collection_firm_num_avg_6m(String call_collection_firm_num_avg_6m) {
                this.call_collection_firm_num_avg_6m = call_collection_firm_num_avg_6m;
            }

            public String getCall_collection_firm_time_1m() {
                return call_collection_firm_time_1m;
            }

            public void setCall_collection_firm_time_1m(String call_collection_firm_time_1m) {
                this.call_collection_firm_time_1m = call_collection_firm_time_1m;
            }

            public String getCall_collection_firm_time_3m() {
                return call_collection_firm_time_3m;
            }

            public void setCall_collection_firm_time_3m(String call_collection_firm_time_3m) {
                this.call_collection_firm_time_3m = call_collection_firm_time_3m;
            }

            public String getCall_collection_firm_time_6m() {
                return call_collection_firm_time_6m;
            }

            public void setCall_collection_firm_time_6m(String call_collection_firm_time_6m) {
                this.call_collection_firm_time_6m = call_collection_firm_time_6m;
            }

            public String getCall_collection_firm_time_avg_3m() {
                return call_collection_firm_time_avg_3m;
            }

            public void setCall_collection_firm_time_avg_3m(String call_collection_firm_time_avg_3m) {
                this.call_collection_firm_time_avg_3m = call_collection_firm_time_avg_3m;
            }

            public String getCall_collection_firm_time_avg_6m() {
                return call_collection_firm_time_avg_6m;
            }

            public void setCall_collection_firm_time_avg_6m(String call_collection_firm_time_avg_6m) {
                this.call_collection_firm_time_avg_6m = call_collection_firm_time_avg_6m;
            }

            public String getCall_lawyer_num_1m() {
                return call_lawyer_num_1m;
            }

            public void setCall_lawyer_num_1m(String call_lawyer_num_1m) {
                this.call_lawyer_num_1m = call_lawyer_num_1m;
            }

            public String getCall_lawyer_num_3m() {
                return call_lawyer_num_3m;
            }

            public void setCall_lawyer_num_3m(String call_lawyer_num_3m) {
                this.call_lawyer_num_3m = call_lawyer_num_3m;
            }

            public String getCall_lawyer_num_6m() {
                return call_lawyer_num_6m;
            }

            public void setCall_lawyer_num_6m(String call_lawyer_num_6m) {
                this.call_lawyer_num_6m = call_lawyer_num_6m;
            }

            public String getCall_lawyer_time_1m() {
                return call_lawyer_time_1m;
            }

            public void setCall_lawyer_time_1m(String call_lawyer_time_1m) {
                this.call_lawyer_time_1m = call_lawyer_time_1m;
            }

            public String getCall_lawyer_time_3m() {
                return call_lawyer_time_3m;
            }

            public void setCall_lawyer_time_3m(String call_lawyer_time_3m) {
                this.call_lawyer_time_3m = call_lawyer_time_3m;
            }

            public String getCall_lawyer_time_6m() {
                return call_lawyer_time_6m;
            }

            public void setCall_lawyer_time_6m(String call_lawyer_time_6m) {
                this.call_lawyer_time_6m = call_lawyer_time_6m;
            }

            public String getCall_bank_num_1m() {
                return call_bank_num_1m;
            }

            public void setCall_bank_num_1m(String call_bank_num_1m) {
                this.call_bank_num_1m = call_bank_num_1m;
            }

            public String getCall_bank_num_3m() {
                return call_bank_num_3m;
            }

            public void setCall_bank_num_3m(String call_bank_num_3m) {
                this.call_bank_num_3m = call_bank_num_3m;
            }

            public String getCall_bank_num_6m() {
                return call_bank_num_6m;
            }

            public void setCall_bank_num_6m(String call_bank_num_6m) {
                this.call_bank_num_6m = call_bank_num_6m;
            }

            public String getCall_bank_time_1m() {
                return call_bank_time_1m;
            }

            public void setCall_bank_time_1m(String call_bank_time_1m) {
                this.call_bank_time_1m = call_bank_time_1m;
            }

            public String getCall_bank_time_3m() {
                return call_bank_time_3m;
            }

            public void setCall_bank_time_3m(String call_bank_time_3m) {
                this.call_bank_time_3m = call_bank_time_3m;
            }

            public String getCall_bank_time_6m() {
                return call_bank_time_6m;
            }

            public void setCall_bank_time_6m(String call_bank_time_6m) {
                this.call_bank_time_6m = call_bank_time_6m;
            }

            public String getCall_agency_num_1m() {
                return call_agency_num_1m;
            }

            public void setCall_agency_num_1m(String call_agency_num_1m) {
                this.call_agency_num_1m = call_agency_num_1m;
            }

            public String getCall_agency_num_3m() {
                return call_agency_num_3m;
            }

            public void setCall_agency_num_3m(String call_agency_num_3m) {
                this.call_agency_num_3m = call_agency_num_3m;
            }

            public String getCall_agency_num_6m() {
                return call_agency_num_6m;
            }

            public void setCall_agency_num_6m(String call_agency_num_6m) {
                this.call_agency_num_6m = call_agency_num_6m;
            }

            public String getCall_agency_time_1m() {
                return call_agency_time_1m;
            }

            public void setCall_agency_time_1m(String call_agency_time_1m) {
                this.call_agency_time_1m = call_agency_time_1m;
            }

            public String getCall_agency_time_3m() {
                return call_agency_time_3m;
            }

            public void setCall_agency_time_3m(String call_agency_time_3m) {
                this.call_agency_time_3m = call_agency_time_3m;
            }

            public String getCall_agency_time_6m() {
                return call_agency_time_6m;
            }

            public void setCall_agency_time_6m(String call_agency_time_6m) {
                this.call_agency_time_6m = call_agency_time_6m;
            }

            public String getCall_fraud_num_1m() {
                return call_fraud_num_1m;
            }

            public void setCall_fraud_num_1m(String call_fraud_num_1m) {
                this.call_fraud_num_1m = call_fraud_num_1m;
            }

            public String getCall_fraud_num_3m() {
                return call_fraud_num_3m;
            }

            public void setCall_fraud_num_3m(String call_fraud_num_3m) {
                this.call_fraud_num_3m = call_fraud_num_3m;
            }

            public String getCall_fraud_num_6m() {
                return call_fraud_num_6m;
            }

            public void setCall_fraud_num_6m(String call_fraud_num_6m) {
                this.call_fraud_num_6m = call_fraud_num_6m;
            }

            public String getCall_fraud_time_1m() {
                return call_fraud_time_1m;
            }

            public void setCall_fraud_time_1m(String call_fraud_time_1m) {
                this.call_fraud_time_1m = call_fraud_time_1m;
            }

            public String getCall_fraud_time_3m() {
                return call_fraud_time_3m;
            }

            public void setCall_fraud_time_3m(String call_fraud_time_3m) {
                this.call_fraud_time_3m = call_fraud_time_3m;
            }

            public String getCall_fraud_time_6m() {
                return call_fraud_time_6m;
            }

            public void setCall_fraud_time_6m(String call_fraud_time_6m) {
                this.call_fraud_time_6m = call_fraud_time_6m;
            }

            public String getCall_nuisance_num_1m() {
                return call_nuisance_num_1m;
            }

            public void setCall_nuisance_num_1m(String call_nuisance_num_1m) {
                this.call_nuisance_num_1m = call_nuisance_num_1m;
            }

            public String getCall_nuisance_num_3m() {
                return call_nuisance_num_3m;
            }

            public void setCall_nuisance_num_3m(String call_nuisance_num_3m) {
                this.call_nuisance_num_3m = call_nuisance_num_3m;
            }

            public String getCall_nuisance_num_6m() {
                return call_nuisance_num_6m;
            }

            public void setCall_nuisance_num_6m(String call_nuisance_num_6m) {
                this.call_nuisance_num_6m = call_nuisance_num_6m;
            }

            public String getCall_nuisance_time_1m() {
                return call_nuisance_time_1m;
            }

            public void setCall_nuisance_time_1m(String call_nuisance_time_1m) {
                this.call_nuisance_time_1m = call_nuisance_time_1m;
            }

            public String getCall_nuisance_time_3m() {
                return call_nuisance_time_3m;
            }

            public void setCall_nuisance_time_3m(String call_nuisance_time_3m) {
                this.call_nuisance_time_3m = call_nuisance_time_3m;
            }

            public String getCall_nuisance_time_6m() {
                return call_nuisance_time_6m;
            }

            public void setCall_nuisance_time_6m(String call_nuisance_time_6m) {
                this.call_nuisance_time_6m = call_nuisance_time_6m;
            }

            public String getCall_railway_airway_num_1m() {
                return call_railway_airway_num_1m;
            }

            public void setCall_railway_airway_num_1m(String call_railway_airway_num_1m) {
                this.call_railway_airway_num_1m = call_railway_airway_num_1m;
            }

            public String getCall_railway_airway_num_3m() {
                return call_railway_airway_num_3m;
            }

            public void setCall_railway_airway_num_3m(String call_railway_airway_num_3m) {
                this.call_railway_airway_num_3m = call_railway_airway_num_3m;
            }

            public String getCall_railway_airway_num_6m() {
                return call_railway_airway_num_6m;
            }

            public void setCall_railway_airway_num_6m(String call_railway_airway_num_6m) {
                this.call_railway_airway_num_6m = call_railway_airway_num_6m;
            }

            public String getCall_railway_airway_time_1m() {
                return call_railway_airway_time_1m;
            }

            public void setCall_railway_airway_time_1m(String call_railway_airway_time_1m) {
                this.call_railway_airway_time_1m = call_railway_airway_time_1m;
            }

            public String getCall_railway_airway_time_3m() {
                return call_railway_airway_time_3m;
            }

            public void setCall_railway_airway_time_3m(String call_railway_airway_time_3m) {
                this.call_railway_airway_time_3m = call_railway_airway_time_3m;
            }

            public String getCall_railway_airway_time_6m() {
                return call_railway_airway_time_6m;
            }

            public void setCall_railway_airway_time_6m(String call_railway_airway_time_6m) {
                this.call_railway_airway_time_6m = call_railway_airway_time_6m;
            }

            public String getCall_special_service_num_1m() {
                return call_special_service_num_1m;
            }

            public void setCall_special_service_num_1m(String call_special_service_num_1m) {
                this.call_special_service_num_1m = call_special_service_num_1m;
            }

            public String getCall_special_service_num_3m() {
                return call_special_service_num_3m;
            }

            public void setCall_special_service_num_3m(String call_special_service_num_3m) {
                this.call_special_service_num_3m = call_special_service_num_3m;
            }

            public String getCall_special_service_num_6m() {
                return call_special_service_num_6m;
            }

            public void setCall_special_service_num_6m(String call_special_service_num_6m) {
                this.call_special_service_num_6m = call_special_service_num_6m;
            }

            public String getCall_special_service_time_1m() {
                return call_special_service_time_1m;
            }

            public void setCall_special_service_time_1m(String call_special_service_time_1m) {
                this.call_special_service_time_1m = call_special_service_time_1m;
            }

            public String getCall_special_service_time_3m() {
                return call_special_service_time_3m;
            }

            public void setCall_special_service_time_3m(String call_special_service_time_3m) {
                this.call_special_service_time_3m = call_special_service_time_3m;
            }

            public String getCall_special_service_time_6m() {
                return call_special_service_time_6m;
            }

            public void setCall_special_service_time_6m(String call_special_service_time_6m) {
                this.call_special_service_time_6m = call_special_service_time_6m;
            }

            public String getCall_express_num_1m() {
                return call_express_num_1m;
            }

            public void setCall_express_num_1m(String call_express_num_1m) {
                this.call_express_num_1m = call_express_num_1m;
            }

            public String getCall_express_num_3m() {
                return call_express_num_3m;
            }

            public void setCall_express_num_3m(String call_express_num_3m) {
                this.call_express_num_3m = call_express_num_3m;
            }

            public String getCall_express_num_6m() {
                return call_express_num_6m;
            }

            public void setCall_express_num_6m(String call_express_num_6m) {
                this.call_express_num_6m = call_express_num_6m;
            }

            public String getCall_express_time_1m() {
                return call_express_time_1m;
            }

            public void setCall_express_time_1m(String call_express_time_1m) {
                this.call_express_time_1m = call_express_time_1m;
            }

            public String getCall_express_time_3m() {
                return call_express_time_3m;
            }

            public void setCall_express_time_3m(String call_express_time_3m) {
                this.call_express_time_3m = call_express_time_3m;
            }

            public String getCall_express_time_6m() {
                return call_express_time_6m;
            }

            public void setCall_express_time_6m(String call_express_time_6m) {
                this.call_express_time_6m = call_express_time_6m;
            }

            public String getCall_ins_fin_num_1m() {
                return call_ins_fin_num_1m;
            }

            public void setCall_ins_fin_num_1m(String call_ins_fin_num_1m) {
                this.call_ins_fin_num_1m = call_ins_fin_num_1m;
            }

            public String getCall_ins_fin_num_3m() {
                return call_ins_fin_num_3m;
            }

            public void setCall_ins_fin_num_3m(String call_ins_fin_num_3m) {
                this.call_ins_fin_num_3m = call_ins_fin_num_3m;
            }

            public String getCall_ins_fin_num_6m() {
                return call_ins_fin_num_6m;
            }

            public void setCall_ins_fin_num_6m(String call_ins_fin_num_6m) {
                this.call_ins_fin_num_6m = call_ins_fin_num_6m;
            }

            public String getCall_ins_fin_time_1m() {
                return call_ins_fin_time_1m;
            }

            public void setCall_ins_fin_time_1m(String call_ins_fin_time_1m) {
                this.call_ins_fin_time_1m = call_ins_fin_time_1m;
            }

            public String getCall_ins_fin_time_3m() {
                return call_ins_fin_time_3m;
            }

            public void setCall_ins_fin_time_3m(String call_ins_fin_time_3m) {
                this.call_ins_fin_time_3m = call_ins_fin_time_3m;
            }

            public String getCall_ins_fin_time_6m() {
                return call_ins_fin_time_6m;
            }

            public void setCall_ins_fin_time_6m(String call_ins_fin_time_6m) {
                this.call_ins_fin_time_6m = call_ins_fin_time_6m;
            }

            public String getCall_car_firm_num_1m() {
                return call_car_firm_num_1m;
            }

            public void setCall_car_firm_num_1m(String call_car_firm_num_1m) {
                this.call_car_firm_num_1m = call_car_firm_num_1m;
            }

            public String getCall_car_firm_num_3m() {
                return call_car_firm_num_3m;
            }

            public void setCall_car_firm_num_3m(String call_car_firm_num_3m) {
                this.call_car_firm_num_3m = call_car_firm_num_3m;
            }

            public String getCall_car_firm_num_6m() {
                return call_car_firm_num_6m;
            }

            public void setCall_car_firm_num_6m(String call_car_firm_num_6m) {
                this.call_car_firm_num_6m = call_car_firm_num_6m;
            }

            public String getCall_car_firm_time_1m() {
                return call_car_firm_time_1m;
            }

            public void setCall_car_firm_time_1m(String call_car_firm_time_1m) {
                this.call_car_firm_time_1m = call_car_firm_time_1m;
            }

            public String getCall_car_firm_time_3m() {
                return call_car_firm_time_3m;
            }

            public void setCall_car_firm_time_3m(String call_car_firm_time_3m) {
                this.call_car_firm_time_3m = call_car_firm_time_3m;
            }

            public String getCall_car_firm_time_6m() {
                return call_car_firm_time_6m;
            }

            public void setCall_car_firm_time_6m(String call_car_firm_time_6m) {
                this.call_car_firm_time_6m = call_car_firm_time_6m;
            }

            public String getCall_carrier_num_1m() {
                return call_carrier_num_1m;
            }

            public void setCall_carrier_num_1m(String call_carrier_num_1m) {
                this.call_carrier_num_1m = call_carrier_num_1m;
            }

            public String getCall_carrier_num_3m() {
                return call_carrier_num_3m;
            }

            public void setCall_carrier_num_3m(String call_carrier_num_3m) {
                this.call_carrier_num_3m = call_carrier_num_3m;
            }

            public String getCall_carrier_num_6m() {
                return call_carrier_num_6m;
            }

            public void setCall_carrier_num_6m(String call_carrier_num_6m) {
                this.call_carrier_num_6m = call_carrier_num_6m;
            }

            public String getCall_carrier_time_1m() {
                return call_carrier_time_1m;
            }

            public void setCall_carrier_time_1m(String call_carrier_time_1m) {
                this.call_carrier_time_1m = call_carrier_time_1m;
            }

            public String getCall_carrier_time_3m() {
                return call_carrier_time_3m;
            }

            public void setCall_carrier_time_3m(String call_carrier_time_3m) {
                this.call_carrier_time_3m = call_carrier_time_3m;
            }

            public String getCall_carrier_time_6m() {
                return call_carrier_time_6m;
            }

            public void setCall_carrier_time_6m(String call_carrier_time_6m) {
                this.call_carrier_time_6m = call_carrier_time_6m;
            }
        }

        public static class CallFamilyDetailBean {
            /**
             * is_family_net_member_1m : 否
             * is_family_net_member_3m : 否
             * is_family_net_member_6m : 否
             * is_family_net_master_1m : 否
             * is_family_net_master_3m : 否
             * is_family_net_master_6m : 否
             * recharge_month_1m : 1
             * recharge_month_3m : 3
             * recharge_month_6m : 6
             * is_address_match_phone_1m : 否
             * is_address_match_phone_3m : 否
             * is_address_match_phone_6m : 是
             * num_of_call_less_1m : 否
             * num_of_call_less_3m : 否
             * num_of_call_less_6m : 否
             * num_of_call_more_1m : 否
             * num_of_call_more_3m : 否
             * num_of_call_more_6m : 否
             * unpaid_month_1m : 0
             * unpaid_month_3m : 1
             * unpaid_month_6m : 2
             * live_month_1m : 1
             * live_month_3m : 2
             * live_month_6m : 5
             */

            private String is_family_net_member_1m;
            private String is_family_net_member_3m;
            private String is_family_net_member_6m;
            private String is_family_net_master_1m;
            private String is_family_net_master_3m;
            private String is_family_net_master_6m;
            private String recharge_month_1m;
            private String recharge_month_3m;
            private String recharge_month_6m;
            private String is_address_match_phone_1m;
            private String is_address_match_phone_3m;
            private String is_address_match_phone_6m;
            private String num_of_call_less_1m;
            private String num_of_call_less_3m;
            private String num_of_call_less_6m;
            private String num_of_call_more_1m;
            private String num_of_call_more_3m;
            private String num_of_call_more_6m;
            private String unpaid_month_1m;
            private String unpaid_month_3m;
            private String unpaid_month_6m;
            private String live_month_1m;
            private String live_month_3m;
            private String live_month_6m;

            public String getIs_family_net_member_1m() {
                return is_family_net_member_1m;
            }

            public void setIs_family_net_member_1m(String is_family_net_member_1m) {
                this.is_family_net_member_1m = is_family_net_member_1m;
            }

            public String getIs_family_net_member_3m() {
                return is_family_net_member_3m;
            }

            public void setIs_family_net_member_3m(String is_family_net_member_3m) {
                this.is_family_net_member_3m = is_family_net_member_3m;
            }

            public String getIs_family_net_member_6m() {
                return is_family_net_member_6m;
            }

            public void setIs_family_net_member_6m(String is_family_net_member_6m) {
                this.is_family_net_member_6m = is_family_net_member_6m;
            }

            public String getIs_family_net_master_1m() {
                return is_family_net_master_1m;
            }

            public void setIs_family_net_master_1m(String is_family_net_master_1m) {
                this.is_family_net_master_1m = is_family_net_master_1m;
            }

            public String getIs_family_net_master_3m() {
                return is_family_net_master_3m;
            }

            public void setIs_family_net_master_3m(String is_family_net_master_3m) {
                this.is_family_net_master_3m = is_family_net_master_3m;
            }

            public String getIs_family_net_master_6m() {
                return is_family_net_master_6m;
            }

            public void setIs_family_net_master_6m(String is_family_net_master_6m) {
                this.is_family_net_master_6m = is_family_net_master_6m;
            }

            public String getRecharge_month_1m() {
                return recharge_month_1m;
            }

            public void setRecharge_month_1m(String recharge_month_1m) {
                this.recharge_month_1m = recharge_month_1m;
            }

            public String getRecharge_month_3m() {
                return recharge_month_3m;
            }

            public void setRecharge_month_3m(String recharge_month_3m) {
                this.recharge_month_3m = recharge_month_3m;
            }

            public String getRecharge_month_6m() {
                return recharge_month_6m;
            }

            public void setRecharge_month_6m(String recharge_month_6m) {
                this.recharge_month_6m = recharge_month_6m;
            }

            public String getIs_address_match_phone_1m() {
                return is_address_match_phone_1m;
            }

            public void setIs_address_match_phone_1m(String is_address_match_phone_1m) {
                this.is_address_match_phone_1m = is_address_match_phone_1m;
            }

            public String getIs_address_match_phone_3m() {
                return is_address_match_phone_3m;
            }

            public void setIs_address_match_phone_3m(String is_address_match_phone_3m) {
                this.is_address_match_phone_3m = is_address_match_phone_3m;
            }

            public String getIs_address_match_phone_6m() {
                return is_address_match_phone_6m;
            }

            public void setIs_address_match_phone_6m(String is_address_match_phone_6m) {
                this.is_address_match_phone_6m = is_address_match_phone_6m;
            }

            public String getNum_of_call_less_1m() {
                return num_of_call_less_1m;
            }

            public void setNum_of_call_less_1m(String num_of_call_less_1m) {
                this.num_of_call_less_1m = num_of_call_less_1m;
            }

            public String getNum_of_call_less_3m() {
                return num_of_call_less_3m;
            }

            public void setNum_of_call_less_3m(String num_of_call_less_3m) {
                this.num_of_call_less_3m = num_of_call_less_3m;
            }

            public String getNum_of_call_less_6m() {
                return num_of_call_less_6m;
            }

            public void setNum_of_call_less_6m(String num_of_call_less_6m) {
                this.num_of_call_less_6m = num_of_call_less_6m;
            }

            public String getNum_of_call_more_1m() {
                return num_of_call_more_1m;
            }

            public void setNum_of_call_more_1m(String num_of_call_more_1m) {
                this.num_of_call_more_1m = num_of_call_more_1m;
            }

            public String getNum_of_call_more_3m() {
                return num_of_call_more_3m;
            }

            public void setNum_of_call_more_3m(String num_of_call_more_3m) {
                this.num_of_call_more_3m = num_of_call_more_3m;
            }

            public String getNum_of_call_more_6m() {
                return num_of_call_more_6m;
            }

            public void setNum_of_call_more_6m(String num_of_call_more_6m) {
                this.num_of_call_more_6m = num_of_call_more_6m;
            }

            public String getUnpaid_month_1m() {
                return unpaid_month_1m;
            }

            public void setUnpaid_month_1m(String unpaid_month_1m) {
                this.unpaid_month_1m = unpaid_month_1m;
            }

            public String getUnpaid_month_3m() {
                return unpaid_month_3m;
            }

            public void setUnpaid_month_3m(String unpaid_month_3m) {
                this.unpaid_month_3m = unpaid_month_3m;
            }

            public String getUnpaid_month_6m() {
                return unpaid_month_6m;
            }

            public void setUnpaid_month_6m(String unpaid_month_6m) {
                this.unpaid_month_6m = unpaid_month_6m;
            }

            public String getLive_month_1m() {
                return live_month_1m;
            }

            public void setLive_month_1m(String live_month_1m) {
                this.live_month_1m = live_month_1m;
            }

            public String getLive_month_3m() {
                return live_month_3m;
            }

            public void setLive_month_3m(String live_month_3m) {
                this.live_month_3m = live_month_3m;
            }

            public String getLive_month_6m() {
                return live_month_6m;
            }

            public void setLive_month_6m(String live_month_6m) {
                this.live_month_6m = live_month_6m;
            }
        }

        public static class CallNumTop33mBean {
            /**
             * city : 合肥
             * peer_number : 15256943459
             * call_num : 14
             * call_time : 5433
             * dial_num : 7
             * dialed_num : 7
             */

            private String city;
            private String peer_number;
            private String call_num;
            private String call_time;
            private String dial_num;
            private String dialed_num;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getPeer_number() {
                return peer_number;
            }

            public void setPeer_number(String peer_number) {
                this.peer_number = peer_number;
            }

            public String getCall_num() {
                return call_num;
            }

            public void setCall_num(String call_num) {
                this.call_num = call_num;
            }

            public String getCall_time() {
                return call_time;
            }

            public void setCall_time(String call_time) {
                this.call_time = call_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }
        }

        public static class CallNumTop36mBean {
            /**
             * city : 金华
             * peer_number : 18072693133
             * call_num : 52
             * call_time : 1544
             * dial_num : 18
             * dialed_num : 34
             */

            private String city;
            private String peer_number;
            private String call_num;
            private String call_time;
            private String dial_num;
            private String dialed_num;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getPeer_number() {
                return peer_number;
            }

            public void setPeer_number(String peer_number) {
                this.peer_number = peer_number;
            }

            public String getCall_num() {
                return call_num;
            }

            public void setCall_num(String call_num) {
                this.call_num = call_num;
            }

            public String getCall_time() {
                return call_time;
            }

            public void setCall_time(String call_time) {
                this.call_time = call_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }
        }

        public static class CallLocationTop33mBean {
            /**
             * city : 合肥
             * call_num : 35
             * peer_number_count : 5
             * call_time : 9705
             * dial_num : 16
             * dialed_num : 19
             */

            private String city;
            private String call_num;
            private String peer_number_count;
            private String call_time;
            private String dial_num;
            private String dialed_num;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCall_num() {
                return call_num;
            }

            public void setCall_num(String call_num) {
                this.call_num = call_num;
            }

            public String getPeer_number_count() {
                return peer_number_count;
            }

            public void setPeer_number_count(String peer_number_count) {
                this.peer_number_count = peer_number_count;
            }

            public String getCall_time() {
                return call_time;
            }

            public void setCall_time(String call_time) {
                this.call_time = call_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }
        }

        public static class CallLocationTop36mBean {
            /**
             * city : 金华
             * call_num : 183
             * peer_number_count : 39
             * call_time : 15673
             * dial_num : 97
             * dialed_num : 86
             */

            private String city;
            private String call_num;
            private String peer_number_count;
            private String call_time;
            private String dial_num;
            private String dialed_num;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCall_num() {
                return call_num;
            }

            public void setCall_num(String call_num) {
                this.call_num = call_num;
            }

            public String getPeer_number_count() {
                return peer_number_count;
            }

            public void setPeer_number_count(String peer_number_count) {
                this.peer_number_count = peer_number_count;
            }

            public String getCall_time() {
                return call_time;
            }

            public void setCall_time(String call_time) {
                this.call_time = call_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }
        }

        public static class DesignatedContactBean {
            /**
             * peer_num : string
             * city : string
             * call_num_1w : string
             * call_num_1m : string
             * call_num_3m : string
             * call_num_6m : string
             * call_time_3m : string
             * call_time_6m : string
             * dial_num_3m : string
             * dial_num_6m : string
             * dialed_num_3m : string
             * dialed_num_6m : string
             * call_num_morning_3m : string
             * call_num_morning_6m : string
             * call_num_noon_3m : string
             * call_num_noon_6m : string
             * call_num_afternoon_3m : string
             * call_num_afternoon_6m : string
             * call_num_evening_3m : string
             * call_num_evening_6m : string
             * call_num_night_3m : string
             * call_num_night_6m : string
             * call_num_weekday_3m : string
             * call_num_weekday_6m : string
             * call_num_weekend_3m : string
             * call_num_weekend_6m : string
             * call_num_holiday_3m : string
             * call_num_holiday_6m : string
             * call_if_whole_day_3m : string
             * call_if_whole_day_6m : string
             */

            private String peer_num;
            private String city;
            private String call_num_1w;
            private String call_num_1m;
            private String call_num_3m;
            private String call_num_6m;
            private String call_time_3m;
            private String call_time_6m;
            private String dial_num_3m;
            private String dial_num_6m;
            private String dialed_num_3m;
            private String dialed_num_6m;
            private String call_num_morning_3m;
            private String call_num_morning_6m;
            private String call_num_noon_3m;
            private String call_num_noon_6m;
            private String call_num_afternoon_3m;
            private String call_num_afternoon_6m;
            private String call_num_evening_3m;
            private String call_num_evening_6m;
            private String call_num_night_3m;
            private String call_num_night_6m;
            private String call_num_weekday_3m;
            private String call_num_weekday_6m;
            private String call_num_weekend_3m;
            private String call_num_weekend_6m;
            private String call_num_holiday_3m;
            private String call_num_holiday_6m;
            private String call_if_whole_day_3m;
            private String call_if_whole_day_6m;

            public String getPeer_num() {
                return peer_num;
            }

            public void setPeer_num(String peer_num) {
                this.peer_num = peer_num;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCall_num_1w() {
                return call_num_1w;
            }

            public void setCall_num_1w(String call_num_1w) {
                this.call_num_1w = call_num_1w;
            }

            public String getCall_num_1m() {
                return call_num_1m;
            }

            public void setCall_num_1m(String call_num_1m) {
                this.call_num_1m = call_num_1m;
            }

            public String getCall_num_3m() {
                return call_num_3m;
            }

            public void setCall_num_3m(String call_num_3m) {
                this.call_num_3m = call_num_3m;
            }

            public String getCall_num_6m() {
                return call_num_6m;
            }

            public void setCall_num_6m(String call_num_6m) {
                this.call_num_6m = call_num_6m;
            }

            public String getCall_time_3m() {
                return call_time_3m;
            }

            public void setCall_time_3m(String call_time_3m) {
                this.call_time_3m = call_time_3m;
            }

            public String getCall_time_6m() {
                return call_time_6m;
            }

            public void setCall_time_6m(String call_time_6m) {
                this.call_time_6m = call_time_6m;
            }

            public String getDial_num_3m() {
                return dial_num_3m;
            }

            public void setDial_num_3m(String dial_num_3m) {
                this.dial_num_3m = dial_num_3m;
            }

            public String getDial_num_6m() {
                return dial_num_6m;
            }

            public void setDial_num_6m(String dial_num_6m) {
                this.dial_num_6m = dial_num_6m;
            }

            public String getDialed_num_3m() {
                return dialed_num_3m;
            }

            public void setDialed_num_3m(String dialed_num_3m) {
                this.dialed_num_3m = dialed_num_3m;
            }

            public String getDialed_num_6m() {
                return dialed_num_6m;
            }

            public void setDialed_num_6m(String dialed_num_6m) {
                this.dialed_num_6m = dialed_num_6m;
            }

            public String getCall_num_morning_3m() {
                return call_num_morning_3m;
            }

            public void setCall_num_morning_3m(String call_num_morning_3m) {
                this.call_num_morning_3m = call_num_morning_3m;
            }

            public String getCall_num_morning_6m() {
                return call_num_morning_6m;
            }

            public void setCall_num_morning_6m(String call_num_morning_6m) {
                this.call_num_morning_6m = call_num_morning_6m;
            }

            public String getCall_num_noon_3m() {
                return call_num_noon_3m;
            }

            public void setCall_num_noon_3m(String call_num_noon_3m) {
                this.call_num_noon_3m = call_num_noon_3m;
            }

            public String getCall_num_noon_6m() {
                return call_num_noon_6m;
            }

            public void setCall_num_noon_6m(String call_num_noon_6m) {
                this.call_num_noon_6m = call_num_noon_6m;
            }

            public String getCall_num_afternoon_3m() {
                return call_num_afternoon_3m;
            }

            public void setCall_num_afternoon_3m(String call_num_afternoon_3m) {
                this.call_num_afternoon_3m = call_num_afternoon_3m;
            }

            public String getCall_num_afternoon_6m() {
                return call_num_afternoon_6m;
            }

            public void setCall_num_afternoon_6m(String call_num_afternoon_6m) {
                this.call_num_afternoon_6m = call_num_afternoon_6m;
            }

            public String getCall_num_evening_3m() {
                return call_num_evening_3m;
            }

            public void setCall_num_evening_3m(String call_num_evening_3m) {
                this.call_num_evening_3m = call_num_evening_3m;
            }

            public String getCall_num_evening_6m() {
                return call_num_evening_6m;
            }

            public void setCall_num_evening_6m(String call_num_evening_6m) {
                this.call_num_evening_6m = call_num_evening_6m;
            }

            public String getCall_num_night_3m() {
                return call_num_night_3m;
            }

            public void setCall_num_night_3m(String call_num_night_3m) {
                this.call_num_night_3m = call_num_night_3m;
            }

            public String getCall_num_night_6m() {
                return call_num_night_6m;
            }

            public void setCall_num_night_6m(String call_num_night_6m) {
                this.call_num_night_6m = call_num_night_6m;
            }

            public String getCall_num_weekday_3m() {
                return call_num_weekday_3m;
            }

            public void setCall_num_weekday_3m(String call_num_weekday_3m) {
                this.call_num_weekday_3m = call_num_weekday_3m;
            }

            public String getCall_num_weekday_6m() {
                return call_num_weekday_6m;
            }

            public void setCall_num_weekday_6m(String call_num_weekday_6m) {
                this.call_num_weekday_6m = call_num_weekday_6m;
            }

            public String getCall_num_weekend_3m() {
                return call_num_weekend_3m;
            }

            public void setCall_num_weekend_3m(String call_num_weekend_3m) {
                this.call_num_weekend_3m = call_num_weekend_3m;
            }

            public String getCall_num_weekend_6m() {
                return call_num_weekend_6m;
            }

            public void setCall_num_weekend_6m(String call_num_weekend_6m) {
                this.call_num_weekend_6m = call_num_weekend_6m;
            }

            public String getCall_num_holiday_3m() {
                return call_num_holiday_3m;
            }

            public void setCall_num_holiday_3m(String call_num_holiday_3m) {
                this.call_num_holiday_3m = call_num_holiday_3m;
            }

            public String getCall_num_holiday_6m() {
                return call_num_holiday_6m;
            }

            public void setCall_num_holiday_6m(String call_num_holiday_6m) {
                this.call_num_holiday_6m = call_num_holiday_6m;
            }

            public String getCall_if_whole_day_3m() {
                return call_if_whole_day_3m;
            }

            public void setCall_if_whole_day_3m(String call_if_whole_day_3m) {
                this.call_if_whole_day_3m = call_if_whole_day_3m;
            }

            public String getCall_if_whole_day_6m() {
                return call_if_whole_day_6m;
            }

            public void setCall_if_whole_day_6m(String call_if_whole_day_6m) {
                this.call_if_whole_day_6m = call_if_whole_day_6m;
            }
        }

        public static class RoamAnalysisBean {
            /**
             * roam_location : 合肥
             * roam_day_num_3m : 0
             * roam_day_num_6m : 3
             * continue_roam_num_3m : 0
             * continue_roam_num_6m : 1
             * max_roam_day_num_3m : 0
             * max_roam_day_num_6m : 2
             */

            private String roam_location;
            private String roam_day_num_3m;
            private String roam_day_num_6m;
            private String continue_roam_num_3m;
            private String continue_roam_num_6m;
            private String max_roam_day_num_3m;
            private String max_roam_day_num_6m;

            public String getRoam_location() {
                return roam_location;
            }

            public void setRoam_location(String roam_location) {
                this.roam_location = roam_location;
            }

            public String getRoam_day_num_3m() {
                return roam_day_num_3m;
            }

            public void setRoam_day_num_3m(String roam_day_num_3m) {
                this.roam_day_num_3m = roam_day_num_3m;
            }

            public String getRoam_day_num_6m() {
                return roam_day_num_6m;
            }

            public void setRoam_day_num_6m(String roam_day_num_6m) {
                this.roam_day_num_6m = roam_day_num_6m;
            }

            public String getContinue_roam_num_3m() {
                return continue_roam_num_3m;
            }

            public void setContinue_roam_num_3m(String continue_roam_num_3m) {
                this.continue_roam_num_3m = continue_roam_num_3m;
            }

            public String getContinue_roam_num_6m() {
                return continue_roam_num_6m;
            }

            public void setContinue_roam_num_6m(String continue_roam_num_6m) {
                this.continue_roam_num_6m = continue_roam_num_6m;
            }

            public String getMax_roam_day_num_3m() {
                return max_roam_day_num_3m;
            }

            public void setMax_roam_day_num_3m(String max_roam_day_num_3m) {
                this.max_roam_day_num_3m = max_roam_day_num_3m;
            }

            public String getMax_roam_day_num_6m() {
                return max_roam_day_num_6m;
            }

            public void setMax_roam_day_num_6m(String max_roam_day_num_6m) {
                this.max_roam_day_num_6m = max_roam_day_num_6m;
            }
        }

        public static class CallContactDetailBean {
            /**
             * city : 金华
             * peer_num : 18072693133
             * call_num_1w : 0
             * call_num_1m : 0
             * call_num_3m : 0
             * call_num_6m : 52
             * call_time_3m : 0
             * call_time_6m : 1544
             * dial_num_3m : 0
             * dial_num_6m : 18
             * dialed_num_3m : 0
             * dialed_num_6m : 34
             * call_num_morning_3m : 0
             * call_num_morning_6m : 15
             * call_num_noon_3m : 0
             * call_num_noon_6m : 4
             * call_num_afternoon_3m : 0
             * call_num_afternoon_6m : 13
             * call_num_evening_3m : 0
             * call_num_evening_6m : 8
             * call_num_night_3m : 0
             * call_num_night_6m : 12
             * call_num_weekday_3m : 0
             * call_num_weekday_6m : 40
             * call_num_weekend_3m : 0
             * call_num_weekend_6m : 10
             * call_num_holiday_3m : 0
             * call_num_holiday_6m : 2
             * call_if_whole_day_3m : 否
             * call_if_whole_day_6m : 否
             */

            private String city;
            private String peer_num;
            private String call_num_1w;
            private String call_num_1m;
            private String call_num_3m;
            private String call_num_6m;
            private String call_time_3m;
            private String call_time_6m;
            private String dial_num_3m;
            private String dial_num_6m;
            private String dialed_num_3m;
            private String dialed_num_6m;
            private String call_num_morning_3m;
            private String call_num_morning_6m;
            private String call_num_noon_3m;
            private String call_num_noon_6m;
            private String call_num_afternoon_3m;
            private String call_num_afternoon_6m;
            private String call_num_evening_3m;
            private String call_num_evening_6m;
            private String call_num_night_3m;
            private String call_num_night_6m;
            private String call_num_weekday_3m;
            private String call_num_weekday_6m;
            private String call_num_weekend_3m;
            private String call_num_weekend_6m;
            private String call_num_holiday_3m;
            private String call_num_holiday_6m;
            private String call_if_whole_day_3m;
            private String call_if_whole_day_6m;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getPeer_num() {
                return peer_num;
            }

            public void setPeer_num(String peer_num) {
                this.peer_num = peer_num;
            }

            public String getCall_num_1w() {
                return call_num_1w;
            }

            public void setCall_num_1w(String call_num_1w) {
                this.call_num_1w = call_num_1w;
            }

            public String getCall_num_1m() {
                return call_num_1m;
            }

            public void setCall_num_1m(String call_num_1m) {
                this.call_num_1m = call_num_1m;
            }

            public String getCall_num_3m() {
                return call_num_3m;
            }

            public void setCall_num_3m(String call_num_3m) {
                this.call_num_3m = call_num_3m;
            }

            public String getCall_num_6m() {
                return call_num_6m;
            }

            public void setCall_num_6m(String call_num_6m) {
                this.call_num_6m = call_num_6m;
            }

            public String getCall_time_3m() {
                return call_time_3m;
            }

            public void setCall_time_3m(String call_time_3m) {
                this.call_time_3m = call_time_3m;
            }

            public String getCall_time_6m() {
                return call_time_6m;
            }

            public void setCall_time_6m(String call_time_6m) {
                this.call_time_6m = call_time_6m;
            }

            public String getDial_num_3m() {
                return dial_num_3m;
            }

            public void setDial_num_3m(String dial_num_3m) {
                this.dial_num_3m = dial_num_3m;
            }

            public String getDial_num_6m() {
                return dial_num_6m;
            }

            public void setDial_num_6m(String dial_num_6m) {
                this.dial_num_6m = dial_num_6m;
            }

            public String getDialed_num_3m() {
                return dialed_num_3m;
            }

            public void setDialed_num_3m(String dialed_num_3m) {
                this.dialed_num_3m = dialed_num_3m;
            }

            public String getDialed_num_6m() {
                return dialed_num_6m;
            }

            public void setDialed_num_6m(String dialed_num_6m) {
                this.dialed_num_6m = dialed_num_6m;
            }

            public String getCall_num_morning_3m() {
                return call_num_morning_3m;
            }

            public void setCall_num_morning_3m(String call_num_morning_3m) {
                this.call_num_morning_3m = call_num_morning_3m;
            }

            public String getCall_num_morning_6m() {
                return call_num_morning_6m;
            }

            public void setCall_num_morning_6m(String call_num_morning_6m) {
                this.call_num_morning_6m = call_num_morning_6m;
            }

            public String getCall_num_noon_3m() {
                return call_num_noon_3m;
            }

            public void setCall_num_noon_3m(String call_num_noon_3m) {
                this.call_num_noon_3m = call_num_noon_3m;
            }

            public String getCall_num_noon_6m() {
                return call_num_noon_6m;
            }

            public void setCall_num_noon_6m(String call_num_noon_6m) {
                this.call_num_noon_6m = call_num_noon_6m;
            }

            public String getCall_num_afternoon_3m() {
                return call_num_afternoon_3m;
            }

            public void setCall_num_afternoon_3m(String call_num_afternoon_3m) {
                this.call_num_afternoon_3m = call_num_afternoon_3m;
            }

            public String getCall_num_afternoon_6m() {
                return call_num_afternoon_6m;
            }

            public void setCall_num_afternoon_6m(String call_num_afternoon_6m) {
                this.call_num_afternoon_6m = call_num_afternoon_6m;
            }

            public String getCall_num_evening_3m() {
                return call_num_evening_3m;
            }

            public void setCall_num_evening_3m(String call_num_evening_3m) {
                this.call_num_evening_3m = call_num_evening_3m;
            }

            public String getCall_num_evening_6m() {
                return call_num_evening_6m;
            }

            public void setCall_num_evening_6m(String call_num_evening_6m) {
                this.call_num_evening_6m = call_num_evening_6m;
            }

            public String getCall_num_night_3m() {
                return call_num_night_3m;
            }

            public void setCall_num_night_3m(String call_num_night_3m) {
                this.call_num_night_3m = call_num_night_3m;
            }

            public String getCall_num_night_6m() {
                return call_num_night_6m;
            }

            public void setCall_num_night_6m(String call_num_night_6m) {
                this.call_num_night_6m = call_num_night_6m;
            }

            public String getCall_num_weekday_3m() {
                return call_num_weekday_3m;
            }

            public void setCall_num_weekday_3m(String call_num_weekday_3m) {
                this.call_num_weekday_3m = call_num_weekday_3m;
            }

            public String getCall_num_weekday_6m() {
                return call_num_weekday_6m;
            }

            public void setCall_num_weekday_6m(String call_num_weekday_6m) {
                this.call_num_weekday_6m = call_num_weekday_6m;
            }

            public String getCall_num_weekend_3m() {
                return call_num_weekend_3m;
            }

            public void setCall_num_weekend_3m(String call_num_weekend_3m) {
                this.call_num_weekend_3m = call_num_weekend_3m;
            }

            public String getCall_num_weekend_6m() {
                return call_num_weekend_6m;
            }

            public void setCall_num_weekend_6m(String call_num_weekend_6m) {
                this.call_num_weekend_6m = call_num_weekend_6m;
            }

            public String getCall_num_holiday_3m() {
                return call_num_holiday_3m;
            }

            public void setCall_num_holiday_3m(String call_num_holiday_3m) {
                this.call_num_holiday_3m = call_num_holiday_3m;
            }

            public String getCall_num_holiday_6m() {
                return call_num_holiday_6m;
            }

            public void setCall_num_holiday_6m(String call_num_holiday_6m) {
                this.call_num_holiday_6m = call_num_holiday_6m;
            }

            public String getCall_if_whole_day_3m() {
                return call_if_whole_day_3m;
            }

            public void setCall_if_whole_day_3m(String call_if_whole_day_3m) {
                this.call_if_whole_day_3m = call_if_whole_day_3m;
            }

            public String getCall_if_whole_day_6m() {
                return call_if_whole_day_6m;
            }

            public void setCall_if_whole_day_6m(String call_if_whole_day_6m) {
                this.call_if_whole_day_6m = call_if_whole_day_6m;
            }
        }

        public static class CallDurationDetail3mBean {
            /**
             * time_step : 早晨[5:30-9:00]
             * total_num : 0
             * peer_num : 0
             * total_time : 0
             * dial_num : 0
             * dialed_num : 0
             * latest_call_time : -
             * farthest_call_time : -
             */

            private String time_step;
            private String total_num;
            private String peer_num;
            private String total_time;
            private String dial_num;
            private String dialed_num;
            private String latest_call_time;
            private String farthest_call_time;

            public String getTime_step() {
                return time_step;
            }

            public void setTime_step(String time_step) {
                this.time_step = time_step;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getPeer_num() {
                return peer_num;
            }

            public void setPeer_num(String peer_num) {
                this.peer_num = peer_num;
            }

            public String getTotal_time() {
                return total_time;
            }

            public void setTotal_time(String total_time) {
                this.total_time = total_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }

            public String getLatest_call_time() {
                return latest_call_time;
            }

            public void setLatest_call_time(String latest_call_time) {
                this.latest_call_time = latest_call_time;
            }

            public String getFarthest_call_time() {
                return farthest_call_time;
            }

            public void setFarthest_call_time(String farthest_call_time) {
                this.farthest_call_time = farthest_call_time;
            }
        }

        public static class CallDurationDetail6mBean {
            /**
             * time_step : 早晨[5:30-9:00]
             * total_num : 20
             * peer_num : 8
             * total_time : 3748
             * dial_num : 10
             * dialed_num : 10
             * latest_call_time : 20160913-071127
             * farthest_call_time : 20160805-085912
             */

            private String time_step;
            private String total_num;
            private String peer_num;
            private String total_time;
            private String dial_num;
            private String dialed_num;
            private String latest_call_time;
            private String farthest_call_time;

            public String getTime_step() {
                return time_step;
            }

            public void setTime_step(String time_step) {
                this.time_step = time_step;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getPeer_num() {
                return peer_num;
            }

            public void setPeer_num(String peer_num) {
                this.peer_num = peer_num;
            }

            public String getTotal_time() {
                return total_time;
            }

            public void setTotal_time(String total_time) {
                this.total_time = total_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }

            public String getLatest_call_time() {
                return latest_call_time;
            }

            public void setLatest_call_time(String latest_call_time) {
                this.latest_call_time = latest_call_time;
            }

            public String getFarthest_call_time() {
                return farthest_call_time;
            }

            public void setFarthest_call_time(String farthest_call_time) {
                this.farthest_call_time = farthest_call_time;
            }
        }

        public static class CallLocationDetail3mBean {
            /**
             * city : 合肥
             * total_num : 35
             * peer_num : 5
             * total_time : 9705
             * dial_num : 16
             * dialed_num : 19
             * dialed_time : 4180
             * dial_time : 5525
             * dial_time_avg : 345
             * dialed_time_avg : 220
             * dial_num_percent : 0.46
             * dialed_num_percent : 0.54
             * dial_time_percent : 0.57
             * dialed_time_percent : 0.43
             */

            private String city;
            private String total_num;
            private String peer_num;
            private String total_time;
            private String dial_num;
            private String dialed_num;
            private String dialed_time;
            private String dial_time;
            private String dial_time_avg;
            private String dialed_time_avg;
            private String dial_num_percent;
            private String dialed_num_percent;
            private String dial_time_percent;
            private String dialed_time_percent;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getPeer_num() {
                return peer_num;
            }

            public void setPeer_num(String peer_num) {
                this.peer_num = peer_num;
            }

            public String getTotal_time() {
                return total_time;
            }

            public void setTotal_time(String total_time) {
                this.total_time = total_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }

            public String getDialed_time() {
                return dialed_time;
            }

            public void setDialed_time(String dialed_time) {
                this.dialed_time = dialed_time;
            }

            public String getDial_time() {
                return dial_time;
            }

            public void setDial_time(String dial_time) {
                this.dial_time = dial_time;
            }

            public String getDial_time_avg() {
                return dial_time_avg;
            }

            public void setDial_time_avg(String dial_time_avg) {
                this.dial_time_avg = dial_time_avg;
            }

            public String getDialed_time_avg() {
                return dialed_time_avg;
            }

            public void setDialed_time_avg(String dialed_time_avg) {
                this.dialed_time_avg = dialed_time_avg;
            }

            public String getDial_num_percent() {
                return dial_num_percent;
            }

            public void setDial_num_percent(String dial_num_percent) {
                this.dial_num_percent = dial_num_percent;
            }

            public String getDialed_num_percent() {
                return dialed_num_percent;
            }

            public void setDialed_num_percent(String dialed_num_percent) {
                this.dialed_num_percent = dialed_num_percent;
            }

            public String getDial_time_percent() {
                return dial_time_percent;
            }

            public void setDial_time_percent(String dial_time_percent) {
                this.dial_time_percent = dial_time_percent;
            }

            public String getDialed_time_percent() {
                return dialed_time_percent;
            }

            public void setDialed_time_percent(String dialed_time_percent) {
                this.dialed_time_percent = dialed_time_percent;
            }
        }

        public static class CallLocationDetail6mBean {
            /**
             * city : 金华
             * total_num : 183
             * peer_num : 39
             * total_time : 15673
             * dial_num : 97
             * dialed_num : 86
             * dialed_time : 3620
             * dial_time : 12053
             * dial_time_avg : 124
             * dialed_time_avg : 42
             * dial_num_percent : 0.53
             * dialed_num_percent : 0.47
             * dial_time_percent : 0.77
             * dialed_time_percent : 0.23
             */

            private String city;
            private String total_num;
            private String peer_num;
            private String total_time;
            private String dial_num;
            private String dialed_num;
            private String dialed_time;
            private String dial_time;
            private String dial_time_avg;
            private String dialed_time_avg;
            private String dial_num_percent;
            private String dialed_num_percent;
            private String dial_time_percent;
            private String dialed_time_percent;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getPeer_num() {
                return peer_num;
            }

            public void setPeer_num(String peer_num) {
                this.peer_num = peer_num;
            }

            public String getTotal_time() {
                return total_time;
            }

            public void setTotal_time(String total_time) {
                this.total_time = total_time;
            }

            public String getDial_num() {
                return dial_num;
            }

            public void setDial_num(String dial_num) {
                this.dial_num = dial_num;
            }

            public String getDialed_num() {
                return dialed_num;
            }

            public void setDialed_num(String dialed_num) {
                this.dialed_num = dialed_num;
            }

            public String getDialed_time() {
                return dialed_time;
            }

            public void setDialed_time(String dialed_time) {
                this.dialed_time = dialed_time;
            }

            public String getDial_time() {
                return dial_time;
            }

            public void setDial_time(String dial_time) {
                this.dial_time = dial_time;
            }

            public String getDial_time_avg() {
                return dial_time_avg;
            }

            public void setDial_time_avg(String dial_time_avg) {
                this.dial_time_avg = dial_time_avg;
            }

            public String getDialed_time_avg() {
                return dialed_time_avg;
            }

            public void setDialed_time_avg(String dialed_time_avg) {
                this.dialed_time_avg = dialed_time_avg;
            }

            public String getDial_num_percent() {
                return dial_num_percent;
            }

            public void setDial_num_percent(String dial_num_percent) {
                this.dial_num_percent = dial_num_percent;
            }

            public String getDialed_num_percent() {
                return dialed_num_percent;
            }

            public void setDialed_num_percent(String dialed_num_percent) {
                this.dialed_num_percent = dialed_num_percent;
            }

            public String getDial_time_percent() {
                return dial_time_percent;
            }

            public void setDial_time_percent(String dial_time_percent) {
                this.dial_time_percent = dial_time_percent;
            }

            public String getDialed_time_percent() {
                return dialed_time_percent;
            }

            public void setDialed_time_percent(String dialed_time_percent) {
                this.dialed_time_percent = dialed_time_percent;
            }
        }
    }

    public static class ActiveDegreeDetailBean {
        /**
         * call_day_1m : 11
         * call_day_3m : 31
         * call_day_6m : 112
         * call_day_avg_3m : 10.33
         * call_day_avg_6m : 18.67
         * sms_day_1m : 7
         * sms_day_3m : 23
         * sms_day_6m : 49
         * sms_day_avg_3m : 7.67
         * sms_day_avg_6m : 8.17
         * recharge_time_1m : 4
         * recharge_time_3m : 12
         * recharge_time_6m : 21
         * recharge_time_avg_3m : 4.00
         * recharge_time_avg_6m : 3.50
         * call_time_1m : 50
         * call_time_3m : 142
         * call_time_6m : 517
         * call_time_avg_3m : 47.33
         * call_time_avg_6m : 86.17
         * sms_time_1m : 20
         * sms_time_3m : 56
         * sms_time_6m : 113
         * sms_time_avg_3m : 18.67
         * sms_time_avg_6m : 18.83
         * flow_total_1m : 10997760
         * flow_total_3m : 12231168
         * flow_total_6m : 12231168
         * flow_total_avg_3m : 4077056
         * flow_total_avg_6m : 2038528
         * flow_used_1m : 1111050
         * flow_used_3m : 4641443
         * flow_used_6m : 4641443
         * flow_used_avg_3m : 1547148
         * flow_used_avg_6m : 773574
         * call_avg_duration_1m : 230
         * call_avg_duration_3m : 247
         * call_avg_duration_6m : 158
         * no_dial_day_1m : 6
         * no_dial_day_3m : 52
         * no_dial_day_6m : 79
         * no_dial_day_avg_3m : 17.33
         * no_dial_day_avg_6m : 13.17
         * no_dial_day_percent_1m : 0.38
         * no_dial_day_percent_3m : 0.68
         * no_dial_day_percent_6m : 0.47
         * no_call_day_1m : 5
         * no_call_day_3m : 46
         * no_call_day_6m : 57
         * no_call_day_avg_3m : 15.33
         * no_call_day_avg_6m : 9.50
         * no_call_day_percent_1m : 0.31
         * no_call_day_percent_3m : 0.60
         * no_call_day_percent_6m : 0.34
         * power_on_max_day_1m : 16
         * power_on_max_day_3m : 22
         * power_on_max_day_6m : 23
         * power_off_day_1m : 0
         * power_off_day_3m : 33
         * power_off_day_6m : 44
         * power_off_day_percent_1m : 0.00
         * power_off_day_percent_3m : 0.43
         * power_off_day_percent_6m : 0.26
         * continue_power_off_num_1m : 0
         * continue_power_off_num_3m : 1
         * continue_power_off_num_6m : 1
         */

        private String call_day_1m;
        private String call_day_3m;
        private String call_day_6m;
        private String call_day_avg_3m;
        private String call_day_avg_6m;
        private String sms_day_1m;
        private String sms_day_3m;
        private String sms_day_6m;
        private String sms_day_avg_3m;
        private String sms_day_avg_6m;
        private String recharge_time_1m;
        private String recharge_time_3m;
        private String recharge_time_6m;
        private String recharge_time_avg_3m;
        private String recharge_time_avg_6m;
        private String call_time_1m;
        private String call_time_3m;
        private String call_time_6m;
        private String call_time_avg_3m;
        private String call_time_avg_6m;
        private String sms_time_1m;
        private String sms_time_3m;
        private String sms_time_6m;
        private String sms_time_avg_3m;
        private String sms_time_avg_6m;
        private String flow_total_1m;
        private String flow_total_3m;
        private String flow_total_6m;
        private String flow_total_avg_3m;
        private String flow_total_avg_6m;
        private String flow_used_1m;
        private String flow_used_3m;
        private String flow_used_6m;
        private String flow_used_avg_3m;
        private String flow_used_avg_6m;
        private String call_avg_duration_1m;
        private String call_avg_duration_3m;
        private String call_avg_duration_6m;
        private String no_dial_day_1m;
        private String no_dial_day_3m;
        private String no_dial_day_6m;
        private String no_dial_day_avg_3m;
        private String no_dial_day_avg_6m;
        private String no_dial_day_percent_1m;
        private String no_dial_day_percent_3m;
        private String no_dial_day_percent_6m;
        private String no_call_day_1m;
        private String no_call_day_3m;
        private String no_call_day_6m;
        private String no_call_day_avg_3m;
        private String no_call_day_avg_6m;
        private String no_call_day_percent_1m;
        private String no_call_day_percent_3m;
        private String no_call_day_percent_6m;
        private String power_on_max_day_1m;
        private String power_on_max_day_3m;
        private String power_on_max_day_6m;
        private String power_off_day_1m;
        private String power_off_day_3m;
        private String power_off_day_6m;
        private String power_off_day_percent_1m;
        private String power_off_day_percent_3m;
        private String power_off_day_percent_6m;
        private String continue_power_off_num_1m;
        private String continue_power_off_num_3m;
        private String continue_power_off_num_6m;

        public String getCall_day_1m() {
            return call_day_1m;
        }

        public void setCall_day_1m(String call_day_1m) {
            this.call_day_1m = call_day_1m;
        }

        public String getCall_day_3m() {
            return call_day_3m;
        }

        public void setCall_day_3m(String call_day_3m) {
            this.call_day_3m = call_day_3m;
        }

        public String getCall_day_6m() {
            return call_day_6m;
        }

        public void setCall_day_6m(String call_day_6m) {
            this.call_day_6m = call_day_6m;
        }

        public String getCall_day_avg_3m() {
            return call_day_avg_3m;
        }

        public void setCall_day_avg_3m(String call_day_avg_3m) {
            this.call_day_avg_3m = call_day_avg_3m;
        }

        public String getCall_day_avg_6m() {
            return call_day_avg_6m;
        }

        public void setCall_day_avg_6m(String call_day_avg_6m) {
            this.call_day_avg_6m = call_day_avg_6m;
        }

        public String getSms_day_1m() {
            return sms_day_1m;
        }

        public void setSms_day_1m(String sms_day_1m) {
            this.sms_day_1m = sms_day_1m;
        }

        public String getSms_day_3m() {
            return sms_day_3m;
        }

        public void setSms_day_3m(String sms_day_3m) {
            this.sms_day_3m = sms_day_3m;
        }

        public String getSms_day_6m() {
            return sms_day_6m;
        }

        public void setSms_day_6m(String sms_day_6m) {
            this.sms_day_6m = sms_day_6m;
        }

        public String getSms_day_avg_3m() {
            return sms_day_avg_3m;
        }

        public void setSms_day_avg_3m(String sms_day_avg_3m) {
            this.sms_day_avg_3m = sms_day_avg_3m;
        }

        public String getSms_day_avg_6m() {
            return sms_day_avg_6m;
        }

        public void setSms_day_avg_6m(String sms_day_avg_6m) {
            this.sms_day_avg_6m = sms_day_avg_6m;
        }

        public String getRecharge_time_1m() {
            return recharge_time_1m;
        }

        public void setRecharge_time_1m(String recharge_time_1m) {
            this.recharge_time_1m = recharge_time_1m;
        }

        public String getRecharge_time_3m() {
            return recharge_time_3m;
        }

        public void setRecharge_time_3m(String recharge_time_3m) {
            this.recharge_time_3m = recharge_time_3m;
        }

        public String getRecharge_time_6m() {
            return recharge_time_6m;
        }

        public void setRecharge_time_6m(String recharge_time_6m) {
            this.recharge_time_6m = recharge_time_6m;
        }

        public String getRecharge_time_avg_3m() {
            return recharge_time_avg_3m;
        }

        public void setRecharge_time_avg_3m(String recharge_time_avg_3m) {
            this.recharge_time_avg_3m = recharge_time_avg_3m;
        }

        public String getRecharge_time_avg_6m() {
            return recharge_time_avg_6m;
        }

        public void setRecharge_time_avg_6m(String recharge_time_avg_6m) {
            this.recharge_time_avg_6m = recharge_time_avg_6m;
        }

        public String getCall_time_1m() {
            return call_time_1m;
        }

        public void setCall_time_1m(String call_time_1m) {
            this.call_time_1m = call_time_1m;
        }

        public String getCall_time_3m() {
            return call_time_3m;
        }

        public void setCall_time_3m(String call_time_3m) {
            this.call_time_3m = call_time_3m;
        }

        public String getCall_time_6m() {
            return call_time_6m;
        }

        public void setCall_time_6m(String call_time_6m) {
            this.call_time_6m = call_time_6m;
        }

        public String getCall_time_avg_3m() {
            return call_time_avg_3m;
        }

        public void setCall_time_avg_3m(String call_time_avg_3m) {
            this.call_time_avg_3m = call_time_avg_3m;
        }

        public String getCall_time_avg_6m() {
            return call_time_avg_6m;
        }

        public void setCall_time_avg_6m(String call_time_avg_6m) {
            this.call_time_avg_6m = call_time_avg_6m;
        }

        public String getSms_time_1m() {
            return sms_time_1m;
        }

        public void setSms_time_1m(String sms_time_1m) {
            this.sms_time_1m = sms_time_1m;
        }

        public String getSms_time_3m() {
            return sms_time_3m;
        }

        public void setSms_time_3m(String sms_time_3m) {
            this.sms_time_3m = sms_time_3m;
        }

        public String getSms_time_6m() {
            return sms_time_6m;
        }

        public void setSms_time_6m(String sms_time_6m) {
            this.sms_time_6m = sms_time_6m;
        }

        public String getSms_time_avg_3m() {
            return sms_time_avg_3m;
        }

        public void setSms_time_avg_3m(String sms_time_avg_3m) {
            this.sms_time_avg_3m = sms_time_avg_3m;
        }

        public String getSms_time_avg_6m() {
            return sms_time_avg_6m;
        }

        public void setSms_time_avg_6m(String sms_time_avg_6m) {
            this.sms_time_avg_6m = sms_time_avg_6m;
        }

        public String getFlow_total_1m() {
            return flow_total_1m;
        }

        public void setFlow_total_1m(String flow_total_1m) {
            this.flow_total_1m = flow_total_1m;
        }

        public String getFlow_total_3m() {
            return flow_total_3m;
        }

        public void setFlow_total_3m(String flow_total_3m) {
            this.flow_total_3m = flow_total_3m;
        }

        public String getFlow_total_6m() {
            return flow_total_6m;
        }

        public void setFlow_total_6m(String flow_total_6m) {
            this.flow_total_6m = flow_total_6m;
        }

        public String getFlow_total_avg_3m() {
            return flow_total_avg_3m;
        }

        public void setFlow_total_avg_3m(String flow_total_avg_3m) {
            this.flow_total_avg_3m = flow_total_avg_3m;
        }

        public String getFlow_total_avg_6m() {
            return flow_total_avg_6m;
        }

        public void setFlow_total_avg_6m(String flow_total_avg_6m) {
            this.flow_total_avg_6m = flow_total_avg_6m;
        }

        public String getFlow_used_1m() {
            return flow_used_1m;
        }

        public void setFlow_used_1m(String flow_used_1m) {
            this.flow_used_1m = flow_used_1m;
        }

        public String getFlow_used_3m() {
            return flow_used_3m;
        }

        public void setFlow_used_3m(String flow_used_3m) {
            this.flow_used_3m = flow_used_3m;
        }

        public String getFlow_used_6m() {
            return flow_used_6m;
        }

        public void setFlow_used_6m(String flow_used_6m) {
            this.flow_used_6m = flow_used_6m;
        }

        public String getFlow_used_avg_3m() {
            return flow_used_avg_3m;
        }

        public void setFlow_used_avg_3m(String flow_used_avg_3m) {
            this.flow_used_avg_3m = flow_used_avg_3m;
        }

        public String getFlow_used_avg_6m() {
            return flow_used_avg_6m;
        }

        public void setFlow_used_avg_6m(String flow_used_avg_6m) {
            this.flow_used_avg_6m = flow_used_avg_6m;
        }

        public String getCall_avg_duration_1m() {
            return call_avg_duration_1m;
        }

        public void setCall_avg_duration_1m(String call_avg_duration_1m) {
            this.call_avg_duration_1m = call_avg_duration_1m;
        }

        public String getCall_avg_duration_3m() {
            return call_avg_duration_3m;
        }

        public void setCall_avg_duration_3m(String call_avg_duration_3m) {
            this.call_avg_duration_3m = call_avg_duration_3m;
        }

        public String getCall_avg_duration_6m() {
            return call_avg_duration_6m;
        }

        public void setCall_avg_duration_6m(String call_avg_duration_6m) {
            this.call_avg_duration_6m = call_avg_duration_6m;
        }

        public String getNo_dial_day_1m() {
            return no_dial_day_1m;
        }

        public void setNo_dial_day_1m(String no_dial_day_1m) {
            this.no_dial_day_1m = no_dial_day_1m;
        }

        public String getNo_dial_day_3m() {
            return no_dial_day_3m;
        }

        public void setNo_dial_day_3m(String no_dial_day_3m) {
            this.no_dial_day_3m = no_dial_day_3m;
        }

        public String getNo_dial_day_6m() {
            return no_dial_day_6m;
        }

        public void setNo_dial_day_6m(String no_dial_day_6m) {
            this.no_dial_day_6m = no_dial_day_6m;
        }

        public String getNo_dial_day_avg_3m() {
            return no_dial_day_avg_3m;
        }

        public void setNo_dial_day_avg_3m(String no_dial_day_avg_3m) {
            this.no_dial_day_avg_3m = no_dial_day_avg_3m;
        }

        public String getNo_dial_day_avg_6m() {
            return no_dial_day_avg_6m;
        }

        public void setNo_dial_day_avg_6m(String no_dial_day_avg_6m) {
            this.no_dial_day_avg_6m = no_dial_day_avg_6m;
        }

        public String getNo_dial_day_percent_1m() {
            return no_dial_day_percent_1m;
        }

        public void setNo_dial_day_percent_1m(String no_dial_day_percent_1m) {
            this.no_dial_day_percent_1m = no_dial_day_percent_1m;
        }

        public String getNo_dial_day_percent_3m() {
            return no_dial_day_percent_3m;
        }

        public void setNo_dial_day_percent_3m(String no_dial_day_percent_3m) {
            this.no_dial_day_percent_3m = no_dial_day_percent_3m;
        }

        public String getNo_dial_day_percent_6m() {
            return no_dial_day_percent_6m;
        }

        public void setNo_dial_day_percent_6m(String no_dial_day_percent_6m) {
            this.no_dial_day_percent_6m = no_dial_day_percent_6m;
        }

        public String getNo_call_day_1m() {
            return no_call_day_1m;
        }

        public void setNo_call_day_1m(String no_call_day_1m) {
            this.no_call_day_1m = no_call_day_1m;
        }

        public String getNo_call_day_3m() {
            return no_call_day_3m;
        }

        public void setNo_call_day_3m(String no_call_day_3m) {
            this.no_call_day_3m = no_call_day_3m;
        }

        public String getNo_call_day_6m() {
            return no_call_day_6m;
        }

        public void setNo_call_day_6m(String no_call_day_6m) {
            this.no_call_day_6m = no_call_day_6m;
        }

        public String getNo_call_day_avg_3m() {
            return no_call_day_avg_3m;
        }

        public void setNo_call_day_avg_3m(String no_call_day_avg_3m) {
            this.no_call_day_avg_3m = no_call_day_avg_3m;
        }

        public String getNo_call_day_avg_6m() {
            return no_call_day_avg_6m;
        }

        public void setNo_call_day_avg_6m(String no_call_day_avg_6m) {
            this.no_call_day_avg_6m = no_call_day_avg_6m;
        }

        public String getNo_call_day_percent_1m() {
            return no_call_day_percent_1m;
        }

        public void setNo_call_day_percent_1m(String no_call_day_percent_1m) {
            this.no_call_day_percent_1m = no_call_day_percent_1m;
        }

        public String getNo_call_day_percent_3m() {
            return no_call_day_percent_3m;
        }

        public void setNo_call_day_percent_3m(String no_call_day_percent_3m) {
            this.no_call_day_percent_3m = no_call_day_percent_3m;
        }

        public String getNo_call_day_percent_6m() {
            return no_call_day_percent_6m;
        }

        public void setNo_call_day_percent_6m(String no_call_day_percent_6m) {
            this.no_call_day_percent_6m = no_call_day_percent_6m;
        }

        public String getPower_on_max_day_1m() {
            return power_on_max_day_1m;
        }

        public void setPower_on_max_day_1m(String power_on_max_day_1m) {
            this.power_on_max_day_1m = power_on_max_day_1m;
        }

        public String getPower_on_max_day_3m() {
            return power_on_max_day_3m;
        }

        public void setPower_on_max_day_3m(String power_on_max_day_3m) {
            this.power_on_max_day_3m = power_on_max_day_3m;
        }

        public String getPower_on_max_day_6m() {
            return power_on_max_day_6m;
        }

        public void setPower_on_max_day_6m(String power_on_max_day_6m) {
            this.power_on_max_day_6m = power_on_max_day_6m;
        }

        public String getPower_off_day_1m() {
            return power_off_day_1m;
        }

        public void setPower_off_day_1m(String power_off_day_1m) {
            this.power_off_day_1m = power_off_day_1m;
        }

        public String getPower_off_day_3m() {
            return power_off_day_3m;
        }

        public void setPower_off_day_3m(String power_off_day_3m) {
            this.power_off_day_3m = power_off_day_3m;
        }

        public String getPower_off_day_6m() {
            return power_off_day_6m;
        }

        public void setPower_off_day_6m(String power_off_day_6m) {
            this.power_off_day_6m = power_off_day_6m;
        }

        public String getPower_off_day_percent_1m() {
            return power_off_day_percent_1m;
        }

        public void setPower_off_day_percent_1m(String power_off_day_percent_1m) {
            this.power_off_day_percent_1m = power_off_day_percent_1m;
        }

        public String getPower_off_day_percent_3m() {
            return power_off_day_percent_3m;
        }

        public void setPower_off_day_percent_3m(String power_off_day_percent_3m) {
            this.power_off_day_percent_3m = power_off_day_percent_3m;
        }

        public String getPower_off_day_percent_6m() {
            return power_off_day_percent_6m;
        }

        public void setPower_off_day_percent_6m(String power_off_day_percent_6m) {
            this.power_off_day_percent_6m = power_off_day_percent_6m;
        }

        public String getContinue_power_off_num_1m() {
            return continue_power_off_num_1m;
        }

        public void setContinue_power_off_num_1m(String continue_power_off_num_1m) {
            this.continue_power_off_num_1m = continue_power_off_num_1m;
        }

        public String getContinue_power_off_num_3m() {
            return continue_power_off_num_3m;
        }

        public void setContinue_power_off_num_3m(String continue_power_off_num_3m) {
            this.continue_power_off_num_3m = continue_power_off_num_3m;
        }

        public String getContinue_power_off_num_6m() {
            return continue_power_off_num_6m;
        }

        public void setContinue_power_off_num_6m(String continue_power_off_num_6m) {
            this.continue_power_off_num_6m = continue_power_off_num_6m;
        }
    }

    public static class ConsumptionDetailBean {
        /**
         * total_fee_1m : 7660
         * total_fee_3m : 105961
         * total_fee_6m : 142656
         * total_fee_avg_3m : 35320
         * total_fee_avg_6m : 23776
         * web_fee_1m : 0
         * web_fee_3m : 70496
         * web_fee_6m : 70496
         * web_fee_avg_3m : 23499
         * web_fee_avg_6m : 11749
         * call_fee_1m : 0
         * call_fee_3m : 4365
         * call_fee_6m : 6630
         * call_fee_avg_3m : 1455
         * call_fee_avg_6m : 1105
         * sms_fee_1m : 0
         * sms_fee_3m : 490
         * sms_fee_6m : 900
         * sms_fee_avg_3m : 163
         * sms_fee_avg_6m : 150
         * vas_fee_1m : 0
         * vas_fee_3m : 0
         * vas_fee_6m : 0
         * vas_fee_avg_3m : 0
         * vas_fee_avg_6m : 0
         * extra_fee_1m : 0
         * extra_fee_3m : 11150
         * extra_fee_6m : 27470
         * extra_fee_avg_3m : 3717
         * extra_fee_avg_6m : 4578
         * recharge_amount_1m : 10000
         * recharge_amount_3m : 47000
         * recharge_amount_6m : 86200
         * recharge_amount_avg_3m : 15667
         * recharge_amount_avg_6m : 14367
         */

        private String total_fee_1m;
        private String total_fee_3m;
        private String total_fee_6m;
        private String total_fee_avg_3m;
        private String total_fee_avg_6m;
        private String web_fee_1m;
        private String web_fee_3m;
        private String web_fee_6m;
        private String web_fee_avg_3m;
        private String web_fee_avg_6m;
        private String call_fee_1m;
        private String call_fee_3m;
        private String call_fee_6m;
        private String call_fee_avg_3m;
        private String call_fee_avg_6m;
        private String sms_fee_1m;
        private String sms_fee_3m;
        private String sms_fee_6m;
        private String sms_fee_avg_3m;
        private String sms_fee_avg_6m;
        private String vas_fee_1m;
        private String vas_fee_3m;
        private String vas_fee_6m;
        private String vas_fee_avg_3m;
        private String vas_fee_avg_6m;
        private String extra_fee_1m;
        private String extra_fee_3m;
        private String extra_fee_6m;
        private String extra_fee_avg_3m;
        private String extra_fee_avg_6m;
        private String recharge_amount_1m;
        private String recharge_amount_3m;
        private String recharge_amount_6m;
        private String recharge_amount_avg_3m;
        private String recharge_amount_avg_6m;

        public String getTotal_fee_1m() {
            return total_fee_1m;
        }

        public void setTotal_fee_1m(String total_fee_1m) {
            this.total_fee_1m = total_fee_1m;
        }

        public String getTotal_fee_3m() {
            return total_fee_3m;
        }

        public void setTotal_fee_3m(String total_fee_3m) {
            this.total_fee_3m = total_fee_3m;
        }

        public String getTotal_fee_6m() {
            return total_fee_6m;
        }

        public void setTotal_fee_6m(String total_fee_6m) {
            this.total_fee_6m = total_fee_6m;
        }

        public String getTotal_fee_avg_3m() {
            return total_fee_avg_3m;
        }

        public void setTotal_fee_avg_3m(String total_fee_avg_3m) {
            this.total_fee_avg_3m = total_fee_avg_3m;
        }

        public String getTotal_fee_avg_6m() {
            return total_fee_avg_6m;
        }

        public void setTotal_fee_avg_6m(String total_fee_avg_6m) {
            this.total_fee_avg_6m = total_fee_avg_6m;
        }

        public String getWeb_fee_1m() {
            return web_fee_1m;
        }

        public void setWeb_fee_1m(String web_fee_1m) {
            this.web_fee_1m = web_fee_1m;
        }

        public String getWeb_fee_3m() {
            return web_fee_3m;
        }

        public void setWeb_fee_3m(String web_fee_3m) {
            this.web_fee_3m = web_fee_3m;
        }

        public String getWeb_fee_6m() {
            return web_fee_6m;
        }

        public void setWeb_fee_6m(String web_fee_6m) {
            this.web_fee_6m = web_fee_6m;
        }

        public String getWeb_fee_avg_3m() {
            return web_fee_avg_3m;
        }

        public void setWeb_fee_avg_3m(String web_fee_avg_3m) {
            this.web_fee_avg_3m = web_fee_avg_3m;
        }

        public String getWeb_fee_avg_6m() {
            return web_fee_avg_6m;
        }

        public void setWeb_fee_avg_6m(String web_fee_avg_6m) {
            this.web_fee_avg_6m = web_fee_avg_6m;
        }

        public String getCall_fee_1m() {
            return call_fee_1m;
        }

        public void setCall_fee_1m(String call_fee_1m) {
            this.call_fee_1m = call_fee_1m;
        }

        public String getCall_fee_3m() {
            return call_fee_3m;
        }

        public void setCall_fee_3m(String call_fee_3m) {
            this.call_fee_3m = call_fee_3m;
        }

        public String getCall_fee_6m() {
            return call_fee_6m;
        }

        public void setCall_fee_6m(String call_fee_6m) {
            this.call_fee_6m = call_fee_6m;
        }

        public String getCall_fee_avg_3m() {
            return call_fee_avg_3m;
        }

        public void setCall_fee_avg_3m(String call_fee_avg_3m) {
            this.call_fee_avg_3m = call_fee_avg_3m;
        }

        public String getCall_fee_avg_6m() {
            return call_fee_avg_6m;
        }

        public void setCall_fee_avg_6m(String call_fee_avg_6m) {
            this.call_fee_avg_6m = call_fee_avg_6m;
        }

        public String getSms_fee_1m() {
            return sms_fee_1m;
        }

        public void setSms_fee_1m(String sms_fee_1m) {
            this.sms_fee_1m = sms_fee_1m;
        }

        public String getSms_fee_3m() {
            return sms_fee_3m;
        }

        public void setSms_fee_3m(String sms_fee_3m) {
            this.sms_fee_3m = sms_fee_3m;
        }

        public String getSms_fee_6m() {
            return sms_fee_6m;
        }

        public void setSms_fee_6m(String sms_fee_6m) {
            this.sms_fee_6m = sms_fee_6m;
        }

        public String getSms_fee_avg_3m() {
            return sms_fee_avg_3m;
        }

        public void setSms_fee_avg_3m(String sms_fee_avg_3m) {
            this.sms_fee_avg_3m = sms_fee_avg_3m;
        }

        public String getSms_fee_avg_6m() {
            return sms_fee_avg_6m;
        }

        public void setSms_fee_avg_6m(String sms_fee_avg_6m) {
            this.sms_fee_avg_6m = sms_fee_avg_6m;
        }

        public String getVas_fee_1m() {
            return vas_fee_1m;
        }

        public void setVas_fee_1m(String vas_fee_1m) {
            this.vas_fee_1m = vas_fee_1m;
        }

        public String getVas_fee_3m() {
            return vas_fee_3m;
        }

        public void setVas_fee_3m(String vas_fee_3m) {
            this.vas_fee_3m = vas_fee_3m;
        }

        public String getVas_fee_6m() {
            return vas_fee_6m;
        }

        public void setVas_fee_6m(String vas_fee_6m) {
            this.vas_fee_6m = vas_fee_6m;
        }

        public String getVas_fee_avg_3m() {
            return vas_fee_avg_3m;
        }

        public void setVas_fee_avg_3m(String vas_fee_avg_3m) {
            this.vas_fee_avg_3m = vas_fee_avg_3m;
        }

        public String getVas_fee_avg_6m() {
            return vas_fee_avg_6m;
        }

        public void setVas_fee_avg_6m(String vas_fee_avg_6m) {
            this.vas_fee_avg_6m = vas_fee_avg_6m;
        }

        public String getExtra_fee_1m() {
            return extra_fee_1m;
        }

        public void setExtra_fee_1m(String extra_fee_1m) {
            this.extra_fee_1m = extra_fee_1m;
        }

        public String getExtra_fee_3m() {
            return extra_fee_3m;
        }

        public void setExtra_fee_3m(String extra_fee_3m) {
            this.extra_fee_3m = extra_fee_3m;
        }

        public String getExtra_fee_6m() {
            return extra_fee_6m;
        }

        public void setExtra_fee_6m(String extra_fee_6m) {
            this.extra_fee_6m = extra_fee_6m;
        }

        public String getExtra_fee_avg_3m() {
            return extra_fee_avg_3m;
        }

        public void setExtra_fee_avg_3m(String extra_fee_avg_3m) {
            this.extra_fee_avg_3m = extra_fee_avg_3m;
        }

        public String getExtra_fee_avg_6m() {
            return extra_fee_avg_6m;
        }

        public void setExtra_fee_avg_6m(String extra_fee_avg_6m) {
            this.extra_fee_avg_6m = extra_fee_avg_6m;
        }

        public String getRecharge_amount_1m() {
            return recharge_amount_1m;
        }

        public void setRecharge_amount_1m(String recharge_amount_1m) {
            this.recharge_amount_1m = recharge_amount_1m;
        }

        public String getRecharge_amount_3m() {
            return recharge_amount_3m;
        }

        public void setRecharge_amount_3m(String recharge_amount_3m) {
            this.recharge_amount_3m = recharge_amount_3m;
        }

        public String getRecharge_amount_6m() {
            return recharge_amount_6m;
        }

        public void setRecharge_amount_6m(String recharge_amount_6m) {
            this.recharge_amount_6m = recharge_amount_6m;
        }

        public String getRecharge_amount_avg_3m() {
            return recharge_amount_avg_3m;
        }

        public void setRecharge_amount_avg_3m(String recharge_amount_avg_3m) {
            this.recharge_amount_avg_3m = recharge_amount_avg_3m;
        }

        public String getRecharge_amount_avg_6m() {
            return recharge_amount_avg_6m;
        }

        public void setRecharge_amount_avg_6m(String recharge_amount_avg_6m) {
            this.recharge_amount_avg_6m = recharge_amount_avg_6m;
        }
    }

    public static class BasicInfoCheckItemsBean {
        /**
         * result : 有效实名制客户
         * check_item : idcard_check
         */

        private String result;
        private String check_item;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getCheck_item() {
            return check_item;
        }

        public void setCheck_item(String check_item) {
            this.check_item = check_item;
        }
    }

    public static class CallServiceDetailBean {
        /**
         * months : 2016-11
         * service_num : 95528
         * total_num : 1
         * total_time : 288
         * dial_num : 1
         * dialed_num : 0
         * dial_time : 288
         * dialed_time : 0
         */

        private String months;
        private String service_num;
        private String total_num;
        private String total_time;
        private String dial_num;
        private String dialed_num;
        private String dial_time;
        private String dialed_time;

        public String getMonths() {
            return months;
        }

        public void setMonths(String months) {
            this.months = months;
        }

        public String getService_num() {
            return service_num;
        }

        public void setService_num(String service_num) {
            this.service_num = service_num;
        }

        public String getTotal_num() {
            return total_num;
        }

        public void setTotal_num(String total_num) {
            this.total_num = total_num;
        }

        public String getTotal_time() {
            return total_time;
        }

        public void setTotal_time(String total_time) {
            this.total_time = total_time;
        }

        public String getDial_num() {
            return dial_num;
        }

        public void setDial_num(String dial_num) {
            this.dial_num = dial_num;
        }

        public String getDialed_num() {
            return dialed_num;
        }

        public void setDialed_num(String dialed_num) {
            this.dialed_num = dialed_num;
        }

        public String getDial_time() {
            return dial_time;
        }

        public void setDial_time(String dial_time) {
            this.dial_time = dial_time;
        }

        public String getDialed_time() {
            return dialed_time;
        }

        public void setDialed_time(String dialed_time) {
            this.dialed_time = dialed_time;
        }
    }

    public static class RoamDetailBean {
        /**
         * roam_day : 2016-08-18
         * roam_location : 合肥
         */

        private String roam_day;
        private String roam_location;

        public String getRoam_day() {
            return roam_day;
        }

        public void setRoam_day(String roam_day) {
            this.roam_day = roam_day;
        }

        public String getRoam_location() {
            return roam_location;
        }

        public void setRoam_location(String roam_location) {
            this.roam_location = roam_location;
        }
    }
}
