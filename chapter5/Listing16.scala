import scala.annotation.switch

def print(int : Int) =
    (int: @switch) match
        case 0 => println("Zero")
        case 1 => println("One")
        case 2 => println("Two")
        case 3 => println("Three")
        case 4 => println("Four")
        case _ => println("More than four")