package com.example.kotlin_demo.泛型

/**
 * Created by zhanghai on 2021/7/20.
 * function：避免泛型在编译时被擦除
 *
 * 原理：
 * 泛型在运行时会被类型擦除，但是在inline函数中我们可以指定类型不被擦除，
 * 因为inline函数在编译期会将字节码copy到调用它的方法里，所以编译器会知道当前的方法中泛型对应的具体类型是什么，
 * 然后把泛型替换为具体类型，从而达到不被擦除的目的，在inline函数中我们可以通过reified关键字来标记这个泛型在编译时替换成具体类型
 */

inline fun <reified T> Int.check(t : T):T?{
    return if (this is T){
        t
    }else{
        null
    }
}

fun main() {
    println(2.check(String::class.java))
}