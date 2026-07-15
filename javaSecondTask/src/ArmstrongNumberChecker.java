/**
 * Class to check if a given number is an Armstrong number.
 * An Armstrong number equals the sum of its own digits each raised to the power of the number of digits.
 */
public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        // Initialize the target number to check
        int number = 153;

        // Save the original value for comparison at the end
        int originalNumber = number;

        // Variable to hold the running sum of digits raised to the power
        int sum = 0;

        // Variable to hold the total number of digits
        int count = 0;

        // --- FIRST LOOP: Count the total number of digits ---
        int tempNumber = number; // Use a temporary variable to preserve the 'number' value
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10; // Remove the last digit
        }

        // --- SECOND LOOP: Extract each digit and calculate the Armstrong value ---
        tempNumber = number; // Reset temporary variable to the original number
        while (tempNumber != 0) {
            // Extract the last digit using modulo operator (%)
            int digit = tempNumber % 10;

            // Calculate the digit raised to the power of 'count' using Math.pow
            // and cast the result back to int
            sum += (int) Math.pow(digit, count);

            // Remove the last digit from the temporary number
            tempNumber = tempNumber / 10;
        }

        // Display the original input number
        System.out.println("Number: " + originalNumber);

        // Compare the calculated sum with the original number
        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is NOT an Armstrong number.");
        }
    }
}

