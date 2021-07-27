// override member function using inheritance.
// override data member
// base class contains
// run functions declared with open keyword
open class Janvar {

    open var name = "Lion"
    open fun run(){
        println("animals can run.")
    }
}

//derived class contains same function
// and data member
// which is overrided using
// override keyword.
class Tiger : Janvar() {
    override var name = "Horse"
    override fun run(){
        println("tiger run fast.")
    }
}