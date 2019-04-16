fun cakeForLoop() {
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/list-of.html#listof
    val cakes = listOf("vanilla", "chocolate", "cheese")

    for (cake in cakes) {
        println("It's $cake cake!")
    }
}

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun cakeWhenAndDoWhileLoop() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

class zooAnimal(val name: String)

class Zoo(val animals: List<zooAnimal>) {
    operator fun iterator(): Iterator<zooAnimal> {
        return animals.iterator()
    }
}

fun main() {
    cakeForLoop()
    cakeWhenAndDoWhileLoop()

    val zoo = Zoo(listOf(zooAnimal("orang utan"), zooAnimal("lion")))

    for (animal in zoo) {
        println("It's a ${animal.name}")
    }
}