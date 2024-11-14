
public class Chap4_EvenOddDisplaySum {
    public static void main(String[] args) { 	
    	
    	int evenSum = 0;
        int oddSum = 0;
        
        StringBuilder evenNumbers = new StringBuilder();
        StringBuilder oddNumbers = new StringBuilder();

        // Display integers and classify them as even or odd
        System.out.print("Integers: ");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print(num + " ");
            
            if (num % 2 == 0) {
                // Number is even
            	evenNumbers.append(num).append(" ");
                evenSum += num;
            } else {
                // Number is odd
            	oddNumbers.append(num).append(" ");
                oddSum += num;
            }
        }
        
        // New line for clarity
        System.out.println("\n\nEven numbers: " + evenNumbers.toString().trim());
        System.out.println("Odd numbers: " + oddNumbers.toString().trim());
        
        // Display the sums of even and odd numbers
        System.out.println("\nEven numbers sum: " + evenSum);
        System.out.println("Odd numbers sum: " + oddSum);

    	
    
    
    }
}
