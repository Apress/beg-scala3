public class Book {
    public String getCategory() {
        return "Non-Fiction";
    }

    public static Book createBook() {
        return new Book();
    }
}