class ISBNumber(val isbn: String) extends AnyVal:
    def shortNumber = isbn.replace("I-", "")

class Book(val name : String, val isbn : ISBNumber)
val book = Book("ISBN", "NAME")   