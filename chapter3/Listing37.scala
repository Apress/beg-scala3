class Book(val name : String, val isbn : String)

object Book:
    val PREFFIX = "I-"

val book = Book("ET", Book.PREFFIX + "Test")
print(book.isbn)