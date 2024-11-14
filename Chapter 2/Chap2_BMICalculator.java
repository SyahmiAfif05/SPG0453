import java.util.Scanner;

public class Chap2_BMICalculator {
public static void main(String[] args) {
		
		double weight, height;
		//Variable Declaration
		
		System.out.println("_________ BMI CALCULATOR _________");
		
		Scanner BMIC = new Scanner(System.in);
		
		// Reads a double from the console
		// and stores into weight variable
		System.out.println("\nPlease enter your weight : (KG)");
        weight = BMIC.nextDouble();
        
        // Reads a double from the console
        // and stores into height variable
        System.out.println("\nPlease enter your height : (m)");
        height = BMIC.nextDouble();
        
        
        // Calculates BMI with weight and height 
        double BMI = weight/(height*height);
        
        // Prints BMI
        System.out.format("\nYour BMI is : %.1f" ,BMI);
		
        
        	
        }
}
