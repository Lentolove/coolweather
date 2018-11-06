package com.tsp.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * OkHttp出色的封装，这里和服务器进行交互的代码非常简单
 * 发起一条Http请求只需要调用sendOKHTTPRequest()方法就可以
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
