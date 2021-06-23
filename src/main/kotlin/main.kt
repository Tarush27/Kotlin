fun main(args: Array<String>) {
//    println("Hello World!")

    var name = "Tarush Kaistha"
    println(name)
    name = "Tushar Kaistha"
    println(name::class)
    val newName = "Tushar"
    println(newName)

    val int: Int = 32;
    println(int.and(50))
    println(int.toByte())

    val newInt: Int = int + 15
    println(newInt)
    val myLong: Long = 1_000_000
    println(myLong.toFloat())

    val float: Float = 32.00F
    println(float.toString())

    val a = 10
    println(a.plus(10))
    println("a is $a")

    val pi = 3.14
    println("PI is $pi")

    var fullName: String = "hElLo"
    println(fullName.length)
    println(fullName.lowercase())
    println(fullName.uppercase())

    val c: Char = 'a'
    println(c.isLowerCase())

    var s: String = "yes" + "\t" + "\n" + "no"
    println(s)
    fun printDouble(d: Double) {
        print(d)
    }

    val d = 1.000000000
    printDouble(d)

    var msg: String = "hello \ni am tarush kaistha.\nhow are you"
    println(msg)

    var message: String = """
        Hello I am Tarush
        Hello Hi
    """.trimIndent()
    println(message)
    var input: String = """
        Hello,
        Tarush Kaistha
    """.replaceIndent("-?")
    println(input)
    input = """
        |hi,
        |Abhay Sood
    """.trimMargin()
    println(input)

    input = "abhay"
    println("hello $input. Your name is ${input.length} characters long. $input and tushar are nice cousins.")

    val bca: Boolean = true
    println(bca.not())
    var isBlank: Boolean = false
//    println(isBlank)
//    println(isBlank.not())
    isBlank = "".isBlank()
    println(isBlank)

    println(isBlank.xor(true))

    var calories = 2500
    if (calories > 2000) {
        println("you have consumed all the required calories")
    }
//    calories = 1900
    calories = 2001
    if (calories > 2000) {
        println("you have consumed all cals")
    } else if (calories > 1500) {
        println("you have left with few calories")
    } else {
        println("you have still some calories left")
    }
    calories = 175
    if (calories > 2000) {
        println("you have consumed all cals")
    } else if (calories > 1500) {
        println("you have left with few calories")
    } else {
        println("you have still some calories left")
    }

    // if else in one line
    val age = 9
    if (age > 10) println("age > 10") else if (age > 8) println("age between 8 and 10") else println("age < 10")
    println("hello")

    // truth tables in kotlin using and , or
    val myAge = 32
    val yourAge = 32
    val myName = "Ram"
    val yourName = "Shyam"
    if ((myAge == yourAge) && (myName != yourName) || (myAge == yourName.length)) println("Items true")
    else println("any other items")

    // kotlin structural equality
    var a1 = "Tarush"
    var a2 = "Tushar"

    a1 = "Tarush"
    a2 = "Tarush"

    println(a1 != a2)

    a1 = "Donn"
    a2 = "Felker"
    println(a1 != a2)

    // referential equality
    var st = Person("Tushar")
    var b = Person("Tushar")
    // number, chars, booleans have their own memory representation and at runtime
    // become primitives but are classes to ordinary users
    println(st !== b)
    val st1 = "jakgud"
    val b1 = "safisof"

    // nullable types in kotlin

//    var str1: String = "Donn"
//    str1 = null;
    var str1: String? = "Donn"
    str1 = null

    var age1: Int? = 12
    age1 = null

//    var age2 = Age(12)
//    age2 = null
    var age2: Age? = Age(12)
    age2 = null

    // nullable safe calls
    var fName: String = "Donn"
    val length = fName.length

    var lName: String? = "Felker"
    val length2 = lName?.length  // null,6
    println(length2)

//    var length3 = if (lName != null) lName.length else 0 // 6,null
//    println(length3)

    // combine nullable safe calls
    var length4 = lName?.substring(0, 2)?.length
    println(length4)

    var length5 = lName?.substring(0, 5)?.drop(2)?.subSequence(2, 3)?.length
    println(length5)

    //elvis operator
    var lastName: String? = "Tushar"
    var length6: Int = lastName?.length ?: 0
    val length3 = lastName?.substring(0, 2)?.length ?: 0
    println(length3)

    // calling hello world function
    helloWorld()

    //return values from a function in kotlin
    var x = sayHi()
    println(x)
    var y = sayHi()
    var z = sayHi()
    var n = sayHi()
    println(y)
    println(z)
    println(n)

    hello()

    there()

    val age123 = 32

    fun doWork() = if (age123 < 21) println("not eligible") else println("eligible")
    doWork()

    bye(5,"tarush",true)
    bye(5,"tushar",false)
    bye(5,"atul",true)

    printUserInfo(likesMovies = true,Name = "Tarush", Age = 21) // named params -> not imp to maintain order
}

class Person(var name: String)
class Age(val age: Int)

// creating helloWorld function
fun helloWorld() {
    println("hello world")
    moo()
    println("hello there")
    // calling of moo function from hello world function
    moo()
}

//creating moo function
fun moo() {
    println("Moo")
}

// hi fun created
fun sayHi(): Int {
    return 25
}

//created hello function
fun hello() {
    println("hi")


    fun hey() {
        println("hey")  // this fun can't be called in the main fun
        fun meow() {
            println("cat")
        }
        meow()      // since scope of this fun is under hello fun.
    }                           // only called inside the hello fun only

    hey()

}

// single line expressions fun in kotlin
//created there fun
// replacement of parans with equal sign
fun there() = println("there")

// created parametrized function
fun bye(i: Int,i1: String,isHappy: Boolean) {
    println("you are $i and your name is $i1 and your family is not $isHappy")
}

// using named params in kotlin function's
// creating user info function
fun printUserInfo(Name: String, Age: Int, likesMovies: Boolean){
    println("$Name is of age $Age and does he likes movies $likesMovies")
}