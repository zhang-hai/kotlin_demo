package com.example.kotlin_demo.泛型

/**
 * Created by zhanghai on 2021/7/19.
 * function：约束泛型，指定泛型是属于某个类型的
 */
//定义一个约束泛型
private class ConstraintMagicBox<T:Human>(item:T){

}

//定义一个父类
private open class Human(val name: String,val age:Int)
//定义一个Human类的子类
private class Male(name: String,age: Int):Human(name, age)
//定义一个Human类的子类
private class Female(name: String,age: Int):Human(name, age)

fun main() {
    //同为Human类型的可传入
    val male = ConstraintMagicBox(Male("Jack", 20))
    val female = ConstraintMagicBox(Female("Jim", 20))
}