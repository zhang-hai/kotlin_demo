package com.example.kotlin_demo.泛型

/**
 * Created by zhanghai on 2021/7/19.
 * function：用in、out修饰泛型
 */

//out修饰的泛型 仅将泛型作为函数返回值
//作用：让子类泛型对象可以赋值给父类泛型对象
interface OutTest<out T>{
    fun outTest():T
}

//in修饰的泛型 仅将泛型作为函数参数,泛型无法当做返回值
//作用：让父类泛型对象可以赋值给子类泛型对象
interface InTest<in T>{
    fun inTest(param : T)
}

//泛型无修饰时，可作为函数参数和函数返回类型
interface NoneTest<T>{
    fun none1(param : T)
    fun none2():T
}

open class Food()

open class FastFood():Food()

class Hamburg():FastFood()

class FastFoodStore() : OutTest<FastFood>{
    override fun outTest(): FastFood {
        println("FastFoodStore ----------")
        return FastFood()
    }
}

class HamburgStore():InTest<FastFood>{
    override fun inTest(param: FastFood) {
        println("HamburgStore-----------")
    }

}

fun main() {
    //子类对象可以传给父类泛型对象 out
    val food1 : OutTest<Food> = FastFoodStore()

    //父类对象可以传给子类泛型对象 in
    val food2 : InTest<Hamburg> = HamburgStore()
}