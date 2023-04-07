package Library;

import java.awt.print.Book;
import java.util.ArrayList;

public class Author extends LibraryItem {
    private String firstName;
    private String lastName;
    private ArrayList<Book> books;

    public Author(String firstName, String lastName, ArrayList<Book> books) {
        super(firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public void display() {
        System.out.println(getName());
    }
}