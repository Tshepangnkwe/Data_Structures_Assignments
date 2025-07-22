package Assignment_1;

public abstract class Vehicle implements Comparable<Vehicle> {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Accessors (getters)
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    // Mutators (setters)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Abstract method that subclasses must implement
    public abstract String vehicleType();

    // Comparable interface method for sorting by year ascending
    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.year, other.year);
    }

    // toString method with explicit details
    @Override
    public String toString() {
        return "Brand: " + brand + ", Year: " + year;
    }
}
