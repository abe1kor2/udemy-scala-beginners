package lectures.part1basics

import scala.compiletime.ops.long

object CBNvsCBV extends App {

    def calledByValue(x: Long): Unit = {
        println("By Value" + x)
        println("by value"+ x)
    }

    def callByName(x: => Long): Unit = {
        println("by Name:" +x)
        println("by Name:" +x)
    }
    calledByValue(System.nanoTime())
    callByName(System.nanoTime())

    // calledByValue() is called onces with a static value, value is computed before the function is called, same value used in both println statements
    // callByName() is called literally twice here, value is computed each time its used, so different value is used in each println statement
  

}
