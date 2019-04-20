// https://kotlinlang.org/docs/reference/lambdas.html

// A higher-order function is a function that takes another function as parameter and/or returns a function

// taking a function as parameter
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sumValues(x: Int, y: Int) = x + y

// returning function
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    // passsing two integer values and the function argument ::sum
    val sumResult = calculate(4,5, ::sumValues)

    // passing a function argument in a lambda
    val multiplyResult = calculate(4,5) { a, b -> a * b }

    println("sumResult $sumResult, multiplyResult $multiplyResult")

    val func = operation()
    println(func(2))
}