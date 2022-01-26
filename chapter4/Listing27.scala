def factorial(number:Int) : Int = {
  if (number == 1) 
    return 1
  number * factorial (number - 1)
}

println(factorial(3))