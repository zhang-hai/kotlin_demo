package com.example.kotlin_demo.泛型

/**
 * Created by zhanghai on 2021/7/19.
 * function：多个同类型的泛型参数，类似Java中的".."
 */
private class VarMagicBox<T : VarHuman>(vararg val items: T) {

    //根据参数从items中获取数据，其中items类型未Array
    fun fetch(index: Int): T? {
        return items.getOrNull(0)
    }

    //在函数中增加可变参数
    fun fetch(vararg indexs: Int):List<T>{
        indexs.takeIf {
            indexs.isNotEmpty()
        }.run {
            return items.filterIndexed { index, t ->
                indexs.contains(index)
            }
        }
    }
}

private open class VarHuman(val name: String, val age: Int)

private class VarMale(name: String, age: Int) : VarHuman(name, age)

fun main() {
    //同为Human类型的可传入
    val male = VarMagicBox(
        VarMale("Jack", 20),
        VarMale("Jam", 10),
        VarMale("Harry", 18)
    )

    val fetchList = male.fetch()
    fetchList.takeIf {
        it.isNotEmpty()
    }?.forEach {
        println("find a boy.name:${it.name},age:${it.age}")
    }
}