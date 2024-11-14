import java.util.Scanner;

public class Chap2_ArithmeticProg {
	public static void main(String[] args) {
		
		int numero1, numero2;
		Scanner inAr = new Scanner(System.in);
		//Variable Declaration
		
		
		// Reads a integer from the console
		// and stores into numero1 variable
		System.out.println("Please enter an integer :");
        numero1 = inAr.nextInt();
        
        // Reads a integer from the console
        // and stores into numero2 variable
        System.out.println("\nPlease enter another integer :");
        numero2 = inAr.nextInt();
        inAr.close();
        
     // Calculates using all operators with numero1 and numero2
        int addition = numero1+numero2;
        int subtraction = numero1-numero2;
        int multiplication = numero1*numero2;
        int division = numero1/numero2;
        int modulus = numero1%numero2;
        int increment = ++numero1;
        int decrement = --numero2;
        
        
        
        
        // Calculates using all operators with numero1 and numero2
        System.out.println("\nAddition :" + addition);
        System.out.println("Subtraction :" + subtraction );
        System.out.println("Multiplication :" + multiplication);
        System.out.println("Division :" + division);
        System.out.println("Modulus :" + modulus );
        System.out.println("Increment :" + increment);
        System.out.println("Decrement :" + decrement);
        
		}
		

}
