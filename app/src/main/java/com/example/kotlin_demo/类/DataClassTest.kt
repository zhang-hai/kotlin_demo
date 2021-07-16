package com.example.kotlin_demo.类

/**
 * Created by zhanghai on 2021/7/16.
 * function：数据类示例
 *
 * 采用<code>data</code>关键字修饰
 * 1.用data修饰的类默认实现了父类Any类的toString、equals、hashCode函数
 *
 * 2.另外提供了copy函数，类似Java的clone，拷贝的时候执行的是主构造函数，若其中一个变量是在次构造函数中赋值的，则无法copy过来，需要手动设置值。
 *
 * 3.支持结构语法，定义方式
 *  operator fun component1() = x
 *  operator fun component2() = x
 *  ...
 *  operator componentN() = x
 *  主构造函数有几个参数就会生产对应几个component
 */
data class DataClassTest(var x: Int, var y: Int) {
    val isInvalidate = x > 0 && y > 0
}

/**
 * 普通类支持解构定义
 */
class Coor(var x: Int, var y: Int) {
    operator fun component1() = x
    operator fun component2() = y

}


fun main() {
    println(DataClassTest(10, 5))
    //支持结构操作
    val (x, y) = DataClassTest(10, 20)

    //普通类支持解构语法
    val (p,q) = Coor(10,20)
}