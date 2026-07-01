import java.util.Scanner;


public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Basic validation to avoid a meaningless empty array
        while (size <= 0) {
            System.out.print("Array size must be a positive integer. Please try again: ");
            size = scanner.nextInt();
        }

        // Step 2: Create the array
        int[] numbers = new int[size];

        // Step 3: Populate the array with user input
        System.out.println("Enter " + size + " integer value(s):");
        for (int i = 0; i < size; i++) {
            System.out.print("  Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Linear search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Display the results in a clean, professional format
        System.out.println();
        System.out.println("===== Find Maximum: Results =====");
        System.out.print("Array Entered   : [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Maximum Value    : " + maxValue);
        System.out.println("Found at Index   : " + maxIndex);
        System.out.println("==================================");

        scanner.close();
    }
}
