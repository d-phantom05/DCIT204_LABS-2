import java.util.Scanner;

/**
 * PairSum.java
 *
 * Interactive program that reads an array of integers and a target sum
 * from the user, then uses a Brute Force (Nested Loop) approach to find
 * a pair of elements whose values add up to the target sum.
 *
 * Time Complexity: O(n^2) - every pair (i, j) with i < j is checked.
 * Space Complexity: O(n) - for storing the array itself.
 */
public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            System.out.print("Array size must be a positive integer. Please try again: ");
            size = scanner.nextInt();
        }

        // Step 2: Create and populate the array
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer value(s):");
        for (int i = 0; i < size; i++) {
            System.out.print("  Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute Force (Nested Loop) search for a matching pair
        boolean pairFound = false;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < numbers.length && !pairFound; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    pairFound = true;
                    break;
                }
            }
        }

        // Step 5 / 6: Display the results
        System.out.println();
        System.out.println("===== Pair Sum: Results =====");
        System.out.print("Array Entered  : [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Target Sum     : " + target);

        if (pairFound) {
            int valueA = numbers[firstIndex];
            int valueB = numbers[secondIndex];
            System.out.println("Pair Found     : Yes");
            System.out.println("Indices        : [" + firstIndex + "] and [" + secondIndex + "]");
            System.out.println("Values         : " + valueA + " and " + valueB);
            System.out.println("Equation       : " + valueA + " + " + valueB + " = " + target);
        } else {
            System.out.println("Pair Found     : No matching pair exists for the target sum.");
        }
        System.out.println("==============================");

        scanner.close();
    }
}
