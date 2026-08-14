package com.kotlinplayground.classes

class Item() {
    // class field
    var name : String = "" // will be overridden from constructor value

    // secondary constructor - this() is required if class has default empty constructor
    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println(item.name)

    // overriding
    item.name = "Iphone 13"
    println(item.name)
}