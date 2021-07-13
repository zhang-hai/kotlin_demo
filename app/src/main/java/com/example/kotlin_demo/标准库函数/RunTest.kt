package com.example.kotlin_demo.标准库函数

fun main() {
    val ret = "Welcom,zhh".run {
        contains("zh")
        length
    }
    println(ret)

    //执行函数的引用
    20.run(::getAge)
      .run(::getName)
      .run(::println)
}

private fun getAge(age:Int) = "年龄：$age"

private fun getName(name:String) = "名字：$name"