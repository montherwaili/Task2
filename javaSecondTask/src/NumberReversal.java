public class NumberReversal {
    /**
     * Class to reverse the digits of a given integer
     * using arithmetic operations and a while loop.
     */


        public static void main(String[] args) {
            // Initialize the original number to be reversed
            int number = 12345;

            // This variable will store the final reversed number
            int reversedNumber = 0;

            // Save the original value for display purposes at the end
            int originalNumber = number;

            // Loop continues until all digits are extracted and 'number' becomes 0
            while (number != 0) {

                // Extract the last digit of the number using the modulo operator (%)
                int digit = number % 10;

                // Build the reversed number: shift existing digits to the left (multiply by 10)
                // and add the newly extracted digit
                reversedNumber = (reversedNumber * 10) + digit;

                // Remove the last digit from the number by performing integer division by 10
                number = number / 10;
            }

            // Print the original number using System.out.println()
            System.out.println("Original Number: " + originalNumber);

            // Print the final reversed number using System.out.println()
            System.out.println("Reversed Number: " + reversedNumber);
        }
    }
