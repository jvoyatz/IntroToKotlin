import java.util.*

object EntityFactory2{
    // fun create() = Entity2("id", "name")

    fun create(type: EntityType): SealedEntity{
        var id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "hard"
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type){
            EntityType.EASY -> SealedEntity.Easy(id, name)
            EntityType.MEDIUM -> SealedEntity.Medium(id, name)
            EntityType.HARD -> SealedEntity.Hard(id, name, 2f)
            EntityType.HELP -> SealedEntity.Help
        }
    }
}

sealed class SealedEntity(){
    object Help: SealedEntity(){
        val name = "Help"
    }

    data class Easy(val id: String, val name: String): SealedEntity(){
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val id: String, val name: String): SealedEntity()
    data class Hard(val id: String, val name: String, val multiplier:Float): SealedEntity()
}

//ext function
fun SealedEntity.Medium.printInfo(){
    println("medium class : $id")
}

val SealedEntity.Medium.info: String
  get() = "someinfo"

fun main() {
   // val entity:SealedEntity = EntityFactory2.create(EntityType.EASY)
    val entity = SealedEntity.Easy("id", "name")
//    val msg = when(entity){
//        is SealedEntity.Easy -> "easy class"
//        is SealedEntity.Hard -> "Hard class"
//        is SealedEntity.Medium -> "medium class"
//        SealedEntity.Help -> "hel clsas"
//        else -> "non"
//    }
//    println(msg)

 //   val entity2 = EntityFactory2.create(EntityType.EASY)
    //val entity2 = SealedEntity.Easy("id", "name")
    //val entity2 = entity.copy(name = "new name")
    val entity2 = SealedEntity.Easy("id", "name")
    if(entity === entity){
        println("equal")
    }else{
        println("non equal")
    }

    SealedEntity.Medium("id", " name").printInfo()
    val medEntity = EntityFactory2.create(EntityType.MEDIUM)
    if(medEntity is SealedEntity.Medium){
        medEntity.printInfo()
        medEntity.info
    }

}