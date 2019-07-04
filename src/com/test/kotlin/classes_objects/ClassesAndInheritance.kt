package com.test.kotlin.classes_objects


// primary constructor
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

    open fun sayHello() {
        println("Hello: $myName")
    }

}

// override primary constructor with a subclass
class SubClass(title: String, name: String, surname: String) : ParentClass(name = name, surname = surname) {

    var titleName = title

    init {
        println("SubClass: titleName $titleName, name: $name, surname: $surname")
    }

    override fun sayHello() {
        println("Overridden hello: $titleName $myName")
    }

}

fun main() {
    val helloMe = SubClass("Mr", "John", "Smith")
    helloMe.sayHello()
}