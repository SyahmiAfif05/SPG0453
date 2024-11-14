import java.util.Scanner;

public class Chap2_AvgMarksCalculator {
	public static void main(String[] args) {
		
		String name, ID, Subject;
		int Test1, Test2;
		//Variable Declaration
		
		System.out.println("_________ GMI MARKS CALCULATOR _________");
		
		Scanner MarkC = new Scanner(System.in);
		
		// Reads a single line from the console
		// and stores into name variable
		System.out.println("\nPlease enter your name :");
        name = MarkC.nextLine();
        
        // Reads a single line from the console
        // and stores into ID variable
        System.out.println("\nPlease enter your student ID :");
        ID = MarkC.nextLine();
        
        // Reads a single line from the console
        // and stores into Subject variable
        System.out.println("\nPlease enter your subject :");
        Subject = MarkC.nextLine();

        // Reads a integer from the console
        // and stores into Test1 variable
        System.out.println("\nPlease enter your Test 1 Marks (/100) :");
        Test1 = MarkC.nextInt();
        MarkC.nextLine();
        
        // Reads a integer from the console
        // and stores into Test2 variable
        System.out.println("\nPlease enter your Test 2 Marks (/100):");
        Test2 = MarkC.nextInt();
        MarkC.nextLine();
        
        // Calculates avgmarks with Test1 and Test2 divided by 2
        int avgmarks = (Test1+Test2)/2;
        
        // Prints name, ID, Subject & avgmarks  to the console
        System.out.println("\nName : " + name);
        System.out.println("Student ID : " + ID);
        System.out.println("Subject : " + Subject);
        System.out.println("Average marks for "+ Subject + ": " + avgmarks);
		}
		

}
