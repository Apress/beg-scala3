public class Book {
    private final int isbn;
    private final String title;

    public Book(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}