package Library;

public class Book {
    private String name;
    private String description;
    private int yearOfIssue;
    private Genre genre;
    private Author author;

    public Book(String name, String description, int yearOfIssue, Genre genre, Author author) {
        this.name = name;
        this.description = description;
        this.yearOfIssue = yearOfIssue;
        this.genre = genre;
        this.author = author;
        this.genre.addBook(this);
        this.author.addBook(this);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }
}
