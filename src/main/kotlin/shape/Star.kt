package shape

class Star(val maxStar: Int) {
    fun printStars(){
        for (i in 1..maxStar){
            for (a in 1..i){
                print("* ")
            }
            println()
        }
    }
}