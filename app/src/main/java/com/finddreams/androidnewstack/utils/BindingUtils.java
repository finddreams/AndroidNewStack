package com.finddreams.androidnewstack.utils;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.finddreams.androidnewstack.adapter.BindRecyclerAdapter;
import com.finddreams.androidnewstack.bean.User;

import java.util.List;

/**
 * Created by lx on 17-11-17.
 */

public class BindingUtils {
    @BindingAdapter({"textcolor"})
    public static void setTextColor(TextView view, int colorId) {
        view.setTextColor(colorId);
    }

    @BindingAdapter("image")
    public static void loadImage(ImageView image, String url) {
        Log.d("image",url+"");
        Glide.with(image).load(url).into(image);

    }

    @BindingAdapter("data")
    public static void setData(RecyclerView recyclerView, List<User> data) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new BindRecyclerAdapter(recyclerView.getContext(), data));
    }
}
