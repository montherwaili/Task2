public class StudentGradeCalculator {
    /**
     * Class to calculate a student's average grade from three subjects
     * and determine their academic performance status.
     */

        public static void main(String[] args) {
            // Initialize grades for three subjects using double for precision
            double grade1 = 85.0;
            double grade2 = 90.0;
            double grade3 = 80.0;

            // Calculate the average by summing all grades and dividing by the total count (3)
            double average = (grade1 + grade2 + grade3) / 3.0;

            // Variable to hold the final performance status
            String status;

            // Decision logic to determine the performance status based on the average score
            if (average >= 90.0) {
                status = "Excellent";
            } else if (average >= 75.0) {
                status = "Good";
            } else if (average >= 60.0) {
                status = "Pass";
            } else {
                status = "Fail";
            }

            // Display the individual subject grades
            System.out.println("Grade 1: " + grade1);
            System.out.println("Grade 2: " + grade2);
            System.out.println("Grade 3: " + grade3);

            // Display the calculated average score
            System.out.println("Average: " + average);

            // Display the final evaluation status
            System.out.println("Status: " + status);
        }
    }


