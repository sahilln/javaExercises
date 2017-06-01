package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		// Ask the user for a file location
		// Verify that file doesn't exist
		File outputFile = getFileFromUser();

		// Open the file for writing
		try (PrintWriter writer = new PrintWriter(outputFile)) {
			// Loop through 1 to 300
			for (int i = 1; i <= 100; i++) {
				// Print the fizzbuzz value to the file
				writer.println(fizzBuzz(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static File getFileFromUser() {
		System.out.println("Where would you like to save this file?");
		Scanner userInput = new Scanner(System.in);
		String path = userInput.nextLine();

		File outputFile = new File(path);
		if (outputFile.exists()) {
			System.out.println("File already exists!");
			System.exit(1);
		}
		return outputFile;
	}

	private static String fizzBuzz(int value) {
		if (divisibleBy(value, 3) && divisibleBy(value, 5)) {
			return "FizzBuzz";
		} else if (divisibleBy(value, 3) || contains(value, 3)) {
			return "Fizz";
		} else if (divisibleBy(value, 5) || contains(value, 5)) {
			return "Buzz";
		} else {
			return Integer.toString(value);
		}
	}

	private static boolean divisibleBy(int value, int divisor) {
		return value % divisor == 0;
	}

	private static boolean contains(int value, int digit) {
		return Integer.toString(value).contains(Integer.toString(digit));
	}
}
