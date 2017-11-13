package com.finddreams.androidnewstack;

import android.app.Application;
import android.content.Context;

import com.finddreams.androidnewstack.dagger.AppComponent;
import com.finddreams.androidnewstack.dagger.AppModule;
import com.finddreams.androidnewstack.dagger.DaggerAppComponent;

/**
 * Created by lx on 17-11-13.
 */

public class MyApplication extends Application{
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }
    public AppComponent getComponent() {
        return component;
    }
    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }
    private void initDagger() {
        component = DaggerAppComponent.builder().appModule(new AppModule())
                .build();
        component.inject(MyApplication.this);
    }
}
