import java.util.Scanner;

public class CalculateRoomSize {
	static double length, width, height;
	static String userContinue = null;

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		do {
			System.out.println("Welcome to the Grand Circus' Room Detail Generator!");
			System.out.println("Enter Length: ");
			length = userInput.nextDouble();
			System.out.println("Enter Width: ");
			width = userInput.nextDouble();
			System.out.println("Enter Height: ");
			height = userInput.nextDouble();
			userInput.nextLine();
			double area = length * width;
			double perimeter = (length * 2) + (width * 2);
			double volume = length * width * height;
			System.out.println(
					"Area: " + area + "ft" + "\nPerimeter: " + perimeter + "ft" + "\nVolume: " + volume + "ft");
			System.out.println("Continue? (Y/N): ");
			userContinue = userInput.nextLine();
			System.out.println("You entered: " + userContinue);
		} while (userContinue.equalsIgnoreCase("y"));
		System.out.println("Thank for for using my program!");
		userInput.close();
	}

}
