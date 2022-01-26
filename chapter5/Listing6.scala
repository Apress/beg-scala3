def printNum(int: Int) =
    int match
        case 0 => println("Zero")
        case 1 => println("One")
        case -1  -2 => println("less than zero")
        case _ => println("more than one")

printNum(-2)