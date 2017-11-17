package com.finddreams.androidnewstack.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lx on 17-11-17.
 */

public class BindingUtils {
    @BindingAdapter({"textcolor"})
    public static void setTextColor(TextView view, int colorId) {
      view.setTextColor(colorId);
    }
}
