package com.example.kotlin_demo

class NullDemo {
    //参数不允许为null
    fun noneNullTest(s : String){
        println(s)
    }

    //参数允许为null
    fun canNullTest(s:String?){
        println(s)

        //s为null，停止执行
        s?.capitalize()
        //s为null，抛异常
        s!!.capitalize()
    }
}