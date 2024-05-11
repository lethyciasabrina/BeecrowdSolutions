package com.example.beecrowd_solutions

fun main() {
    println("Enter a number: ")
    val n1 = readLine()!!.toInt()
    println("Enter another number: ")
    val n2 = readLine()!!.toInt()

    val product = n1 * n2

    println("PROD = $product")
}