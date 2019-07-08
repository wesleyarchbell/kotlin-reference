package com.test.kotlin.classes_objects

fun String.appendName(name: String) : String {
    return this.plus(" Name: $name")
}

fun String.toStringValue(): String {
    if (this == null) return "null"
    // after the null check, 'this' is autocast to a non-null type, so the toString() below
    // resolves to the member function of the Any class
    return "toString: ${toString()}"
}

class D {
    fun bar() {  }
}

class C {
    fun baz() {  }

    fun D.foo() {
        bar()   // calls D.bar
        baz()   // calls C.baz
    }

    fun caller(d: D) {
        d.foo()   // call the extension function
    }
}

fun main() {
    var nameString = "Hello"
    nameString = nameString.appendName("Wesley")
    println(nameString.toStringValue())
}