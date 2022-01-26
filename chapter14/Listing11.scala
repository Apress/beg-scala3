def validByAge(in: List[Person]): List[String] =
    val valid = for (p<- in if p.valid) yield p
    def localSortFunction(a: Person,b:Person) = a.age < b.age
    val people = valid.sort(localSortFunction _)
    for(p<- people) yield p.first