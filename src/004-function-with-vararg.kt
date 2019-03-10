// varargs doc: https://kotlinlang.org/docs/reference/functions.html#variable-number-of-arguments-varargs

fun printAll(vararg messages: String) {
    for (message in messages) println(message)
}

fun printAllWithPrefix(prefix: String, vararg messages: String) {
    println()
    print(prefix)
    for (message in messages) print(message + " ")
    println("\n")
}

fun printAllWithSuffix(vararg messages: String, suffix: String) {
    for (message in messages) println(message + suffix)
}

fun log(vararg entries: String) {
    println("\nFrom LOG: ")
    printAll(*entries)
}

fun main() {
    printAll("Hello", "Halo", "Salut", "Hola", "Aloha")
    printAllWithPrefix( "Greeting: ", "Hello", "Halo", "Salut", "Hola", "Aloha")
    printAllWithSuffix("Hello", "Halo", "Salut", "Hola", "Aloha", suffix = " All")
    log("Hello", "Halo", "Salut", "Hola", "Aloha")
}