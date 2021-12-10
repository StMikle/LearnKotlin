package com.example.kotlin.itAcademy.lessons.three.figure

class Circle(private val radius: Double) : Figure {
    override val name: String
        get() = "Круг"

    override fun getSquare(): Double {
        return Math.PI * radius * radius
    }

    override fun toString(): String {
        return "$name с радиусом $radius имеет площадь: ${getSquare()})"
    }
}