class FancyInfoProvider: BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("FancyInfo")
    }
}