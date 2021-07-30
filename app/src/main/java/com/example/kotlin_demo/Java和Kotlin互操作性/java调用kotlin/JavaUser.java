package com.example.kotlin_demo.Java和Kotlin互操作性.java调用kotlin;

import java.io.IOException;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/**
 * Created by zhanghai on 2021/7/30.
 * function：Java中调用Kotlin代码
 */
public class JavaUser {
    private int age;
    private String name;

    //调用方式一
    @Override
    public String toString(){
        //调用非kotlin类的函数，编译器会自动生成一个UserKt的类，并且内部函数为静态的
        return UserKt.log(age,name);
    }

    //方式二：自定义编译后生成的Kotlin类名称
    //在Kotlin代码中增加@file.JvmName("User2")
    public void useKotlinCode(){
        User2.log2(age,name);
    }

    //访问Kotlin中的属性 不通过get/set方式
    public void visitKotlinField(){
        JvmFieldUser jvmFieldUser = new JvmFieldUser();
        //方式一：通过get/set方式访问
        int age = jvmFieldUser.getAge();
        jvmFieldUser.setAge(10);

        //方式二：直接像访问Java类中public变量一样访问
        //需要在Kotlin中增加注解@JvmField
        jvmFieldUser.name = "Jack";
    }

    /**
     * 访问kotlin中的多参数函数
     * 由于参数是有默认值，在kotlin中可以只传一个参数，但是在java中不行，必须给方法
     * 增加@JvmOverloads标记，强制在编译时对有该标记的函数进行重载
     */
    public void visitKotlinFun(){
        JvmOverloadsTest test = new JvmOverloadsTest();
        test.create("Hello");
        test.create();
    }

    /**
     * 访问Kotlin伴生对象中的属性及方法
     */
    public void visitKotlinCompanionObject(){
        //
        System.out.println(JvmStaticTest.Companion.getMAX_PIC());
        JvmStaticTest.Companion.getPicturePath();

        //那么怎么类似Kotlin中访问，不需要加Companion呢？
        //给属性或函数增加@JvmStatic注解
        System.out.println(JvmStaticTest.getUserName());
        System.out.println(JvmStaticTest.AGE);
    }

    /**
     * 访问Kotlin中异常捕获
     */
    public void visitKotlinThrowable(){
        ThrowsTest test = new ThrowsTest();
        //Kotlin抛出的异常无法捕获到，因为编译时将kotlin抛出的是Throwable，因此需要捕获的是Throwable
        try {
            test.getFilePath();
        }catch (Throwable t){
//        }catch (IOException e){ //无法捕获到IOException
        }

        //增加了@Throws注解的，是编译器在编译的时候抛出对应的异常
        try {
            test.getFilePathWithThrows();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 调用Kotlin中匿名函数
     */
    public void visitKotlinAnonymousFunc(){
        UseKotlinAnonymousFunc func = new UseKotlinAnonymousFunc();
        //返回的是FunctionN（N为函数参数个数）
//        Function2<String, Integer, Unit> anonymousFunc = func.getAnonymousFunc();
        Function2<String, Integer, Unit> anonymousFunc = func.anonymousFunc;
        //调用方式通过Function的invoke调用
        anonymousFunc.invoke("Jone",20);
    }
}
