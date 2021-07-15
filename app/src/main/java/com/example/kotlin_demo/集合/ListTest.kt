package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：固定长度的List
 */
fun main() {
    //实例化一个固定长度的List集合
    val list = listOf("Sam", "Jack", "Chork", "Yam")

    println(list[2])
    //该方式获取时，若索引越界会抛异常
    println(list[4])
    println(list.elementAt(1))
    //该方式获取指定的索引的值，若越界会返回指定的默认字符串
    println(list.getOrElse(4){"UnKnown"})
    println(list.getOrElse(2){"UnKnown"})
    //同上方法
    println(list.elementAtOrElse(4){"UnKnown"})
    //该方式获取指定索引的值时，若越界则会返回null
    println(list.getOrNull(4))
    //同上方法，内部调用了getOrNull方法
    println(list.elementAtOrNull(4))

    //********* 转可变集合
    val toMutableList = list.toMutableList()

    //********* 元素去重
    list.distinct() //等价于 list.toSet().toList()

    //********* 转数组
    //这里list是对象类型的故要用toTypedArray
    val toTypedArray = list.toTypedArray()
    //整数List
    listOf(10,20).toIntArray()
}