package com.example.kotlin_demo.Java和Kotlin互操作性.kotlin调用java;

/**
 * Created by zhanghai on 2021/7/30.
 * function：Java用户类
 */
public class User {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
