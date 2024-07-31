package BookProgram;

public class Book {
    private String name;
    private int year;
    private String contents;

    public Book(String name, int year, String contents) {
        this.name = name;
        this.year = year;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + year + ")\nContents: " + contents;
    }
}

