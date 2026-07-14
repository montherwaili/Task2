/**
 * Class to count how many even and odd numbers exist
 * within a given range (inclusive) using a loop.
 */
public class EvenOddCounter {

    public static void main(String[] args) {
        // Define the starting and ending points of the range
        int start = 1;
        int end = 10;

        // Counter variables to keep track of even and odd numbers, starting at 0
        int evenCount = 0;
        int oddCount = 0;

        // Loop through each number in the range from 'start' to 'end' inclusive
        for (int i = start; i <= end; i++) {

            // Check if the current number is even using the modulo operator (%)
            if (i % 2 == 0) {
                // If remainder is 0, it's an even number
                evenCount++;
            } else {
                // If remainder is not 0, it's an odd number
                oddCount++;
            }
        }

        // Display the total counts for both even and odd numbers
        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}
