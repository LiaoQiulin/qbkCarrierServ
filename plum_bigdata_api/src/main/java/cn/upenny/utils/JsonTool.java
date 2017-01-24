package cn.upenny.utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Created by hubert on 16/1/10.
 */
public class JsonTool {

    //利用Gson将Object类型数据解析成 Json数据   Object——Json
    public static String toJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    /**
     * fromJson(content, Object.class)  ---Object
     * UserInfo info = JsonTool.fromJson(response.data.toString(), UserInfo.class);
     * @param json
     * @param classOfT
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> classOfT) {
        Gson gson = new Gson();
        return gson.fromJson(json, classOfT);
    }

    /**
     * fromJson(content, new TypeToken<Object>() {}.getType())  ---Object
     * fromJson(jsonString, new TypeToken<List<Object>>(){}.getType()); ----List<Object>
     *
     * @param json
     * @param typeOfT
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Type typeOfT) {
        Gson gson = new Gson();
        return gson.fromJson(json, typeOfT);

    }

}
