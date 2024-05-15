package com.example.beecrowd_solutions

fun main(){
    println("Enter your number: ")
    val number = readLine()!!.toInt()
    println("Enter your hours worked: ")
    val hours = readLine()!!.toInt()
    println("Enter your amount you receive per hour worked: ")
    val valueHour = readLine()!!.toDouble()

    val wage = hours * valueHour
    val wageConvert = String.format("%.2f",wage)

    println("NUMBER = $number")
    println("SALARY = U$ $wageConvert")
}
