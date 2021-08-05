package interfaces

import Discountable

class GenericToy : Discountable {
    override fun discountPercent(): Double {
        return discountPercent()
    }

    override fun noDiscount() {
        TODO("Not yet implemented")
    }
}