package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Author> authors;
    private ArrayList<Book> books;
    private ArrayList<Genre> genres;

    public Library() {
        this.authors = new ArrayList<Author>();
        this.books = new ArrayList<Book>();
        this.genres = new ArrayList<Genre>();
    }

    public void addGenre(String name, String description) {
        Genre genre = new Genre(name, description);
        genres.add(genre);
    }

    public void removeGenre(int index) {
        Genre genre = genres.get(index);
        for (Book book : genre.getBooks()) {
            book.getAuthor().removeBook(book);
        }
        genres.remove(index);
    }

    public void displayGenres() {
        for (int i = 0; i < genres.size(); i++) {
            System.out.println(i + ". " + genres.get(i).getName());
        }
    }

    public void addAuthor(String surname, String name) {
        Author author = new Author(surname, name);
        authors.add(author);
    }

    public void removeAuthor(int index) {
        Author author = authors.get(index);
        for (Book book : author.getBooks()) {
            book.getGenre().removeBook(book);
        }
        authors.remove(index);
    }

    public void removeAllAuthors() {
        authors.clear();
    }

    public void addBook(String name, String description, int yearOfIssue) {
        System.out.println("Select the genre:");
        displayGenres();
        Scanner scanner = new Scanner(System.in);
        int genreIndex = scanner.nextInt();
        Genre genre = genres.get(genreIndex);
        System.out.println("Select the author:");
        displayAuthors();
        int authorIndex = scanner.nextInt();
        Author author = authors.get(authorIndex);
        Book book = new Book(name, description, yearOfIssue, genre, author);
        books.add(book);
    }

    public void removeBookByName(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                book.getGenre().removeBook(book);
                book.getAuthor().removeBook(book);
                books.remove(book);
                return;
            }
        }
    }

    public void displayAuthors() {
        for (int i = 0; i < authors.size(); i++) {
            System.out.println(i + ". " + authors.get(i).getSurname() + ", " + authors.get(i).getName());
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getName() + " by " + book.getAuthor().getSurname() + ", " + book.getAuthor().getName());
            System.out.println("Description: " + book.getDescription());
            System.out.println("Year of issue: " + book.getYearOfIssue());
            System.out.println("Genre: " + book.getGenre().getName());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Add genre");
            System.out.println("2. Remove genre");
            System.out.println("3. Display all genres");
            System.out.println("4. Add author");
            System.out.println("5. Remove author");
            System.out.println("6. Remove all authors");
            System.out.println("7. Add book");
            System.out.println("8. Delete book by name");
            System.out.println("9. Display all books");
            System.out.println("10. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the genre name:");
                    String genreName = scanner.next();
                    System.out.println("Enter the genre description:");
                    String genreDescription = scanner.next();
                    library.addGenre(genreName, genreDescription);
                    break;
                case 2:
                    System.out.println("Select the genre to remove:");
                    library.displayGenres();
                    int genreIndex = scanner.nextInt();
                    library.removeGenre(genreIndex);
                    break;
                case 3:
                    library.displayGenres();
                    break;
                case 4:
                    System.out.println("Enter the author surname:");
                    String authorSurname = scanner.next();
                    System.out.println("Enter the author name:");
                    String authorName = scanner.next();
                    library.addAuthor(authorSurname, authorName);
                    break;
                case 5:
                    System.out.println("Select the author to remove:");
                    library.displayAuthors();
                    int authorIndex = scanner.nextInt();
                    library.removeAuthor(authorIndex);
                    break;
                case 6:
                    library.removeAllAuthors();
                    break;
                case 7:
                    System.out.println("Enter the book name:");
                    String bookName = scanner.next();
                    System.out.println("Enter the book description:");
                    String bookDescription = scanner.next();
                    System.out.println("Enter the year of issue:");
                    int yearOfIssue = scanner.nextInt();
                    library.addBook(bookName, bookDescription, yearOfIssue);
                    break;
                case 8:
                    System.out.println("Enter the book name to delete:");
                    String bookNameToDelete = scanner.next();
                    library.removeBookByName(bookNameToDelete);
                    break;
                case 9:
                    library.displayBooks();
                    break;
                case 10:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
