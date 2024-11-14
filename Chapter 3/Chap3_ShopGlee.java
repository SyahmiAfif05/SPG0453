import java.util.Scanner;

public class Chap3_ShopGlee {
	public static void main(String[] args) {
		
		int MineralWater=1,SuperRing=2,IceLemonTea=5,OyakiCheese=3,ChocChip=4, itemchoice;
		//Variable Declaration
		
		System.out.println("------------------------------------------");
		System.out.println("|      Welcome to ShopGlee! :D     |");
		System.out.println("------------------------------------------");
		System.out.println("-----------Please Select an Item----------");
		System.out.println("|  1.Mineral Water  : RM1.00             |");
		System.out.println("|  2.Super Ring     : RM2.00             |");
		System.out.println("|  3.Ice Lemon Tea  : RM5.00             |");
		System.out.println("|  4.Oyaki Cheese   : RM3.00             |");
		System.out.println("|  5.Chocolate Chip : RM4.00             |");
		System.out.println("__________________________________________");
		//Interface for ShopGlee
		
		
		Scanner item = new Scanner(System.in);  // Create a Scanner object
		System.out.println("\nInsert code of your desired item : "); //Prompts user to insert item code
		itemchoice = item.nextInt();  // Read user input
		
		
		//Switches output depending on the value of variable itemchoice
		switch(itemchoice){
		case 1:System.out.println("You have selected Mineral Water.");
		       break;
		case 2:System.out.println("You have selected Super Ring.");
	           break;
		case 3:System.out.println("You have selected Ice Lemon Tea.");
		       break;
		case 4:System.out.println("You have selected Oyaki Cheese.");
		       break;
		case 5:System.out.println("You have selected Chocolate Chip.");
		       break;
		default:System.out.println("Invalid code.");break;
		
		}
		
		// if..else that follows the value of variable itemchoice
		if (itemchoice==1) {
		    System.out.println("\nInsert Quantity : ");
		    int Quantity = item.nextInt();  // Read user input
		    item.close();
		    System.out.println("\nMineral Water : RM1.00");
		    System.out.println("\nTotal Price : RM" + Quantity*1 + ".00");}
		else if (itemchoice==2) {
		    System.out.println("\nInsert Quantity : ");
		    int Quantity = item.nextInt();  // Read user input
		    item.close();
		    System.out.println("\nSuper Ring : RM2.00");
		    System.out.println("\nTotal Price : RM" + Quantity*2 + ".00");}
		else if (itemchoice==3) {
		    System.out.println("\nInsert Quantity : ");
		    int Quantity = item.nextInt();  // Read user input
		    item.close();
		    System.out.println("\nIce Lemon Tea : RM5.00");
		    System.out.println("\nTotal Price : RM" + Quantity*5 + ".00");}
		else if (itemchoice==4) {
		    System.out.println("\nInsert Quantity : ");
		    int Quantity = item.nextInt();  // Read user input
		    item.close();
		    System.out.println("\nOyaki Cheese : RM3.00");
		    System.out.println("\nTotal Price : RM" + Quantity*3 + ".00");}
		else if (itemchoice==5) {
		    System.out.println("\nInsert Quantity : ");
		    int Quantity = item.nextInt();  // Read user input
		    item.close();
		    System.out.println("\nChocolate Chip : RM4.00");
		    System.out.println("\nTotal Price : RM" + Quantity*4 + ".00");}
		else {
			    System.out.println("");

		}

		System.out.println("Thank you for shopping at ShopGlee! :D ");
}
}
