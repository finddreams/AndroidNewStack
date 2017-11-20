package com.finddreams.androidnewstack.mvp;

import android.content.Context;

import com.finddreams.androidnewstack.bean.WeatherBean;
import com.finddreams.androidnewstack.mvp.presenter.IPresenter;
import com.finddreams.androidnewstack.mvp.view.IView;

/**
 * Created by lx on 2016/10/14.
 */

public interface ApiContract {

    interface View extends IView {
        void showWeather(WeatherBean weatherBean);
    }
    interface Presenter extends IPresenter<View> {
        void getWeatherData(Context context);
    }

}
