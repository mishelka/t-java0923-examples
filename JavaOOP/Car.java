public class Car {
    private String brand;
    private String color;
    private boolean started = false;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
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
}
