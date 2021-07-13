package com.example.kotlin_demo

import kotlin.Exception

class ExceptionDemo {
    //异常捕获方式
    fun exceptionTest(){
        val str = "aaa"

        try {
            var num = str.toInt()
        }catch (e:Exception){
            println("类型转换异常")
        }finally {
        }
    }


    //计算前n项求和
    //关键字tailrec是进行尾递归优化标识
    tailrec fun sum( n:Int,result:Int):Int{
        if(n == 1) {
            return result+1
        }else{
            //尾递归优化，return 值必须为递归方法，不可为：return n+sum(n-1,result)
            //否则编辑器会提示：A function is marked as tail-recursive but no tail calls are found
            return sum(n-1,result+n)
        }
    }

    class CustomException(string: String):Exception(string)
}