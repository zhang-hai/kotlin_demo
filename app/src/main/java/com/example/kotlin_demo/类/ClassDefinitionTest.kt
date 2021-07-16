package com.example.kotlin_demo.类

import kotlin.math.absoluteValue

/**
 * Created by zhanghai on 2021/7/16.
 * function：定义一个类，
 * 有一个主构造函数，在主构造函数中定义私有属性（_name和_age）和成员变量（isVip）
 * 有属性，
 * 分别给属性赋值
 */
private class ClassDefinitionTest(_name:String,_age:Int = 20,var isVip:Boolean){

    var name    = _name
        //field关键字
        //field持有变量name的数据,不能直接定义field，Kotlin对field进行了封装，只暴露给了getter和setter使用
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    var age     = _age
        get() = field.absoluteValue
        set(value){
            field = value.absoluteValue
        }
    /**
     * 定义无函数体的次构造函数
     * 注意：其他参数名称要与主构造函数名称一致
     */
    constructor(_name:String):this(_name,isVip = false)

    /**
     * 定义有函数体的次构造函数
     */
    constructor(_name:String,_age: Int):this(_name,_age,isVip = false){
        this.name = _name
        this.age = _age
    }

    fun checkAge() = if (age >= 18) "成年人" else "${name},你还是未成年人"
}

fun main() {
    val player = ClassDefinitionTest("zhang1",16,false)
    println(player.checkAge())
    val player2 = ClassDefinitionTest("zhang2")
    println(player2.checkAge())
    val player3 = ClassDefinitionTest("zhang3",10)
    println(player3.checkAge())
}