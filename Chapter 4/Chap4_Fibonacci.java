import java.util.Scanner;

public class Chap4_Fibonacci {
    public static void main(String[] args) {
        Scanner Fibonacci = new Scanner(System.in);

        // Prompt the user for the maximum number in the Fibonacci series
        System.out.print("Enter the maximum number for the Fibonacci series: ");
        int maxNumber = Fibonacci.nextInt();

        if (maxNumber < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            // Display the Fibonacci series up to the given number
            System.out.println("Fibonacci series up to " + maxNumber + ":");
            displayFibonacciSeries(maxNumber);
        }

        // Close the scanner
        Fibonacci.close();
    }

    // Method to display Fibonacci series up to a given number
    public static void displayFibonacciSeries(int maxNumber) {
        if (maxNumber >= 0) {
            int a = 0;
            int b = 1;

            // Print the first Fibonacci number
            if (maxNumber >= a) {
                System.out.print(a + " ");
            }

            // Print the rest of the Fibonacci numbers
            while (b <= maxNumber) {
                System.out.print(b + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
    }
}
