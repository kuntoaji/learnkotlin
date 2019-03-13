// https://kotlinlang.org/docs/reference/classes.html#classes

class Customer // valid

class Contact(val id: Int, var email: String) // also valid class

class InitOrder(name: String) {
    val uppercaseName = name.toUpperCase()
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name and $uppercaseName")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    val customer = Customer()
    val contact = Contact(1, "user@example.com")
    println(contact.id)
    println(contact.email)

    contact.email = "seconduser@example.com"
    println(contact.email)

    val initOrder = InitOrder("Foobar")
}