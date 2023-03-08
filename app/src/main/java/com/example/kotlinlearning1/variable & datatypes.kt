package com.example.kotlinlearning1

fun main(){
    var myName = "Tharushi"
    myName = "Dharmasiri"

    var age = 25

    var myString = "Hi i live in kelaniya"

    var firstChar = myString[0]

    var lastChar = myString[myString.length-1]



    println(age)
    println(myString)
    println("First character = " + firstChar)
    println("Last character =  " + lastChar)


    //TODO : Write a function to start the program

    var result = 5+3

    result /= 2

    println("Result =  " + result)

    var isTrueOrFalse = 5!=8

    println("isTrueOrFalse is $isTrueOrFalse")
    println("isTrueOrFalse is ${11 < 10}")

    myFunction()
    //addNumbers(3,5)

    var result2 = addNumbers(2,5)
    println("The main function result is = "+ result)

}

fun myFunction(){
    println("My function was called")
}

fun addNumbers(a : Int, b: Int): Int {
    var result = a+b
    println("Result is: " + result)
    return result
}