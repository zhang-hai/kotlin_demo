package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：List遍历方式
 */
fun main() {
    val list = listOf("Sam", "Jack", "Chork")

    //*********** 遍历方式一 ***************
    for (s in list){
         println(s)
    }

    //*********** 遍历方式二 ***************
    list.forEach {
        println(it)
    }

    //*********** 遍历方式三 带索引 ***************
    list.forEachIndexed { index, s ->
        println("${index},${s}")
    }

    //*********** 遍历方式四 带索引 ***************
    list.withIndex().forEach {
        println("${it.index},${it.value}")
    }

    //*********** 遍历方式五 解构 ***************
    val (first,second,third) = list
    println("$first $second $third")
    //若不想取某个元素的值，则可以通过下划线“_”
    val (origin,_,last) = list
    println("$origin $last")
}