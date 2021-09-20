import StringExtensions.initials
import StringExtensions.isAdult
import abstraction.*
import classes.Employee
import classes.JuniorDev
import classes.Manager
import classes.SeniorDev
import interfaces.*
import protected_modifier.Chef
import protected_modifier.Persons
import java.lang.Math.PI
import java.lang.Thread.sleep
import java.util.concurrent.TimeUnit
import kotlin.random.Random
import kotlin.system.measureNanoTime

typealias AuthToken = String

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
    val en = Enemy(age = 10, firstName = "tarush", calories = 80)
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
    val animal = Animal("german shepherd", "jimmy")
    val (theAnimalName, animalBreed) = animal
    println(animalBreed)
    println(theAnimalName)

    // copy method of data class
    val animals = animal.copy("husky")
    println(animals)
    val animals1 = animals.copy()
    println(animals1)

    val order = Order(amt = 100, customer = animals1)
    println(order)

    val newOrder = order.copy(200, animals)
    println(newOrder)

    /*
     inbuilt data classes in kotlin
    */
    // pair data class
    val pair = 10 to 20
    println(pair.first)
    println(pair.second)
    // triple data class
    val three = Triple(1, 2, 3)
    println(three.first)
    println(three.second)
    println(three.third)

    var person1 = Persons("Tarush", 26)
//    person1.printMyFavoFood()
    val chef = Chef("Tushar", 25, "chicken")
//    chef.printMyFavoFood()
    chef.setMyFavoFood("Lobster")
//    chef.printMyFavoFood()
    chef.getValue()
    person1.printValue()
    chef.setMyFavoFood("aloo")

    /*
    var trucks = Truck("Blue")
    trucks.addAxel(5)
    var ashok = AshokLeyLand("Red")
    ashok.addAxel(2)
    */

    CEO(name = "tarush", salary = 250.00, age = 25)
    val tiger = Tiger()
    tiger.run()
    println(tiger.name)
    val iphone = iPhone()
    iphone.dispColor()

    val hen = Hen()
    hen.eat()
    hen.fly()

    val crow = Crow()
    crow.sing()
    val pcock = Peacock()
    pcock.sing()

    // made object of pigeon class
    // in which eat() is called.
    val pigeon = Pigeon(color = "green")
    taru(pigeon)

    val fs = getFileSystem()
    println(fs.readDir())
    println(fs.readFile())

    var btn = Button()
    btn.clickListener = MyListener()   // concrete implementation
    btn.click()

    /*
    anonymous Interface.
    */
    val bt = Button()
    bt.setListener(object : OnClickListener {
        override fun onClick() {
            println("again clicked!!!")
        }
    })
    bt.clickListener = object : OnClickListener {
        override fun onClick() {
            println("already clicked")
        }

    }
    bt.click()
    val interfaceDemo = InterfaceDemo()
    interfaceDemo.add(5)
    interfaceDemo.show()

    val propDemo = PropDemo()
    println(propDemo.a)
    println(propDemo.b)

    val result = Result()
    result.area()
    result.perimeter()

    // array in kotlin.
    val items = charArrayOf('a', 'b', 'c')
    items.forEach { println(it) }
    for (i in 0..items.size - 1) {
        println(items[i])
    }
    // array of objects.
    val cse = arrayOf(User("Tarush", "Kumar"), User("Tushar", "Kaistha"))
    cse.forEach { println(it) }
    // add new user using
    // array of objects.
    val ooty = cse.plus(User("Abhay", "Sood"))
    ooty.forEach { println(it) }
    val ertiga = cse[0]
    println(ertiga)
    cse[0] = User("Anchal", "Sood")
    val alto = cse[0]
    println(alto)
    // using array constructor.
    val arrayName = Array(5) { i -> i * 1 }
    // traversing in arrays in kotlin.
    for (i in 0..arrayName.size - 1) {
        println(arrayName[i])
    }
    for (i in arrayName.indices) {
        println(arrayName[i])
    }
//    for (i in arrayName.withIndex()){
//        println(arrayName[i])
//    }
    for (i in 1..5 step 2) {
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1 step 4) {
        println(i)
    }

    // list in kotlin.
    // immutable list.
    // through list-of,
    // can't add elements in list.
    val jaguar = listOf(1.0, 2.0, 3.0, 4.0)
    jaguar.forEach { println(it) }

    val i10 = listOf(User("Tarush", "Kaistha"), User("Tushar", "Kaistha"))
    i10.forEach { println(it) }
    println(i10.size)
    for (i in i10.indices) {
        println(i10[i])
    }

    // returns first element in the list.
    val first = i10.first()
    println(first.fn)

    // returns last element in the list.
    val last = i10.last()
    println(last)

    // returns first element or null
    // if list is empty.
    val firstOrNull = i10.firstOrNull()
    println(firstOrNull)

    // empty list returns read only list.
    // size = 0
    val odi: String? = null
    val bugati = if (odi == null) emptyList() else listOf(odi)
    println(bugati.isEmpty())

    // returns index of element in list.
    println(jaguar.indexOf(1.0))

    //returns the index of the last element in list.
    println(jaguar.lastIndexOf(-1.0))

    // also returns the index of the last element in list.
    println(jaguar.lastIndex)

    // sorting of the immutable list
    // ascending order and descending order.
    val list = listOf(5, 6, 8, 2, 4, 3, 7, 1)
    println(list.sorted())
    println(list.sortedDescending())

    // mutable lists.
    val chd = mutableListOf(1, 2, 3, 4, 5)
    chd.forEach { println(it) }

    println("----")

    chd.add(6) // new element added.

    chd.forEach { println(it) }

    chd.remove(2)  // element removed.

    println("----")

    chd.forEach { println(it) }

    chd.removeAt(3)  // element removed at index.
    println("----")

    chd.forEach { println(it) }

    println("----")

    // mutable list of objects.
    val user2068 = User("Tarush", "Kaistha")
    val mercury = mutableListOf(
        user2068,
        User("Tushar", "Kaistha"),
        User("Anchal", "Kaistha")
    )
    mercury.forEach { println(it) }
//    mercury.removeAt(1)
//    mercury.removeAt(1)

    println("----")
    mercury.forEach { println(it) }
    mercury[1] = User("Abhay", "Sood")  // setting the new value in the list.
    println("----")
    mercury.forEach { println(it) }
    println("----")
    println(mercury[0]) // getting value in the list.

    //filter list in kotlin.
    val filterList: List<String> = listOf("hi", "hello", "bye", "hiya", "heena", "hyna")
    val filteredList = filterList.filter { it != "hello" }
    val listFiltered = filterList.filter { it.contains("h") }
    println(filteredList)
    println(listFiltered)
    val filterAges = listOf(23, 33, 12, 9, 17, 19, 99)
    val adults = filterAges.filter(::isAdult)  // passing method reference.
    println(adults)

    // find items in list.
    val newList: List<String> = listOf("Donn", "Tushar", "Tarush", "Pooja", "Meyanka", "Taru")
    val newResult: String? = newList.find { it == "Pooja" }
    println(newResult?.length)
    println("----")
    val newResult1: String = newList.first { it == "Pooja" }
    println(newResult1.length)
    println("----")
//    val nR2:String = newList.first { it == "foobar"}
//    println(nR2)
    val hiResult: String? = newList.firstOrNull { it == "donn" }
    println(hiResult?.length)
    println("----")
    val newResult3: String = newList.first { it.contains("Taru") }
    println(newResult3)
    println("----")
    val newResult4: String = newList.last { it.contains("Taru") }
    println(newResult4)
    println("----")
    val newResult5: Int = newList.indexOfLast { it.contains("nsakfh") }
    println(newResult5)
    println("----")
    val hiResults: String? = newList.lastOrNull { it == "Taru" }
    println(hiResults?.length)
    println(hiResults)

    // use filter not in list.
    println("----")
    val notFilter = newList.filterNot { it == "Tushar" }
    println(notFilter)

    // creating new list from existing list.
    val newMutableList: MutableList<String> = mutableListOf("Pushpinder", "Parul")
    // appends the new elements at the end of the list.
    newList.filterTo(newMutableList) { it.contains("a") }
    // doesnt include any new element.
    newList.filterNotTo(newMutableList) { it == "Tarush" }
    println(newMutableList)
    println("----")
    //flatten a list in an array in kotlin.
    val mine: List<String> = listOf("Apples", "Grapes")
    val theirs: List<String> = listOf("Ape", "Guava")
    val others: List<String> = listOf("Pineapple", "Kiwi")
    val allOfUs: List<List<String>> = listOf(mine, theirs, others)
    println(allOfUs)
    println("----")
    println(allOfUs.flatten())
    println("----")
    val mineArray: Array<String> = arrayOf("Apples", "Grapes")
    val theirsArray: Array<String> = arrayOf("Ape", "Guava")
    val othersArray: Array<String> = arrayOf("Pineapple", "Kiwi")
    val allArrays: Array<Array<String>> = arrayOf(mineArray, theirsArray, othersArray)
    println(allArrays)
    println("----")
    println(allArrays.flatten())
    println("----")

    // combine multiple immutable list in kotlin.
    val finalList: List<String> = mine.plus(theirs).plus(others)
    println(finalList)
    println("----")
    println(finalList.minus(others))
    println(finalList.minus("Ape"))

    // use of map operator in kotlin list.
    val abbreviations = newList.map { it.substring(0, 3).uppercase() }.reversed()
    println("----")
    println(abbreviations)
    println("----")
    val abbreviation = newList.map { "BAR" }
    println(abbreviation)
    val newAbr = newList.map {
        val words = it.split(' ')
        words[0].substring(0, 1)
    }
    println("----")
    println(newAbr)

    // created list of objects.
    val people = listOf(
        People("Tushar"),
        People("Honey"),
        People("Ajay"),
    )
    println("----")
    // map function in list of objects.
    val newPeople = people.map { it.name_2068.lowercase() }
    println(newPeople)

    // map vs flat map
    val groceryBag = listOf(
        ShoppingBag(listOf("Grapes", "Apples", "Oranges")),
        ShoppingBag(listOf("Milk", "Eggs", "Paste")),
        ShoppingBag(listOf("Bread", "Naan", "Cake"))
    )

    val retailBag = listOf(
        ShoppingBag(listOf("Shirts", "Pants", "Trousers")),
        ShoppingBag(listOf("Sox", "Shoes")),
        ShoppingBag(listOf("Jacket", "Sweater", "Scarf"))
    )
    println("---")
    println(retailBag.map { it.itemsBag })
    println("----")
    // flatMap returns a brand-new single list
    println(groceryBag.flatMap { it.itemsBag })

    // kotlin set data structure.
    println("----")
    // creating immutable set.
    val initialSet = setOf("Donn", "Tushar", "Tarush", "Tarush")
    println(initialSet)
    println("----")
    // creating mutable set.
    val marazoSet = mutableSetOf("Tushar", "Tarush", "Abhay", "Anchal")
    println(marazoSet)
    println("----")
    marazoSet.add("Jane")  // added new element in the set.
    println(marazoSet.size)
    println(marazoSet.isEmpty())  // check if the set is empty or not.

    marazoSet += mutableListOf("Anu")
    println(marazoSet)
    println("----")
    // set of objects.
    val setOfPeople = setOf(
        People("Param"),
        People("Param"),
        People("Palak")
    )
    println(setOfPeople)

    val newCollections = initialSet.containsAll(setOf("Donn"))
    println("----")
    println(newCollections)

    /*
    loops in kotlin
    */

    // for loop
    val values = listOf(1, 2, 3, 4, 5, 6, 7)
    for (i in values) {
        println(i)
    }
    println("----")
    for (j in 0 until 10 step 2) {
        println(j)
    }
    println("----")
    val gentle = listOf(
        People("gausf"),
        People("djyt"),
        People("uwehcehu")
    )

    for (b in gentle) {
        println(b)
    }

    println("----")
    // while loop in kotlin
    var g = 0
    while (g < 10) {
        println(g)
        g++
    }

    val xuv = listOf("tarush", "tushar", "karthik")
    var e = 0
    while (e < xuv.size) {
        println(xuv[e])
        e++
    }

    // kotlin union operator.
    val people_2 = listOf(
        People("Honey"),
        People("Dolphy"),
        People("Varun"),
        People("Nidhi")
    )

    val people_3 = listOf(
        People("Honey"),
        People("Purvi"),
        People("Vikas"),
        People("Akshay")
    )

    val distinctValues = people_2.union(people_3).union(listOf(People("Money")))
    println(distinctValues)

    // forEachIndex in kotlin.
    // returns the index of the element simultaneously.
    people_3.forEachIndexed { index, people ->
        println("Index : $index , People : $people")
    }

    // range in kotlin.
    val q = 5
    if (q in 1..20) {
        println("yes")
    } else {
        println("no")
    }

    // map in kotlin.
    val states = mapOf(         // -> immutable map
        "NY" to "New York",
        "CA" to "California",
        "IND" to "India"
    )
    // prints the default value if the key is not present.
    val resultState: String = states.getOrDefault("NEYY", "welcome to new york")
    println(resultState)

    println("----")
    // prints the value of default value function.
    val resultStates = states.getOrElse("CAI") { "BAR" }
    println(resultStates)
    // returns boolean value.
    val noState = states.containsKey("IND")
    println(noState)
    val noValue = states.containsValue("India")
    println(noValue)
    // returns a read only set containing key-value pairs.
    val newEntries = states.values
    println(newEntries)
    // returns the length of immutable map.
    val numberOfEntries = states.count()
    println(numberOfEntries)
    // empty map.
    val emptyMap = mapOf<String, Int>()
    println(emptyMap)
    println(emptyMap.entries)
    println(emptyMap.keys)
    println(emptyMap.values)

    // mutable maps in kotlin.
    var mutableMap = mutableMapOf(
        "BT" to "Bluetooth",
        "WA" to "Whatsapp",
        "FB" to "Facebook"
    )

    // printing the map.
    println(mutableMap)

    // inserting the element in the map.
    mutableMap.put("AS", "Adobe Scanner")
    println("----")
    println(mutableMap)
    println("----")
    // removing the element in the map.
    mutableMap.remove("WA")
    println(mutableMap)
    println("----")
    mutableMap.put("BT", "Boston")
    println(mutableMap)
    println("----")
    mutableMap.putIfAbsent("JK", "Jammu Kashmir")
    println(mutableMap)
    mutableMap.put("JK", "J&K")
    println(mutableMap)
    // only removes the value
    // if the key is not present.
    // otherwise not.
    mutableMap.remove("FB", "FooBar")
    println(mutableMap)

    // inserts the value.
    // if it's not present.
    mutableMap.getOrPut("AUS") { "Australia" }
    println(mutableMap)

    // filter and transform
    // maps in kotlin.
    val newMap = mutableMapOf(
        "NY" to "New York",
        "SA" to "South Africa",
        "IND" to "India",
        "FL" to "Florida",
        "CH" to "Chicago"
    )
    // filter map
    // filter keys
    val newBrandMap = newMap.filter { it.key.contains("A") }
    println(newBrandMap)
    // applied map and filter values function.
    val nayaMap = newMap.filterValues { it.lowercase().contains("a") }
        .map { it.value.substring(0, 3) }
    println(nayaMap)

    // map vs map key and map values.
    val orgMap = newMap.mapKeys { it.key.length }
    println(orgMap)

    val orMap = newMap.mapValues { it.value.length }
    println(orMap)

    // remove null items from a kotlin map.
    // mapNotNull.
    val newRacer: List<Map.Entry<String, String>?> = newMap.mapNotNull(::findValueInWebService)
    println(newRacer)

    // generate large sequences & list
    // generateSequence.
    // sequence converted into list.

    // kotlin performance.
    // measure nano time and measure milliseconds.
    lateinit var newSequence: List<Int>
    newSequence = generateSequence(1) { it + 1 }
        .take(500)
        .toList()
    measure {
        val newSequenceResult = newSequence.filter { it % 3 == 0 }.average()
        println("Done")
        println(newSequenceResult)
    }
    println("----")

    // improving performance
    // with kotlin sequences.

    listOf("a", "b", "c")
        .filter {
            println("filter: $it")
            true
        }
        .forEach {
            println("for each: $it")
        }
    println("----")
    sequenceOf("x", "y", "z")
        .filter {
            println("filter: $it")
            true
        }
        .forEach {
            println("for each: $it")
        }

    println("----")

    measure {
        val sequence: Sequence<Int> = generateSequence(1) { it + 1 }
            .take(500)
        val newSequenceResult = sequence.filter { it % 3 == 0 }.average()
        println("Done")
        println(newSequenceResult)
    }

    println("----")

    measure {
        val customerList = getCustomerList()
        val customerResult = customerList.asSequence().filter { it % 2 == 0 }
        println(customerResult)
    }

    println("----")
    // kotlin ternary operator.
    var carName: String? = "Kia sonet"
    val nameLength = carName?.length ?: 0
    println(nameLength)

    println("----")
    //kotlin double bang operator. <- non null assertion.
    // if string is null, even then i want non null value.
    var cycleName: String? = "asjha"
    val cycleLength = cycleName!!.length
    println(cycleLength)

    println("----")
    // require not null in kotlin.
    var bikeName: String? = "askhfsif"
    val bikeNameLength = requireNotNull(bikeName) { "the string is null!" }.length
    println(bikeNameLength)

    // kotlin check not null.
    val newPerson: Person? = Person("donn")
    if (checkNotNull(newPerson) { "hi its an error" }.name == "Donn") {
        println("hi donn")
    } else {
        println("hi")
    }

    // filter not null.
    // already implemented.

    // type checking
    // with is keyword.
    println("----")
    val pc: Any = "lenovo"
    if (pc is Float) {
        println("yes")
    } else {
        println("no")
    }

    println("----")
    val tarush = Tarush(54656)
    if (tarush is Any) {
        println("yes")
    } else {
        println(tarush.javaClass.name)
    }

    println("-----")

    // cast in kotlin.
    // using as keyword.
    val carStuff: Any = getStuff("1")
    val newCarStuff: Int = carStuff as Int
    println(newCarStuff)

    println("----")
    // kotlin safe cast
    // with as?

    val bikeStuff: Any = getStuff("2")
    val newBikeStuff = bikeStuff as? String   // <- safe cast
    println(newBikeStuff)

    // kotlin generics
    // with lists and map.

    val genericList: List<String> = listOf("hi", "hello", "gud", "should")

    val genericMap: Map<Int, String> = mapOf(1 to "Tarush", 2 to "tushar")

    println("----")
    // generic class in kotlin.
    val genericClass = EventList(genericList)
    println(genericClass.items())

    println("-----")
    val newGenericClass = listOf(
        Tarush(23165),
        Tarush(2316),
        Tarush(23154),
        Tarush(2314648)
    )
    println(EventList(newGenericClass).items())

    println("----")

    // throw an exception in kotlin.
//   ` val tarushKaistha = Tarush(27)
//    if(tarushKaistha.passportNumber < 26){
//        println("user is allowed")
//    }
//    else{
//        throw Exception("user not allowed")
//    }`

    println("----")
    // create custom exception.
//    val t = Tarush(30)
//    if (t.passportNumber < 35) {
//        throw InvalidPassportException(t.passportNumber, "passport expired & invalid !!")
//    }

    println("----")

    // try and catch in kotlin.
    val aD = Tarush(14)
    try {
        checkPassportNumber(aD)
        println("Hi")
    } catch (e: Exception) {
        println("caught!!")
    }

    println("----")

    // catch multiple exceptions.

    val wD = Tarush(14)
    try {
        checkPassportNumber(wD)
    } catch (e: Exception) {
        when (e) {
            is InvalidPassportException -> println("Invalid passport")
            is java.lang.IllegalArgumentException -> println("Illegal Argument")
            is IndexOutOfBoundsException -> println("index not found")
            else -> e
        }
        println("Boom")
    }
    println("khauifd")

    println("----")
    // use of finally keyword with try and catch.
    val espresso = Tarush(10)
    try {
        checkPassportNumber(espresso)
        println("after validation")
    } catch (exception: RuntimeException) {
        println("hey this is a runtime exception.")
    } finally {
        println("finally")
    }
    println("jdigw")

    // try with multiple catch
    // order of catch block varies from most specific to general.
    println("----")
    try {
        val integerArray = IntArray(5)
        integerArray[5] = 10 / 0
    } catch (e: java.lang.Exception) {
        println("parent class exception")
    } catch (e: ArithmeticException) {
        println("runtime error")
    } catch (e: IndexOutOfBoundsException) {
        println("index bound error")
    }
    println("anyone of above")

    println("----")

    // type alias in kotlin.
    val speaker = Speaker("Tushar", "HUBBUB-843JKGD")
    println(speaker.authToken)

    println("----")
    // kotlin extension function.
    // with user defined classes.
    fun Circle.perimeter(): Double {
        return 2 * PI * radius
    }

    val newCircle = Circle(2.3)
    println(newCircle.area())
    println(newCircle.perimeter())

    // with default library classes.
    fun Int.abs(): Int {
        return if (this < 0) -this else this
    }

    println(4.abs())
    println((-4).abs())
    println("----")
    val hsfName = "Tarush Kaistha"
    println(hsfName.initials())
    val tarushAge = 2
    println(tarushAge.isAdult())

    println("----")
    // lazy evaluation in kotlin.
    val tvName: String by lazy {
        println("MI")
//        sleep(3000)
        "TCL"
    }
    println(tvName)
    println(tvName)

    println("----")

    // use of lazy initializer block in kotlin.
    val studentMarks = lazy {
        expensiveOperation()
    }
    println(studentMarks.value)
    println("is initialized : ${studentMarks.isInitialized()}")
    println(studentMarks.value)
    println(studentMarks.value)
    println(studentMarks.value)

    // use of packages
    // importing of packages -> done.

    // type inference in kotlin.
    val videoName = "Effective Java"
    val videoNumber = 42
    println(videoName)
    println(videoNumber)

    // variable initialized with lateinit keyword
    // their type is not inferred automatically
    lateinit var collegeName: String

    val reverseVideoName = videoNameReverse(videoName)

    println("----")

    //use of simple lambda expressions.
    // val lambdaName: (InputType) -> ReturnType = { args: InputType -> body }

    val greeter = { v: String ->
        val modifyName = v.uppercase()
        println("Hello $modifyName")
    }
    greeter("Tarush")

    println("----")

    // arguments can be more than one.
    val newG: (String, String) -> String = { f: String, m: String -> "hi $f $m" }
    println(newG("Tushar", "Kaistha"))

    println("----")

    // lambda fun as fun param.
    lineLogger {
        println("hshfoise")
        repeat(5) { println("------") }
    }

    println("----")
    // pass arguments to kotlin lambda function.
    repeater(5) { index ->
        // 3 times
        if (index < 3) {
            println("hi")
        }
        // 2 times
        else {
            println("gi")
        }
    }

    derbyAnnouncer { player: String ->
        "$player is a great player."
    }

    // use of underscore
    // to signify unused params.
    loremIpsum(5) { _: Int, ipsum: String ->
        print(ipsum)
        print(" ")
    }

    println("----")

    // use of it
    // param in kotlin.

    repeat(5) {
        println("this is iteration $it")
    }

    println("----")

    // kotlin lambdas as extensions.

    val newLam: String.(Int) -> Int = { it + it }
    val res = "Geeks".newLam(5)
    println(res)

    println("----")
    // call kotlin code from java.. <- done.
    // call java code from kotlin. <- done.

    // use of sealed classes.
    val sealedEmployee:Employee = SeniorDev("Name",20,10)
    val sealedMessages = when(sealedEmployee){
        is Manager -> {
            "Welcome ${sealedEmployee.name}! You have ${sealedEmployee.team.size} employees in your team!"
        }
        is SeniorDev -> {"Welcome ${sealedEmployee.name}! You have already ${sealedEmployee.projects} projects under your belt!"}
        //is is not required for SingleTon
        JuniorDev -> {"Welcome aboard! We wish you an awesome Experience!"}
    }


}
enum class Results(val datas: String){
    SUCCESS("success"),
    //FAILURE(val exceptionssss: Exception)  // <- not possible in enums

}
val latinWords = listOf(
    "lorem",
    "ipsum",
    "doti",
    "ohio",
    "amen"
)

fun loremIpsum(times: Int, block: (Int, String) -> Unit) {
    repeat(times) {
        val newIpsum = latinWords.random()
        block(it, newIpsum)
    }
}

fun derbyAnnouncer(block: (String) -> String) {
    val players = listOf(
        "Messi",
        "Ronaldo",
        "Dhoni"
    )
    val randomPlayer = players.random()
    println("Next player is ... $randomPlayer")
    val announcer = block(randomPlayer)
    println(announcer)
}

fun repeater(times: Int, block: (Int) -> Unit) {
    repeat(times) { index -> block(index) }
}

fun lineLogger(block: () -> Unit) {
    block()
}

fun videoNameReverse(videoName: String): String {
    return videoName.reversed()
}

fun expensiveOperation(): Int {
    println("hello ji")
    sleep(1000)
    return Random(System.currentTimeMillis()).nextInt()
}

class Circle(val radius: Double) {
    fun area(): Double {
        return PI * radius * radius
    }
}

fun checkPassportNumber(aD: Tarush) {
    if (aD.passportNumber < 15) {
        throw RuntimeException("jsdiu")
    }
}

data class Speaker(val userName: String, val authToken: AuthToken)
data class Account(val authToken: AuthToken)
data class Orders(val authToken: AuthToken)
class InvalidPassportException(val pNo: Int, msg: String) :
    IllegalArgumentException("Invalid pNo: $pNo.$msg")

class EventList<T>(val list: List<T>) {
    fun items(): List<T> {
        return list.filterIndexed { index, t -> index % 2 == 0 }
    }
}

fun getStuff(value: String): Any {
    return when (value) {
        "1" -> 99
        "2" -> "Hello"
        "3" -> true
        "4" -> 16.1
        else -> false
    }
}

data class Tarush(val passportNumber: Int)

fun getCustomerList(): List<Int> {
    return generateSequence(1) { it + 1 }
        .take(50_000_000).toList()
}

fun measure(block: () -> Unit) {
    val nanoTime = measureNanoTime(block)
    val ms = TimeUnit.NANOSECONDS.toMillis(nanoTime)
    println("$ms ms")
}

fun findValueInWebService(entry: Map.Entry<String, String>): Map.Entry<String, String>? {
    if (entry.key.startsWith("N")) {
        return null
    } else {
        return entry
    }
}

data class People(val name_2068: String)
class ShoppingBag(val itemsBag: List<String>)

fun isAdult(value: Int): Boolean {
    return value >= 18
}

fun getFileSystem(): FileSystem {
    return MemoryFileSystem(
        listOf("/path/to/file", "/another/path/to/file"), "file-contents"
    )
}

interface Discountable {
    fun discountPercent(): Double
    fun noDiscount()
}

interface FileSystem {
    fun readDir(): List<String>
    fun readFile(): String
}

interface OnClickListener {
    fun onClick()
}

fun taru(birds: Birds) {
    birds.eat()
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
