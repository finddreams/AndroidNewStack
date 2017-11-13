package com.finddreams.androidnewstack.dagger;

import android.app.Application;

import com.finddreams.androidnewstack.StockPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lx on 17-11-13.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
        }
)
public interface AppComponent {
    void inject(Application app);
    StockPresenter getStockPresenter();
}
