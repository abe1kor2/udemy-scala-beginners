package lectures.part1basics

object StringOps extends App {

// cheat sheet of string operations
    val str: String = "Hello, I am learning Scala"
    println(str.charAt(2))
    println(str.substring(7,11))
    println(str.split(" ").toList)
    println(str.startsWith("Hello"))
    println(str.replace(" ", "-"))
    println(str.toLowerCase())
    println(str.toUpperCase())
    println(str.length)


    /* 
        all the functions are present in the java language because
        scala runs on the (Java Virtual Machine),
         so it has access to all the java libraries, including the string library, which is why we can use all these functions on strings in scala
    

        to prepend a string with another string, we can use the +: operator
        to append a string with another string, we can use the :+ operator
     */

    val aNumberString = "45"
    val aNumber = aNumberString.toInt
    println('a' +: aNumberString :+ 'z') // prepend and append
    println(str.reverse)
    println(str.take(2)) // take the first 2 characters of the string


    // scala-specific string interpolators

    // s-interpolator
    val name = "Abe"
    val age = 5
    val greeting = s"Hi, my name is $name and I am $age years old"
    println(greeting)

    // f-interpolator for formatted strings, similar to printf in other languages
    val speed = 1.2f
    val myth = f"$name%s can eat $speed%2.2f burgers per minute"
    println(myth)


    // raw-interpolator, does not escape special characters
    println(raw"This is a \n newline") // raw does not escape the \n, it will print the \n as is, while the normal string will print a new line
}
