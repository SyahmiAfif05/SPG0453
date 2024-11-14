import java.util.Scanner;

public class Chap5_MinMax {
 public static void main (String args[]) {
      Scanner MinMax = new Scanner(System.in);
      boolean Looping = true;
      
      while (Looping) {
    	  
    	  System.out.print("\nEnter the first integer: ");
    	  int numero1 = MinMax.nextInt();
    			  
    	  System.out.print("Enter the second integer: ");
    	  int numero2 = MinMax.nextInt();
    	  
    	  System.out.print("Enter the third integer: ");
    	  int numero3 = MinMax.nextInt();
    	  
    	  int maxNumero = Math.max(numero1,Math.max(numero2, numero3));
    	  int minNumero = Math.min(numero1,Math.min(numero2, numero3));
    	  
    	  System.out.println("\nMaximum value : " + maxNumero);
    	  System.out.println("Minimum value : " + minNumero);
    	  
    	  System.out.println("\nDo you want to enter another set of integers? (yes/no)");
    	  String userRespond = MinMax.next().toLowerCase();
    	  
    	  if (!userRespond.equals("yes")) {
    		  Looping = false;
    		  System.out.println("Exiting program....");
    	  }
      }
      
      MinMax.close();
 }
}
