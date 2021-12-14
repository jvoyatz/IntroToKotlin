
fun sayHellov1(greeting:String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    val things = arrayOf("kotlin", "program", "vinyls")
    println(things.size)
    println(things[0])
    println(things.get(0))

    println("/////////////////////")
//    for (thing in things){
//        println(thing)
//    }
    things.forEach {thing ->
        println(thing)
    }

    things.forEachIndexed{ index, thing ->
        println("$thing is at index $index")
    }

}