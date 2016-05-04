import java.util.Scanner;

public class LetterGrader {
	public static int numGrade;
	static String letterGrade;
	static String choice = null;

	private static void convertGrade() {
		if (99 == numGrade | 100 == numGrade) {
			letterGrade = "A+";
		} else if (88 <= numGrade && numGrade <= 98) {
			letterGrade = "A";
		} else if (88 == numGrade | numGrade == 89) {
			letterGrade = "A-";
		} else if (86 == numGrade | numGrade == 87) {
			letterGrade = "B+";
		} else if (82 <= numGrade && numGrade <= 85) {
			letterGrade = "B";
		} else if (80 == numGrade | numGrade == 81) {
			letterGrade = "B-";
		} else if (78 == numGrade | numGrade == 79) {
			letterGrade = "C+";
		} else if (69 <= numGrade && numGrade <= 77) {
			letterGrade = "C";
		} else if (67 == numGrade | numGrade == 68) {
			letterGrade = "C-";
		} else if (65 == numGrade | numGrade == 66) {
			letterGrade = "D+";
		} else if (62 <= numGrade && numGrade <= 64) {
			letterGrade = "D";
		} else if (60 == numGrade | numGrade == 61) {
			letterGrade = "D-";
		} else {
			letterGrade = "F";
		}
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		do {
			System.out.println("Welcome to the Letter Grade Converter!");
			System.out.println("Enter a numerical grade: ");
			numGrade = userInput.nextInt();
			userInput.nextLine();
			convertGrade();
			System.out.println("Letter Grade: " + letterGrade);
			System.out.println("Would you like to continue?(Y/N): ");
			choice = userInput.nextLine();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("You have selected no, goodbye.");
		userInput.close();

	}

}
