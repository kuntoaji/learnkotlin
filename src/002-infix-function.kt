infix fun Int.times(str: String) = str.repeat(this)

fun main() {
    println(2 times "Aloha ")

    val pair = "key" to "value"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    var myPair = "Aloha" onto "Baloha"
    println(myPair)

    var foo = Person("Foo")
    var bar = Person("Bar")
    var lan = Person("Lan")
    foo likes bar
    foo.likes(lan)
}

class Person(val name: String) {
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/mutable-list-of.html
    val likedPeople = mutableListOf<Person>()

    infix fun likes(other: Person) {
        println("${this.name} likes ${other.name}")
        likedPeople.add(other)
        println("liked People: ${likedPeople.map { p -> p.name } }")
    }
}