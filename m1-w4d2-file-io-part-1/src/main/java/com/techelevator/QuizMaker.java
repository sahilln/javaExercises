package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		File file = getFileFromUser();

		try (Scanner fileInput = new Scanner(file)) {
			int points = 0;
			int questions = 0;
			while (fileInput.hasNextLine()) {
				String quizLines = fileInput.nextLine();
				String[] quiz = quizLines.split("\\|");
				String prompt = quiz[0];
				List<String> answers = new ArrayList<String>();
				int correct = 0;

				System.out.println(prompt);
				for (int i = 1; i < quiz.length; i++) {
					String answerKey = quiz[i];
					if (answerKey.contains("*")) {
						correct = i;
						answerKey = answerKey.substring(0, answerKey.length() - 1);
					}
					System.out.println(Integer.toString(i) + ") " + answerKey);
				}

				Scanner input = new Scanner(System.in);
				int userInput = input.nextInt();
				System.out.println("Your answer: " + userInput);
				if (userInput == correct) {
					System.out.println("You are correct!");
					points++;
					questions++;
				} else {
					System.out.println("Sorry that isn't correct!");
					questions++;
				}
			}

			System.out.println("You got " + points + " answer(s) out of the total " + questions + " questions asked.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static File getFileFromUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the path to the file.");
		String path = input.next();

		File file = new File(path);
		if (!file.exists()) {
			System.out.println("That file doesn't exist.");
			System.exit(1); // exit with an error status
		} else if (!file.isFile()) {
			System.out.println(path + "is a directory.");
			System.exit(1);
		}

		return file;
	}
}