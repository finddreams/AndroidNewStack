package com.finddreams.androidnewstack.bean;

/**
 * Created by lx on 17-11-17.
 */

public class User {
    public String name;
    public String url;
    public int age;

    public User(String name,String url, int age) {
        this.name = name;
        this.age = age;
        this.url = url;
    }
}
