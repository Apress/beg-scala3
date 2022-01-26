@annotation.tailrec
def factorial(accumulator: Int, number: Int) : Int = {
    if(number == 1)
        return accumulator
    factorial(number * accumulator, number - 1)
}

println(factorial(1,3))