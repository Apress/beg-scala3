class Playlist(var name : String):
    var books : List[Book] = Nil
    def addBook(book : Book) : Unit =
        books = book :: books
    class Book(var name : String, var isbn : String)

val playlist = Playlist("Horror")
playlist.addBook(playlist.Book("ET", "sdsd"))
print(playlist.books.size)