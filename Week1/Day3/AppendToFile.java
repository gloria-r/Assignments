/**
 * 
 */
package com.lavenberg;

import java.io.BufferedWriter;

/**
 * @author Gloria
 *
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {			 
			 Files.write(Paths.get("TestFile.txt"), "\nText written to file".getBytes(), StandardOpenOption.APPEND);
			 
	            
	            System.out.println("Successfully Appended Text To File.");
	 
		 }
	        catch (IOException e) {
	            System.out.println("An Error Occurred");
	            e.printStackTrace();
	        }
	}
	
}


