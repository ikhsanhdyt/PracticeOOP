package shape

class Triangle(val base: Double, val height:Double, val hypotenusa: Double ) : Shape("Triangle") {
    override fun calculateArea(): Double {
        return 3 * hypotenusa
    }

    override fun calculateCircular(): Double {
        return 0.5 * base * height
    }
}