fun main() {
    //val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map[4] = "d"
    map.forEach { (key, value) ->  println("$key -> $value") }


    //immutable
    val things = mutableListOf("Kotlin", "Program", "Vinyls")
    //things.add()// not provided
    //here comes the fun mutableListOf
    things.add("mutable list")

}