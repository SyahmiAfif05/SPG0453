import java.util.Scanner;

public class Chap3_InteractivePriceDisc {
public static void main(String[] args) {
		
		String itemName;
		int Price, Quantity,DiscColor;
		double DiscRate = 0;
		//Variable Declaration
		
		System.out.println("_________ DISCOUNT CALCULATOR _________");
		
		Scanner DiscCal = new Scanner(System.in);
		
		// Reads a single line from the console
		// and stores into itemName variable
		System.out.println("\nPlease enter the item name :");
        itemName = DiscCal.nextLine();
        
        // Reads a single line from the console
        // and stores into Price variable
        System.out.println("\nPlease enter the price of the item : (RM)");
        Price = DiscCal.nextInt();
        DiscCal.nextLine();
        
        // Reads a single line from the console
        // and stores into Quantity variable
        System.out.println("\nPlease enter the quantity of the item :");
        Quantity = DiscCal.nextInt();
        DiscCal.nextLine();

        // Reads a integer from the console
        // and stores into DiscColor variable
        System.out.println("\nPlease enter the color code for the for the item:");
        System.out.println("1. Red (50%)");
        System.out.println("2. Orange (30%)");
        System.out.println("3. Yellow (20%)");
        System.out.println("4. Blue (10%)");
        DiscColor = DiscCal.nextInt();
        DiscCal.close();
        
        // Switches the value of DiscRate depending on what the user chose for DiscColor
        switch(DiscColor) {
          case 1:DiscRate = 0.5;break;
	      case 2:DiscRate = 0.3;break;
	      case 3:DiscRate = 0.2;;break;
	      case 4:DiscRate = 0.1;;break;
	      default:System.out.println("Invalid color code.");
        }
        
        // Calculates pricebeforediscount & priceafterdiscount with DiscRate, Quantity and Price.
        int pricebeforediscount = Price*Quantity;
        double discount = 1 - DiscRate;
        double priceafterdiscount = discount*Price*Quantity;
        double DiscountRate = DiscRate*100;
        
        // Prints itemName, Price, Quantity, pricebeforediscount, DiscountRate & priceafterdiscount to the console
        System.out.println("\nItem Name : " + itemName);
        System.out.println("Price per item : RM" + Price);
        System.out.println("Quantity : " + Quantity);
        System.out.println("Total Price for "+ itemName + ":RM" + pricebeforediscount);
        System.out.println("Discount Rate : " + DiscountRate + "%");
        System.out.println("Price after Discount :RM" + priceafterdiscount);
	}
		

}
