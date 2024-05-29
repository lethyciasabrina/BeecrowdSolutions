package com.example.beecrowd_solutions

fun main(){
    println("Enter your distance traveled (km): ")
    val distance = readLine()!!.toInt()
    println("Enter the total fuel spent (l): ")
    val liters = readLine()!!.toDouble()

    val consumption = distance / liters
    println(String.format("%.3f km/l",consumption))
}