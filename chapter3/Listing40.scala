object DomainIds:
    opaque type BookId = Int
    object BookId:
        def apply(id: Int): BookId = id
    extension (bookId: BookId)
        def value: Int = bookId

@main def main =
    //Import the domain objects.
    import DomainIds._

    val bookId = BookId(1)
    print(bookId.value == 1)