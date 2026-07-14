public class PalindromeChecker {
    /**
     * Class to check if a given number is a palindrome.
     * A palindrome number reads the same backward as forward.
     */


        public static void main(String[] args) {
            // Initialize the target number to be checked
            int number = 1221;

            // Save the original value because 'number' will become 0 during the loop
            int originalNumber = number;

            // This variable will hold the reversed version of the number
            int reversedNumber = 0;

            // Loop to extract digits and build the reversed number mathematically
            while (number != 0) {
                // Get the last digit
                int digit = number % 10;

                // Append the digit to the reversed number
                reversedNumber = (reversedNumber * 10) + digit;

                // Remove the last digit from the original number
                number = number / 10;
            }

            // Display the original input number
            System.out.println("Number: " + originalNumber);

            // Compare the original number with the completely reversed number
            if (originalNumber == reversedNumber) {
                // If they are equal, it is a palindrome
                System.out.println("The number is a palindrome.");
            } else {
                // If they are not equal, it is not a palindrome
                System.out.println("The number is NOT a palindrome.");
            }
        }
    }