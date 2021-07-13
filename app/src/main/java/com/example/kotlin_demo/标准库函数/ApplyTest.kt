package com.example.kotlin_demo.标准库函数

import java.io.File

fun main() {
    var file = File("D://file.txt").apply {
        setReadable(true)
        setWritable(true)
    }
}