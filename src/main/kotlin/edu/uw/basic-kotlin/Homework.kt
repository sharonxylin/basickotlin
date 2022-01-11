package edu.uw.basickotlin

class Library {
    // This is just here as a placeholder, to make sure tests run and pass
    // before you add any code
    fun someLibraryMethod(): Boolean {
        return true
    }
}

// write a "whenFn" that takes an arg of type "Any" and returns a String
whenFn (x: Any): String {
  "Hello" -> return "world"
  x!="Hello" -> return "I don't understand"
  0 -> return "zero"
  1 -> return "one"
  in 2..10 -> return "low number"
  !in 2..10 -> return "a number"
  else -> { return "I don't understand" }
}
    
// write an "add" function that takes two Ints, returns an Int, and adds the values
fun add(int1: Int, int2: Int): Int {
  return int1 + int2
}

// write a "sub" function that takes two Ints, returns an Int, and subtracts the values
fun sub(int1: Int, int2: Int): Int {
  return int1 - int2
}

// write a "mathOp" function that takes two Ints and a function (that takes two Ints and returns an Int), returns an Int, and applies the passed-in-function to the arguments
fun mathOp(int1: Int, int2: Int, func: (Int, Int)-> Int): Int{
    return func(int1, int2)
}

// write a class "Person" with first name, last name and age
class Person(var firstName: String, var lastName: String, var age: Int) {
  init {
    val debugString = "[Person firstName:$firstName lastName:$lastName age:$age]"
  }
}

// write a class "Money" with amount and currency, and define a convert() method and the "+" operator
class Money(var amount: Int, var currency: String){

}