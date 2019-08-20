// apply executes a block of code on an object and returns the object itself.
// inside the block, the object is referenced by this.
// this function is handy for initializing objects.

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val kak = Person()
    val stringDescription = kak.apply {
        // inside apply, this is equivalent with this.name
        name = "KAK"

        age = 900
        about = "Secret"
    }.toString()

    println(stringDescription)
}
