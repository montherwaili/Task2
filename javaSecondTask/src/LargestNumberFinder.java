/**
 * Class to find the largest number among a set of values
 * using a for loop and conditional comparison.
 */
public class LargestNumberFinder {

    public static void main(String[] args) {
        // An array of numbers to be compared
        int[] numbers = {12, 45, 89, 34, 67, 23};

        // Initialize 'largest' with the first element of the array
        int largest = numbers[0];

        // Loop through the rest of the array starting from index 1
        for (int i = 1; i < numbers.length; i++) {

            // Current number to be compared in this iteration
            int number = numbers[i];

            // Check if the current number is greater than the currently known largest number
            if (number > largest) {
                // Update 'largest' with the new higher value found
                largest = number;
            }
        }

        // Display the final largest number found after completing the loop
        System.out.println("Largest Number: " + largest);
    }
}
