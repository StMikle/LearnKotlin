package com.example.kotlin.itAcademy.lessons.three.figure

class Rectangle(private val a: Double, private val b: Double) : Figure {
    override val name: String
        get() = "Прямоугольник"

    override fun getSquare(): Double {
        return a * b
    }

    override fun toString(): String {
        return "$name со сторонами ($a, $b) имеет площадь: ${getSquare()}"
    }


}