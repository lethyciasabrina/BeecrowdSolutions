package com.example.beecrowd_solutions

fun main(){
    println("Enter your name: ")
    val name = readLine()!!.toString()
    println("Enter your fixed salary: ")
    val fixedSalary = readLine()!!.toDouble()
    println("Enter total sales for the month: ")
    val totalSales  = readLine()!!.toDouble()

    val salaryBonus = (totalSales * 0.15) + fixedSalary
    val bonusFormatted = String.format("%.2f",salaryBonus)

    println("TOTAL = R$ $bonusFormatted")
}