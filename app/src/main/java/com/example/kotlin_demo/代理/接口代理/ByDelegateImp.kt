package com.example.kotlin_demo.代理.接口代理

import com.example.kotlin_demo.代理.接口代理.DelegateImp1
import com.example.kotlin_demo.代理.接口代理.IDelegate

//继承了IDelegate接口，并委托给Child类实现
//委托条件：继承自相同的接口
class ByDelegateImp : IDelegate by DelegateImp1() {

}