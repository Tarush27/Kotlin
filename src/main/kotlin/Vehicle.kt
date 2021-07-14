/*
Nested Classes in Kotlin.
*/

// outer class vehicle
class Vehicle {
    var brand: String = "idk"
    fun print() = println(brand)

    // nested class steering wheel
    inner class SteeringWheel {
        // now steering wheel is an inner class
        var name: String = "Leather"
        // here brand is not accessible
        // since nested classes are not eligible
        // to access the member variables of
        // outer class

        // now steering wheel can access
        // the member variables of vehicle class
        fun info() = println("$brand is the brand name with a $name steering wheel")
    }

    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle is shifted")
    }
}