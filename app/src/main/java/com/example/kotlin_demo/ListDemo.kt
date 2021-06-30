package com.example.kotlin_demo

class ListDemo {
    //简单的for循环
    fun myList(){
        val lists = listOf<String>("1","2","3","4")
        //简单的for循环，查询列表数据
        for (item in lists){
            println(item)
        }
    }

    //按索引值查询
    fun myList2(){
        val lists = listOf<String>("1","2","3","4")
        //按位循环查询，包括索引和值
        for ((i,v) in lists.withIndex()){
            println("$i,$v")
        }
    }
}