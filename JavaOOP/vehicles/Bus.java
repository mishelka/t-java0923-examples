package vehicles;

public class Bus extends Vehicle {
    private int numberOfPassengers;

    public Bus(String brand, String color, int numberOfPassengers) {
        super(brand, color);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Bus " + super.color + " " + super.brand + ", " + numberOfPassengers + " passengers";
    }
}
