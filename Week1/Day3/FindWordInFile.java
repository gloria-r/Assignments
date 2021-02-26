package com.lavenberg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWordInFile {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner myWord = new Scanner(System.in);
        System.out.println("Enter a word to find: ");
        String word = myWord.next();
        boolean flag = false;
        int count = 0;
        
        System.out.println("\n---Contents of the file:");
      //Reading the contents of the file
        Scanner myFile = new Scanner(new FileInputStream("/Users/Peekay/SampleText.txt"));
        while (myFile.hasNextLine()) {
            String line = myFile.nextLine();
            System.out.println(line);
            if(line.indexOf(word)!=-1) {
                flag = true;
                count++;
            }
        }
        if (flag) {
            System.out.println("\nOkay, the file contains that word");
            System.out.println("Number of occurrences is: "+count);
        } else {
            System.out.println("\nFile does not contain that word");
        }

        }

	}
