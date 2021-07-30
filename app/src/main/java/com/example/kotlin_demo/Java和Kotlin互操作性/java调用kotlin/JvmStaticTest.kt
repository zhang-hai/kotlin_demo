package com.example.kotlin_demo.Java和Kotlin互操作性.java调用kotlin

/**
 * Created by zhanghai on 2021/7/30.
 * function：
 * 是@JvmField和@JvmStatic注解允许Java中像访问静态变量或静态方法一样访问半生对象中的属性和函数
 * 其中：@JvmField修饰属性；@JvmStatic修饰函数和属性（修饰属性时，需要通过get方式调用）
 */
class JvmStaticTest {

    companion object{
        val MAX_PIC = 10

        fun getPicturePath() = println("I am used in Java.")

        @JvmField
        val AGE = 20
        @JvmStatic
        fun getUserName() = "Jone"
    }

}

fun main() {
    println("------------ Used in Kotlin ----------------------")
    println(JvmStaticTest.MAX_PIC)
    println(JvmStaticTest.getPicturePath())

    println("------------ Used in Java ----------------------")
    val user = JavaUser()
    user
}