import java.util.Scanner;
import java.util.ArrayList;

public class Chap4_EvenOddSequenceCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Step 1: Input sequence of integers
            ArrayList<Integer> numbers = getNumbers(scanner);

            // Step 2: Count even and odd numbers
            int[] counts = countEvenOdd(numbers);

            // Step 3: Display results
            displayResults(counts);

            // Step 4: Ask user if they want to continue
            System.out.println("\nDo you want to enter another sequence? (yes/no)");
            String userResponse = scanner.next().toLowerCase();
            continueProgram = userResponse.equals("yes");

            // Clear the input buffer for next iteration
            scanner.nextLine();  // Consume the newline character left by next()
        }

        System.out.println("Exiting program....");
        scanner.close();
    }

    // Method to get a sequence of integers from the user
    public static ArrayList<Integer> getNumbers(Scanner scanner) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        System.out.println("Enter integers (type 'done' to finish):");

        while (scanner.hasNextInt()) {
            numbersList.add(scanner.nextInt());
        }

        // Consume the non-integer input (assumed to be 'done')
        scanner.next(); // This consumes the non-integer input, e.g., "done"

        return numbersList;
    }

    // Method to count even and odd numbers
    public static int[] countEvenOdd(ArrayList<Integer> numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }

    // Method to display the results
    public static void displayResults(int[] counts) {
        System.out.println("\nEven numbers: " + counts[0]);
        System.out.println("Odd numbers: " + counts[1]);
    }
}
