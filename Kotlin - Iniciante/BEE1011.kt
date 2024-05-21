package com.example.beecrowd_solutions

fun main(){
    println("Enter the value of the radius: ")
    val radius = readLine()!!.toDouble()
    val radiusModify = (radius * radius * radius)
    val volume = 4/3.0 * 3.14159 * (radiusModify)
    println(String.format("VOLUME = %.3f",volume))
}