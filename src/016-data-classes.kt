// https://kotlinlang.org/docs/reference/data-classes.html

// Data classes: classes whose main purpose is to hold data

data class User(val name: String, val id: Int)

fun main() {
    val user = User("KAK", 1)
    println(user) // method toString is auto-generated

    val secondUser = User("KAK", 1)
    val thirdUser = User("DHH", 2)

    // Auto-generated equals considers two instances equal
    // if all theri properties are equal
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // Equal data class instances have equal hashCode()
    println(user.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy()) // Auto-generated copy function makes it easy to create new instance

    // When copying, you can change values of certain properties.
    // copy function accepts arguments in the same order as the class constructor.
    println(user.copy("DHH"))

    // Use copy with named arguments to change the value
    // despite of the properties order
    println(user.copy(id = 2))

    // Get the values of properties in the order declaration with
    // auto-generated componentN functions
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}