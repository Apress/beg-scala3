public class Book{
    private static Book book;
    private Book() {}
    public static synchronized Book getInstance() {
        if (book == null) {
            book = new Book();
        }
        return book;
    }
}