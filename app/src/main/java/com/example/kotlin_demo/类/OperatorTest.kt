package com.example.kotlin_demo.类

/**
 * Created by zhanghai on 2021/7/16.
 * function：运算符重载示例
 *
 * 常见的操作符
 *
 * 操作符              函数名                 作用
 * +                  plus            把一个对象添加到另一个对象里
 * +=              plusAssign         把一个对象添加到另一个对象里，然后将结果赋值给第一个对象
 * -                  minus           把一个对象减去另外一个对象
 * ==                equals           如果两个对象相等，则返回true,否则返回false
 * >                compareTo         如果左边的对象大于右边的对象，则返回true,否则返回false
 * []                 get             返回集合中指定位置的元素
 * ..               rangeTo           创建一个range对象
 * in               contains          如果对象包含在集合里，则返回true
 *
 */
class OperatorTest(var x: Int, var y: Int) {
    /**
     * 对“+”进行运算符重载
     */
    operator fun plus(other: OperatorTest) = OperatorTest(x + other.x, y + other.y)

    /**
     * 对"-"进行运算符重载
     */
    operator fun minus(other: OperatorTest) = OperatorTest(x - other.x, y - other.y)
}

fun main() {
    val op1 = OperatorTest(10, 20)
    val op2 = OperatorTest(5, 30)
    println(op1 + op2)
    println(op1 - op2)
}