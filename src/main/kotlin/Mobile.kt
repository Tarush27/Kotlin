class Mobile(var name: String,var model:String) {

    /*
    make constants in kotlin.
    */

    // local constants using val
    val MAX_PRICE = 88000

    // using companion object
    companion object {
        const val max_price = 1_20_000
    }
    fun mobileName() = "$name$model"
    override fun toString(): String{

        return mobileName()
    }
}