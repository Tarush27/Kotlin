package interfaces

class Result() : FindParams {
    override fun area() {
        println("area is ${length * width}")
    }

    override fun perimeter() {
        println("perimeter is ${2*(length + width)}")
    }

    override val length: Double
        get() = 10.0
    override val width: Double
        get() = 20.0
}