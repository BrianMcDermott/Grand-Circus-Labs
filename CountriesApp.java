
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {
	private static Scanner userInput = new Scanner(System.in);
	private static ArrayList<String> countries = new ArrayList<String>();
	private final static Path countriesPath = Paths.get("countries.txt");
	private final static File countriesFile = countriesPath.toFile();
	public static String country = null;

	public static void main(String[] args) {
		displayMenu();
		chooseOptions();

	}

	public static void displayMenu() {
		System.out.println("MENU\nlist - See the list of countries\nadd - Add a country\nexit - Exit");
	}

	public static void displayAllCountries() {
		System.out.println("COUNTRY LIST");
		try {
			FileReader fileReader = new FileReader(countriesFile);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((country = bufferedReader.readLine()) != null) {
				System.out.println(country);
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + countriesFile + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + countriesFile + "'");
		}

	}

	private static void chooseOptions() {
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = getString("Enter a command: ");
			System.out.println();
			if (command.equalsIgnoreCase("list")) {
				displayAllCountries();
			} else if (command.equalsIgnoreCase("add")) {
				addList();
			} else if (command.equalsIgnoreCase("exit")) {
				System.out.println("Thank you for using my program.");
				System.exit(1);
			}
		}

	}

	public static String getString(String prompt) {
		System.out.println(prompt);
		String x = userInput.nextLine();
		return x;
	}

	public static ArrayList<String> addList() {
		System.out.println("");
		try {
			FileWriter fileWriter = new FileWriter(countriesFile);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(getString("Enter the name of the country you wish to add: "));
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + countriesFile + "'");
		}
		return countries;
	}
	public static void writeFile(ArrayList<String> countries){
		try {
			PrintStream toFile = new PrintStream(new FileOutputStream("path"));
			for (String x : countries){
				toFile.print(x+"\n");
			}
			toFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This file was not found, please try again.");
		}
	}
}
