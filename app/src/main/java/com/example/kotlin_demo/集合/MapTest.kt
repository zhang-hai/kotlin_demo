package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：不可变map集合
 */
fun main() {
    val map = mapOf("Jack" to 10, "Sam" to 20, "Luck" to 18)

    //*********** 读取Map的值
    println(map["Jack"])
    println(map.getValue("Sam"))
    //安全取值函数
    println(map.getOrElse("Sam"){"Unknown"})
    println(map.getOrDefault("JJ",0))


}