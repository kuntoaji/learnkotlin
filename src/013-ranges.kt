fun main() {
    for (i in 0..3) { // iterate from 0 to 3, inclusive
        print(i)
    }

    print(" ")

    for (i in 2..8 step 2) { // iterate with custom increment
        print(i)
    }

    print(" ")

    for (i in 3 downTo 0) { // reverse order
        print(i)
    }

    print(" ")

    for (c in 'a'..'d') { // iterate over a char range
        print(c)
    }

    print(" ")

    for (c in 'z' downTo 's' step 2) { // char ranges support downTo and step as well
        print(c)
    }

    print(" ")

    val x = 2
    if (x in 1..10) { // ranges as if statement
        print(x)
    }

    print(" ")

    if (x !in 1..4) { // !in as the opposite of in
        print(x)
    }
}