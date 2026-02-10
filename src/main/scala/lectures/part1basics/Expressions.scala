package lectures.part1basics

object Expressions extends App {

    val x = 1 + 2 // Expression
    println(x)

    println(2 + 3 * 4) // Mathematical expressions
    // + - * / & | ^ << >> >>> (right shift with zero extension)

    println(1 == x) // Relational expression
    // == != > >= < <=

    println(!(1 == x)) // Logical expression
    // ! && ||

    var aVariable = 2
    aVariable += 3 // also works with -= *= /= (side effects)
    println(aVariable)
  
    // Instructions (DO) vs Expressions (VALUE)

    // IF expression
    val aCondition = true
    val aCondtionValue = if (aCondition) 5 else 3
    println(aCondtionValue)


    var i = 0
    while (i < 10) {
        println(i)
        i += 1
    }

    // NEVER WRITE THIS AGAIN

    // everything in Scala is an expression!
    val aWeirdValue = (aVariable = 3) // Unit == void
    println(aWeirdValue)

    // side effects: println(), whiles, reassigning

    // code blocks
    val aCodeBlock = {
        val y = 2
        val z = y + 1

        if (z > 2) "hello" else "goodbye"
    } 

    // 1. difference between "hello world" vs println("hello world")
    // answer: the first one is a string value, the second one is a side effect (Unit)
    // 2. 

    val someValue = {
        2 < 3
    }
    println(someValue) // this is true because its a conditional expression that evaluates to a boolean

    val someOtherValue = {
        if (someValue) 239 else 986
        42
    }
    println(someOtherValue) // this is 42 because the value of the code block is the value of the last expression, which is 42. The if expression is evaluated but its value is not used.


}
