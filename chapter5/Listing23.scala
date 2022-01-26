case class Person(name: String, age: Int, valid: Boolean)

case class MarriedPerson(override val name: String,
                                override val age: Int,
                                override val valid: Boolean,
                                spouse: Person) extends Person(name, age, valid)