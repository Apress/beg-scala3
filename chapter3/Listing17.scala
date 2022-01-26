class Book(var name : String, var isbn : String):
    def this(name : String) =
        this(name, "default")

    def this() =
        this("", "default")

val bookOne = Book("ET")
print(bookOne.isbn)