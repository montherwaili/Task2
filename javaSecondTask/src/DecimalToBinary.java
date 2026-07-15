/**
 * Class to convert a decimal number into its binary representation
 * using arithmetic operations and a loop without built-in methods.
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        // Initialize the target decimal number to convert
        int number = 25;

        // Save the original value for display purposes at the end
        int originalNumber = number;

        // Initialize a String variable to hold the binary result as required
        String binary = "";

        // Special case: if the number is 0, its binary representation is simply "0"
        if (number == 0) {
            binary = "0";
        } else {
            // Loop runs as long as the number is greater than 0
            while (number > 0) {
                // Get the remainder of dividing the number by 2 (will be 0 or 1)
                int remainder = number % 2;

                // Build the binary string by placing the new remainder at the FRONT.
                // This automatically reverses the order as required by the task.
                binary = remainder + binary;

                // Divide the number by 2 to process the next bit
                number = number / 2;
            }
        }

        // Display the original decimal number
        System.out.println("Decimal Number: " + originalNumber);

        // Display the final calculated binary representation
        System.out.println("Binary Number: " + binary);
    }
}
