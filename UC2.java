import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);

        // Check existence of "Sleeper"
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nIs Sleeper bogie present? " + exists);

        // Final List
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for next operations...");
    }
}