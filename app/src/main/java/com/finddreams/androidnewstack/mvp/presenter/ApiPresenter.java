package com.finddreams.androidnewstack.mvp.presenter;

import android.content.Context;
import android.util.Log;

import com.finddreams.androidnewstack.MyApplication;
import com.finddreams.androidnewstack.bean.WeatherBean;
import com.finddreams.androidnewstack.mvp.ApiContract;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by lx on 2016/10/14.
 */

public class ApiPresenter extends BasePresenter<ApiContract.View> implements ApiContract.Presenter {


    @Override
    public void start() {
    }


    @Override
    public void getWeatherData(Context context) {
        Call<WeatherBean> weatherBeanCall = MyApplication.get(context).getComponent().getLivingPresenter().getWeatherInfo("深圳", null, 0);
        weatherBeanCall.enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                String s = call.request().toString();
                Log.d("stack",s);

                WeatherBean body = response.body();
                String message = response.message();

                Log.d("stack",body.result.today.city);
                Log.d("stack",message);
                mView.showWeather(body);
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {

            }
        });
//        weatherBeanCall.cancel();
    }
}
