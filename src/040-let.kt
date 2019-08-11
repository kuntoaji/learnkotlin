// let can be used for scoping and null-checks
// when called on an object, let executes the given block of code
// and returns the result of its last expression.

fun customPrint(s: String) {
    print(s.toUpperCase())
}

fun main() {
    val empty = "test".let {
        customPrint(it)

        // returns value
        it.isEmpty()
    }

    println(" is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        // uses safe call, it will be executed only on non-null values
        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    printNonNull(null)
    printNonNull("my string")
}
