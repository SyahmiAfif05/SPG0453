import java.util.Scanner;

public class Chap2_AgeCalculator {
	public static void main(String[] args) {
		
		int currentyear, birthyear;
		//Variable Declaration
		
		System.out.println("_________ AGE GUESSER _________");
		
		Scanner inputage = new Scanner(System.in);
		
		// Reads a single line from the console
		// and stores into currentyear variable
		System.out.println("Please enter the current year :");
        currentyear = inputage.nextInt();
        inputage.nextLine();
        
        // Reads a integer from the console
        // and stores into birthyear variable
        System.out.println("Please enter your birth year :");
        birthyear = inputage.nextInt();
        inputage.close();
        
        // Calculates age based on currentyear and birthyear given
        int age = currentyear - birthyear;
        
        // Prints age to the console
        System.out.println("\nYour age is : " + age);

		}
		

}
