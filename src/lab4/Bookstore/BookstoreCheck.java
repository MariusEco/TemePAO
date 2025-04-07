package lab4.Bookstore;

public class BookstoreCheck {
    public static boolean isDuplicate(Book b1, Book b2) {
        return b1.getTitle().equals(b2.getTitle()) && b1.getAuthor().equals(b2.getAuthor());
    }

    public static Book thickerBook(Book b1, Book b2) {
        return b1.getPageCount() > b2.getPageCount() ? b1 : b2;
    }
}
