package com.finddreams.androidnewstack;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.finddreams.androidnewstack.mvp.presenter.IPresenter;
import com.finddreams.androidnewstack.mvp.view.IView;


public abstract class BaseActivity<T extends ViewDataBinding,P extends IPresenter>  extends AppCompatActivity implements IView{
    protected  T binding;
    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getBindingLayoutId());
        mPresenter=getPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        initConfig();
        initData();
    }

    private void initConfig() {
    }

    protected abstract int getBindingLayoutId();

    protected abstract P getPresenter();

    protected abstract void initData();

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }
}
