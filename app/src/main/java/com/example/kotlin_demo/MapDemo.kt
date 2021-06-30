package com.example.kotlin_demo

class MapDemo {

    fun mapTest():Unit{
        var map = HashMap<String,String>()
        map["1"] = "hello"
        map["2"] = " "
        map["3"] = "world"

        //查询某个key对应的值
        println("map[\"3\"] = ${map["3"]}")

        //查询map中所有的键值对
        for (kv in map){
            println("key=${kv.key},value=${kv.value}")
        }

    }
}