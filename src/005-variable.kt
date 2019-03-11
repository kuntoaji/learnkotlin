fun main() {
    var myMutableVar: String = "initial value for mutable variable"
    println(myMutableVar)
    myMutableVar = "change value mutable variable"
    println(myMutableVar)

    val immutableVar: Int = 1
    println(immutableVar)

    /*
    immutableVar = 3 // Error:(9, 5) Kotlin: Val cannot be reassigned
    println(immutableVar)
    */

    val implicitTypeVar = 2
    println(implicitTypeVar) // The compiler infers the type Int

    /*
    var nonInitializeVar: Int
    println(nonInitializeVar) // Error:(19, 13) Kotlin: Variable 'nonInitializeVar' must be initialized
    */

    val myNonInitializeVar: Int
    val random = (0..10).random()

    if (random % 2 == 0) {
        myNonInitializeVar = 999
    } else {
        myNonInitializeVar = 888
    }

    println(myNonInitializeVar)
}