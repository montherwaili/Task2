public class FibonacciSequence {


/**
 * Class to generate and display the first 15 numbers
 * of the Fibonacci sequence in a single line.
 */

    public static void main(String[] args) {
        // First number of the Fibonacci sequence
        int first = 0;

        // Second number of the Fibonacci sequence
        int second = 1;

        // Total number of elements to display in the sequence
        int totalElements = 15;

        // Display the first number followed by a space
        System.out.print(first + " ");

        // Display the second number followed by a space
        System.out.print(second + " ");

        // Loop starts from 3 because the first two numbers are already printed
        for (int count = 3; count <= totalElements; count++) {

            // Calculate the next number by adding the previous two numbers
            int next = first + second;

            // Print the newly calculated number followed by a space
            System.out.print(next + " ");

            // Update variables: 'first' takes the value of 'second'
            first = second;

            // 'second' takes the value of 'next' for the upcoming iteration
            second = next;
        }

        // Print a new line at the very end of the output
        System.out.println();
    }
}
