
public class Chap4_Factorial_NonInteractive {
	  public static void main(String[] args) {
	        int n = 7;  // Hardcoded value for demonstration
	        long factorial = 1;

	        // Iterative method to calculate factorial
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }

	        // Display the result
	        System.out.println("The factorial of " + n + " is " + factorial);
	    }
}
