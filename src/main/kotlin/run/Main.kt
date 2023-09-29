package run

fun main(args: Array<String>) {
    var person = Person("ec", "0123456", "FPT", 5)
    println(person.displayInfo())

    person.run {
        println(this.displayInfo())
        moveAddress("Ho Chi Minh city")
        changePhone("99070000000")
        println(displayInfo())
    }

    val numbers = mutableListOf("one", "two", "three", "four", "five", "six", "seven")

    numbers.map { item ->
        item.length
    }.filter {
        it > 3
    }.run {
        println(this)
    }
}