class CompanionObjectDemo(var pilotName: String) {

    //companion object
    companion object {
        val pilots = mutableListOf<CompanionObjectDemo>()
        fun createPilots(count:Int): List<CompanionObjectDemo>{
            for (i in 0..count){
                pilots.add(CompanionObjectDemo("Shraddha$i"))
            }
            return pilots
        }
        fun display(pilotName: String): CompanionObjectDemo {
            return CompanionObjectDemo(pilotName)
        }
    }

    fun printName(): String = pilotName
    override fun toString(): String {
        return printName()
    }
}