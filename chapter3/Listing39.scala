object DomainIds:
    opaque type BookId = Int
    object BookId:
        def apply(id: Int): BookId = id

@main def main =
    //Import the domain objects.
    import DomainIds._
    val bookId = BookId(1)
    print(bookId)