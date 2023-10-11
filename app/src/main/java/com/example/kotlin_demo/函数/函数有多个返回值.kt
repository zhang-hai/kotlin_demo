package com.example.kotlin_demo.函数


/**
 * 方式一：采用数据类型
 */
data class Fruit(val name:String,val taste:String)
fun fetchFruit():Fruit{
    return Fruit("苹果","甜")
}

/**
 * 方式二：采用Pair/Triple 类
 * Pair 两个值
 * Triple 三个值
 * Kotlin 具有通用的 Pair 和 Triple 类型，它们可以从函数返回两个或三个值
 */
fun fetchFruit2():Pair<String,String>{
    return Pair("苹果","甜")
}
fun fetchFruit20():Triple<String,String,Int>{
    return Triple("苹果","甜",10)
}

/**
 * 方式三：采用数组
 * 将值累积在数组中并从函数中返回。
 * 请注意，这不会为对象数组提供类型安全性或将字段信息传递给调用者。
 */
fun fetchMultiValues():Array<Any>{
    return arrayOf("苹果","甜",10)
}

fun main(){
    //方式一
    val (name,taste) = fetchFruit()
    println("一、多返回值(数据类型)：$name，$taste")

    //方式二
    val fruit2 = fetchFruit2()
    println("二、多返回值(Pair)：${fruit2.first}，${fruit2.second}")
    val triple = fetchFruit20()
    println("二、多返回值(Triple)：${triple.first}，${triple.second}，${triple.third}")

    //方式三
    val arr = fetchMultiValues()
    println("三、多返回值(Array)：${arr[0]},${arr[1]},${arr[2]}")

}