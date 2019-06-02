fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // any returns true if the collection contains at least one element that matches the given predicate
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }

    // all returns true if all elements in collection match the given predicate
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }

    // none returns true if there are no elements that match the given predicate in the collection
    val allEvenWithNone = numbers.all { it % 2 == 1 }
    val allLess6WithNone = numbers.all { it > 6 }

    println("Numbers: $numbers")
    println("Negative: $anyNegative")
    println("Greater than 6: $anyGT6")

    println("Check whether all elements are even: $allEven")
    println("Check whether all elements are less than 6: $allLess6")

    println("All numbers are even: $allEvenWithNone")
    println("No element greater than 6: $allLess6WithNone")
}