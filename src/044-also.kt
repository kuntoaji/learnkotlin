// also works like apply, it executes a given block and returns the object called.
// Inside the block, the object is referenced by it.

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeLog(person: Person) {
    println("A new person ${person.name} was created")
}

fun main() {
    val kak = Person("KAK", 7, "Rubyist").also {
        writeLog(it)
    }
}
