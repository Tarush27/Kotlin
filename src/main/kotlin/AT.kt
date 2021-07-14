
// using abstract functions.
enum class AT {
    bronze {
        override fun findDiscount()  = 5
    },
    silver{
          override fun findDiscount()  = 6
          },
    gold{
        override fun findDiscount()  = 7
    },
    platinum{
        override fun findDiscount()  = 8
    };

    abstract fun findDiscount(): Int

    // added static method or companion object.
    companion object{
        fun getAccount(name: String) = name
    }
}