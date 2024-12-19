import lms.Book;
import lms.Library;
import lms.Patron;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // add books
        library.addBook(new Book(1, "No sweetness here", "Ama Atta Aidoo", "1987"));
        library.addBook(new Book(2, "Monkey king", "Agya Koo", "2005"));

        //add users

        Library.addPatron(new Patron(1, "Alomo Gyata", "0241234567"));
        Library.addPatron(new Patron(2, "Joe Alipatre", "0201234567"));

        // borrow book

        System.out.println("Borrowing Book:");
        boolean borrowed = library.borrowBook(1, 1);
        System.out.println(borrowed ? "Book borrowed successfully" : "Failed to borrow book");

        // listing books

        System.out.println("\nBooks:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // returning book
        System.out.println("\nReturning Book:");
        boolean returned = library.returnBook(1, 1);
        System.out.println(returned ? "Book returned successfully" : "Failed to return book");

        // list books

        System.out.println("\nAvailable books: :");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}