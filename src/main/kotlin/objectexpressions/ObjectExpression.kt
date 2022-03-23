package objectexpressions

class ObjectExpression {
    val helloWorld = object : A {
        val a = 1
        val b = 2
        override fun a1() {
            val b1 = 3
            val b2 = 4
            println(" $b1 $b2")
        }

        override fun toString() = "$a $b"
    }
}

interface A {
    fun a1()
}