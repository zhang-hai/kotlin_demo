package com.example.kotlin_demo.函数

/**
 * Created by zhanghai on 2021/7/28.
 * function：扩展函数
 *
 */
// 1.普通扩展函数
fun String.print(){
    println(this)
}

//2.泛型扩展函数
fun <T> T.print(){
    println(this)
}

//3.可空类型扩展函数
fun String?.printWithDefault(default:String) = println(this ?: default)

//4.扩展属性
val String.numVowels
    get() = count { "hsde".contains(it) }


fun main() {
    println("----------------------普通扩展函数-------------------")
    "普通扩展函数".print()
    println("----------------------泛型扩展函数 示例----------------")
    //泛型扩展函数示例
    1.print()
    "泛型扩展函数示例".print()
    3.14.print()
    println("----------------------可空类型扩展函数----------------")
    null.printWithDefault("字符串为空")
    "字符串不为空".printWithDefault("字符串为空")
    println("----------------------扩展属性-----------------------")
    "abdeejifshahsd".numVowels.print()
}