
// use of super
// keyword in inheritance.
open class Phone {
    var color = "Blue"
    fun dispName(name: String) {
        println("company is $name")
    }
}

class iPhone : Phone() {
    fun dispColor() {
        println("Color is :" + super.color)
        super.dispName("Apple")
    }

}