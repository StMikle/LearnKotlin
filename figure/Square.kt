package com.example.kotlin.itAcademy.lessons.three.figure

class Square(private val a: Double) : Figure {
    override val name: String
        get() = "Квадрат"

    override fun getSquare(): Double {
        return a * a
    }

    override fun toString(): String {
        return "$name со сторонами ($a) имеет площадь: ${getSquare()}"
    }


}