package com.example.kotlin_demo.协程

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by zhanghai on 2021/8/27.
 * function：
 */
suspend fun getToken(): String {
    delay(300)
    println("getToken 开始执行，时间:  ${System.currentTimeMillis()}")
    return "ask"
}

suspend fun getResponse(token: String): String {
    delay(100)
    println("getResponse 开始执行，时间:  ${System.currentTimeMillis()}")
    return "response"
}

fun setText(response: String) {
    println("setText 执行，时间:  ${System.currentTimeMillis()}")
}

fun main() {
    GlobalScope.launch {
        println("协程 开始执行，时间:  ${System.currentTimeMillis()}")
        val token = getToken()
        val response = getResponse(token)

        setText(response)
    }

    Thread.sleep(1000)
}