fun main() {
    val ANIMAL: String = "Dog"
    
    // Block to check if ANIMAL is DOG
    if (ANIMAL == "DOG") {
        println("Animal is DOG")
    } else if (ANIMAL == "Cat") {
        println("Animal is Cat")
    } else {
        println("Animal unknown")
    }
    
    
    // Using when format
    when (ANIMAL) {
       "Dog" -> println("Animal is DOG")
       "Cat" -> print("Animal is cat")
       else -> print("Unknown")
    }
}