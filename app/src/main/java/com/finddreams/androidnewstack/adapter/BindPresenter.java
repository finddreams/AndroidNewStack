package com.finddreams.androidnewstack.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.finddreams.androidnewstack.bean.User;

/**
 * Created by lx on 17-11-20.
 */

public class BindPresenter {
    public void onClickListenerBinding(Context view, User bean) {
        if (bean==null)
            Toast.makeText(view, "回传参数为空", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(view, bean.age+"", Toast.LENGTH_SHORT).show();
    }
}
