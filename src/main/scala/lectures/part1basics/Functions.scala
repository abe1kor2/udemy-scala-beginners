package lectures.part1basics

import scala.compiletime.ops.int
import scala.compiletime.ops.boolean

object Functions extends App {
    def aFunction(a: String, b: Int): String = {
        a + " " + b
    }

    // println(aFunction("hello", 3))


    def aParameterlessFunction(): Int = 42
    // println(aParameterlessFunction())


    def aRepeatedFunction(aString: String, n: Int): String = {
        if(n==1) aString
        else aString + aRepeatedFunction(aString, n-1)
    }

    // println(aRepeatedFunction("hello", 1))
    // println(aRepeatedFunction("try ", 2))

    // WHEN YOU NEED LOOPS, USE RECURSION.!!!

    // recursive function needs a return type, otherwise it will not compile

    def aFucntionWithSideEffects(aString: String): Unit = println(aString)

    // aFucntionWithSideEffects("a function with side effects") 

    def aBigFunction(n: Int): Int = {
        def aSmallerFunction(a: Int, b: Int): Int = a + b

        aSmallerFunction(n, n-1)
    }

    println(aBigFunction(6))


    // exercises

    // 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    def aGreetingFunction(name: String, age: Int): String = {
        s"Hi my name is $name and I am $age years old"
    }


    println(aGreetingFunction("Abe", 5))

    // 2. Factorual Function 1*2*3*4... *n

    def aFactorialFunction(n: BigInt): BigInt = if(n <= 1) n else n * aFactorialFunction(n-1)
    // def aFactorialFunction(n: Int): Int ={
    //     if(n==1) 1
    //     else n * aFactorialFunction(n-1)
    // }

    println(aFactorialFunction(4))

    // 3. Fibonacci function

    def aFibonacciFunction(n: BigInt): BigInt = if( n <= 1) n else aFibonacciFunction(n-1) + aFibonacciFunction((n - 2))

    println(aFibonacciFunction(10))

    // 4. Tests if a number is prime

    def ifNumberIsPrime(n: Int) = {
        def isPrimeUntil(t: Int): Boolean =
            if (t<=1) true 
            else n % t != 0 && isPrimeUntil(t-1)

        isPrimeUntil(n/2)
    }

    println(ifNumberIsPrime(12))

}
