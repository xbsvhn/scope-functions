package let

fun main(args: Array<String>) {
    var person = Person("ec", "0123456", "FPT", 5)
    println(person.displayInfo())

    person.let { user ->
        println(user.displayInfo())
        user.moveAddress("Ho Chi Minh city")
        user.changePhone("99070000000")
        println(user.displayInfo())
    }

    val person1: Person? = null

    person1?.let {
        println(it.displayInfo())
    }

    val numbers = mutableListOf("one", "two", "three", "four", "five", "six", "seven")

    numbers.map { item ->
        item.length
    }.filter {
        it > 3
    }.let {
        println(it)
    }
}