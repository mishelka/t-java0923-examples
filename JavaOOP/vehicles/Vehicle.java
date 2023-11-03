package vehicles;

import cars.Person;

public abstract class Vehicle {
    protected String brand;
    protected String color;
    protected boolean started = false;
    protected Person owner;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Vehicle(String brand, String color) {
        this(brand);
        this.color = color;
    }

    public Vehicle(String brand, String color, boolean started) {
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

    @Override
    public String toString() {
        return brand + " " + color + " ("
                + (started ? "engine started" : "engine off")
                + "), [Owner: "
                + (owner != null ? owner : "no owner assigned")
                + "]";
    }
}
