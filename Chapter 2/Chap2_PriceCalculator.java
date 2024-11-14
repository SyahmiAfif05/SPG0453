import java.util.Scanner;

public class Chap2_PriceCalculator {
public static void main(String[] args) {
		
		String itemName;
		int Price, Quantity;
		double DiscRate;
		//Variable Declaration
		
		System.out.println("_________ DISCOUNT CALCULATOR _________");
		
		Scanner DiscCal = new Scanner(System.in);
		
		// Reads a single line from the console
		// and stores into name variable
		System.out.println("\nPlease enter the item name :");
        itemName = DiscCal.nextLine();
        
        // Reads a single line from the console
        // and stores into ID variable
        System.out.println("\nPlease enter the price of the item : (RM)");
        Price = DiscCal.nextInt();
        DiscCal.nextLine();
        
        // Reads a single line from the console
        // and stores into Subject variable
        System.out.println("\nPlease enter the quantity of the item :");
        Quantity = DiscCal.nextInt();
        DiscCal.nextLine();

        // Reads a integer from the console
        // and stores into Test1 variable
        System.out.println("\nPlease enter the discount rate : (0.2, 0.3)");
        DiscRate = DiscCal.nextDouble();
        DiscCal.close();
        
        // Calculates pricebeforediscount & priceafterdiscount with DiscRate, Quantity and Price.
        int pricebeforediscount = Price*Quantity;
        double discount = 1 - DiscRate;
        double priceafterdiscount = discount*Price*Quantity;
        double DiscountRate = DiscRate*100;
        
        // Prints name, ID, Subject & avgmarks to the console
        System.out.println("\nItem Name : " + itemName);
        System.out.println("Price : RM" + Price);
        System.out.println("Quantity : " + Quantity);
        System.out.println("Total Price for "+ itemName + ":RM" + pricebeforediscount);
        System.out.println("Discount Rate : " + DiscountRate + "%");
        System.out.println("Price after Discount :RM" + priceafterdiscount);
}
}