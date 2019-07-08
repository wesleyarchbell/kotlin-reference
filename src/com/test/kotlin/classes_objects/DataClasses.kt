package com.test.kotlin.classes_objects

/**

The compiler automatically derives the following members from all properties declared in the primary constructor:

- equals()/hashCode() pair;
- toString() of the form "User(name=John, age=42)";
- componentN() functions corresponding to the properties in their order of declaration;
- copy() function (see below).
- The primary constructor needs to have at least one parameter;
- All primary constructor parameters need to be marked as val or var;

 */
data class User(val name: String, val age: Int) {
    var height: Int = 0 // excluded from generated data classes
}

fun main() {
    val user = User("john", 2)
    println(user.toString()) // User(name=john, age=2) height is not included

}