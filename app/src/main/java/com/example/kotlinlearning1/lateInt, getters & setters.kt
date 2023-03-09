package com.example.kotlinlearning1

fun main(){

    var car1 = Car()
    //car1.name

    println("Brand Name is ${car1.brandName}")
     car1.maxSpeed = 20

    println("Speed is ${car1.maxSpeed}")

    println("My model is ${car1.myModel}")
}

class Car(){
    lateinit var name : String

    var brandName = "Benz"

    get(){
        return field.toLowerCase()
    }

    var maxSpeed = 180

    get() = field

    set(value){
        field = if(value>0) value else throw IllegalAccessException("Speed can't reduce under 0 ")
    }

    var myModel = "Z6"

    private set



    init {
        name  = "Toyota"
    }
}