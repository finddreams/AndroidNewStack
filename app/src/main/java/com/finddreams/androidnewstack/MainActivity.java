package com.finddreams.androidnewstack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.finddreams.androidnewstack.bean.WeatherBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String stockInfo = MyApplication.get(this).getComponent().getStockPresenter().getStockInfo();
        Call<WeatherBean> weatherBeanCall = MyApplication.get(this).getComponent().getLivingPresenter().getWeatherInfo("深圳", null, 0);
        weatherBeanCall.enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                String s = call.request().toString();
                Log.d("stack",s);

                WeatherBean body = response.body();
                String message = response.message();

                Log.d("stack",body.result.today.city);
                Log.d("stack",message);
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {

            }
        });
        weatherBeanCall.cancel();
    }
}
