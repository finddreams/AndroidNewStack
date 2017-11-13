package com.finddreams.androidnewstack.service;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit的实体类
 */
public class RestApiAdapter {
    private static final long DEFAULT_TIMEOUT = 20;
    private static Retrofit retrofit = null;

    private RestApiAdapter() {

    }

    public static Retrofit getInstance(String baseUrl) {
        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient();
            OkHttpClient.Builder builder = okHttpClient.newBuilder();
            builder.retryOnConnectionFailure(true);
            builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
//            builder.addInterceptor(interceptor);
//            builder.addNetworkInterceptor(interceptor);
            retrofit = new Retrofit.Builder().client(builder.build())
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
