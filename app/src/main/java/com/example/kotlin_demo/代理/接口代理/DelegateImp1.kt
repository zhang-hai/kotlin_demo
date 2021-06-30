package com.example.kotlin_demo.代理.接口代理

import com.example.kotlin_demo.代理.接口代理.IDelegate

//继承了IDelegate接口
class DelegateImp1 : IDelegate {
    //实现了接口方法
    override fun delegateAction() {
        println("我来自Child,实现了接口中的delegateAction方法")
    }
}