import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	String firstName, lastName, favoriteFood, homeTown;

	public Student(String firstName, String lastName, String favoriteFood, String homeTown) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.favoriteFood = favoriteFood;
		this.homeTown = homeTown;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public String getHomeTown() {
		return homeTown;
	}

	static Student jason = new Student("Jason", "Vorheeves", "Pizza", "Sandusky, OH");
	static Student john = new Student("John", "Smith", "Spaghetti", "Detroit, MI");
	static Student bill = new Student("Bill", "Engvall", "Cake", "Los Angeles, CA");
	static Student tom = new Student("Tom", "Hanks", "PB&J", "Seattle, WA");
	static Student kelly = new Student("Kelly", "Samson", "Salad", "Dallas, TX");
	static Student tyler = new Student("Tyler", "Dunn", "Hummus", "Miami, FL");
	static Student andy = new Student("Andy", "Gardner", "Pitas", "Chicago, IL");
	static Student kyle = new Student("Kyle", "Reese", "Beans", "Atlanta, GA");
	static Student sarah = new Student("Sarah", "Connor", "Carrots", "Lansing, MI");
	static Student chris = new Student("Chris", "Cringle", "Cookies", "North Pole");
	static Student crystal = new Student("Crystal", "Cratt", "Fig Newtons", "North Pole");
	static Student jacob = new Student("Jacob", "Hobbs", "French Fries", "Phoenix, AZ");
	static Student jerry = new Student("Jerry", "Seinfeld", "Shwarma", "New York, NY");
	static Student eric = new Student("Eric", "Draven", "Apples", "Manistee, MI");
	static Student bruce = new Student("Bruce", "Wayne", "Caviar", "Gotham");
	static Student bridget = new Student("Bridget", "Bellario", "Watermelon", "Canton, MI");
	static Student robert = new Student("Robert", "Duvall", "Frenchbread Pizza", "Boston, MA");
	static Student warren = new Student("Warren", "Nash", "Tacos", "Wixom, MI");
	static Student chuck = new Student("Chuck", "Norris", "Nails", "Amazingville, USA");
	static Student jeremiah = new Student("Jeremiah", "Jonas", "Cod", "Houston, TX");

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String choice = "yes";
		String userChoice2;
		int userChoice = 0;
		Student studentDatabase[] = null;
		System.out.println("Welcome to our Java class. Which student would you like to learn more about?");
		do {
			try {
				System.out.println("Enter an integer, 1 through 20: ");
				userChoice = userInput.nextInt();
				userInput.nextLine();
				userChoice -= 1;
				studentDatabase = new Student[] { jason, john, bill, tom, kelly, tyler, andy, kyle, sarah, chris,
						crystal, jacob, jerry, eric, bruce, bridget, robert, warren, chuck, jeremiah };
				System.out.println("Student " + (userChoice + 1) + " is " + studentDatabase[userChoice].getFirstName()
						+ " " + studentDatabase[userChoice].getLastName() + ", what would you like to know about "
						+ studentDatabase[userChoice].getFirstName() + "?");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("There are only 20 students, you must enter an integer between 1 and 20.");
				continue;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, please enter a number 1 through 20.");
				userInput.next();
				continue;
			}
			System.out.println("(Enter hometown or favorite food): ");
			userChoice2 = userInput.nextLine();
			switch (userChoice2.toLowerCase()) {
			case "hometown":
				System.out.println(studentDatabase[userChoice].getFirstName() + "'s hometown is "
						+ studentDatabase[userChoice].getHomeTown() + ".");
				break;
			case "favorite food":
				System.out.println(studentDatabase[userChoice].getFirstName() + "'s favorite food is "
						+ studentDatabase[userChoice].getFavoriteFood() + ".");
				break;
			}
			System.out.println("Would you like to know more?(Enter yes or no): ");
			choice = userInput.next();
			userInput.nextLine();
		} while (choice.equalsIgnoreCase("yes"));
		if (choice.equalsIgnoreCase("no")) {
			System.out.println("Thank you for using my program.");
		}
		userInput.close();
	}
}
