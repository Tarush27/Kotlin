// enums in kotlin.
// using constructor.
enum class AccType(val discountPercent:Int, val subscription: Int) {
    BRONZE(10,1),
    SILVER(15,2),
    GOLD(20,3),
    PLATINUM(25,4)
}