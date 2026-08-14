package com.kotlinplayground.functions

// use const of top level variables
const val courseName = "Kotlin Programming"

fun main() {
    val num = topLevelFunction(3)
    println(num)
}

fun topLevelFunction(x : Int) : Int {
    // return a random value from 0 to 100
    return x
}