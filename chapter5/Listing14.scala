def getStrings(in: List[Any]): List[String] =
    in match
        case Nil => Nil
        case (s: String) :: rest => s :: getStrings(rest)
        case _ :: rest => getStrings(rest)