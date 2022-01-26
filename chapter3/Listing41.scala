class Book (val name : String, val isbn : String)

class BookService:
    opaque type BookId = Int
    def getIdByName(name: String) : BookId = 1

val bookService = BookService()
bookService.getIdByName("sad")