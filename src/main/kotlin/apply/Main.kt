package apply

fun main(args: Array<String>) {
    val person: Person = Person(
        name = "vu hoai nam",
        address = "HN",
        age = 2,
        phone = "0000000000"
    ).apply {
        println(this.displayInfo())
        name = "namvh13"
        address = "FSOFT"
        age = 1
        phone = "099999999"
    }
    println(person.displayInfo())

    println(createPerson(age = 11, name = "David", contactNumber = "0980989080", address = "Dong Nai").displayInfo())
    println(
        createPersonNoUseApply(
            age = 11,
            name = "David",
            contactNumber = "0980989080",
            address = "Dong Nai"
        ).displayInfo(
        )
    )
}

fun createPerson(age: Int, name: String, contactNumber: String, address: String) = Person().apply {
    this.name = name
    this.age = age
    this.phone = contactNumber
    this.address = address
}

fun createPersonNoUseApply(age: Int, name: String, contactNumber: String, address: String): Person {
    val person = Person()
    person.age = age
    person.name = name
    person.phone = contactNumber
    person.address = address
    return person
}