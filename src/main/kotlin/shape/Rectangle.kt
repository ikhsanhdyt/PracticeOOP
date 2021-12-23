package shape

class Rectangle(val width: Double,val length: Double): Shape("Rectangle") {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculateCircular(): Double {
        return 2 * (length + width)
    }

}