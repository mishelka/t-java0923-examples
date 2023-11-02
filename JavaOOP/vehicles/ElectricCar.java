package vehicles;

public class ElectricCar extends Vehicle {
    private int batteryLevel = 100;

    public ElectricCar(String brand, String color, int batteryLevel) {
        super(brand, color);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "Electric Car " + super.color + " " + super.brand + ", " + batteryLevel + "% battery";
    }
}
