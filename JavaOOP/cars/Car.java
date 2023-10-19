package cars;

public class Car {
    private String brand;
    private String color;
    private boolean started = false;
    private Person owner;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String color) {
        this(brand);
        this.color = color;
    }

    public Car(String brand, String color, boolean started) {
        this(brand, color);
        this.started = started;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStarted() {
        return started;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
