package com.kotlinplayground.basics

fun main() {
    for (i in 1 .. 5) {
        if (i == 3) continue // break execution of loop
        println("i in $i")
    }

    //label()
}

fun label() {
    loop@ for (i in 1 .. 5) {
        println("i in $i")

        if (i == 3) break@loop // break execution of loop
    }
}
