import scala.annotation.switch

def print(letter : Char) =
    (letter: @switch) match
        case 'A' => println("Animal")
        case 'B' => println("Bank")
        case 'D' => println("Dance")
        case 'E' => println("Elephant")
        case _ => println("Is not a letter")