open class Animal { // allow inheritance with open modifier
    open fun hello() { // allow overriding with open modifier
        println("Aloha!")
    }
}

class Cat : Animal() {
    override fun hello() {
        println("Meow!")
    }
}

open class Tiger(val origin: String) {
    fun hello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia") // superclass use constructor

open class Lion(val name: String, val origin: String) {
    fun hello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val animal = Animal()
    animal.hello()

    val cat: Animal = Cat()
    cat.hello()

    val tiger: Tiger = SiberianTiger()
    tiger.hello()

    val lion: Lion = Asiatic("Rufo")
    lion.hello()
}