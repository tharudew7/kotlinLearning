package com.example.kotlinlearning1

fun main() {
    var object2 = Person("Sithma", "Hirushii")
    var object1 = Person(lastName = "De Silva")

    object2.favoriteColor = "Blue"
    object1.favoriteColor = "Pink"

    object2.myFavoriteColor()
    object1.myFavoriteColor()
}

class Person(firstName: String = "Tharushi", lastName: String = "Dharmasiri") {

    var firstName : String? = null
    init {
        println("My name is $firstName $lastName")
        this.firstName = firstName
    }

    // Member variable or properties
    var age: Int? = null
    var favoriteColor = "Red"


    // Member Function
    fun myFavoriteColor() {
        println("${firstName} favorite color is $favoriteColor")
    }
}


