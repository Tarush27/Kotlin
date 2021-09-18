package com.example

import StringExtensions.initials
import example.User

class CustomerFacade(user: User) {
    init {
        // here customer is platform type .
        // i.e. Customer!
        // means it could be nothing or not null or null.
        val customer = user.customer("jhsuf")
        println(customer.name)
        val customerInitials = customer.name.initials()
        val customers = user.newCustomer()
    }
}