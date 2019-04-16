// Kotlin uses == for structural comparison and === for referential comparison.
//
// More precisely, a == b compiles down to:
// a == null ? b == null : a.equals(b)

fun main() {
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/set-of.html
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // true, it calls authors.equals(writers) and sets ignore element order
    println(authors === writers)  // false, authors and writers are distinct references
}