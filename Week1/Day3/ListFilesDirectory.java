
package com.lavenberg;

import java.io.File;

public class ListFilesDirectory {
	 public void listFiles(String startDir) {
		 	//Create a file object
	        File dir = new File(startDir);
	        File[] files = dir.listFiles();

	        if (files != null) {
	            for (File file : files) {
	                    System.out.println(file.getName());
	                }
	            }
	        }	
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListFilesDirectory test = new ListFilesDirectory();
	        String startDir = ("C:/Users/Peekay/TestFolder");
	        test.listFiles(startDir);		
	}
}

