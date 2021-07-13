package com.example.kotlin_demo.标准库函数

import java.io.File

fun main() {
    val ret = File("D://file.txt").takeIf {
        it.exists() && it.canRead()
    }?.readText()
    println(ret)
}