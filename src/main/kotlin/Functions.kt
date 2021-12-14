fun main() {
    val list = listOf("kotlin", "java", "c++", "javascript", null, null)

    var map = list
        .filterNotNull()
        .associate {
            it to it.length
        }
    /*.takeLast(3)*/
     /*   .filter {
            it.startsWith("j")
        }
        .map {
            it.length
        }*/
        /*.forEach {
            println("${it.value}, ${it.key}")
        }*/

    val language = list.first()
    println(language)
    var languageLast = list.last()
    println(languageLast)
    languageLast = list.filterNotNull().last()
    println(languageLast)

    val filtered = list.filterNotNull().find { it.startsWith("Java") }.orEmpty()
    println(filtered)
}