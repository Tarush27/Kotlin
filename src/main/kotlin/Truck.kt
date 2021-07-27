/*
use of internal modifier in kotlin.
*/
internal class Axle(val numberOfWheels: Int){
    //...
}
open class Truck(var color: String) {
    private lateinit var axles: MutableList<Axle>
    fun info(){
        println("This truck is $color")
    }

    fun addAxel(numberOfWheels: Int){
        axles.add(Axle(numberOfWheels))
    }
}
class AshokLeyLand(color: String) : Truck(color){
}
