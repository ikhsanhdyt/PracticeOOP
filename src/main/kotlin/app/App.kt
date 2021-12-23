package app

import shape.Circle
import shape.Rectangle
import shape.Star
import shape.Triangle
import java.lang.NumberFormatException

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }

    private fun run() {
        printHeader()
        inputMenu()
    }

    private fun printHeader() {
        println("======================")
        println("Console App for Calculating Area in 2D")
        println("======================")
        println("1. Calculate Rectangle Area")
        println("2. Calculate Circle Area")
        println("3. Calculate Triangle Area")
        println("4. Print Stars")
        println("======================")
        println("Enter Menu 1/2/3/4")
        println("======================")
    }

    private fun inputMenu() {
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                menuRectangle()
            }
            "2" -> {
                menuCircle()
            }
            "3" -> {
                menuTriangle()
            }
            "4" -> {
                menuStars()
            }
            else -> {
                println("Wrong Input Please Try Again")
                run()
            }
        }
    }

    fun getValueFromUser(): Double {
        return try {
            readLine()?.toDouble() ?: 0.0
        } catch (e: NumberFormatException) {
            0.0
        }
    }

    private fun menuRectangle() {
        println("Input length :")
        val length = getValueFromUser()
        println("Input width :")
        val width = getValueFromUser()
        if (length != 0.0 || width != 0.0) {
            val rectangle = Rectangle(length, width)
            rectangle.printShapeName()
            rectangle.printTotalAreaAndCircular()
        } else {
            println("Wrong Input Please Try Again")
            run()
        }
    }

    private fun menuTriangle() {
        println("Input Base :")
        val base = getValueFromUser()
        println("Input Hypotenusa :")
        val hypotenuse = getValueFromUser()
        println("Input height :")
        val height = getValueFromUser()

        if (base != 0.0 || hypotenuse != 0.0 || height != 0.0){
            val triangle = Triangle(base, height, hypotenuse)
            triangle.printShapeName()
            triangle.printTotalAreaAndCircular()
        }else{
            println("Wrong Input Please Try Again")
            run()
        }
    }

    private fun menuCircle() {
        println("Input radius :")
        val radius = getValueFromUser()

        if (radius != 0.0) {
            val circle = Circle(radius)
            circle.printShapeName()
            circle.printTotalAreaAndCircular()
        } else {
            println("Wrong Input Please Try Again")
            run()
        }
    }

    private fun menuStars() {
        println("Input max stars :")
        val maxStar = try {
            readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            0
        }
        if (maxStar != 0) {
            val star = Star(maxStar)
            star.printStars()
        } else {
            println("Wrong Input Please Try Again")
            run()
        }
    }
}