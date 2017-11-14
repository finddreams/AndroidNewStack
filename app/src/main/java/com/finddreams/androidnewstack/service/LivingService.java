package com.finddreams.androidnewstack.service;

import com.finddreams.androidnewstack.bean.WeatherBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by lx on 17-11-13.
 */

public interface LivingService {
    @GET("/weather/index")
    Call<WeatherBean> getWeather(@Query("key") String key,@Query("cityname") String cityname, @Query("dtype") String dtype, @Query("format") int format);
}
