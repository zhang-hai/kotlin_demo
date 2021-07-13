package com.example.kotlin_demo

/**
 * Created by zhanghai on 2021/6/30.
 * function：List中高阶函数使用和扩展
 */
class Student(var name:String,var age:Int)
var 数据库 = listOf<Student>(
    Student("张三",13), Student("王二",18), Student("李四",12),
    Student("张三1",10), Student("王二1",21), Student("李四1",17)
)

var log = fun (student: Student){
    println("姓名=${student.name},年龄=${student.age}")
}

/**
 * infix 定义中缀表达式
 */
infix fun List<Student>.haha(age: Int){
    filter {
        it.age > age
    }.forEach {
        log(it)
    }
}
const val str = "Hello world"
fun main() {
    val str2 = "Hahahhah"
//    var stud = 数据库.find {
//            it.age == 10
//    }
//    log(stud!!)

//    数据库.filter {
//        it.age == 21
//    }.forEach {
//        log(it)
//    }

//    var student = 数据库.maxOf {
//        it.age
//    }
//    println(student)

//    数据库 haha 15
}