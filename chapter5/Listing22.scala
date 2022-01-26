case class Person(name: String, age: Int, valid: Boolean)

def older(p: Person): Option[String] =
    p match
        case Person(name, age, true) if age > 35 => Some(name)
        case _ => None

older(p)
older(Person("Fred", 73, false))
older(Person("Jorge", 24, true))