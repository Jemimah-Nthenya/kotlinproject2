fun main() {
    val contacts= Contacts(9808762,"Janet","0114556672")
    println(contacts.id)
}
data class Contacts(
        var id: Int? = null,
        var name: String,
        var number: String
)






