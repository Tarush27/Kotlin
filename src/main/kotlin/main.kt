import protected_modifier.Chef
import protected_modifier.Persons

const val CHEAP_PRICE = 25000

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

    bye(5, "tarush", true)
    bye(5, "tushar", false)
    bye(5, "atul", true)

    printUserInfo(likesMovies = false, Name = "Tarush") // named params -> not imp to maintain order
    printUserInfo(Name = "Abhay", Age = 30) // named params -> not imp to maintain order
    printUserInfo(Name = "Tushar", Age = 21) // named params -> not imp to maintain order
    printUserInfo(Age = 36, Name = "Anu") // named params -> not imp to maintain order
    disp("pens", 25, 33, 258, 450)

    val dost = User("car", "white", true)
    /*  dost.printFullName()
      dost.updateName("Tushar")
      dost.printFullName()
      dost.printFnLength()
      dost.printPrefix("Mr")*/


    val yar = User("tarush", "kaistha")
//    yar.printFullName()

    val dosti = User("Soni")

    var cousin = Contact("Sonia", "Gandhi")

    var bro = Contact("ajay")

    var sis = Info("developer", 64)
    println(sis.goal)
    sis.goal = 32.toString()
    println(sis.goal)
    println(sis.goalMotive)

    var hosp = Hospital("Preeti", "Honey")
    println(hosp.roomName)
    hosp.roomName = "Purvi"
    println(hosp.roomName)
    hosp.roomName = "Abhilasha"
    println(hosp.roomName)
    hosp.nurse = "Jaya"
    println(hosp.nurse)
    hosp.nurse = "Jacki"
    println(hosp.nurse)
    hosp.roomName = "Female CKT Team"
    println(hosp.roomName)
    hosp.patient = "Abdul"
    println(hosp.patient)
    hosp.floorNo = 2
    println("Floor No :${hosp.floorNo}")
    hosp.wardNo = 4
    println("Ward No :${hosp.wardNo}")
    println(hosp.showDetails())
    var medicalInfo = Hospital("Pooja", "Nihal")
    println(medicalInfo.showDetails())
    var history = Hospital("Ananya", "Tarush")
    println(history.updateDetailsWithSuffix("Thakur"))
    println(history.nurseName)

//    val yaari = Contact("foo","bar")
//    println(yaari.createContact)

    val hyena = CompanionObjectDemo.display("Anshika")
    println(hyena)

    val silky = CompanionObjectDemo.createPilots(6)
    val silk = CompanionObjectDemo.createPilots(0)
//    println(silk)

//    CompanionObjectDemo.createPilots(8)
//    val kaistha = CompanionObjectDemo.pilots    // works as a singleton object
//    println(kaistha)

    // only single instance of the class FavFood
    FavFood.name = "Tomatoe"
    println(FavFood.name)
    println(FavFood.length())
    FavFood.ingredients.add("Salt")
    println(FavFood.length())
    println(FavFood.ingredients.first())
    doStuff()
    println(FavFood.name)
//    println(FavFood.ingredients.first())
    println(FavFood.ingredients.firstOrNull())

    var iot = Mobile("Redmi", "Note Five Pro", AccType.SILVER) // value of enum passes
    println(iot.MAX_PRICE)
    println(Mobile.max_price)
    println(iot.accType)  // enum printed
    // created a class that contains various constants but that class acts as a singleton.
    println(Constants.AVG_PRICE)

    println(CHEAP_PRICE)

    iot.favCity = "New York"
    iot.favCity = ":"
    iot.favColor = "BLUE"
    println(iot.toString())


    val transmission = Vehicle.Transmission()
    transmission.shift()
    transmission.shift()
    transmission.shift()

    val vehicle = Vehicle()
    vehicle.brand = "Alto K10"
    vehicle.print()
    vehicle.print()
    vehicle.print()

    val sw = vehicle.SteeringWheel()
    sw.info()

    val accTypeFromApi = "gold"
    val accType = AccType.valueOf(accTypeFromApi.uppercase())
    println(accType)
    println(AccType.SILVER)
    println(accType == AccType.SILVER)

    println(AccType.SILVER.discountPercent)
    println(AccType.SILVER.subscription)
    println(AccType.SILVER.discountPercent)

    val ac = AccType.valueOf("Bronze".uppercase())
    println(ac.subscription)
    println(ac.discountPercent)

    println(AT.bronze.findDiscount())

    val ac2 = AT.valueOf("silver")
    println(ac2.findDiscount())

    for (accountType in AccType.values()) {
        println("${accountType.discountPercent}$accountType")
    }
    // how to iterate over values in kotlin enums using for & for each loop
    // values method returns an array of values
    // built in method in collections.
    AccType.values().forEach { println(it) }

    println(AT.getAccount("gold"))

    var users = User("tarush", "kaisth")

    // use of when expression
    when {
        users.fn == "tarush" || users.ln == "kaistha" -> println("Hi this is tarush")
//        "tarus" -> { println("Hi this is tarush")}
        else -> println("this is not tarush")
    }


    // non exhaustive when statement
    // when as a statement with or w/o else
    when (AT.gold) {
        AT.gold -> println("gold member")
    }

    // exhaustive when statement
    // when as an expression
    var ati = AT.bronze

    val acp = when (ati) {
        AT.bronze -> "bronze"
        AT.platinum -> "platinum"
        AT.gold -> "gold member"
        else -> "regular"
    }
    println(acp)

    // initialize data class
    val en = Enemy(age = 10,firstName = "tarush",calories = 80)
    val en1 = Enemy("abc", 10, 14)
    // params passed in the constructor
    // are being considered as components
    // to the kotlin compiler
    println(en.component1())
    println(en.component2())
    println(en.component3())
    println(en.equals(en1)) // prints true
    println(en)
    println(en1)
    println(en.printName())
    val en_2 = Enemy(calories = 10)
    println(en_2)

    // destructuring in kotlin
    val animal = Animal("german shepherd","jimmy")
    val (theAnimalName,animalBreed) = animal
    println(animalBreed)
    println(theAnimalName)

    // copy method of data class
    val animals = animal.copy("husky")
    println(animals)
    val animals1 = animals.copy()
    println(animals1)

    val order = Order(amt = 100,customer = animals1)
    println(order)

    val newOrder = order.copy(200,animals)
    println(newOrder)

    /*
     inbuilt data classes in kotlin
    */
    // pair data class
    val pair = 10 to 20
    println(pair.first)
    println(pair.second)
    // triple data class
    val three = Triple(1,2,3)
    println(three.first)
    println(three.second)
    println(three.third)

    var person1 = Persons("Tarush",26)
    person1.printMyFavoFood()
    val chef = Chef("Tushar",25,"chicken")
    chef.printMyFavoFood()
    chef.setMyFavoFood("Lobster")
    chef.printMyFavoFood()
    chef.getValue()
    person1.printValue()
}

fun doStuff() {
    FavFood.name = "Fish"
    FavFood.ingredients.clear()
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
fun bye(i: Int, i1: String, isHappy: Boolean) {
    println("you are $i and your name is $i1 and your family is not $isHappy")

}

// using named params in kotlin function's
// creating user info function
// using default values of the args
fun printUserInfo(Name: String = "Rikky", Age: Int = 85, likesMovies: Boolean = true) {
    println("$Name is of age $Age and does he likes movies $likesMovies")
}

//multi args of same type using vararg
//created disp fun
fun disp(title: String, vararg prices: Int) {
    println("$title and Prices : ")
    prices.forEach { println(it) } // it-> object of iterator
}

data class Order(val amt: Int, val customer: Animal)
