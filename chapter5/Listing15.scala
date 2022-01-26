import scala.annotation.switch //You need to import this annotation                                                                                                                                                                             
def printNum(int : Int) =
    (int: @switch) match //You indicate to Scala to use the optimization
        case 0 => println("Zero")
        case 1 => println("One")
        case _ => if int > 0 then println("More than one") else println("Less than zero")

printNum(3)  