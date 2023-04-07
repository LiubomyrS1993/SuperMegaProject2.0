package Library;

public abstract class LibraryItem implements Displayable {
    private String name;

    public LibraryItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}