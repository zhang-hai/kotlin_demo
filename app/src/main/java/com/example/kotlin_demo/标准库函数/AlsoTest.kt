package com.example.kotlin_demo.标准库函数

import java.io.File

fun main() {
    var list : List<String>
    File("D://file.txt")
            .also {
                println(it.name)
            }.also {
                it.setReadable(true)
            }.also {
                list = it.readLines()
            }
    println(list)
}