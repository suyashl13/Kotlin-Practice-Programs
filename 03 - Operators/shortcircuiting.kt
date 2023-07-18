fun main() {
	var i = 10
    var j = 30
    
    var result = true || i++ == 31
    println(i) // 10 as first condition is true it will not move forward
    
    result = false || i++ == 31
    println(i)
    
}

// Output:
// 10
// 11