package com.finddreams.androidnewstack;

import android.content.Intent;
import android.view.View;

import com.finddreams.androidnewstack.bean.WeatherBean;
import com.finddreams.androidnewstack.databinding.ActivityMainBinding;
import com.finddreams.androidnewstack.mvp.ApiContract;
import com.finddreams.androidnewstack.mvp.presenter.ApiPresenter;

public class MainActivity extends BaseActivity<ActivityMainBinding,ApiPresenter> implements ApiContract.View{
    @Override
    protected int getBindingLayoutId() {
        return R.layout.activity_main;
    }
    @Override
    protected void initData() {
        String stockInfo = MyApplication.get(this).getComponent().getStockPresenter().getStockInfo();
        mPresenter.getWeatherData(this);

    }

    @Override
    protected ApiPresenter getPresenter() {
        return new ApiPresenter();
    }

    public void openuser(View view){
        startActivity(new Intent(this,RecyclerViewActivity.class));
    }
    @Override
    public void showWeather(WeatherBean weatherBean) {
        binding.setWeather(weatherBean);
    }
}
