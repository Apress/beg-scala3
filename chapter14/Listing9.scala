def validByAge(in: List[Person]): List[String] =
  var valid: List[Person] = Nil
  for (p <- in)
    if (p.valid) valid = p :: valid

def localSortFunction(a: Person, b: Person) = a.age < b.age
val people = valid.sort(localSortFunction _)
var ret: List[String] = Nil

for (p <- people)
  ret = ret ::: List(p.first)

return ret