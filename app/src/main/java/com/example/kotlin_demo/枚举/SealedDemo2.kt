package com.example.kotlin_demo.枚举
//方式二：密封类声明在同一个文件中
sealed class SealedDemo2
data class Const(val number: Double) : SealedDemo2()
data class Sum(val e1: SealedDemo2, val e2: SealedDemo2) : SealedDemo2()
object NotANumber : SealedDemo2()

fun main() {
    val const = Const(10.0)
    val sum = Sum(const,const)
}