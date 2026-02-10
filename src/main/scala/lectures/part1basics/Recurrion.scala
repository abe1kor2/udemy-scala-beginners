package lectures.part1basics

import scala.annotation.tailrec

object Recurrion extends App {

    // recursive function: a function that calls itself

    // def aFactorialFunction(n: BigInt): BigInt = if(n <= 1) 1 else n * aFactorialFunction(n-1)
    // println(aFactorialFunction(3))

    def factorial(n: Int): Int = {
        if (n <= 1) 1
        else {
            // n * factorial(n-1)
            println(s"Computing factorial of $n, need factorial of ${n-1}")
            val result = n * factorial(n-1)
            println(s"Computed factorial of $n")
            result
        }
    }
    // println(factorial(5))


    def anotherFactorial(n: BigInt): BigInt = {
        def factHelper(x: BigInt, accumulator: BigInt): BigInt = {
            if (x <= 1) accumulator
            else factHelper(x-1, x * accumulator) // tail recursion = use recursive call as the last expression
        }
        factHelper(n, 1)
    }
    // println(anotherFactorial(5000)) // this will not crash with stack overflow because its tail recursive, but the previous one will crash because its not tail recursive

    // When you need loops, use tail recursion.



    /* 
    Exercises: concatenate a string n times
    isPrime a functional tail recursive function
    fibonacci function, tail recursive
     */

    @tailrec
    def concatenateString(aString: String, n: Int, accumulator: String): String ={
        if (n<=0) accumulator
        else concatenateString(aString, n-1, aString + accumulator)
    }
    
    println(concatenateString("hello", 5, ""))

    // def isPrime(n: Int): Boolean = {
    //     def isPrimeUnit(t: Int): Boolean={
    //         if (t <=1) true
    //         else n % t != 0 && isPrimeUnit(t-1)
    //     }
    //     isPrimeUnit(n/2)
    // }

    // /* 
    // n is an integer

    //  */
    
    // println(isPrime(27))

    // def fibonacci(n: Int): Int = {
    //     def fibonacciUnit(t: Int): Int = {
    //          if (t <= 1) t
    //          else fibonacciUnit(t-1) + fibonacciUnit(t-2)
    //     }
    //     fibonacciUnit(n)
    // }

    // println(fibonacci(10))
}
 