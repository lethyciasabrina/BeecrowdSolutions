package com.example.beecrowd_solutions

fun main(){
    println("Enter the number values: ")
    val input = readLine()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()

    fun maior(x: Int, y: Int) : Int {
        return (x + y + Math.abs(x- y)) / 2
    }
    val maiorAB = maior(a, b)
    val maiorABC = maior(maiorAB, c)
    println("$maiorABC eh o maior")
}