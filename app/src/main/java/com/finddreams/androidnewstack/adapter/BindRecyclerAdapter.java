package com.finddreams.androidnewstack.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.finddreams.androidnewstack.BR;
import com.finddreams.androidnewstack.R;
import com.finddreams.androidnewstack.bean.User;
import com.finddreams.androidnewstack.databinding.ItemRecyclerViewBindBinding;

import java.util.List;

/**
 * Created by lx on 17-11-20.
 */

public class BindRecyclerAdapter extends RecyclerView.Adapter<BaseBindingViewHolder<ItemRecyclerViewBindBinding>> {
    private List<User> data;
    private Context context;

    public BindRecyclerAdapter(Context context, List<User> list) {
        this.context = context;
        this.data = list;
    }

    @Override
    public BaseBindingViewHolder<ItemRecyclerViewBindBinding> onCreateViewHolder(ViewGroup parent, int viewType) {

        ItemRecyclerViewBindBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_recycler_view_bind, parent, false);
        return new BaseBindingViewHolder<>(binding);
//        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BaseBindingViewHolder<ItemRecyclerViewBindBinding> holder, int position) {
        User user = data.get(position);
        ItemRecyclerViewBindBinding binding = holder.getBinding();
        binding.setVariable(BR.user, user);
        binding.setPresenter(new BindPresenter());
//        holder.bindData(user);
        // 立刻刷新界面
        binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {

        private ItemRecyclerViewBindBinding binding;

        public BindingHolder(ItemRecyclerViewBindBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ItemRecyclerViewBindBinding getBinding() {
            return binding;
        }

        public void bindData(User item) {
            binding.setVariable(BR.user, item);
            binding.setPresenter(new BindPresenter());
        }
//
//        public void setBinding(ItemRecyclerViewBindBinding binding) {
//            this.binding = binding;
//        }
    }
}
