package com.example.kotlin_demo.标准库函数

fun main() {
    val ret = listOf<Int>(5,2,1).last().let {
        it.shl(2)
    }
    println(ret)
}