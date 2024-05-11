package com.example.beecrowd_solutions

fun main(){
    println("Enter the first grade: ")
    val grade1 = readLine()!!.toFloat()
    println("Enter the second grade: ")
    val grade2 = readLine()!!.toFloat()

    val totalWeights = 3.5 + 7.5
    val weightedSum  = (grade1 * 3.5) + (grade2 * 7.5)
    val finalGrade  = weightedSum / totalWeights

    val formattedFinalGrade  = String.format("%.5f",finalGrade)

    println("MEDIA = $formattedFinalGrade")
}