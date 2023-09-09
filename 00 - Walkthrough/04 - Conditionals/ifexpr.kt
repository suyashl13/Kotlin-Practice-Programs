fun main() {
	val x: Int = 5
    val y: Int = 6
    
    val z: String = if (x > y) {
        "X is Greater"
    } else if (x < y) {
        "Y is Greater"
    } else {
        "Equal"
    }
    
    println(z)


    val isEven = if (y % 2 == 0) "Even" else "Odd"
    println(isEven)
}