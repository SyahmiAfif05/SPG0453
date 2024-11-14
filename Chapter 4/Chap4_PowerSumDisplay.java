
public class Chap4_PowerSumDisplay {
	public static void main(String[] args) {
        int sum = 0;  // To store the sum of squares

        System.out.println("Number\tSquare");
        System.out.println("----------------");

        // Loop through integers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int square = calculateSquare(i);  // Calculate square of the integer
            System.out.println(i + "\t" + square);  // Display the integer and its square
            sum += square;  // Add the square to the sum
        }

        // Display the total sum of squares
        System.out.println("----------------");
        System.out.println("Sum of squares: " + sum);
    }

    // Method to calculate the square of an integer
    public static int calculateSquare(int number) {
        return number * number;
    }
        }
        

    	
    
 


