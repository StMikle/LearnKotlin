package com.example.kotlin.itAcademy.lessons.three.figure

class FigureFactory {
    fun createFigure(type: FigureType?): Figure? {
        var figure: Figure? = null
        when (type) {
            FigureType.CIRCLE -> {
                print("Введите радиус круга: ")
                val radius = readLine()!!.toDouble()
                figure = Circle(radius)
            }
            FigureType.RECTANGLE -> {
                print("Введите две стороны прямоугольника через пробел: ")
                val(side1, side2) = readLine()!!.split("\\s+".toRegex()).map { it.toDouble() }
                figure = Rectangle(side1, side2)
            }
            FigureType.SQUARE -> {
                print("Введите сторону квадрата: ")
                val side = readLine()!!.toDouble()
                figure = Square(side)
            }
            FigureType.TRIANGLE -> {
                print("Введите стороны треугольника через пробел: ")
                val (side1, side2, side3) = readLine()!!.split("\\s+".toRegex()).map {it.toDouble()}
                figure = Triangle(side1, side2, side3)
            }
        }
        return figure
    }
}