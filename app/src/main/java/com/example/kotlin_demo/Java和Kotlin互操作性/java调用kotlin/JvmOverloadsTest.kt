package com.example.kotlin_demo.Java和Kotlin互操作性.java调用kotlin

/**
 * Created by zhanghai on 2021/7/30.
 * function：@JvmOverloads强制编译器对方法进行重置，兼容Java调用kotlin
 */
class JvmOverloadsTest {

    /**
     * JvmOverloads 可以让编译器强制对该函数进行重载
     */
    @JvmOverloads
    fun create(name:String = "Jack",age:Int = 20){
        println("name : ${name},age：$age")
    }

}

fun main() {
    val test = JvmOverloadsTest()
    test.create("Jone")

    val user = JavaUser()
    user.visitKotlinFun()
}