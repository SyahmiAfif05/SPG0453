package JavaPop;

import java.util.Scanner;

class Chap5_AVG_INTERFACE {
	//Math-Class Method for finding the maximum average for student marks
	   public int findMax(int StudentAvg1, int StudentAvg2, int StudentAvg3) {
			return Math.max(StudentAvg1,Math.max(StudentAvg2, StudentAvg3));
			
		}
	   
	//Method to calculate average for all three student's tests
	   public int[] calcAvg(int Stu1T1, int Stu1T2, int Stu2T1, int Stu2T2, int Stu3T1, int Stu3T2) {
		    int StudentAvg1 = (Stu1T1+Stu1T2)/2;
			int StudentAvg2 = (Stu2T1+Stu2T2)/2;
			int StudentAvg3 = (Stu3T1+Stu3T2)/2;
			return new int[] {StudentAvg1, StudentAvg2, StudentAvg3};
	   }
	   
	   public void ReadUserInput2(){
			
		   int Stu1T1,Stu1T2,Stu2T1,Stu2T2,Stu3T1,Stu3T2;
			Scanner userinput = new Scanner(System.in);
			
			//Asks input from 
			System.out.print("Enter the Test 1 marks of student 1 (/100) :");
			Stu1T1 = userinput.nextInt();
		   
			System.out.print("Enter the Test 2 marks of student 1 (/100) :");
			Stu1T2 = userinput.nextInt();
			
			System.out.print("Enter the Test 1 marks of student 2 (/100) :");
			Stu2T1 = userinput.nextInt();
		   
			System.out.print("Enter the Test 2 marks of student 2 (/100) :");
			Stu2T2 = userinput.nextInt();
		   
			System.out.print("Enter the Test 1 marks of student 3 (/100) :");
			Stu3T1 = userinput.nextInt();
		   
			System.out.print("Enter the Test 2 marks of student 3 (/100) :");
			Stu3T2 = userinput.nextInt();

			
			// Assigns value to averages
			int[] averages = calcAvg(Stu1T1,Stu1T2,Stu2T1,Stu2T2,Stu3T1,Stu3T2);
			int StudentAvg1 = averages[0];
			int StudentAvg2 = averages[1];
			int StudentAvg3 = averages[2];
			
			// Displays average marks for all three students
			System.out.println("\nAverage marks of student 1 : " + StudentAvg1);
			System.out.println("Average marks of student 2 : " + StudentAvg2);
			System.out.println("Average marks of student 3 : " + StudentAvg3);
			
			// Displays highest average marks from all three students
			int MaxAvg = findMax(StudentAvg1,StudentAvg2,StudentAvg3);
			System.out.println("\nThe highest averages marks are : " + MaxAvg);
	   }

}

