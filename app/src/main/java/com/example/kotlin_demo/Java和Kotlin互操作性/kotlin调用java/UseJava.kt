package com.example.kotlin_demo.Java和Kotlin互操作性.kotlin调用java

/**
 * Created by zhanghai on 2021/7/30.
 * function：调用Java代码
 */
fun main() {
    //实例化后，给age和name赋值
    val user = User().apply {
        age = 12
        name = "Jack"
    }

    println(user.toString())

}