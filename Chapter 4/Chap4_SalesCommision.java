import java.util.Scanner;

public class Chap4_SalesCommision {
	public static void main(String[] args) {
        // Constants
        final double baseSalary = 600.00;
        final double commissionRate = 0.05;
        
        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Input: Ask for the number of items sold and the price per item
        System.out.print("Enter the number of items sold by the salesman last week: ");
        int itemsSold = scanner.nextInt();
        
        System.out.print("Enter the price per item: RM ");
        double pricePerItem = scanner.nextDouble();
        
        // Calculate gross sales
        double grossSales = itemsSold * pricePerItem;
        
        // Calculate commission
        double commission = grossSales * commissionRate;
        
        // Calculate total earnings
        double totalEarnings = baseSalary + commission;
        
        // Display the results
        System.out.printf("\nGross sales for the week: RM %.2f\n", grossSales);
        System.out.printf("Commission earned: RM %.2f\n", commission);
        System.out.printf("Total earnings for the week: RM %.2f\n", totalEarnings);
        
        // Close the scanner
        scanner.close();
    }

}
