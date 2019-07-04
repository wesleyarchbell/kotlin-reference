package com.test.kotlin.classes_objects


interface MetalObject {
    val type: String
}

interface Vehicle : MetalObject {
    // override type in parent interface
    override val type: String get() = "Steel"
    val colour: String
    val size: Int

    fun drive()
}

class Car(override val colour: String) : Vehicle {
    override val size: Int = 72
    override fun drive() {
        println("Driving Car ${size}m made of $type")
    }
}

class Bus(override val colour: String) : Vehicle {
    override val size: Int = 340
    override fun drive() {
        println("Driving Bus ${size}m made of $type")
    }
}

fun main() {
    val car: Vehicle = Car("Red")
    val bus: Vehicle = Bus("Blue")

    car.drive()
    bus.drive()
}