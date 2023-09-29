package with

fun main(args: Array<String>) {
    var person = Person("ec", "0123456", "FPT", 5)
    println(person.displayInfo())

    with(person) {
        println(displayInfo())
        moveAddress("Quan 3 Ho Chi Minh")
        changePhone("08080808")
        println(displayInfo())
    }

    val numbers = mutableListOf("one", "two", "three", "four", "five", "six", "seven")

    with(numbers.map { it.length }.filter { it > 3 }) {
        println(this)
    }
}