/*public */
public class Person(val firstName:String = "Unknown",val lastName:String = "Uknown"){ //3rd way of initializing
//internal means public within the module

    //2nd way of initializing
//    val firstName: String = _firstName
//    val lastName: String = _lastName

    //1st way of initializing
//    init{
//        firstName = _firstName
//        lastName = _lastName
//    }

//    init {
//        println("init 1")
//    }
//    //secondary constructor
//    constructor():this("Unknown", "Uknkown"){
//        println("secondary constructor")
//    }
//
//    init {
//        println("init 2")
//    }

    var nickName: String? = null
      set(value) {
          field = value
          println("the new nickname is $value")
      }
      get() {
          //println("The returned value is $field")
          return field
      }

    fun printInfo(){
      //  val nickName2Print = if(nickName != null) nickName else "no nickname"
        val nickName2Print = nickName ?: "no nickname"
        println("$firstName ($nickName2Print) $lastName")
    }
}