fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Aloha ")

    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/get.html
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

    // val myStr = "Hello from Jakarta"
    // println(myStr[0..6])
}