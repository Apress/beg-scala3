def validByAge(in: List[Person]): List[String] =
    in.filter(_.valid).sort(_.age < _.age).map(_.first)