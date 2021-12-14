val nullableVal: String? = null
val name = "John"
var greeting : String? = null

fun main() {
//  greeting = "Hello"
//    val greetingToPrint = if(greeting != null) greeting else "Hi"
    val greetingToPrint =  when(greeting){
        null -> "Hi"
        else -> greeting
    }
//    greeting = "Hello"
//    when(greeting){
//        null -> println("hi")
//        else -> print("greeting")
//    }
    println(greetingToPrint)
    println(name)
}