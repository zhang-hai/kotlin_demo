package com.example.kotlin_demo.泛型

/**
 * Created by zhanghai on 2021/7/19.
 * function：Kotlin泛型实例
 */
class MagicBox<T>(val item: T) {
    var available = false

    fun fetch(): T? {
        return item.takeIf { available }
    }

    /**
     * 函数中增加范式类型,类似Java
     */
    fun <R> fetch(anotherGenericity: (T) -> R): R? {
        return anotherGenericity(item).takeIf { available }
    }
}

private class Bird(val name: String)

private class Boy(val name: String, val age: Int)

private class Man(val name: String, val age: Int)

fun main() {
    val boy = MagicBox(Boy("Jim", 16))
    val bird = MagicBox(Bird("啄木鸟"))
    boy.available = true

    boy.fetch()?.run {
        println("find a boy.name:${name},age:${age}")
    }

    val man = boy.fetch {
        Man(it.name, it.age.plus(10))
    }
    man?.run {
        println("find a boy.name:${name},age:${age}")
    }
}