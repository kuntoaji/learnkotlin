// https://kotlinlang.org/docs/reference/collections.html

// A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList)
// or read-only (List).

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSudoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    // Updates the MutableList. All related read-only views are updated as well since they point to the same object.
    addSudoer(4)

    println("Total sudoers: ${getSysSudoers().size}")

    getSysSudoers().forEach {
        i -> println("Some usefull info on user $i")
    }

    // Error
    // getSysSudoers().add(5)
}