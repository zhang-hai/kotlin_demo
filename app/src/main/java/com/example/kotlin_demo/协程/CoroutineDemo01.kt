package com.example.kotlin_demo.协程

import kotlinx.coroutines.*

/**
 * Created by zhanghai on 2021/8/26.
 * function：
 */
fun main() {
    println("协程demo01------------>>>>>>>")
    GlobalScope.launch {
        val response = requestLogin("1234","1234")

        println(response.toString())
    }
    println("main.....")

    GlobalScope.launch(Dispatchers.Unconfined,CoroutineStart.LAZY){

    }

    //增加延迟，否则主线程结束，协程中的日志看不到
    Thread.sleep(1000L)
}

fun requestLogin(id:String,pwd:String):LoginResponse{

    return LoginResponse(200,"login success")
}

data class LoginResponse(val code:Int,val msg:String)