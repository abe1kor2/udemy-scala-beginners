package lectures.part2oop

import scala.compiletime.ops.boolean

object MethodNotations extends App {
    class Person(val name: String, favourtieMovie: String, val age: Int = 0){
        def likes(movie: String): Boolean = movie == favourtieMovie
        def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
        def +(person: Person): String = s"${this.name} is with ${person.name}"
        def unary_! : String = s"${name}, what the heck!?"
        def isAlive: Boolean = true
        def apply(): String = s"hi my name is $name and I like ${favourtieMovie}"
        def unary_+ : Person = new Person(name, favourtieMovie, age + 1)
        def +(nickname: String): Person = new Person(s"$name ($nickname)", favourtieMovie)
        def learns(thing: String): String = s"$name learns $thing"
        def learnsScala: String = this.learns("Scala")
        def apply(n: Int): String = s"$name watched $favourtieMovie $n times"
    }

    val mary = new Person("Mary", "Inception")
    println(mary.likes("Inception"))
    // println(mary likes "Inception") // equivalent(this can be made only with methods with one parameters)
    //   infix notation = operator notation

    // "operators" in Scala
    val tom = new Person("Tom", "Fight Club")
    println(mary + tom)
    println(mary+(tom))


    // all Operators are methods. 
    // AKKA actors have ! ?

    // prefix notation:
    val x = -1
    val y = 1.unary_-

    // unary_prefix only worka with - + ~ !
    println(!mary)
    println(mary.unary_!)

    // postfix notation:
    println(mary.isAlive)


    // apply
    println(mary.apply())
    println(mary()) // equivalent

    /* 
        1. overload the + operator
            mary + "the rockstar" => new person "Mary (the rockstar)"
        
        2. Add an age to the Person class
            add a unary + operator => new person with the age + 1
            +mary => mary with the age incremeter

            ++
     */
    println((mary + "the Rockstar").apply())
    println((+mary).age )
    println(mary.learnsScala)
    println(mary(10))
}
