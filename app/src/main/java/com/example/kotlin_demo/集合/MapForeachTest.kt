package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：map遍历
 */
fun main() {
    val map = mapOf("Jack" to 10, "Sam" to 20, "Luck" to 18)

    //方式一
    map.forEach {
        println("${it.key}，${it.value}")
    }

    //方式二
    map.forEach { (t, u) ->
        println("${t} -- ${u}")
    }
}