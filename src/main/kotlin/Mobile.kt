
/* passed enum in the constructor of Mobile */

class Mobile(var name: String,var model:String, var accType: AccType = AccType.BRONZE) {

    /*
    make constants in kotlin.
    */

    // local constants using val
    val MAX_PRICE = 88000

    // using companion object
    companion object {
        const val max_price = 1_20_000
    }

    /*
    late init modifier
    */

    lateinit var favCity: String
    var favColor: String = "RED"  // without late init modifier
    fun mobileName() = "$name$model"
    override fun toString(): String{

        return mobileName() + " favourite city is $favCity and favColor is $favColor"
    }
}