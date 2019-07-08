package com.test.kotlin.classes_objects


/**
 * Sealed classes are used for representing restricted class hierarchies,
 * when a value can have one of the types from a limited set, but cannot have any other type.
 * They are, in a sense, an extension of enum classes: the set of values for an enum type is also restricted,
 * but each enum constant exists only as a single instance, whereas a subclass of a sealed class can have multiple
 * instances which can contain state.
 */
sealed class State

data class On(val name: String) : State()

data class Off(val name: String) : State()

