package com.example.kotlin_demo.标准库函数

fun main() {
    //值参作为第一个参数传入
    val ret = with("Hello,Kotlin"){
        length > 5
    }
    println(ret)
}