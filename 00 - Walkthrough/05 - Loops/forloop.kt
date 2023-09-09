fun main() {
    // One 1 step
    for (i in 1..5) {
        print(i.toString() + " ")
    }

    // two steps
    for (i in 1..10 step 2) {
        print(i.toString() + " ")
    }
    
    // Negative stepping
   	for (i in 50 downTo 10 step 2) {
	    print(i.toString() + " ")
    }
    
    // Write table
    for (i in 1..10) {
        println("2 X ${i.toString()} = ${(i*2).toString()}")
    }
        
}