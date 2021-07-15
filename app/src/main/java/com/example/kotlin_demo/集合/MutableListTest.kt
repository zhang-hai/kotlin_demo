package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：定义可变长度的List集合
 */
fun main() {
    val mutableList = mutableListOf("Sam", "Jack", "Chork", "Yam")
    //**************添加元素
    mutableList += "Hab"    //mutator函数
    mutableList.add("Hab2")
    mutableList.add(1,"Hab3")
    println(mutableList)

    //**************删除元素
    mutableList -= "Sam"
    mutableList.removeAt(0)
    mutableList.removeFirst()
    mutableList.removeFirstOrNull()
    mutableList.removeLast()
    mutableList.removeLastOrNull()
    mutableList.remove("Hab2")
    //移除符合条件的数据
    mutableList.removeIf{it.contains("k")}
    println(mutableList)

    //**************转不可变的List
    val toList = mutableList.toList()

    //**************转Set
    val toSet = mutableList.toSet()

}