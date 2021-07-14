package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：可变长度的Set集合
 */
fun main() {
    val mutableSet = mutableSetOf("Sam", "Jack", "Chork", "Yam")
    //********* 添加元素
    mutableSet += "Yam"
    mutableSet.add("Hob")
    println(mutableSet)

    //********* 删除元素
    mutableSet -= "Sam"
    mutableSet.removeIf{it.contains("k")}
    println(mutableSet)

    //********* 转不可变Set集合
    val toSet = mutableSet.toSet()
}