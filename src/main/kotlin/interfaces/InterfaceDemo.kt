package interfaces

class InterfaceDemo : FirstInterface {
    override fun add(a: Int, b: Int) {
        val x = a + b
        println("$x")

    }

    override fun show() {
        super.show()
        println("what to show")
    }
}