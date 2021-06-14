fun main(args: Array<String>) {
//    println("Hello World!")

    var name = "Tarush Kaistha"
    println(name)
    name = "Tushar Kaistha"
    println(name::class)
    val newName = "Tushar"
    println(newName)

    val int:Int = 32;
    println(int.and(50))
    println(int.toByte())

    val newInt:Int = int + 15
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

    val c:Char = 'a'
    println(c.isLowerCase())

    var s:String = "yes" + "\t" + "\n" + "no"
    println(s)
    fun printDouble(d: Double){
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
    var input:String = """
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
}