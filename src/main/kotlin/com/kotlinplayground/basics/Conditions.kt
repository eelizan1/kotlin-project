package com.kotlinplayground.basics

fun main() {
    // 1-> GOLD, 2 -> SILVER, 3 -> BRONZE
    val pos = 2
    val medal = when (pos) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)
}