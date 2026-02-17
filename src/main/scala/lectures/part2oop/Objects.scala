package lectures.part2oop

object Objects {
    // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
    object Person { // type + its only instance
        val N_EYES = 2
        def canFly: Boolean = false

        // factory method
        def from(mother: Person, father: Person): Person = new Person("Bobbie")
    }

    // in scala, companions are classes and objects with the same name
    // they can access each other's private members
    class Person(val name: String) {
        // instance-level functionality
    }

    def main(args: Array[String]): Unit = {
        println(Person.N_EYES)
        println(Person.canFly)
        // Scala object = SINGLETON INSTANCE
        
        val mary = Person
        val john = Person
        println(mary == john) // true



        val person1 = new Person("Mary")
        val person2 = new Person("John")
        println(person1 == person2) // false

        val bobbie = Person.from(person1, person2)
        println(bobbie.name)
  
    }



    // tldr: objects are singletons, companions to classes, and can have factory methods
    // scala objets: - are in their own class, - have only one instance, - singleton pattern in one line
    // scala companions: - class and object with the same name, - can access each other's private members, - used for factory methods
}
