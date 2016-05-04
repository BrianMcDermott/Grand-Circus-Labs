import java.util.InputMismatchException;
import java.util.Scanner;

public class BattingAverageCalculator {
	static int[] baseballStats = null;
	static int timesAtBat, basesSum, hits = 0;
	static float bases, bats, slugPercentage, batAverage = 0;
	static boolean tryMe = true;
	static String choice = "y";
	private static Scanner userInput = new Scanner(System.in);

	public static int[] getBaseballStats(int capacity) {
		int[] array = new int[capacity];
		return array;
	}

	public static void validateInput() {
		do {
			try {
				tryMe = true;
				System.out.println("Enter number of times at bat:");
				timesAtBat = userInput.nextInt();
				break;
			} catch (NumberFormatException | InputMismatchException ex) {
				tryMe = false;
				System.out.println("Invalid input, enter an integer only.");
				userInput.nextLine();
				continue;
			}
		} while (!tryMe);
	}

	public static void fillBaseballStats() {
		for (int i = 0; i < baseballStats.length; i++) {
			int temp = 0;
			do {
				do {
					try {
						tryMe = true;
						System.out.println("Must Enter Integer: 0=out, 1=single, 2=double, 3=triple or 4=home run");
						System.out.printf("Result for at-bat " + (i + 1) + ": ");
						temp = userInput.nextInt();
						break;
					} catch (NumberFormatException | InputMismatchException ex) {
						tryMe = false;
						System.out.println("Must enter only integers 0, 1, 2, 3 or 4.");
						userInput.nextLine();
						continue;
					}
				} while (!tryMe);

			} while (temp < 0 | temp > 4);
			baseballStats[i] = temp;
		}
	}

	public static void addBasesAndHits() {
		hits = 0;
		for (int i = 0; i < baseballStats.length; i++) {
			basesSum += baseballStats[i];
			switch (baseballStats[i]) {
			case 1: case 2: case 3: case 4:
				hits += 1;
				break;
			}
		}
	}

	public static void addHits() {
		for (int i = 0; i < baseballStats.length; i++) {

		}
	}

	public static void printBaseballStats() {
		for (int i = 0; i < baseballStats.length; i++) {
			System.out.println(baseballStats[i]);
		}
	}
	public static void main(String[] args) {
		do {
			System.out.println("Welcome to the Batting Average Calculator!");
			validateInput();
			baseballStats = getBaseballStats(timesAtBat);
			fillBaseballStats();
			addBasesAndHits();
			performCalculations();
			System.out.format("Batting average: %.3f" + "\t\tSlugging average: %.3f", batAverage, slugPercentage);
			userInput.nextLine();
			System.out.println("\nAnother batter?(y/n): ");
			choice = userInput.nextLine();
		} while (choice.equalsIgnoreCase("y"));
		if (choice.equalsIgnoreCase("n")) {
			System.out.println("Thank you for using my Batting Average Calculator.");
			System.exit(1);
		}
	}


	private static void performCalculations() {
		float bases = basesSum;
		float bats = timesAtBat;
		slugPercentage = bases / bats;
		batAverage = hits / bats;
	}
}