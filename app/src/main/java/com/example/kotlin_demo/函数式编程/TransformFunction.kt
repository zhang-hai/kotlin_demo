package com.example.kotlin_demo.函数式编程

/**
 * 变换函数
 * 概念：会遍历集合内容，用一个以值参的形式传入的变换器函数，变换每一个元素，然后返回已包含修改数据的集合并可传给链上的其他函数。
 *
 * 1.map - 会遍历接收者集合，让变换器函数作用于集合中的各个元素，返回结果是已修改元素的集合，
 *         可以作为链上下一个函数的输入。
 * 2.flatMap - 操作一个集合的集合，将多个集合的元素合并并返回一个包含所有元素的单一集合。
 *
 */
fun main() {

    // 1.变换函数map
    mapTest()
    //2.变换函数flatMap
    flatMapTest()

}

//1.变换函数map
private fun mapTest() {
    val list = listOf<Int>(2, 5, 8, 10, 22)
    //变换后的新列表
    val newList = list.map {
        it * 2 + 3
    }

    println("mapTest newList:$newList")
}

//2.变换函数flatMap
private fun flatMapTest() {
    val list1 = listOf(1,2,3,4)
    val list2 = listOf(7,8,9)

    val newList = listOf(list1,list2).flatMap {
        it
    }
    println("flatMapTest newList:$newList")
}