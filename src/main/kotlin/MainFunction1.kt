
//fun sayHello(itemToGreet: String){
//    //val msg = "Hello " + itemToGreet //use string template instead
//    //val msg = "Hello $itemToGreet"
//    println("Hello $itemToGreet")
//}

fun sayHello(greeting:String, itemToGreet: String) = println("$greeting $itemToGreet")
fun main() {
    sayHello("Hey","Kotlin")
    sayHello("Hello", "World")
}