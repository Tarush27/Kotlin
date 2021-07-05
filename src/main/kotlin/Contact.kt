class Contact(var hey: String,var hi:String) {


    constructor(hey: String) : this(hey,"bobby"){
        println("have u studied this type of constructor?")
    }
    // c2 -> this -> pC1 -> init -> printlnOfC2
    // when init and secondary constructor is used then init has the highest priority(it executes first).
    init{
        println("hello worlds")
    }
    init {
        println("hey yous")
    }



}