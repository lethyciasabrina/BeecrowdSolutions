package com.example.beecrowd_solutions

fun main(){
    println("Raio: ")
    val raio = readLine()!!.toDouble()
    val area = 3.14159 * (raio * raio)
    val formatted = String.format("%.4f",area)
    println("A = $formatted")
}