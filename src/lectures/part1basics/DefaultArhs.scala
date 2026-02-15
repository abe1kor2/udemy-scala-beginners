package lectures.part1basics

object DefaultArhs extends App {

    def trFact(n: Int, acc: Int = 1): Int = {
        if (n <= 1) acc
        else trFact(n-1, n*acc)
    }

    // argument defaults and name arguments
    /* 
        when most of the time we call a function with the same argumnt, we can provide a default value for that argument, so we dont have to specify it each time we call the function, 
        and we can also use name arguments to specify which argument we are providing a value for, so we dont have to remember the order of the arguments. we cannot immute leading argiments.
        


     */
  
}
