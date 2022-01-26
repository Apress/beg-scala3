def printNum(int: Int) =
    int match
        case 0 => println("Zero")
        case 1 => println("One")
        case default => println("more than one")

printNum(2)