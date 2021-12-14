
fun sayHello(greeting: String, vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson (greeting: String = "Hello", name:String = "unknown")= println("$greeting $name")
fun main() {
    val things = arrayOf("Kotlin", "Program", "Vinyls")
    things.forEach { thing ->
        println("thing $thing")
    }

    //Required:
    //String
    //Found:
    //Array<String>
    //sayHello("hi", things)
    sayHello(itemsToGreet = *things, greeting ="hi")
    //sayHello("Hi", "kotlin", "prog")

    //default parameters
    greetPerson(name = "giannis"/*, greeting = "hi"*/)
    greetPerson()
}