package lab4.Bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookstoreTest {
    private static List<Book> books = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static void createBook() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        int pageCount;
        do {
            System.out.print("Page count: ");
            pageCount = scanner.nextInt();
            scanner.nextLine();
        } while (pageCount == 0);

        books.add(new Book(title, author, publisher, pageCount));
    }

    static void readBooks() {
        if (books.isEmpty()) {
            System.out.println("Nu exista carti in lista.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
    
    static void updateBook(int index) {
        if (index < books.size()) {
            Book b = books.get(index);
            System.out.print("New Title: ");
            b.setTitle(scanner.nextLine());
            System.out.print("New Author: ");
            b.setAuthor(scanner.nextLine());
            System.out.print("New Publisher: ");
            b.setPublisher(scanner.nextLine());
            int pageCount;
            do {
                System.out.print("New Page count: ");
                pageCount = scanner.nextInt();
                scanner.nextLine(); 
            } while (pageCount == 0);
            b.setPageCount(pageCount);
        }
    }

    static void deleteBook(int index) {
        if (index < books.size()) {
            books.remove(index);
        }
    }
    public static void main(String[] args) {
        createBook();
        System.out.println();
        readBooks();
        updateBook(0);
        System.out.println();
        readBooks();
        deleteBook(0);
        System.out.println();
        readBooks();

        Book b1 = new Book("Harry Potter", "J.K.Rowling", "Pub1", 100);
        Book b2 = new Book("Harry Potter", "J.K.Rowling", "Pub2", 200);
        System.out.println();
        System.out.println("Duplicate: " + BookstoreCheck.isDuplicate(b1, b2));
        Book thicker = BookstoreCheck.thickerBook(b1, b2);
        System.out.println(thicker);
    }
}
