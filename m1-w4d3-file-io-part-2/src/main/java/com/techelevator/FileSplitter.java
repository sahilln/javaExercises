package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File file = getFileFromUser();
		System.out.println("How many lines would you like in each file?");
		int numberOfLines = input.nextInt();

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

}
