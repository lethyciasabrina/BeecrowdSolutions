package com.example.beecrowd_solutions

fun main(){
    println("Enter your first grade: ")
    val grade1 = readLine()!!.toDouble()
    println("Enter your second grade: ")
    val grade2 = readLine()!!.toDouble()
    println("Enter your third grade: ")
    val grade3 = readLine()!!.toDouble()

    val totalWeight = 2 + 3 + 5
    val weightedSum = (grade1 * 2) + (grade2 * 3) + (grade3 * 5)
    val average = weightedSum / totalWeight
    val formattedAverage = String.format("%.1f", average)
    println("MEDIA = $formattedAverage")
}