package com.example.beecrowd_solutions

fun main(){
    println("Enter a number 1: ")
    val A = readLine()!!.toInt()
    println("Enter a number 2: ")
    val B = readLine()!!.toInt()
    println("Enter a number 3: ")
    val C = readLine()!!.toInt()
    println("Enter a number 4: ")
    val D = readLine()!!.toInt()

    val difference = (A * B) - (C * D)
    println("DIFERENCA = $difference")
}