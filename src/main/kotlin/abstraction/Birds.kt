package abstraction

abstract class Birds(var color: String) {
    abstract fun eat()
    abstract fun stop()
}

class Pigeon(color: String) : Birds(color) {
    override fun eat() {
        println("Pigeon like to eat")
    }

    override fun stop() {
        TODO("Not yet implemented")
        eat()
    }
}

abstract class Owl(color: String) : Birds(color) {
    override fun stop() {
        TODO("Not yet implemented")
    }

    abstract fun fly()
}

class Hen() : Owl("red") {
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

// inheritance of non-abstract class
// using an abstract class.
open class Crow {
    open fun sing() {
        println("crow sings")
    }
}

abstract class Parrot() : Crow() {
    abstract override fun sing()
}

class Peacock() : Parrot() {
    override fun sing() {
        println("peacock like to sing")
    }

}