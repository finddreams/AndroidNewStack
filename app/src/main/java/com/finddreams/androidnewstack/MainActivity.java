package com.finddreams.androidnewstack;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.finddreams.androidnewstack.bean.WeatherBean;
import com.finddreams.androidnewstack.databinding.ActivityMainBinding;
import com.finddreams.module_user.UserActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initData();
    }

    private void initData() {
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
                binding.setWeather(body);

            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {

            }
        });
//        weatherBeanCall.cancel();

    }
    public void openuser(View view){
        startActivity(new Intent(this,UserActivity.class));
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.unbind();
    }
}
