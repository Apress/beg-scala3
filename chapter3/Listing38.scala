class Book private (val name : String, val isbn : String)

object Book:
    val PREFFIX = "I-"
    def apply(name : String, isbn : String) = new Book(name, isbn)

val book = Book.apply("name", "isbn")