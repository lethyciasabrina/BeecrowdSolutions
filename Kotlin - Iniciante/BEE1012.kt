package com.example.beecrowd_solutions

fun main(){
    println("Enter the values: ")
    val input = readLine()!!.split(" ")
    val value1 = input[0].toDouble()
    val value2 = input[1].toDouble()
    val value3 = input[2].toDouble()

    val areaOfTriangle = (value1 * value3) / 2
    val areaOfCircle = 3.14159 * (value3 * value3)
    val areaOfTrapeze = (value1 + value2) * value3 / 2
    val areaOfSquare = value2 * value2
    val areaOfRectangle = value1 * value2

    println(String.format("TRIANGULO: %.3f",areaOfTriangle))
    println(String.format("CIRCULO: %.3f",areaOfCircle))
    println(String.format("TRAPEZIO: %.3f",areaOfTrapeze))
    println(String.format("QUADRADO: %.3f",areaOfSquare))
    println(String.format("RETANGULO: %.3f",areaOfRectangle))
}

