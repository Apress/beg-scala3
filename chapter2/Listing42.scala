import scala.annotation.switch
val month = 2
(month: @switch) match
    case 1 | 2 => println("Winter")
    case 6 | 7 => println("Summer")