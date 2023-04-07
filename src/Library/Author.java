package Library;

import java.util.ArrayList;

public class Author {
    private String surname;
    private String name;
    private ArrayList<Book> books;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeAllBooks() {
        books.clear();
    }
}