fun main(args: Array<String>) {
    val one: Int = add(5,9)
    val two: Int = add(35,43)
    println(one)
    print(two)
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

// One Liner function
fun add2(num1: Int, num2: Int) = num1 + num2