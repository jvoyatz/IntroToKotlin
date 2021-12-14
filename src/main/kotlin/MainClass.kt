fun main() {
    var person = Person("John", "Voyatzis")
    println("${person.firstName}  ${person.lastName}")
    person.printInfo()
    person.nickName= "Voyas"
    println(person.nickName)
    person.printInfo()

    val person2 = Person()
    println("${person2.firstName}  ${person2.lastName}")
}