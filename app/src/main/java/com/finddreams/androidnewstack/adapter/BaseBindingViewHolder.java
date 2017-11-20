package com.finddreams.androidnewstack.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lx on 17-11-20.
 */

public class BaseBindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private T binding;
    public BaseBindingViewHolder(T binding) {
        super(binding.getRoot());
        this.binding=binding;
    }
    public T getBinding() {
        return binding;
    }


}
