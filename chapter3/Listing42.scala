class Book (val name : String, val isbn : String)

class BookRepository:
    def getBook() = new Book("test", "test")

class BookService:
    private val bookRepository = new BookRepository()
    export bookRepository.getBook //Use export to expose the method

@main def main =
    val bookService = BookService()
    val book = bookService.getBook()
    print(book.name)