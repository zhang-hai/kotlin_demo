package com.example.kotlin_demo.Java和Kotlin互操作性.java调用kotlin

/**
 * Created by zhanghai on 2021/7/30.
 * function：java访问Kotlin类中的属性方式
 */
class JvmFieldUser {

    //java 访问该属性必须通过get/set方式
    var age : Int = 0

    //有该注解，java访问该属性可直接调用该属性名访问
    //注解可使编译时将该属性的访问权限设置为public
    @JvmField
    var name : String? = null

}