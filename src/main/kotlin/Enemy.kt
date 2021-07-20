// implemented data class
// parameter less constructor in data classes
// provide default value
data class Enemy(
    var firstName: String = "sf",
    val age: Int = 0,
    val calories: Int
){
    fun printName(): String{
        return firstName
    }
}