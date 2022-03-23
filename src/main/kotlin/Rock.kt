class Rock(name: String, age: Int) {
     var isOlderThanMe = false
     val myAge = 25

    init {
        isOlderThanMe = age > myAge
        println("$isOlderThanMe")
    }
}