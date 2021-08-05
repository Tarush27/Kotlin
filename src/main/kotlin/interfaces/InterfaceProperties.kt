package interfaces

interface InterfaceProperties {
    val a: Int
    val b: String
    get() = "hello"
}