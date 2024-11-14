import java.util.Scanner;

public class Chap4_PasswordSystem {
	public static void main(String[] args) {
        // Predefined correct password
        final String CORRECT_PASSWORD = "SWE3Syahmi";
        
        // Maximum number of attempts
        final int MAX_ATTEMPTS = 3;
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Variables to keep track of attempts
        int attempts = 0;
        boolean isAuthenticated = false;

        System.out.println("Password System");
        System.out.println("Please enter your password.");

        while (attempts < MAX_ATTEMPTS && !isAuthenticated) {
            // Prompt user to enter password
            System.out.print("Attempt " + (attempts + 1) + ": ");
            String inputPassword = scanner.nextLine();
            
            // Check if the input password matches the correct password
            if (inputPassword.equals(CORRECT_PASSWORD)) {
                isAuthenticated = true;
                System.out.println("Access Granted!");
            } else {
                attempts++;
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Incorrect password. Please try again.");
                    System.out.println("Remaining attempts: " + (MAX_ATTEMPTS - attempts));
                }
            }
        }
        
        if (!isAuthenticated) {
            System.out.println("Access Denied. You have used all attempts.");
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
