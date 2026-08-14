package com.kotlinplayground.classes

// constructor arguments and default value
class Person(val name: String = "", val age: Int = 0) {
    var email: String = ""
    var nameLength: Int = 0;

    // initialization code
    init {
        nameLength = name.length
    }

    constructor(_email: String,
                _name: String = "",
                _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
    // using the secondary constructor to pass in name and age which will pass it to the primary constructor via this()
    val person = Person(_email = "eelizanjr@gmail.com", "Alex", 40)
    println("Name : ${person.name} and the age is ${person.age} and the email is ${person.email}")
    println(person.nameLength)
}