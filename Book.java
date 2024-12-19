package lms;

public class Book {
    private int bookID;
    private String bookTitle;
    private String author;
    private String yearOfPublication;
    private boolean isAvailable;

    public Book(int bookID, String bookTitle, String author,  String yearOfPublication){
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;


    }

    // getters

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookID() {
        return bookID;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // setters
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookID(int bookID) {
        if (bookID <= 0) {
            System.out.println("Invalid book Id, it must be positive. ");
        }
        this.bookID = bookID;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Book{" +
                "id=" + bookID +
                ", title='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ",yearOfPublication='" + yearOfPublication + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
