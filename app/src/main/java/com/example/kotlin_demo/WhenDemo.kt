package com.example.kotlin_demo

class WhenDemo {

    /**
     * 无返回值的when表达式
     */
    fun noneReturn(type:Int){
        when(type){
            1 -> {//有多行代码
                println("这里有多行代码，加大括号")
                println("这里有多行代码，加大括号")
            }
            2 -> println("只有一行代码，不用大括号")     //只有一行代码，不用大括号
            else -> println("其他情况")
        }
    }

    /**
     * 带返回值的when表达式
     */
    fun withReturn(type:Int){
        var str = when(type){
            1 -> {//有多行代码
                println("这里有多行代码，加大括号")
                println("这里有多行代码，加大括号")
                "我是type=1时的返回值"
            }
            2 -> "我是type=2的返回值"     //只有一行代码，不用大括号
            else -> "我是其他情况的返回值"
        }

        println(str)
    }

}