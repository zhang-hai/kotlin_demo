package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：可变长度的map集合
 */
fun main() {
    val map = mutableMapOf("Jack" to 10, "Sam" to 20, "Luck" to 18)
    //******** 添加元素
    map += "Haha" to 16
    map.put("Hob",18)
    map.getOrPut("Choice"){17}
    println(map)

    //******** 移除元素
    map -= "Haha"
    map.remove("Jack")
    println(map)

    //******** map转List集合
    val toList = map.toList()
    println(toList)

}