package com.example.kotlin_demo.标准库函数

import java.io.File

fun main() {
    //不满足条件时，才执行后续
    val ret = File("D://file.txt").takeUnless {
        it.isHidden
    }?.readText()

    println(ret)
}