package com.example.kotlin_demo.函数

/**
 * Created by zhanghai on 2021/7/5.
 * function：返回值是函数类型
 */
fun main() {
    val f = showOnBoard("小明")
    println(f())
}


/**
 * 参数为函数类型，作为最后一个参数
 */
private fun showOnBoard(name: String):()->String{
    return {
        val age = (10 .. 30).shuffled().first()
        "返回值是函数类型：${name}的年龄是${age}岁"
    }
}