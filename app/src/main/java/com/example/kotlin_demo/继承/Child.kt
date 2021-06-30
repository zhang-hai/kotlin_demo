package com.example.kotlin_demo.继承
//Child类继承自Parent类
class Child : Parent() {
    //子类重写了父类的action方法
    override fun action(){
        println("Child action----------")
    }
}