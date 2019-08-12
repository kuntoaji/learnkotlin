// run is similar with let, the difference is that inside run
// the object is accessed by this. This is useful when you want to call the
// object's methods rather than pass it as an argument

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {

            // the object's members are accessed without its name
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")

            // returns the length of the given string if it's not null
            length
        }
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}
