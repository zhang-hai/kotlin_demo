package com.example.kotlin_demo.函数式编程

/**
 * 合并函数
 *
 *
 * 包含：zip,合并函数来合并两个集合，并返回一个包含键值对的新集合
 *      fold,函数接收一个初始累加器值，随后会根据匿名函数的结果更新
 *
 */
fun main(){
    zipTest()
    foldTest()
}

/**
 * 合并函数 - zip，合并函数来合并两个集合，并返回一个包含键值对的新集合
 */
private fun zipTest(){
    val list = listOf("a","b","c")
    val listValue = listOf(28,30,33)
    //合并后转成map
    val zipMap = list.zip(listValue).toMap()
    println("ZipTest : $zipMap")
    println("zipList[\"a\"]=${zipMap["a"]}")
}

/**
 * 合并函数 - fold,函数接收一个初始累加器值，随后会根据匿名函数的结果更新
 */
private fun foldTest(){
    val list = listOf(1,2,3,4)
    val foldValues = list.fold(0){acc, number ->
        println("初始累计值：$acc")
        acc + (number * 3)
    }
    println("foldValues : $foldValues")
}