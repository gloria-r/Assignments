package com.lavenberg;

public class LargestNumberArray {

	public static void main(String[] args) {
		int myNumbers[][] = { {2, 4, 6, 8, 10}, {34, 9, 21, 75} };
	    int max = Integer.MIN_VALUE; // stores the maximum possible value for any integer variable 
	    for (int i = 0; i < myNumbers.length; i++) {
	        for (int j = 0; j < myNumbers[i].length; j++) {
	            if (myNumbers[i][j] > max) {	
	            max = myNumbers[i][j];
	            }
	        }
	    }
	         System.out.println("The largest number in the array is: " + max);
	}

}
