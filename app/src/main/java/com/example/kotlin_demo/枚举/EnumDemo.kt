package com.example.kotlin_demo.枚举
//定义一个枚举类型
enum class EnumDemo {
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}

fun main() {
    //输出枚举类型的索引和值
    for (item in EnumDemo.values()){
        println("ordinal--${item.ordinal},name--${item.name}")
    }
}