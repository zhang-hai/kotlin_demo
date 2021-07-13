package com.example.kotlin_demo.函数

/**
 * Created by zhanghai on 2021/7/5.
 * function：
 */

fun main() {

    //定义一个匿名函数
    val showDiscount = { name:String,age:Int->
        "方式一：${name}的年龄是${age}岁"
    }

    showOnBoard("小明",showDiscount)

    //方式二：简略写法，直接在参数中定义,
    //条件：1.是参数的最后一个参数；2.是唯一一个参数，两者满足其一即可使用该简略写法
    showOnBoard("小明") { name: String, age: Int ->
        "方式二：${name}的年龄是${age}岁"
    }

    //方式三：非最后一个参数写法
    showOnBoard2({name:String,age:Int ->
        "方式三：${name}的年龄是${age}岁"
    },"小明")

    //方式四：采用函数引用
    showOnBoard("小明",::showMyFull)

}

private fun showMyFull(name: String,age:Int) = "方式四：${name}的年龄是${age}岁"

/**
 * 参数为函数类型，作为最后一个参数
 */
private fun showOnBoard(name:String,showDiscount:(String,Int)->String){
    val age = (10 .. 30).shuffled().first()
    println(showDiscount(name,age))
}

/**
 * 参数为函数类型，该非最后一个参数
 */
private fun showOnBoard2(showFullInfo:(String,Int)->String,name: String){
    val age = (10 .. 30).shuffled().first()
    println(showFullInfo(name,age))
}