import java.util.Stack;

class Book {
    String title, author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title; this.author = author; this.year = year;
    }

    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + year);
    }
}

class GeneralBook extends Book {
    String genre;
    public GeneralBook(String t, String a, int y, String g) {
        super(t, a, y); this.genre = g; // [cite: 186]
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Genre: " + genre); // [cite: 177]
    }
}

class ChildrenBook extends Book {
    int minAge;
    boolean hasVisual;
    public ChildrenBook(String t, String a, int y, int age, boolean v) {
        super(t, a, y); this.minAge = age; this.hasVisual = v;
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Minimum Age: " + minAge);
        System.out.println("Has Visualisation: " + (hasVisual ? "Yes" : "No")); // [cite: 182]
    }
}

public class THROOPQ5 {
    public static void main(String[] args) {
        Stack<Book> library = new Stack<>(); // [cite: 185]
        
        // Pre-load 5 books [cite: 157]
        library.push(new Book("Why Black Moves First", "Wesley So", 2025)); // [cite: 172]
        library.push(new GeneralBook("Inside Black Mesa", "Dr. Isaac Kleiner", 1997, "Documentary")); // [cite: 173]
        library.push(new ChildrenBook("Got Science?", "Rachel Dawes", 2015, 5, true)); // [cite: 173]
        
        // Tampilkan semua
        for (Book b : library) {
            b.getInfo();
            System.out.println();
        }
    }
}