import java.util.Scanner;

public class Chap4_Factorial_Interactive {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner Factorial = new Scanner(System.in);

        // Prompt the user to enter a value for n
        System.out.print("Enter a positive integer: ");
        int n = Factorial.nextInt();

        // Validate input
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        // Compute factorial using iterative method
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("The factorial of " + n + " is " + factorial);

        // Close the scanner
        Factorial.close();
    }
}
