package com.finddreams.androidnewstack;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.finddreams.androidnewstack.bean.User;
import com.finddreams.androidnewstack.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class RecyclerViewActivity extends AppCompatActivity {


    private ActivityRecyclerViewBinding mBinder;
    public Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mBinder.recyclerview.getAdapter().notifyDataSetChanged();
            mBinder.recyclerview.smoothScrollToPosition(mBinder.recyclerview.getChildCount());

        }
    };
    private TimerTask timerTask;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        final ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new User("liuxiang","http://static.firefoxchina.cn/img/201711/8_5a122aef2a54c0.jpg", i));
        }
        mBinder.setData(users);
        timerTask = new TimerTask() {
            @Override
            public void run() {
                users.add(new User("finddreams","10",10));
                handler.sendEmptyMessage(0);
            }
        };
        timerTask.scheduledExecutionTime();
        timer = new Timer();
        timer.schedule(timerTask,0,5000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timerTask.cancel();
        timer.cancel();
    }
}
