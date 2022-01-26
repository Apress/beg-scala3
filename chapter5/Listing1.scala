def printNum(int: Int) =
    int match
        case 0 => println("Zero")
        case 1 => println("One")
        case _ => println("more than one")

printNum(0)
printNum(1)
printNum(2)