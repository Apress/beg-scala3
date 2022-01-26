def noPairs[T](in: List[T]): List[T] =
    in match
        case Nil => Nil
        case a :: b :: rest if a == b => noPairs(a :: rest)
        // the first two elements in the list are the same, so we'll
        // call noPairs with a List that excludes the duplicate element
        case a :: rest => a :: noPairs(rest)
        // return a List of the first element followed by noPairs
        // run on the rest of the List

noPairs(List(1,2,3,3,3,4,1,1))
