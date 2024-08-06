package com.example.beecrowd_solutions

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println("Enter 2 numbers: ")
    val (x1, y1) = readLine()!!.split(" ").map { it.toDouble() }

    println("Enter +2 numbers: ")
    val (x2, y2) = readLine()!!.split(" ").map { it.toDouble() }

    val distance = calculateDistance(x1, y1, x2, y2)

    println(String.format("%.4f", distance))
}

fun calculateDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val x = x2 - x1
    val y = y2 - y1
    return sqrt(x.pow(2.0) + y.pow(2.0))
}