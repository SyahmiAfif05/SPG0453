import java.util.Scanner;

public class Chap2_UserInput {
	public static void main(String[] args) {
		
		String name, hobby, favfood;
		int age;
		//Variable Declaration
		
		Scanner inputinnit = new Scanner(System.in);
		
		// Reads a single line from the console
		// and stores into name variable
		System.out.println("Please enter your name :");
        name = inputinnit.nextLine();
        
        // Reads a integer from the console
        // and stores into age variable
        System.out.println("Please enter your age :");
        age = inputinnit.nextInt();
        inputinnit.nextLine();
        
        // Reads a line from the console
        // and stores into hobby variable
        System.out.println("Please enter your hobby :");
        hobby = inputinnit.nextLine();
        
        // Reads a line from the console
        // and stores into favfood variable
        System.out.println("Please enter your favorite food :");
        favfood = inputinnit.nextLine();
        inputinnit.close();
        
 
        // Prints name and age to the console
        System.out.println("\nName : " + name);
        System.out.println("Age : " + age);
        System.out.println("Hobby : " + hobby);
        System.out.println("Favorite Food : " + favfood);
		}
		

}
