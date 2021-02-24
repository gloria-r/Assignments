package com.lavenberg;

public class AddingDifferentTypes {
	public static void addTypes(int a, double b, float c) {
	        	
	        System.out.println("Variable values...");
	        System.out.println("    int a = " + a);
	        System.out.println("    double b = " + b);
	        System.out.println("    float c = " + c);

	        //adding numbers
	        System.out.println("\n");
	        System.out.println("Adding Numbers...");
	        System.out.println("    a + b = " + (a + b));
	        System.out.println("    c + d = " + (b + c));
	        System.out.println("    a + b + c = " + (a + b + c));
	    }

	    public static void main(String args[]) {
	        int a = 7;
	        double b = 12.5;
	        float c = 2;
	        addTypes(a, b, c);
	    }
	}

