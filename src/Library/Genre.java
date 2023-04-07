package Library;

import java.util.ArrayList;

public class Genre {
    private String name;
    private String description;
    private ArrayList<Book> books;

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
