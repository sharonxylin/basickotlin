package edu.uw.basickotlin

class Library {
    // This is just here as a placeholder, to make sure tests run and pass
    // before you add any code
    fun someLibraryMethod(): Boolean {
        return true
    }
}

// write a "whenFn" that takes an arg of type "Any" and returns a String
fun whenFn(arg: Any): String {
  when(arg){
    "Hello" -> return "world"
    is String -> return "Say what?"
    0 -> return "zero"
    1 -> return "one"
    in 2..10 -> return "low number"
    is Int -> return "a number"
    else -> return "I don't understand" 
  }
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
fun mathOp(int1: Int, int2: Int, func: (a: Int, b: Int) -> Int): Int {
  return func(int1, int2)
}

// write a class "Person" with first name, last name and age
class Person(var firstName: String, val lastName: String, var age: Int) {
  val debugString: String = "[Person firstName:$firstName lastName:$lastName age:$age]"
} 

// write a class "Money" with amount and currency, and define a convert() method and the "+" operator
class Money(var amountInput: Int, var currencyInput: String){
  var amount: Int = 0
  var currency: String = ""
  init {
    if(amountInput<0){
      throw IllegalArgumentException("amount cannot be less than zero")
    }else{
      amount = amountInput
    }
    if(!(currencyInput=="USD" || currencyInput=="EUR" || currencyInput=="CAN" || currencyInput=="GBP")){
      throw IllegalArgumentException("currency can only be USD, EUR, CAN, or GBP")
    }else{
      currency = currencyInput
    }
  }
  public fun convert(arg: String): Money {
      // in USD 
      var usdEquivalent: Int = when(currency) {
        "EUR" -> (amount / 3) * 2
        "CAN" -> (amount / 5) * 4
        "GBP" -> amount * 2
        else -> amount
      }
      var targetEquivalent: Int = when(arg){
        "EUR" -> (usdEquivalent / 2) * 3
        "CAN" -> (usdEquivalent / 4) * 5
        "GBP" -> usdEquivalent / 2
        else -> usdEquivalent 
      }
      return Money(targetEquivalent, arg)
  }

  operator fun plus(other: Money): Money {
    val converted: Money = other.convert(this.currency)
    return Money(this.amount + converted.amount, this.currency)
  }
} 