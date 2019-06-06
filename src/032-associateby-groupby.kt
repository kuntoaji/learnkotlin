// Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key.
// The difference between associateBy and groupBy is how they process objects with the same key:
// - associateBy uses the last suitable element as the value
// - groupBy builds a list of all suitable elements and puts it in the value

fun main() {
    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("KAK", "Boston", "+1-888-123456"),
        Person("KAK Labs", "Munich", "+49-777-789123"),
        Person("KAK Tools", "Saint-Petersburg", "+7-999-456789"),
        Person("Catetin", "Saint-Petersburg", "+7-999-123456"))

    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)
    val peopleCities = people.groupBy(Person::city, Person::name)

    println("People: $people")
    println("Phone book: $phoneBook")
    println("City book: $cityBook")
    println("People living in each city: $peopleCities")
}
