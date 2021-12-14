interface PersonInfoProvider{
    val providerInfo:String
    fun printInfo(person: Person){
        println("basicInfoProvider")
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId(): String
}

//you can inherit from this class
open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"
//    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}


fun main(){
   // val provider = BasicInfoProvider()
    //val provider = FancyInfoProvider()
    val provider = object : PersonInfoProvider{
        override val providerInfo: String
            get() = "new info provider"

        fun getSessionId() = "id"
    }

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}


fun checkTypes(infoProvider: PersonInfoProvider){
//    if(infoProvider is SessionInfoProvider){
//        println("is a session info provider")
//    }else {
//        println("not a session info provider")
//    }

    //opposite
    if(infoProvider !is SessionInfoProvider){
        println("not a session info provider")
    }else {
        println("is a session info provider")
        //casting
        //no need to re-cast
        //(infoProvider as SessionInfoProvider).getSessionId()
        //smart casting as kotlin provides
        infoProvider.getSessionId()
    }
}