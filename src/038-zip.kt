// zip function merges two given collection, default value is Pairs of source
// collection elements with the same index

fun main() {
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B) { a, b -> "$a$b" }

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}
