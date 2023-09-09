fun main(args: Array<String>) {
    val isAbove70: Boolean = false
    val isKnownProgramming: Boolean = true

    var calledForInterview: Boolean = isAbove70 && isKnownProgramming
    println(calledForInterview) // false (both should be true)

    calledForInterview: Boolean = isKnownProgramming || isAbove70
    println(calledForInterview)

}