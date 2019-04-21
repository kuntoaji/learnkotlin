// https://kotlinlang.org/docs/reference/lambdas.html

// Lambda functions are a simple way to create functions ad-hoc.

fun main() {
    // All examples create a function object that performs upper-casing.
    // So it's a function from String to String

    // explicit types everywhere
    val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }

    // the type of the lambda parameter is inferred from the type of the variable it's assigned to.
    val upperCase2: (String) -> String = { str -> str.toUpperCase() }

    // the type of the variable is inferred from the type of the lambda parameter and return value.
    val upperCase3 = { str: String -> str.toUpperCase() }

    // Error, the compiler can not do both together.
    // val upperCase4 = { str -> str.toUpperCase() }

    // single parameter can be replaced with it parameter
    val upperCase5: (String) -> String = { it.toUpperCase() }

    // if a lambda function only consist a single function call, function pointers can be used.
    val upperCase6: (String) -> String = String::toUpperCase

    println(upperCase2("hello"))
    println(upperCase1("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}