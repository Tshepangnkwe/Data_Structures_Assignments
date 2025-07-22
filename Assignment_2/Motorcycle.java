package Assignment_2;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    // Getter and setter
    public boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String vehicleType() {
        return "Motorcycle";
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Motorcycle, Sidecar: " + (hasSidecar ? "Yes" : "No");
    }
}

