package lms;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private static List<Patron> patrons;

    // constructor
    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();

    }

    // book management, which returns no value
    public  void addBook(Book book){
       books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public Book searchBookByID(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
               return book;
            }
        }
        return null;
    }

    // patron management system

    public static void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public List<Patron>getPatrons() {
        return patrons;
    }

    // system for borrowing a book

    public boolean borrowBook(int bookID, int PatronID) {
        Book book = searchBookByID(bookID);
        if (book != null && book.isAvailable()) {
            Patron patron = searchPatronByID(PatronID);
            if (patron != null) {
                book.setAvailable(false);
                patron.borrowBook(book);
                return true;
            }
        }
        return false;

    }

    public boolean returnBook(int bookID, int patronID) {
        Book book = searchBookByID(bookID);
        if (book != null && !book.isAvailable()) {
            Patron patron = searchPatronByID(patronID);
            if (patron != null && patron.getBorrowedBooks().contains(book)) {
                book.setAvailable(true);
                patron.returnBook(book);
                return true;
            }
        }
        return false;

    }

    private Patron searchPatronByID(int ID){
        for (Patron patron : patrons) {
            if (patron.getID() == ID) {
                return patron;
            }
        }
        return null;
    }
}
