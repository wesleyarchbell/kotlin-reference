package com.test.kotlin.classes_objects

private fun foo() {} // visible inside VisibilityModifiers.kt

var bar: Int = 5 // property is visible everywhere (public by default)
    private set         // setter is visible only in VisibilityModifiers.kt

internal val baz = 6    // visible inside the same module

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}

/*
 Here the constructor is private. By default, all constructors are public, which effectively amounts to them being
 visible everywhere where the class is visible (i.e. a constructor of an internal class is only visible within the
 same module).
*/
class C private constructor(a: Int) {}