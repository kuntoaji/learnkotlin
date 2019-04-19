fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    // object expression
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")
}

// object declaration, can't be used in variable
object Authentication {
    fun params(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {
    // companion object, it's similar to the static methods in Java
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    rentPrice(10, 2,1)
    Authentication.params("foo", "bar")
    BigBen.getBongs(12)
}