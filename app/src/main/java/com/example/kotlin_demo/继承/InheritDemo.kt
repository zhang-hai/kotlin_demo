package com.example.kotlin_demo.继承

/**
 * 继承了抽象类AbstractDemo和接口InterfaceDemo
 */
class InheritDemo : AbstractDemo(),InterfaceDemo {
    //实现了抽象类中的抽象方法
    override fun absAction() {
        println("我来自抽象类中的抽象方法")
    }

    //实现了接口中的方法
    override fun action() {
        println("我来自接口中的action方法")
    }

    //重写了接口中的方法
    override fun action2() {
        super.action2()
        println("我来自接口中的实现的方法")
    }
}