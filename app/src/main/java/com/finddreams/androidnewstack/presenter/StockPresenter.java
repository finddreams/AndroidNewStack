package com.finddreams.androidnewstack.presenter;

import com.finddreams.androidnewstack.service.StockService;

import javax.inject.Inject;

/**
 * Created by lx on 17-11-13.
 */

public class StockPresenter {
    private final StockService api;

    @Inject
    public StockPresenter(StockService stockService) {
        this.api = stockService;
    }

    public String getStockInfo() {
        return "成功";
    }
}
