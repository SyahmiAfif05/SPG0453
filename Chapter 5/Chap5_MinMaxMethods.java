import java.util.Scanner;

public class Chap5_MinMaxMethods {
	public static void main (String args[]) {
	      Scanner MinMax = new Scanner(System.in);
	      boolean Looping = true;
	      while (Looping) {
	    	  
	    	  int[] numeros = getUserInput(MinMax);
	    	  int maxNumero = findMax(numeros);
	    	  int minNumero = findMin(numeros);
	    	  
	    	  System.out.println("\nMaximum value : " + maxNumero);
	    	  System.out.println("Minimum value : " + minNumero);
	    	  
	    	  Looping = asktocontinue(MinMax);
	    	  
	      }
	      
	      System.out.println("Exiting program....");
	      MinMax.close();
	}
	      public static int[] getUserInput(Scanner MinMax) {
	    	  System.out.print("\nEnter the first integer: ");
	    	  int numero1 = MinMax.nextInt();
	    			  
	    	  System.out.print("Enter the second integer: ");
	    	  int numero2 = MinMax.nextInt();
	    	  
	    	  System.out.print("Enter the third integer: ");
	    	  int numero3 = MinMax.nextInt();
	    	  
	    	  return new int[] {numero1,numero2,numero3};
	    	  
	      }
	      
	      public static int findMax(int[] numeros) {
	    	  return Math.max(numeros[0],Math.max(numeros[1], numeros[2]));
	      }
	      
	      public static int findMin(int[] numeros) {
	    	  return Math.min(numeros[0],Math.min(numeros[1], numeros[2]));
	      } 
	    	  
          public static boolean asktocontinue(Scanner MinMax) {
	    	  System.out.println("\nDo you want to enter another set of integers? (yes/no)");
	    	  String userRespond = MinMax.next().toLowerCase();
	    	  return userRespond.equals("yes");
          }

	      }
	      


