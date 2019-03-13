// https://kotlinlang.org/docs/reference/generics.html

class MyWhateverGeneric<Whatever>(myParam: Whatever) {
    var value = myParam
}

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last() // E as return value

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()}) from toString()"
}

fun main() {
    val myString = MyWhateverGeneric<String>("Hello world")
    val myInteger = MyWhateverGeneric<Int>(999)

    println(myString.value)
    println(myInteger.value)

    val mutableStack = MutableStack<String>("hello", "world", "from", "jakarta")
    println(mutableStack)

    println(mutableStack.push("Indonesia"))
    println(mutableStack)

    println(mutableStack.peek())
    println(mutableStack.pop())
    println(mutableStack)

    println(mutableStack.isEmpty())
    println(mutableStack.size())
}