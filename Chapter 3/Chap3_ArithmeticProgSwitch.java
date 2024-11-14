import java.util.Scanner;

public class Chap3_ArithmeticProgSwitch {
	public static void main(String[] args) {
		
		int numero1, numero2,op_choice;
		Scanner inAr = new Scanner(System.in);
		//Variable Declaration
		
		System.out.println("_________ GMI ARITHMETIC PROGRAM _________");
		
		// Reads an integer from the console
		// and stores into the numero1 variable
		System.out.println("Please enter an integer :");
        numero1 = inAr.nextInt();
        
        // Reads an integer from the console
        // and stores into the numero2 variable
        System.out.println("Please enter another integer :");
        numero2 = inAr.nextInt();
        inAr.nextLine();
        
        //Reads an integer from the console
        //and stores into the op_choice variable 
        System.out.println("\nPlease enter which arithemtic operator you would like to use :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Increment");
        System.out.println("7. Decrement");
        op_choice = inAr.nextInt();
        inAr.close();
        
     // Calculates using all operators with numero1 and numero2
        int addition = numero1+numero2;
        int subtraction = numero1-numero2;
        int multiplication = numero1*numero2;
        int division = numero1/numero2;
        int modulus = numero1%numero2;
        int increment = ++numero1;
        int decrement = --numero2;
        
        
        
        
        // Calculates following users choice of operator (op_choice)
        switch(op_choice) {
          case 1:System.out.println("\nAddition :" + addition);break;
	      case 2:System.out.println("\nSubtraction :" + subtraction );break;
	      case 3:System.out.println("\nMultiplication :" + multiplication);break;
	      case 4:System.out.println("\nDivision :" + division);break;
	      case 5:System.out.println("\nModulus :" + modulus );break;
	      case 6:System.out.println("\nIncrement :" + increment);break;
	      case 7:System.out.println("\nDecrement :" + decrement);break;
	      default:System.out.println("\nInvalid choice.");break;
        }

        
		}
		


}
