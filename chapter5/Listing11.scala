def sumOdd(in: List[Int]): Int =
    in match
        case Nil => 0
        case x :: rest if x % 2 == 1 => x + sumOdd(rest)
        case _ :: rest => sumOdd(rest)