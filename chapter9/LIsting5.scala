class Book(val isbn: Int, val title: String)

class NonFiction (isbn: Int, title: String) extends Book(isbn, title)