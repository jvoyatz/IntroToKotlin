
//fun getGreeting(): String?{
//    //return "Hello Kotlin"
//    return null
//}
fun getGreeting() = "Hello Kotlin"

//The type with only one value: the Unit object. This type corresponds to the void type in Java.
fun sayHello()/*: Unit*/{
    println(getGreeting())
}
fun main() {
    println(getGreeting())
    sayHello()
}