fun strLength(notNull: String): Int {
    return notNull.length
}

fun nullStringChecker(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "Not null or empty string. String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    var neverNull = "this can't be null"
    //neverNull = null // Error:(15, 17) Kotlin: Null can not be a value of a non-null type String


    var nullable: String? = "you can keep a null here"
    nullable = null // working fine

    var inferredNonNull = "The compiler assumes non-null"
    //inferredNonNull = null // Error:(22, 23) Kotlin: Null can not be a value of a non-null type String

    println(strLength(neverNull))
    //println(strLength(nullable)) // Error:(25, 23) Kotlin: Type mismatch: inferred type is String? but String was expected

    println(nullStringChecker((neverNull)))
    println(nullStringChecker((nullable)))
}