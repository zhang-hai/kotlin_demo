package com.example.kotlin_demo.代理.属性代理

import kotlin.reflect.KProperty
//定义一个属性代理类
class PropertyDelegate(var value:String) {
    //属性代理必须实现一个getValue方法
    operator fun getValue(any:Nothing?, property: KProperty<*>):String{
        return value
    }
    //属性代理必须实现一个setValue方法
    operator fun setValue(any:Nothing?, property:KProperty<*>, str:String){

    }
}