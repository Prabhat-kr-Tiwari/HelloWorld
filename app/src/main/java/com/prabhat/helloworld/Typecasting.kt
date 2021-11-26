package com.prabhat.helloworld

import java.lang.Math.floor

fun main(){

    val stringList:List<String> = listOf("denis","ken","john")
    val mixedTypeList:List<Any> = listOf("denis",7,9,90.00,"ken","john")

    for (value in mixedTypeList){
        if (value is Int){
            println("Integer '$value'")
        }else if (value is Double ){
            println("Double '$value'with floor value ${floor(value)}")

        }else if (value is String ){
            println("string '$value'length ${value.length}")

        }else{
            println("Unknown type")
        }
        for (value in mixedTypeList){
            when(value){
                is Int->println("Integer '$value'")
                is Double->println("Double '$value' with floor value ${floor(value)}")
                is String -> println("string '$value'length ${value.length} ")
                    else-> println("unknown type")
            }

        }
    }
    //smart cast
    val obj1:Any="I have a dream"
    if(obj1 !is String){
        println("Not a String")
    }else{
        //obj is automatically cast to a string in this scope
        println("Found a string of length ${obj1.length}")
    }
    //explicit(unsafe) casting using the "as" keyword can go wrong
    /*val str1:String=obj1 as String
    println(str1.length)
    val obj2:Any=133
    val str2:String=obj2 as String
    println(str2)*/
    //Explicit (safe) casting using the "as?" keyword
    val obj3:Any =133
    val str3:String?=obj3 as? String//works
    println(str3)


}
