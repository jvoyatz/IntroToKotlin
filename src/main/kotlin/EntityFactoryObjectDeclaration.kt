import java.util.*

enum class EntityType{
   HELP,  EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactoryObjectDeclaration{
   // fun create() = Entity2("id", "name")

    fun create(type: EntityType): Entity2{
        var id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "hard"
            EntityType.HELP -> "help"
        }
        return Entity2(id, name)
    }
}
class Entity2(val id: String, val name: String){
    override fun toString(): String {
        return "id:$id name: $name"
    }
}

fun main() {
    val entity = EntityFactoryObjectDeclaration.create(EntityType.EASY)
    println(entity)

    val medianEntity = EntityFactoryObjectDeclaration.create(EntityType.MEDIUM)
    println(medianEntity)
}