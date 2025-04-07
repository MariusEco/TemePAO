package lab4.Bookstore;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getPageCount() { return pageCount; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    
    @Override
    public String toString() {
        return "BOOK_TITLE: " + title.toUpperCase() + "\n" +
               "BOOK_AUTHOR: " + author + "\n" +
               "BOOK_PUBLISHER: " + publisher.toLowerCase();
    }
}
