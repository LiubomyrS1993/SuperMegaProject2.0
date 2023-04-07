package Library;

public class Book extends LibraryItem {
    private String description;
    private int year;
    private Genre genre;
    private Author author;

    public Book(String name, String description, int year, Genre genre, Author author) {
        super(name);
        this.description = description;
        this.year = year;
        this.genre = genre;
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public void display() {
        System.out.println(getName() + " by " + getAuthor().getName() + " (" + getGenre().getName() + ", " + getYear() + ")");
    }
}
