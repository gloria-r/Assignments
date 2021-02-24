package com.lavenberg;

import java.util.Scanner;

public class AddingDifferentTypes {
	public static void main(String args[]) {
	//Getting input from user
	Scanner input = new Scanner (System.in);
	System.out.println("Enter an int, float and double number seperated by spaces: ");
	
	int a = input.nextInt();
	System.out.println("You entered integer" + a);
	
	double b = input.nextDouble(); 
    System.out.println("You entered double " + b); 
    
    float c = input.nextFloat(); 
    System.out.println("You entered float " + c);
    //Printing number to the screen
    System.out.println("\n");
    System.out.println("Types Entered...");
    System.out.println("    integer a = " + a);
    System.out.println("    double b = " + b);
    System.out.println("    float c = " + c);

    //Adding numbers
    System.out.println("\n");
    System.out.println("Adding Types...");
    System.out.println("    int a + float b = " + (a + b));
    System.out.println("    double b + float c = " + (b + c));
    System.out.println("    int a + double b + float c = " + (a + b + c));
	
	}
}
