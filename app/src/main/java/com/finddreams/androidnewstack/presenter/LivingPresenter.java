package com.finddreams.androidnewstack.presenter;

import com.finddreams.androidnewstack.bean.WeatherBean;
import com.finddreams.androidnewstack.service.LivingService;
import com.finddreams.androidnewstack.service.StockService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.http.Query;

/**
 * Created by lx on 17-11-13.
 */

public class LivingPresenter {
    private final LivingService api;
    String key="";

    @Inject
    public LivingPresenter(LivingService livingService) {
        this.api = livingService;
    }

    public Call<WeatherBean>  getWeatherInfo(String cityname, String dtype,int format) {
        Call<WeatherBean> weather = api.getWeather(key,cityname, dtype, format);
        return weather;
    }
}
