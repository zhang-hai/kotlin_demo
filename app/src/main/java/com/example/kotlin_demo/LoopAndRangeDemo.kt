package com.example.kotlin_demo

class LoopAndRangeDemo {

    fun loopAndRange(){
        println("输出：1 .. 16的值-------")
        var nums = 1 .. 16
        //会输出1 2 3 ... 16
        for (n in nums){
            print("$n,")
        }

        println("输出：1 until 16的值-------")
        var nums2 = 1 until 16
        //会输出1 2,3 ... 15，不会输出16
        for (n in nums2){
            print("$n,")
        }
        println("输出：1 .. 16并且步长为2的值-------")
        //会输出1 3 5 7 9 11 13 15
        for (n in nums step 2){
            print("$n,")
        }
    }
}