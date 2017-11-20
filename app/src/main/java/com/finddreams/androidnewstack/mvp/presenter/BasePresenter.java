package com.finddreams.androidnewstack.mvp.presenter;


import com.finddreams.androidnewstack.mvp.view.IView;

/**
 * Created by lx on 2016/10/14.
 */

public abstract class BasePresenter<T extends IView> implements IPresenter<T> {

    protected static final String TAG = "BasePresenter";
    protected T mView;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    public boolean isViewAttached() {
        return mView != null;
    }

    public T getView() {
        return mView;
    }


}
