/**
 * Class to calculate the multiplication result of numbers
 * within a given range (inclusive) using a for loop.
 */
public class MultiplicationCalculator {

    public static void main(String[] args) {
        // Define the starting and ending points of the range
        // For example, 1 to 5 gives 1 * 2 * 3 * 4 * 5 = 120
        int start = 1;
        int end = 5;

        // Initialize 'result' to 1 because multiplying by 0 would wipe out the product
        int result = 1;

        // Loop through each number in the range from 'start' to 'end' inclusive
        for (int i = start; i <= end; i++) {

            // Multiply the current accumulated result by the loop counter variable
            result = result * i;
        }

        // Display the final multiplication product after completing the loop
        System.out.println("Multiplication Result: " + result);
    }
}