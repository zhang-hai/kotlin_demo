package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：不可变Set集合
 */
fun main() {
    val set = setOf("Sam", "Jack", "Chork", "Sam")
    println(set.elementAt(1))
    println(set.elementAtOrElse(1){"UnKnown"})
    println(set.elementAtOrNull(1))
}