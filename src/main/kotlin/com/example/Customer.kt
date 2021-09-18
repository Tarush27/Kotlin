package com.example

class Customer(var name: String){
    fun customerHasLongName() = name.length > 10
}