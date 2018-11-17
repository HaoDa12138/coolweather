package com.example.wjh.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by WJH on 2018/11/17.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
