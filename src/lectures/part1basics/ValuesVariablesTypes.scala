package lectures.part1basics

object ValuesVariablesTypes extends App {

    
    val x: Int = 42
    println(x)
    //   VALS are immutable


    // Compiler can infer types
    val aString: String = "Hello"
    val anotherString = "Goodbye"

    val aBoolean: Boolean = true
    val aChar: Char = 'a'
    val anInt: Int = x
    val aShort: Short = 4613
    val aLong: Long = 4613L
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.14


    // vartiables are mutable
    var aVariable: Int = 4
    aVariable = 5 // side effects

}
