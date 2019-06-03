fun main() {
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    // Looks for the first word starting with "some"
    val first = words.find { it.startsWith("some") }

    // Looks for the last word starting with "some"
    val last = words.findLast { it.startsWith("some") }

    // Looks for the first word containing with "some"
    val nothing = words.find { it.contains("nothing") }

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")
}