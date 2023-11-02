package vehicles;

public class Truck extends Vehicle {
    private String loadedStuff;

    public Truck(String brand, String color, String loadedStuff) {
        super(brand, color);
        this.loadedStuff = loadedStuff;
    }

    public void unload() {
        this.loadedStuff = null;
    }

    public void load(String stuff) {
        this.loadedStuff = stuff;
    }

    @Override
    public String toString() {
        String s = "Truck " + super.color + " " + super.brand + ", ";
        s += loadedStuff == null ? "unloaded" : (" loaded with " + loadedStuff);
        return s;
    }
}
