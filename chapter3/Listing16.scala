class Book(var name : String, var isbn : String)

val book = Book("ET", "S2323")
print(book.name)
book.name = "ET II"
print(book.name)
