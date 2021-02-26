package com.lavenberg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindCharInFile {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner myWord = new Scanner(System.in);
		char character;
        System.out.println("Enter a character to find: ");
        character = myWord.nextLine().charAt(0);
       // String word = myWord.next();
        boolean flag = false;
        int count = 0;
        
        System.out.println("Contents of the file");
      //Reading the contents of the file
        Scanner myFile = new Scanner(new FileInputStream("/Users/Peekay/SampleText.txt"));
                
        while (myFile.hasNextLine()) {
                 String line = myFile.nextLine();
                 System.out.println(line);
                 
                 for(int i = 0; i < line.length(); i++){
                     if(line.charAt(i) == character){
                     flag = true;
                     count++;      
            }
        }
        if (flag) {
            System.out.println("\nOkay, the file contains that character");
            System.out.println("Number of occurrences is: "+count);
        } else {
            System.out.println("File does not contain that character");
        }

        }
	}
}

