package com.example.kotlin_demo
//创建一个简单的类，该类有两个变量
class HelloKotlin(var letter:String ,var letter2: String){
    /**
     * 方法的定义
     */
    fun method(){
        println("我是定义的一个方法")
    }
}

fun main() {
    var demo = HelloKotlin("Hello"," Kotlin")
    println("${demo.letter}${demo.letter2}")
    demo.method()
}