package lectures.part2oop

object AnonymousClass extends App {
    abstract class Animal {
        def eat: Unit
    }

    // anonymous class: an instance of an abstract class or trait with an implementation of the abstract members
    val funnyAnimal: Animal = new Animal {
        override def eat: Unit = println("ahahahah")
    }
    println(funnyAnimal.getClass())

    // anonymous classes are used in Akka actors, for example, to create actors without having to define a separate class for each actor.
  
    class Person(name: String) {
        def sayHi: Unit = println(s"Hi, my name is $name")
    }

    val jim = new Person("Abe") {
        override def sayHi: Unit = println(s"Hi, my name is Jim and I'm an anonymous class")
    }
    jim.sayHi
}
