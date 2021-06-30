package com.example.kotlin_demo.枚举
//方式一：嵌套在密封类内部声明
sealed class SealedDemo {
    class Monday(var string: String) : SealedDemo(){
        fun mondayAct(){
            println("Monday--->${string}")
        }
    }
    class Tuesday(var string: String) : SealedDemo(){
        fun mondayAct(){
            println("Tuesday--->${string}")
        }
    }
}

fun main() {
    val monday = SealedDemo.Monday("星期一")
    val second = SealedDemo.Tuesday("星期二")
    monday.mondayAct()
    second.mondayAct()
}