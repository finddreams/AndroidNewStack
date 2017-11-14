package com.finddreams.androidnewstack.dagger;

import com.finddreams.androidnewstack.service.LivingService;
import com.finddreams.androidnewstack.service.RestApiAdapter;
import com.finddreams.androidnewstack.service.StockService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by lx on 17-11-13.
 */
@Module
public class AppModule {
    @Provides
    public Retrofit provideStockAdapter() {
        return RestApiAdapter.getInstance("http://v.juhe.cn/");
    }

    @Provides
    public StockService provideStockApi(Retrofit restAdapter) {
        return restAdapter.create(StockService.class);
    }
    @Provides
    public LivingService provideLivingApi(Retrofit restAdapter) {
        return restAdapter.create(LivingService.class);
    }
}
