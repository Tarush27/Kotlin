/* inheritance using secondary constructor*/

// base class
open class Employee {
    constructor(name: String, age: Int) {
        println(name)
        println(age)
    }
}

// derived class
class CEO : Employee {
    constructor(name: String, age: Int, salary: Double) : super(name, age) {
        println(salary)
    }


}