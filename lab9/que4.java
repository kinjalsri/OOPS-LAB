package lab9;

import java.util.HashSet;

public class que4 {
    public static void main(String[] args) {
        String[] names = { "Aman", "Varchasv", "Sourabh", "Varchasv", "Aman" };

        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        // Check if "Sourabh" exists
        if (uniqueNames.contains("Sourabh")) {
            System.out.println("Sourabh is in the set.");
        }

        // Print unique names
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
