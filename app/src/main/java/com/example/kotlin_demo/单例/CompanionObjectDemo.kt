package com.example.kotlin_demo.单例

//Kotlin类中声明的方法都是非静态的
//但是有时候也会想把部分方法定义为静态，则可以使用companion object关键字进行标识
class CompanionObjectDemo {
    companion object{
        fun log(string: String){
            println("我来自伴生对象的方法---${string}")
        }
    }

    fun other(str : String){
        println(str)
    }
}

fun main() {
    //调用伴生对象的方法
    CompanionObjectDemo.log("companion function")

    var demo = CompanionObjectDemo()
    //调用对象中的方法
    demo.other("other function")
}