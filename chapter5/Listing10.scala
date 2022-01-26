val x = 1
val rest = List(2,3,4)

val list = x :: rest

def printNumbers(list : List[Int]) : Unit =
    list match
        case head :: tail => println(head); printNumbers(head)
        case Nil => println("")

def printNumbers(list: List[Int]): Unit

printNumbers(list)