fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("aloha")
    println("Hello, world!!!")
    println(printMessage("baloha"))
    printMessageWithPrefix("Hello", "LOG")
    println(sum(1, multiply(2, 2)))
}