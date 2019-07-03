package com.test.kotlin


open class ParentClass(name: String) {

    var myName = name

    // secondary
    constructor(name: String, surname: String): this(name) {
        println("ParentClass: name ${name}, surname: ${surname}")
    }

    init {
        println("first init")
    }

    init {
        println("second init: $myName")
    }

}

class SubClass(title: String, name: String, surname: String) : ParentClass(name = name, surname = surname) {

    var titleName = title

    init {
        println("SubClass: titleName $titleName, name: $name, surname: $surname")
    }

}

fun main() {
    SubClass("Mr", "John", "Smith")
}