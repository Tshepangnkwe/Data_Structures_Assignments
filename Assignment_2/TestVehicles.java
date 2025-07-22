package Assignment_2;

import java.util.Random;
import java.util.Arrays;

public class TestVehicles {
    public static void main(String[] args) {
        Random rand = new Random();
        Vehicle[] vehicles = new Vehicle[10]; // Array to hold Vehicle objects

        // Randomly create Car or Motorcycle instances
        for (int i = 0; i < vehicles.length; i++) {
            if (rand.nextBoolean()) {
                // Create a random Car
                vehicles[i] = new Car(
                    "CarBrand" + rand.nextInt(100),
                    2000 + rand.nextInt(25),
                    2 + rand.nextInt(3)); // 2-4 doors
            } else {
                // Create a random Motorcycle
                vehicles[i] = new Motorcycle(
                    "MotoBrand" + rand.nextInt(100),
                    2000 + rand.nextInt(25),
                    rand.nextBoolean());
            }
        }

        // Demonstrate polymorphism
        for (Vehicle v : vehicles) {
            System.out.println("Type: " + v.vehicleType());
        }

        // Explicit and implicit toString demonstration
        System.out.println("\n-- Explicit toString --");
        System.out.println(vehicles[0].toString());

        System.out.println("\n-- Implicit toString --");
        System.out.println(vehicles[1]);

        // Sort the array (by year, ascending - as per compareTo)
        Arrays.sort(vehicles);

        System.out.println("\n-- Sorted Vehicles (by year) --");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

        // Time complexity analysis (printed at the end)
        System.out.println("\n==== TIME COMPLEXITY ANALYSIS ====");
        timeComplexityAnalysis();
    }

    public static void timeComplexityAnalysis() {
        // 1. Detailed Method (tau-notation)
        System.out.println("-- Detailed (tau-notation) --");
        System.out.println("tau = c1*N // random creation loop");
        System.out.println("   + c2*N*D // D: average field assignments per object");
        System.out.println("   + c3*N // Array sorting call, Arrays.sort (uses TimSort, O(N log N))");
        System.out.println("Total tau ≈ c*N + d*N*logN");

        // 2. Simplified Method
        System.out.println("\n-- Simplified Method --");
        System.out.println("Total steps: O(N) (creation) + O(N log N) (sort)");
        System.out.println("Total time: O(N log N)");

        // 3. Asymptotic Analysis (Big O)
        System.out.println("\n-- Asymptotic (Big O) --");
        System.out.println("Dominant term: O(N log N) for Arrays.sort[20][13]");
    }
}

