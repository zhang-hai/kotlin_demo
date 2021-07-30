package com.example.kotlin_demo.Java和Kotlin互操作性.java调用kotlin

import java.io.IOException
import kotlin.Throws

/**
 * Created by zhanghai on 2021/7/30.
 * function：捕获异常注解
 */
class ThrowsTest {

    /**
     * 普通跑异常，编译时会转成抛出的是Throwable类型,而非指定的IOException
     */
    fun getFilePath() {
        throw IOException("Not find file")
    }

    /**
     * Throws注解，使得编译器可以抛出对应的异常，保证Java中能捕获该异常
     */
    @Throws(IOException::class)
    fun getFilePathWithThrows(){
        throw IOException("Not find file--->getFilePathWithThrows")
    }
}
