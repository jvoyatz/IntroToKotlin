fun printFilteredStrings(list:List<String>, predicate: ((String) -> Boolean)?){
    list.forEach {
        if(predicate?.invoke(it) == true){
            println((it))
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

fun getPrintPredicate(): (String) -> Boolean{
    return {it.startsWith("J")}
}
fun main() {
    val list = listOf("koltin", "java", "c++", "bash")

    printFilteredStrings(list) {
        it.startsWith("k")
    }
    printFilteredStrings(list, predicate)
    printFilteredStrings(list,  getPrintPredicate())
    printFilteredStrings(list, null)
}