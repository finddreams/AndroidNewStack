package com.finddreams.androidnewstack;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.finddreams.androidnewstack.bean.User;
import com.finddreams.androidnewstack.bean.WeatherBean;
import com.finddreams.androidnewstack.databinding.ActivityMainBinding;

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
        binding.tvName.setTextColor(getResources().getColor(R.color.colorAccent));
        binding.tvOtherName.setTextColor(getResources().getColor(R.color.colorPrimary));
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
        ArrayList<User> users=new ArrayList<>();
        User user=new User("liuxiang",18);
        User user2=new User("finddreams",20);
        users.add(user);
        users.add(user2);
        binding.setUsers(users);
        binding.setUser(user);
//        user.name="";
    }

}
