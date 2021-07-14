package com.example.kotlin_demo.集合

/**
 * Created by zhanghai on 2021/7/14.
 * function：数组
 */
fun main() {
    //1.Int数组
    val intArrayOf = intArrayOf(10, 20, 30)
    //2.Double 数组
    val doubleArrayOf = doubleArrayOf(2.3, 2.0, 1.5)
    //3.Float 数组
    val floatArrayOf = floatArrayOf(2.0f, 1.5f)
    //4.Long 数组
    val longArrayOf = longArrayOf(10L, 20L)
    //5.Short 数组
    val shortArrayOf = shortArrayOf(10, 20)
    //6.Byte 数组
    val byteArrayOf = byteArrayOf(1, 2, 3)
    //7.Boolean 数组
    val booleanArrayOf = booleanArrayOf(true, false)
    //8.Object 数组
    val arrayOf = arrayOf(User(), User())
}
//定义一个类
private class User