package com.example.kotlin_demo.Java和Kotlin互操作性.java调用kotlin

/**
 * Created by zhanghai on 2021/7/30.
 * function：Java中使用Kotlin中的匿名函数，通过invoke
 */
class UseKotlinAnonymousFunc {


    @JvmField
    val anonymousFunc = {name:String,age : Int ->
        println("name:$name,age:$age")
    }

}

fun main() {
    val user = JavaUser()
    user.visitKotlinAnonymousFunc()
}