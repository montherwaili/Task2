/**
 * Class to count the number of digits in a given integer
 * using a while loop.
 */
public class DigitCounter {

    public static void main(String[] args) {
        // Initialize the target number to count its digits
        int number = 123456;

        // Save the original value because 'number' will be modified to 0 during the loop
        int originalNumber = number;

        // Counter variable to keep track of the number of digits, starting at 0
        int count = 0;

        // Special check: if the number is 0, it technically has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop continues until all digits are removed and 'number' becomes 0
            while (number != 0) {
                // Increment the counter for each digit found
                count++;

                // Remove the last digit from the number using integer division by 10
                number = number / 10;
            }
        }

        // Display the original input number
        System.out.println("Number: " + originalNumber);

        // Display the total count of digits found
        System.out.println("Number of digits: " + count);
    }
}

