import java.util.Scanner;

public class PowersTable {
	static Scanner userInput = new Scanner(System.in);
	static double userDouble;
	static String userContinue = "y";

	public static void main(String[] args) {
		System.out.println(
				"The purpose of this program is to produce a table of squares and cubes that ends with a user given integer.");
		while (userContinue.equalsIgnoreCase("y")) {
			System.out.println("Please enter an integer: ");
			userDouble = userInput.nextDouble();

			System.out.println("Number\t\tSquared\t\tCubed");
			System.out.println("======\t\t======\t\t======");

			for (int i = 1; i <= userDouble; i++) {
				int square = (int) Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);
				System.out.println(i + "\t\t" + square + "\t\t" + cubed);
			}
			System.out.println("Do you want to continue?(y/n): ");
			userContinue = userInput.next();
		}

	}

}
