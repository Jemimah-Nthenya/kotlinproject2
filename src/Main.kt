fun main(){
val people=People("Ken",7903564,"0114567435")
    println(people.name)
    println(people.id)
    println(people.phoneNumber)

val myPeople=People("Jane",7377665,"0712632961")
    println(myPeople.name)
    println(myPeople.id)
    println(myPeople.phoneNumber)

val person=People("Maryam",5762526,"0764783857")
    println(person.name)
    println(person.id)
    println(person.phoneNumber)

val person2=People("Mary",6573412,"0110572835")
    println(people.name)
    println(people.id)
    println(people.phoneNumber)
}
open class People(var name:String, var id:Int, var phoneNumber:String){}









