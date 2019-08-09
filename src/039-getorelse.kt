// getOrElse takes an index and a function that provides the default value
// in cases when the index is out of bound

fun main() {
    val list = listOf(0, 10, 20)

    // prints the element at index 1
    println(list.getOrElse(1) { 42 })

    // prints 42 because index 10 is out of bound
    println(list.getOrElse(10) { 42 })

    val map = mutableMapOf<String, Int?>()

    // key "x" is not in the map, prints the default value
    println(map.getOrElse("x") { 1 })

    // prints 3, the value of key "x"
    map["x"] = 3
    println(map.getOrElse("x") { 1 })

    // prints the default value because x is not defined
    map["x"] = null
    println(map.getOrElse("x") { 1 })
}
