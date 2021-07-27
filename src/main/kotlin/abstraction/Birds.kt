package abstraction

abstract class Birds(var color: String) {
    abstract fun eat()
}

class Pigeon(color: String) : Birds(color) {
    override fun eat() {

    }
}

abstract class Owl(color: String) : Birds(color) {
    abstract fun fly()
}

class Hen() : Owl("red"){
    override fun fly() {
        println("owls like to fly and hen feel jealous.")
    }

    override fun eat() {
        println("owls like to eat $color hens which like red meat")
    }

}

class Ostrich(color: String) : Owl(color) {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }
}