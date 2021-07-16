package com.example.kotlin_demo.类

/**
 * Created by zhanghai on 2021/7/16.
 * function：延迟初始化方式：lateinit 和 lazy
 */
class DelayInitTest {
    /**
     * 1.延迟初始化，使用时要手段进行初始化
     */
    lateinit var strAge : String

    /**
     * 2.惰性初始化，lazy，初始化不执行，当第一次使用的时候在进行初始化
     */
    val strName by lazy {
        loadConfig()
    }

    fun loadConfig():String{
        return "惰性初始化"
    }
}