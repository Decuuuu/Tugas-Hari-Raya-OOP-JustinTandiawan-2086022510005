class Food { // [cite: 81]
    String name;
    int basePrice;

    public Food(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public int calcPrice() {
        return basePrice + 5000; // Labour cost [cite: 82]
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + calcPrice()); // [cite: 86]
    }
}

class RegularMenu extends Food {
    public RegularMenu(String name, int basePrice) { super(name, basePrice); }
    @Override
    public int calcPrice() { return super.calcPrice() + 10000; } // [cite: 83]
}

class SpecialMenu extends Food {
    public SpecialMenu(String name, int basePrice) { super(name, basePrice); }
    @Override
    public int calcPrice() { return super.calcPrice() + 20000; } // [cite: 83]
}

public class THROOPQ3 {
    public static void main(String[] args) {
        new Food("Beef Rendang", 15000).getInfo(); // [cite: 85]
        new RegularMenu("Chicken Ramen", 20000).getInfo(); // [cite: 85]
        new SpecialMenu("Fiery Fried Rice", 80000).getInfo(); // [cite: 85]
    }
}