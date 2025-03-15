package basic_calculator;

import java.util.Scanner;

public class Main_Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("=====================================");
		System.out.println("     🖩 WELCOME TO BASIC CALCULATOR   ");
		System.out.println("=====================================\n");

		while (true) {
			System.out.println("\n─────────────────────────────────────");
			System.out.print("▶ Enter the First Number: ");
			int firstInput = scanner.nextInt();

			System.out.print("▶ Enter the Second Number: ");
			int secondInput = scanner.nextInt();

			System.out.println("\n─────────────────────────────────────");
			System.out.println("SELECT OPERATION");
			System.out.println("─────────────────────────────────────");
			System.out.println("[1] Add");
			System.out.println("[2] Subtract");
			System.out.println("[3] Multiply");
			System.out.println("[4] Divide");
			System.out.print("▶ Your Choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			System.out.println("\n─────────────────────────────────────");

			switch (choice) {
			case 1: {
				int result = Calculations.Addition(firstInput, secondInput);
				System.out.printf("Result: %d + %d = %d\n", firstInput, secondInput, result);
				System.out.print("\nWant to continue? [Y][N]: ");

				String answer = scanner.nextLine();

				if (answer.equalsIgnoreCase("N")) {
					System.out.println("Exiting calculator...");
					scanner.close();
					return;
				}

				break;
			}

			case 2: {
				int result = Calculations.Subtraction(firstInput, secondInput);
				System.out.printf("Result: %d - %d = %d\n", firstInput, secondInput, result);
				System.out.print("Want to continue? [Y][N]: ");

				String answer = scanner.nextLine();

				if (answer.equalsIgnoreCase("N")) {
					System.out.println("Exiting calculator...");
					scanner.close();
					return;
				}

				break;
			}

			case 3: {
				int result = Calculations.Multiplication(firstInput, secondInput);
				System.out.printf("Result: %d x %d = %d\n", firstInput, secondInput, result);
				System.out.print("Want to continue? [Y][N]: ");

				String answer = scanner.nextLine();

				if (answer.equalsIgnoreCase("N")) {
					System.out.println("Exiting calculator...");
					scanner.close();
					return;
				}

				break;
			}

			case 4: {
				while (secondInput == 0) {
					System.out.println("Error: Division by zero is not allowed. Please enter a non-zero divisor.");
					System.out.print("▶ Enter Second Number again: ");
					secondInput = scanner.nextInt();
					scanner.nextLine();
				}
				int result = Calculations.Division(firstInput, secondInput);
				System.out.printf("Result: %d ÷ %d = %d\n", firstInput, secondInput, result);
				System.out.print("Want to continue? [Y][N]: ");

				String answer = scanner.nextLine();

				if (answer.equalsIgnoreCase("N")) {
					System.out.println("Exiting calculator...");
					scanner.close();
					return;
				}
				break;
			}
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}
