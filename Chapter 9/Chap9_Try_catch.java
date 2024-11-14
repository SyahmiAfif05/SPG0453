

public class Chap9_Try_catch {
	public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // Change this to a non-zero value to test successful division

        try {
            // Attempt to divide
            int result = numerator / denominator;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            // Catch division by zero error
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues after the try-catch block.");
    }
}
