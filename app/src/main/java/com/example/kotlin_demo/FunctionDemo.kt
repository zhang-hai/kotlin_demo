package com.example.kotlin_demo

class FunctionDemo {

    //方式一：方法定义
    fun method(){
        println("方式一：方法定义")
    }

    //方法二：若方法中代码仅有一行，可省略大括号，如下
    fun method2() = println("方法二：若方法中代码仅有一行")

    fun method3(){
        //方法三：直接在方法里面定义,函数表达式的形式
        var i = {x:Int,y:Int -> x+y}
        var ret = i(1,2)
        println(ret)

        //方法四：是方法三的完善写法
        var j:(Int,Int)->Int = {x,y -> x+y}
        //j当做一个函数来使用
        var retJ = j(1,2)
        println(retJ)
    }

    //函数默认值
    fun area(pi:Float=3.1415f,r : Float) {
        println("计算圆的周长----${2 * r * pi}")
    }
}