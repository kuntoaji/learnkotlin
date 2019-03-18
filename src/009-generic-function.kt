// https://kotlinlang.org/docs/reference/generics.html#generic-functions

fun <Whatever> whateverFunction(myParam: Whatever) = "Whatever $myParam"

// MutableStack is defined at 008-generic-class.kt
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    println(whateverFunction("Aloha"))
    println(whateverFunction(99))

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}