package com.example.kotlin.itAcademy.lessons.three.figure

fun main(args: Array<String>) {
    print("Введите название фигуры которую хотите создать: \n" +
            "(Круг/Прямоугольник/Квадрат/Треугольник)\n")
    val nameFigure = readLine()
    val figure = nameFigure?.choose().also { print(it.toString()) }
}

fun String.choose() : Figure? {
    val factory = FigureFactory()
    return when(this) {
        "Круг" -> factory.createFigure(FigureType.CIRCLE)
        "Прямоугольник" -> factory.createFigure(FigureType.RECTANGLE)
        "Квадрат" -> factory.createFigure(FigureType.SQUARE)
        "Треугольник" -> factory.createFigure(FigureType.TRIANGLE)
        else -> {
            print("Неверное название фигуры")
            null
        }
    }
}