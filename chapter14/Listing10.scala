def validByAge(in: List[Person]): List[String] =
    val valid:ListBuffer[Person] = new ListBuffer // displaced mutability
    for(p<- in)
        if (p.valid) valid += p

    def localSortFunction(a: Person, b:Person) = a.age < b.age then 1 else 0
val people = valid.toList.sort(localSortFunction)
val ret:ListBuffer[String] = new ListBuffer
for(p<- people)
    ret += p.first

ret.toList