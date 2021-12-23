package shape

abstract class Shape(val shapeName:String) {
    fun printShapeName() {
        println("This is a $shapeName")
    }
    fun printTotalAreaAndCircular(){
        println("Area in  $shapeName = ${calculateArea()}")
        println("Circular in  $shapeName = ${calculateCircular()}")
    }
    abstract fun calculateArea():Double
    abstract fun calculateCircular():Double
}