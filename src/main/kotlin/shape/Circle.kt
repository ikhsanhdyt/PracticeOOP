package shape

class Circle(val radius:Double): Shape("Circle") {
    val phi = 3.14
    override fun calculateArea(): Double {
        return phi * radius * radius
    }

    override fun calculateCircular(): Double {
        return 2 * phi * radius
    }
}