package com.example.kotlin_demo.类

/**
 * Created by zhanghai on 2021/7/16.
 * function：初始化块(init)例子
 * 初始化块代码是在构造类的实例时执行
 *
 * 初始化顺序：
 * 主构造函数里声明的属性 --> 类级别的属性赋值 --> init初始化块 --> 次构造函数里的属性
 */
private class ClassInitTest(var name: String) {

    constructor():this(name="Zhang"){
        println("次构造函数---------->>>")
    }

    /**
     * 构造类的实例时执行,构造函数中执行
     */
    init {
        println("构造类的实例时执行------> init")
    }
}

fun main() {
    val initTest = ClassInitTest("Zhang3")
}