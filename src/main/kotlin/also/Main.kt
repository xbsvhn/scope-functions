package also

fun main(args: Array<String>) {
    val person: Person = Person(
        name = "vu hoai nam",
        address = "HN",
        age = 2,
        phone = "0000000000"
    ).also {
        println(it.displayInfo())
        it.name = "namvh13"
        it.address = "FSOFT"
        it.age = 1
        it.phone = "099999999"
    }
    println(person.displayInfo())

    println(createPerson(age = 11, name = "David", contactNumber = "0980989080", address = "Dong Nai").displayInfo())
    println(
        createPersonNoUseAlso(
            age = 11,
            name = "David",
            contactNumber = "0980989080",
            address = "Dong Nai"
        ).displayInfo(
        )
    )
}

fun createPerson(age: Int, name: String, contactNumber: String, address: String) = Person().also {
    it.name = name
    it.age = age
    it.phone = contactNumber
    it.address = address
}

fun createPersonNoUseAlso(age: Int, name: String, contactNumber: String, address: String): Person {
    val person = Person()
    person.age = age
    person.name = name
    person.phone = contactNumber
    person.address = address
    return person
}