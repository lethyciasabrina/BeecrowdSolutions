package com.example.beecrowd_solutions

fun main(){
    println("Enter the code, the number of parts and their unit value: ")
    val input1 = readLine()!!.split(" ")
    val code1 = input1[0].toInt()
    val numberParts1 = input1[1].toInt()
    val unitValue1 = input1[2].toDouble()

    println("Enter the code, the number of parts and their unit value: ")
    val input2 = readLine()!!.split(" ")
    val code2 = input2[0].toInt()
    val numberParts2 = input2[1].toInt()
    val unitValue2 = input2[2].toDouble()

    val total = (numberParts1 * unitValue1) + (numberParts2 * unitValue2)
    println(String.format("VALOR A PAGAR: R$ %.2f", total))
}