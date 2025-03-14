package basic_calculator;

import java.util.Scanner;

public class Main_Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the First Number: ");
			int firstInput = scanner.nextInt();

			System.out.print("Enter the Second Number: ");
			int secondInput = scanner.nextInt();

			System.out.println("\n\n[1] Add");
			System.out.println("[2] Subtract");
			System.out.println("[3] Multiply");
			System.out.println("[4] Divide");
			System.out.print("Select Operation: ");
			int choice = scanner.nextInt();

			scanner.nextLine();

			switch (choice) {
			case 1: {
				int result = Calculations.Addition(firstInput, secondInput);
				System.out.println("The answer was: " + result);
				System.out.print("Want to continue? [Y][N]: ");

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
				System.out.println("The answer was: " + result);
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
				System.out.println("The answer was: " + result);
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
				int result = Calculations.Division(firstInput, secondInput);
				System.out.println("The answer was: " + result);
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
