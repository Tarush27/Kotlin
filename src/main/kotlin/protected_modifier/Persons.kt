

/*
 -> use of protected_modifier in kotlin.
 -> use of protected_modifier with functions in kotlin.
*/
package protected_modifier

open class Persons(var name: String, var age:Int) {
    protected open val int = 10
    fun info(){
        println("this person's name is $name and he is $age year's old.")
    }
    fun printValue(){
        println(int)
    }
}
class Chef(name: String,age: Int,var favoFood:String) : Persons(name,age){
    protected fun printMyFavoFood(){
        println(favoFood)
    }

    init{
        println(favoFood)
    }
    fun setMyFavoFood(food: String){
        favoFood = food
        printMyFavoFood()
    }
    override val int = 20
    fun getValue():Int{
        return int
    }
}