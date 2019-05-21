// https://kotlinlang.org/docs/reference/collections.html

// A map is a collection of key/value pairs, where each key is unique and is used
// to retrieve the corresponding value.

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {
        k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    // updatePointsCredit(5) --> error
    accountReport()
}