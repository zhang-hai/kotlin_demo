package com.example.kotlin_demo.泛型

class ReifiedTest<T:ReifiedHuman>{
    //符合指定的类型则返回，否则使用参数函数进行构造
    //Kotlin同Java一样不允许对泛型进行类型检查，因为泛型在编译时会被擦除
    //kotlin中可通过关键字reified对泛型进行修饰，并设置对应函数为内联函数
    inline fun <reified T> randomBackup(backup:()->T) : T{
        val list = listOf<ReifiedHuman>(
                ReifiedBoy("Jack",16),
                ReifiedMan("Hank",30)
        )
        val first = list.shuffled().first();
        return if (first is T){
            first
        }else{
            backup()
        }
    }
}

//定义一个父类
open class ReifiedHuman(val name: String,val age:Int){
    override fun toString(): String {
        return "ReifiedHuman(name='$name', age=$age)"
    }
}
//定义一个Human类的子类
class ReifiedBoy(name: String,age: Int):ReifiedHuman(name, age)
//定义一个Human类的子类
class ReifiedMan(name: String,age: Int):ReifiedHuman(name, age)

fun main() {
    val reifiedTest = ReifiedTest<ReifiedBoy>()
    val backup = reifiedTest.randomBackup {
        ReifiedMan("Harry",22)
    }
    println(backup.toString())
}