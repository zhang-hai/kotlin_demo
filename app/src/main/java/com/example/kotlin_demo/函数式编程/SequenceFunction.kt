package com.example.kotlin_demo.函数式编程

/**
 * 序列
 * generateSequence
 */
fun main(){
    val value = generateSequence(2){
        it+1
    }.filter { it.isPrime() }.take(100)
    println("${value.count()}")
}

fun Int.isPrime():Boolean{
    val ret = (2 until this).map {
        this % it
    }.none { it == 0 }
    return ret
}