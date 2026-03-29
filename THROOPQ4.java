class Item { // Base class [cite: 115]
    String title;
    int releaseYear;
    double price;

    public Item(String title, int releaseYear, double price) {
        this.title = title;
        this.releaseYear = releaseYear; // 1800 < year < 2026 [cite: 146]
        this.price = price;
    }

    public void getDescription() {
        System.out.println("Title: " + title);
        System.out.println("release Year: " + releaseYear);
        System.out.println("Price: " + (int)price);
    }
}

class Dvd extends Item {
    double runtime;
    public Dvd(String t, int y, double p, double r) { 
        super(t, y, p); this.runtime = r; // [cite: 144]
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Runtime: " + (int)runtime + " minutes"); // [cite: 132]
    }
}

class Magazine extends Item {
    String author;
    int numPages;
    public Magazine(String t, int y, double p, String a, int n) {
        super(t, y, p); this.author = a; this.numPages = n;
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages); // [cite: 137]
    }
}

class Vinyl extends Item {
    int size;
    public Vinyl(String t, int y, double p, int s) {
        super(t, y, p); this.size = s;
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Size in inches: " + size); // [cite: 141]
    }
}

public class THROOPQ4 {
    public static void main(String[] args) {
        new Dvd("Baby be Mine", 1982, 50000, 4).getDescription(); // [cite: 126]
        new Magazine("Nintendo Power #82", 1997, 25000, "Nintendo", 36).getDescription(); // [cite: 127]
        new Vinyl("Song of The Wind", 1967, 350000, 12).getDescription(); // [cite: 128]
    }
}