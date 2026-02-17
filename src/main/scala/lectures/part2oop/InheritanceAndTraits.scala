package lectures.part2oop

object InheritanceAndTraits extends App {
    // single class inheritance. one class at a time
    class Animal {
        protected def eat: Unit = println("nomnom")
    }   
    val animal = new Animal

    class Cat extends Animal {
        def crunch: Unit = {
            eat
            println("crunch crunch")
        }
    }
    val cat = new Cat
    cat.crunch



    // constructors
    class Person(name: String, age: Int) {
        def this(name: String) = this(name, 0)
        def this() = this("John Doe")
    }
    class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
    val adult = new Adult("Bob", 54, "1234")
    println(s"Adult: $adult")

    // overriding
    class Dog extends Animal {
        override def eat: Unit = println("crunch, crunch")
    }
    val dog = new Dog
    dog.eat
}
