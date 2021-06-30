package com.example.kotlin_demo.代理.属性代理

import kotlin.properties.Delegates

fun main() {
    //通过by使用属性代理的方式
    var str : String by PropertyDelegate("我是代理类")
    println(str)
    str = "haha"
    println(str)

    //使用lazy委托属性
    val lazyValue :String by lazy {
        println("computed!")
        "Hello"
    }
    println(lazyValue)

    //observable实现委托属性
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
    name = "zhangsan"
    println(name)
}