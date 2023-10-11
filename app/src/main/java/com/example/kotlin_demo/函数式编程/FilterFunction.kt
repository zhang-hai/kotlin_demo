package com.example.kotlin_demo.函数式编程

/**
 * 过滤函数：
 * 是Kotlin中函数式编程的第二大类函数，过滤函数接收一个predicate函数，
 * 该函数提供了一个查询条件用于查询集合中的元素并给出true或false的结果。
 * 如果predicate函数返回`true`，则将元素添加到新的集合中，如果返回`false`，则受检元素则移出新集合。
 *
 * filter
 */
fun main(){
    val list = listOf("I","like","kotlin")
    val filterList = list.filter { it.contains("k") }
    println("filterList : $filterList")
}