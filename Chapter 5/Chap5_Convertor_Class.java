import java.util.Scanner;

class Chap5_Convertor_Class {
  public void ConvTool(){
		
		int value = 0, op_choice;
		Scanner converter = new Scanner(System.in);
		//Variable Declaration
		
		System.out.println("Converter available :");
		

      //Reads an integer from the console
      //and stores into the op_choice variable 
      System.out.println("1. Length (km - miles)");
      System.out.println("2. Weight (kg - lbs)");
      System.out.println("3. Temperature (°C - °F)");
	  System.out.print("Choose your converter : ");
      op_choice = converter.nextInt();
      

   // Reads an integer from the console
   // and stores into the value variable
      System.out.print("Insert Amount/Quantity : ");
      value = converter.nextInt();
      converter.close();

      // Calculates following users choice of operator (op_choice)
      switch(op_choice) {
        case 1:System.out.println("\n" + value + "km " + " = " + (value/1.609) + " miles");
               break;
        case 2:System.out.println("\n" + value + "kg " + " = " + value*2.205 + " pounds");
               break;
        case 3:System.out.println("\n" + value + "°C " + " = " + ((value*9/5) +32) + " °F");
               break;

      
		}
		


	  
  }
}
