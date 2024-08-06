package com.example.beecrowd_solutions

fun main(){
    println("Enter your kilometers: ")
    val kilometers = readLine()!!.toInt()

    val distance = kilometers * 2
    println("$distance minutos")
}