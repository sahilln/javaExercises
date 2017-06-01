package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		// Ask the user for the file path
		// Verify that's a valid file
		File file = getFileFromUser();
		
		// Ask the user for the search term
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a search word");
		String searchWord = input.nextLine();
		
		//Ask the user if the search should be case-insensitive
		System.out.println("Do you want to search in a case insensitive way?");
		String response = input.nextLine();
		boolean caseInsensitive = response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");
		
		if(caseInsensitive){
			searchWord = searchWord.toLowerCase();
		}
		
		// Open the file for reading
		try(Scanner fileInput = new Scanner(file)) {
			
		
			// Go line by line through the file
			int lineNumber = 1;
			while(fileInput.hasNextLine()) {
				String originalLine = fileInput.nextLine();
				String line = originalLine;
				
				if(caseInsensitive){
					line = line.toLowerCase();
				}
				
				// On each line check for the search term
				if(line.contains(searchWord)){
					// If we find it print out the line number and the line from the file
					System.out.println(Integer.toString(lineNumber) + ") " + originalLine);
				}
				
				lineNumber++;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	private static File getFileFromUser() {
			
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter the path to the file.");
			String path = input.nextLine();
			
			File file = new File(path);
			if(!file.exists()) {
				System.out.println("That file doesn't exist");
				System.exit(1);
			} else if(!file.isFile()){
				System.out.println(path + " is a directory.");
				System.exit(1);
			}
			
			return file;
	}

}
