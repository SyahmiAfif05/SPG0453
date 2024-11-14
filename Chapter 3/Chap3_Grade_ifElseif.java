import java.util.Scanner;

public class Chap3_Grade_ifElseif {
	public static void main(String[]args) {
		  
		  int Test_1,Test_2;
		  //Variable Declaration
		  
		  //Initializing Scanner grade_in
		  Scanner grade_in= new Scanner(System.in);
		  
		  System.out.println("_________ GMI GRADES CALCULATOR _________");
		  
		  //Reads an integer from the console
		  //and stores into the Test_1 variable
	      System.out.println("Please enter your Test 1 scores. (/100)");
	      Test_1 = grade_in.nextInt();
	      
	      //Reads an integer from the console
		  //and stores into the Test_2 variable
	      System.out.println("Please enter your Test 2 scores. (/100)");
	      Test_2 = grade_in.nextInt();
	      grade_in.close();
	      

		  //Calculates the value for Grade by using Test_1+Test_2 and dividing it by 2
	      int Grade = (Test_1+Test_2)/2;
	      
	      //if...else if depending on the value of Grade calculated
	      if (Grade>=80) 
	    	  System.out.println("\nYour grades are : A");
	      else if (Grade>=60)
	    	  System.out.println("\nYour grades are : B");
	      else if (Grade>=40)
	    	  System.out.println("\nYour grades are : C");
	      else
	    	  System.out.println("\nYour grades are : F");
}
	  }

