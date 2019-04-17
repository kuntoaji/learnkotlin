//https://kotlinlang.org/docs/reference/sealed-classes.html

// Sealed classes restricts the use of inheritance. Once a class is sealed, nobody else can create its subclasses.

sealed class Mammal(val name: String)

class Bird(val catName: String) : Mammal(catName) // Defines subclasses. Note that all subclasses must be in the same file.
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Bird -> return "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Bird("Flerken")))
}