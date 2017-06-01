package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File file = getFileFromUser();
		String outputBase = makeNewFile();
		System.out.println("How many lines would you like in each file?");
		int numberOfLines = input.nextInt();
		int count = 1;
		
		try (Scanner fileInput = new Scanner(file)) {

			while (fileInput.hasNextLine()) {
				String outputFile = outputBase + count + ".txt";

				try (PrintWriter writer = new PrintWriter(outputFile)) {
					for (int i = 0; i < numberOfLines; i++) {
						if(fileInput.hasNextLine()){
							String line = fileInput.nextLine();
							writer.println(line);
						}
					}
				}
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static File getFileFromUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the path to the file.");
		String path = input.nextLine();

		File file = new File(path);
		if (!file.exists()) {
			System.out.println("That file doesn't exist");
			System.exit(1);
		} else if (!file.isFile()) {
			System.out.println(path + " is a directory.");
			System.exit(1);
		}

		return file;
	}
	
	private static String makeNewFile() {
		System.out.println("Where would you like to save the splits?");
		Scanner input = new Scanner(System.in);
		String path = input.nextLine();
		return path;
	}

}