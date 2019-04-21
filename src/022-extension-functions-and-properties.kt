// https://kotlinlang.org/docs/reference/extensions.html

// Kotlin provides the ability to extend a class with new functionality without
// having to inherit from the class or use any type of design pattern such as Decorator.
// This is done via special declarations called extensions.
// There are two types of extensions: extension functions and extension properties.

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

// adds extension functions for the Order type
fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"

// check the object for null with:
// fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"
fun Item.nullSafeToString() = this?.toString() ?: "NULL"

// adds an extension property for the Order type
val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Juice", 29.0F), Item("Water", 12.0F)))
    val item = Item("Tea", 15.0F)

    // calls extension functions
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("null safe item: ${item.nullSafeToString()}")

    // accesses the extension property on an instance of Order.
    println("Items: ${order.commaDelimitedItemNames}")
}