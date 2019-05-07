// https://kotlinlang.org/docs/reference/collections.html

// A set is an unordered collection that does not support duplicates.
// There are functions setOf() and mutableSetOf() for creating sets.
// A read-only view of a mutable set can be obtained by casting it to Set.

val openIssues: MutableSet<String> = mutableSetOf("unique1", "unique2", "unique3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "unique4"
    val anExistingIssue: String = "unique2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anExistingIssue ${getStatusLog((addIssue(anExistingIssue)))}")
}