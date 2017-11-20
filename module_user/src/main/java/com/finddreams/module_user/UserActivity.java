package com.finddreams.module_user;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.finddreams.module_user.databinding.ActivityUserBinding;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {

    private ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user);
        ArrayList<User> users = new ArrayList<>();
        User user = new User("liuxiang", 18);
        User user2 = new User("finddreams", 20);
        users.add(user);
        users.add(user2);
        binding.setUsers(users);
        binding.setUser(user);
//        user.name="";
    }
}
