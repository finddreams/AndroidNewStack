package com.finddreams.androidnewstack.mvp.presenter;


import com.finddreams.androidnewstack.mvp.view.IView;

/**
 * Created by lx on 2016/10/14.
 */

public interface IPresenter<T extends IView> {

    void attachView(T view);
    void start();
    void detachView();
}
