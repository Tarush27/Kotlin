object FavFood {
    var name = "unknown"
    var ingredients = mutableListOf<String>()

    fun length():Int{
        return ingredients.size
    }
}