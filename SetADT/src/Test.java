/*
 * NAME: Shirley Ramirez
 * Programming Fundamentals
 * Summer Semester 2020
 * PROGRAMMING ASSIGNMENT 4 - SET
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String command;

		String[] methodValue = new String[2];
		String method;
		int value;

		Set setValues = new Set();
		String add = "add";
		String delete = "del";
		String exists = "exists";

		// Header
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Shirley Ramirez");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
		System.out.println();

		while (true) {
			// Prompt user to enter command
			System.out.print("Enter command: ");
			command = scan.nextLine();

			// Separate command entered into method to call and value to use
			methodValue = command.split(" ");

			// Validate command length
			if (methodValue.length != 2) {
				System.out.println("Not a valid command. Please try again.");
				System.out.println();
				continue;
			}

			// Validate method name
			method = methodValue[0];

			// Validate user input

			try {
				value = Integer.parseInt(methodValue[1]);

				if (method.equals(add)) {
					setValues.add(value);
					System.out.println(setValues);
					continue;
				}

				if (method.equals(delete)) {
					setValues.delete(value);
					System.out.println(setValues);
					continue;
				}

				if (method.equals(exists)) {
					System.out.println(setValues.exists(value));
					continue;
				}

				System.out.println("Not a valid command. Please try again.");
				System.out.println();

			} catch (NumberFormatException ex) {
				System.out.println("Not a valid command. Please try again.");
				System.out.println();
			}

		}
	}
}