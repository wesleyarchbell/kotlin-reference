package com.test.kotlin

// constant
const val CONSTANT_STRING: String = "key.1"

class Address {

    // Every variable must be declared unless otherwise late initialized.

    // mutable variable
    var name: String = "Name"
    var street: String = "21 Street"
    set (value) {
        // access backing field
        field = "Street: $value"
    }

    // read-only variable
    val gender: String = "Male"

    val inferredType = 1 // has type Int and a default getter

    // late initialized variable
    lateinit var status: String

    constructor() {
        street = "21 Happy St"
    }

    fun updateStatusInitialized() {
        status = "Initialized"
    }
}

fun main() {
    println(CONSTANT_STRING)
    val address = Address()
    address.updateStatusInitialized()
    println("Status: ${address.status}")
}