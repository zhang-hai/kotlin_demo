package com.example.kotlin_demo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    //测试变量可为空
    @Test
    fun testNullDemo(){
        var demo = NullDemo()
        //不允许参数为null
        demo.noneNullTest("Hello---->")
        //允许参数为null
        demo.canNullTest(null)

    }

    //测试When表达式
    @Test
    fun whenDemoTest(){
        val demo = WhenDemo()
        //不带返回值
        demo.noneReturn(2)

        //带返回值
        demo.withReturn(2)

    }

    @Test
    fun loopAndRangeDemoTest(){
        val larDemo = LoopAndRangeDemo()
        larDemo.loopAndRange()
    }

    @Test
    fun listDemoTest(){
        val demo = ListDemo()
        demo.myList()
        demo.myList2()
    }

    @Test
    fun mapDemoTest(){
        val demo = MapDemo()
        demo.mapTest()
    }

    //函数定义方式测试
    @Test
    fun functionDemoTest(){
        val demo = FunctionDemo()
        demo.method()

        demo.method2()

        demo.method3()

        demo.area(3.14f,10f)

        demo.area(r=20f)
    }

    @Test
    fun inputDemoTest(){
        val demo = InputDemo()
        demo.inputTest()
    }
}