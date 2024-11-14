import java.util.Scanner;

public class Chap4_BonusToInstructor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be positive.");
        }

        // Initialize counters for passed and failed students
        int passedCount = 0;
        int failedCount = 0;

        // Get the test results from the user
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter result for student " + i + " (1 for pass, 0 for fail): ");
            int result = scanner.nextInt();

            // Validate input
            if (result == 1) {
                passedCount++;
            } else if (result == 0) {
                failedCount++;
            } else {
                System.out.println("Invalid input. Enter 1 for pass or 0 for fail.");
                i--; // Decrement i to repeat this iteration
            }
        }

        // Calculate the percentage of students who passed
        double passPercentage = (double) passedCount / numberOfStudents * 100;

        // Display the number of passed and failed students
        System.out.println("\nNumber of students who passed: " + passedCount);
        System.out.println("Number of students who failed: " + failedCount);

        // Check if more than 50% passed and display message if true
        if (passPercentage > 50) {
            System.out.println("\nBonus to instructor! :D");
        }
        
        // Close the scanner
        scanner.close();
    }

}
