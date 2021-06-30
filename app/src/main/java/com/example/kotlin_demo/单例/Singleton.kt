package com.example.kotlin_demo.单例
//通过使用object标识为单例
object Singleton{
    fun log(str:String){
        println(str)
    }
}

fun main() {
    //直接通过类名调用方法，类似Java中的静态方法
    Singleton.log("我是单例中的log方法。")
}