package com.example.kotlin.itAcademy.lessons.three.figure

import kotlin.math.sqrt

class Triangle(private val a: Double, private val b: Double, private val c: Double) : Figure {

    override val name: String
        get() = "Треугольник"

    override fun getSquare(): Double {
        val p = (a + b + c) / 2
        return sqrt((p * (p - a) * (p - b) * (p - c)))
    }

    override fun toString(): String {
        return "$name со сторонами ($a, $b, $c) имеет площадь: ${"%.3f".format(getSquare())}"
    }
}