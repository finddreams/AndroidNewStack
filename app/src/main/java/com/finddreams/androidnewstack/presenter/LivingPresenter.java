package com.finddreams.androidnewstack.presenter;

import com.finddreams.androidnewstack.bean.WeatherBean;
import com.finddreams.androidnewstack.service.LivingService;
import com.finddreams.androidnewstack.service.StockService;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.http.Query;

/**
 * Created by lx on 17-11-13.
 */

public class LivingPresenter {
    private final LivingService api;
    String key="eeffc72fa23b19f82fff6192e95a24cb";

    @Inject
    public LivingPresenter(LivingService livingService) {
        this.api = livingService;
    }

    public Call<WeatherBean>  getWeatherInfo(String cityname, String dtype,int format) {
        OkHttpClient.Builder builder=new OkHttpClient.Builder();
        OkHttpClient build = builder.build();
        return api.getWeather(key,cityname, dtype, format);
    }
}
