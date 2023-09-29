package apply

/**
 * @author namvh
 */
class Person(
    var name: String = "",
    var phone: String = "",
    var address: String = "",
    var age: Int = 0
) {
    fun moveAddress(address: String) {
        this.address = address
    }

    fun changePhone(phone: String) {
        this.phone = phone
    }

    fun displayInfo(): String {
        return "Name: $name, phone: $phone, address: $address, age: $age"
    }
}