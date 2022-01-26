class ISBNumber(val isbn: String) extends AnyVal:
    def shortNumber = isbn.replace("I-", "")

val book = Book("NAME", ISBNumber("I-TEST"))
print(book.isbn.shortNumber) 