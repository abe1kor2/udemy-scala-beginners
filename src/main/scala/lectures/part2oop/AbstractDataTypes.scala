package lectures.part2oop

object AbstractDataTypes extends App {
    // abstract for situations where you need to leave some fields or methods unimplemented, but you want to have a common type for all the subclasses.
    // abstract classes cannot be instantiated, but they can have both implemented and unimplemented members.
    abstract class Animal {
        val creatureType: String
        def eat: Unit
    }

    class Dog extends Animal {
        override val creatureType: String = "Canine"
        override def eat: Unit = println("crunch, crunch")
    }

    // traits: like abstract classes, but they can be mixed into classes that already extend another class. they cannot have constructor parameters.
    trait Carnivore {
        def eat(animal: Animal): Unit
    }

    class Crocodile extends Animal with Carnivore {
        override val creatureType: String = "Croc"
        override def eat: Unit = println("nomnom")
        override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
    }

    val dog = new Dog
    val croc = new Crocodile
    croc.eat(dog)

    // traits vs abstract classes:
    // 1. traits do not have constructor parameters, abstract classes can
    // 2. a class can extend multiple traits, but only one abstract class 
}
