import java.util.Random;
import java.util.Scanner;

public class DiceRollerApp {
	static int random1, random2, sides;
	static String choice, choice2;

	private static void rollDice(Random randomizer, Scanner userInput) {
		do {
			random1 = randomizer.nextInt(sides) + 1;
			random2 = randomizer.nextInt(sides) + 1;
			System.out.println("Result:\n\t" + random1 + "\n\t" + random2);
			if ((random1 + random2) == 1) {
				System.out.println("\tSnake eyes!");
			} else if ((random1 + random2) == 7) {
				System.out.println("\tCraps!");
			} else if ((random1 + random2) == 12) {
				System.out.println("\tBox cars!");
			}
			System.out.println("Roll again?(y/n): ");
			choice = userInput.next();
			userInput.nextLine();
		} while (choice.equalsIgnoreCase("y"));
	}

	public static void main(String[] args) {
		Random randomizer = new Random();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("How many sides should each die have?\n(Enter an integer): ");
		sides = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Roll the dice?(y/n): ");
		choice = userInput.next();
		userInput.nextLine();
		rollDice(randomizer, userInput);
		System.out.println("Thanks for playing!");
		userInput.close();
	}

}
