package com.test.kotlin

// constant
const val KEY_NAME: String = "key.1"

class Address {

    // Every variable must be declared unless otherwise lateinit.

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

    fun main() {
    }

}