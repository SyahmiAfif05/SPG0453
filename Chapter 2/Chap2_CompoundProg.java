import java.util.Scanner;

public class Chap2_CompoundProg {
public static void main(String[] args) {
		
		int numero;
		//Variable Declaration
		
		//Introduction
		System.out.println("_________ Increment & Decrement Operators Explanator 3000 _________");
		System.out.println("\nWelcome to the Increment & Decrement Operators Explanator 3000! All"
				+ " you have \nto do is just type a number and let our system explain the differences!");
		
		
		Scanner InCO = new Scanner(System.in);
		
		
		// Reads a double from the console
		// and stores into numero variable
		System.out.println("\n\u001B[33m"+"Please enter an integer (a) : "+"\u001B[0m");
        numero = InCO.nextInt();
        

        
        
        // Explanation between prefix and postfix
        System.out.println("\nWhen it comes to the increment & decrement operators,"
        		+ " there is both a "+ "\u001B[44m" + "prefix" + "\u001B[0m" + " and a " + "\u001B[41m" +"postfix"+"\u001B[0m"+ "."+ "\n\nLet me first explain the "+"\u001B[44m"+ "prefix"+ "\u001B[0m"+" aspect of it.");
        
        System.out.println("A " + "\u001B[44m" + "prefix" + "\u001B[0m" + " is when the ++ & -- symbols are before the name of a variable.");
        System.out.println("\nThis, in return, will cause the value of the variable to increment or decrement first,"
        		+ "\nthen the results will be used in the expression.");
        System.out.println("\nThe example of "+"\u001B[44m" + "prefix" + "\u001B[0m" +" is shown below: \n");
        
        int b = ++numero;
        System.out.println("\u001B[33m"+"Prefix Increment Operator"+"\u001B[0m");
        System.out.println("a: " + numero + ", b: " + b);

        int c = --numero;
        System.out.println("\n\u001B[33m"+"Prefix Decrement Operator"+"\u001B[0m");
        System.out.println("a: " + numero + ", b: " + c);
        
        System.out.println("\nIn these examples, a is incremented/decremented by 1.");
        System.out.println("Then, the result is assigned to b.");
        
        System.out.println("\nNow, let me explain the "+"\u001B[41m" +"postfix"+"\u001B[0m"+" aspect of it.");
        System.out.println("A "+"\u001B[41m" +"postfix"+"\u001B[0m"+" is when the ++ & -- symbols are after the name of a variable.");
        System.out.println("\nThis, in return, will cause the value of the variable to be used in the expression first,"
        		+ "\nthen it is incremented/decremented.");
        System.out.println("\nThe example of "+"\u001B[41m" +"postfix"+"\u001B[0m"+" is shown below: \n");
        
        int d = numero++;
        System.out.println("\u001B[33m"+"Postfix Increment Operator"+"\u001B[0m");
        System.out.println("a: " + numero + ", b: " + d);

        int e = numero--;
        System.out.println("\n\u001B[33m"+"Postfix Decrement Operator"+"\u001B[0m");
        System.out.println("a: " + numero + ", b: " + e);
        
        System.out.println("\nIn these examples, a is used in the expression first.");
        System.out.println("Then, it is incremented/decremented by 1, which is b.");
        
        System.out.println("\nThank you for using our system! :D");
		}
		

}
