def ignore(in: List[String]): List[String] =
    in match
        case Nil => Nil
        case _ :: "ignore" :: rest => ignore(rest)
        // If the second element in the List is "ignore" then return the ignore
        // method run on the balance of the List
        case x :: rest => x :: ignore(rest)
        // return a List created with the first element of the List plus the
        // value of applying the ignore method to the rest of the List