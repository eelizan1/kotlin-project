package com.kotlinplayground.basics

fun main() {

    // kotlin inters the type automatically based on value it is assigned
    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    // string interpolation with variable and function
    println("course:  $course and the course length is ${course.length}")

    // multi line
    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()
    println(multiLine1)
}