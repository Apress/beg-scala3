def printNum(int: Int) =
    int match
        case _ => println("more than one")
        case 0 => println("Zero")
        case 1 => println("One")