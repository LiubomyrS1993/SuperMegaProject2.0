package Library;

public class Genre extends LibraryItem {
    private String description;

    public Genre(String name, String description) {
        super(name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void display() {
        System.out.println(getName() + ": " + getDescription());
    }
}
