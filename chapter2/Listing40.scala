val month = 2
month match
    case 1 | 2 => println("Winter")
    case 6 | 7 => println("Summer")
    case _ => println("Invalid month") //This works as the default
