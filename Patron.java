package lms;
import java.util.ArrayList;
import java.util.List;

public class Patron {
    private int patronID;
    private String name;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    // constructor

    public Patron(int ID, String name, String phoneNumber) {
        this.patronID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();

    }

    // getters

    public int getID() {
        return patronID;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // methods of the patron

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // overriding the toString method

    public String toString(){
        return "Patron{" +
                "id=" + patronID +
                "name=" + name + '\'' +
                "borrowedBooks=" +borrowedBooks + '}';
    }
}
