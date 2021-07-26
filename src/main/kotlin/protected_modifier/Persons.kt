

/*
use of protected_modifier in kotlin.
*/
package protected_modifier

open class Persons(var name: String, var age:Int) {
    protected var favoFood: String = "unknown"
    open protected val int = 10
    fun info(){
        println("this person's name is $name and he is $age year's old.")
    }
    fun printMyFavoFood(){
        println(favoFood)
    }
    fun printValue(){
        println(int)
    }
}
class Chef(name: String,age: Int,favFood:String) : Persons(name,age){
    init {
        favoFood = favFood
    }
    fun setMyFavoFood(food: String){
        favoFood = food
    }
    override val int = 20
    fun getValue():Int{
        return int
    }
}