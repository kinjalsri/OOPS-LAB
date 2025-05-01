package lab9;

import java.util.ArrayList;
import java.util.HashSet;

public class que5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        // Convert to HashSet to remove duplicates
        HashSet<Integer> unique = new HashSet<>(numbers);

        int sum = 0;
        for (int num : unique) {
            sum += num;
        }

        System.out.println("Unique values: " + unique);
        System.out.println("Sum of unique values: " + sum);
    }
}
