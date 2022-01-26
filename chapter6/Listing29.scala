def validPeople(in: List[Person])=
  in.filter(_.valid).map(_.first)