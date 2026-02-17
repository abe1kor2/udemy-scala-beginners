package lectures.part2oop

object OOBasics extends App {

    val person = new Person("John", 12) //instantiating class
    println(person.x)
    println(person.greet("Daniel"))
}

// constructor
class Person(name: String, age: Int) {
    // class perameters are not FIELDS!(callable values)
    // val, vars, definitions, expressions, functions
    // body
    val x = 3

    println(age)

    // method
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
    // this.name is used to disambiguate between two different variables named name (John in this case)

    // overloading(this is allowed)
    def greet(): Unit = println(s"Hi, I am $name")

    // multiple contructors
    def this(name: String) = this(name, 0) //calling the primary constructor
    def this() = this("John Doe")
}

