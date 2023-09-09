package com.example.demoapp

fun main(args: Array<String>) {

    // Arithmetic Operators
    var a = 4 + 2
    var b = 6 - 5
    println("a: $a = 4 + 2\nb: $b = 6 - 5")

    // Division cannot be int
    var c: Int = 5/6 // Bad practice
    println("c: $c\n")


    // Comparison Operators (Boolean)
    val isEqual = 5==4 // false

    val isNotEqual: Boolean = 5!=5 // false

    println("Is -5 greater than 4: ${-5 > 4}")
    println("String equality: ${"Esas".equals("asasas")}")


    // Assignment operators, Increment and decrement operators
    var myNum: Int = 5 // '=' is an assignment operator
    var newNum = 5
    newNum += 55 // Equivalent to: newNum = newNum + 55

    println("\nnewNum: $newNum")

    // Increment and decrement operators
    var nwNum:Int = 33
    println("nwNum: ${nwNum++}")
    println("nwNum: ${++nwNum}")
}

