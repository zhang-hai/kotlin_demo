package com.example.kotlin_demo.继承
//父类，
//有open修饰：允许其他类继承
//无open修饰：不允许其他类继承
open class Parent {
    //父类中的一个方法
    //有open修饰：允许子类重写
    //无open修饰：不允许子类重写
    open fun action(){
        println("Parent action----------")
    }
}