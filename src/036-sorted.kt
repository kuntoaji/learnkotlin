fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3)
    val asc = shuffled.sorted()
    val desc = shuffled.sortedBy { -it }

    println("Shuffled: $shuffled")
    println("Ascending order: $asc")
    println("Descending order: $desc")
}
