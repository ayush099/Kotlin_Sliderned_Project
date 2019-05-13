package com.hcl.mylovekotlin

fun main(args: Array<String>) {

    var a = 238249F

    if (a is Float) {
        print("Yes this is Integer Class")
    }

    println("Word " + a)
    print("Hello Word")
    print("Ayush Word")


    Program1()
    Program2()
    Program3()
    Program4()

    //Array Of Nulls
    Program5()
}

//Array Of Nulls
fun Program5()
{
    var array = arrayOfNulls<Int>(5)

    array.set(2, 456)

    println("${array.size}")

    for (i in array)
    {
        println("${i}")
    }

    array = emptyArray()
    println("${array.size}")

}

// Video 5: This is for array tutorial

fun Program4()
{
    var myArray: Array<String> = arrayOf("123", "323", "454", "565")

    println("AYUSH " +myArray[0])

    for (i in myArray)
    {
        println("${i}")
    }


    var array= Array<Int>(6, {i-> (i*i)})

    array.set(4, 6)
    println("${array.size} Ayush")

    for (i in array)
    {
        println("${i}")
    }
}

fun Program3()
{

    var ch = 'h'

    println("${ch}")
    println(ch)
}

// Compare two variable in Kotlin
fun Program2()
{
    var a: Int = 58
    var b: Int = 2

    println(a.compareTo(b))
}

fun Program1()
{
    var b: Int? = 564596

    if (b != null)
    {
        println("Deepak Word not null" + b)
    }
    else
    {
        println("Deepak Word null")
    }
}

//-------------------------------------------------------

// Primitive Array



