//creating class in kotlin
class User(var fn: String,var ln: String,isPlayer: Boolean)   // primary constructor
{
    // initializer blocks in kotlin

    constructor(fn: String,ln: String) : this(fn,ln,true)   // secondary constructor
    {
        println("2nd")
    }
                                                            // c10 -> fn -> this -> c5 -> this -> pC2
    constructor(fn: String) : this(fn,"mehra"){
        println("3rd")
       println(fn.length)
    }

    fun printFullName(): String = "$fn $ln"

    fun printPrefix(prefix: String){
        println("$prefix $ln")
    }
    fun updateName(newName: String){
        fn = newName
    }

    fun printFnLength(){
        println(fn.length)
    }
    override fun toString():String{
        val fullName = printFullName()
        return fullName
    }

}