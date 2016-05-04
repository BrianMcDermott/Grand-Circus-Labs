import java.util.Scanner;

public class AdventureGame {
	static String userName, playGame, stringAction;
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		int hitPoints = 3;
		System.out.println("Hello, please enter your name: ");
		userName = userInput.nextLine();
		System.out.println("Would you like to play a game, " + userName + "?(Y/N): ");
		playGame = userInput.nextLine();
		while (playGame.equalsIgnoreCase("n")) {
			System.out.println("Thanks anyways, take care.");
			System.exit(1);
		}

		System.out
				.println("Welcome to my Adventure Game, your objective is to survive a leisurely stroll down Woodward."
						+ "\nYou are resilient and can take 3 hit points but after your third strike, YOUR OUT.");

		System.out.println("\nYou are strolling down Woodward, when suddenly you see a large white truck barreling"
				+ "\ntowards an adjacent puddle that will surely soak you from head to toe. You're dressed to impress, what do you do?");
		System.out.println("What do you do?(Enter 1 to to lunge out of the way, or Enter 2 to remain still: )");
		stringAction = userInput.nextLine();
		int choice1 = Integer.parseInt(stringAction);

		switch (choice1) {
		case 1:
			System.out.println("You narrowly avoid a big splash and continue onward!");
			break;
		case 2:
			System.out.println("You remain still and allow the water to saturate your clothes."
					+ "\nThe force of the wave knocks you back and takes away 1 hit point. You now have: "
					+ --hitPoints);
			break;
		}
		if (choice1 == 1) {
			System.out.println(
					"Still dry, you continue onward.. unphased until you encounter a loose pitbull who bites you and takes away 1 hit point.\nYou now have: "
							+ --hitPoints);
		} else {
			System.out.println("\nSoaked to the bone you listen to the squeaking sound your wet shoes make as you walk."
					+ "\nThe sound attracts a pitbull who is foaming at the mouth!"
					+ "\nLuckily the dog is just thirsty and immediately begins to lap up the water that is dripping off of you.");
		}

		System.out.println(
				"Whew! That was close.. now that the dog is gone you continue on your way. \nYou come to a fork in the road, do you go left or right?(1 for Left, 2 for Right): ");
		stringAction = userInput.nextLine();
		int choice2 = Integer.parseInt(stringAction);

		switch (choice2) {
		case 1:
			System.out.println(
					"You head down the left fork, the sun is shining overhead.. this doesn't seem too dangerous.");
			break;
		case 2:
			System.out.println("You head down the right fork, the clouds are grey and a storm is brewing.. uh-oh!");
			break;
		}

		if (choice2 == 1) {
			System.out.println("Not much further now, you can see your goal in the distance!");
		} else {
			System.out.println("The wind from the brewing storm takes a branch off of a nearby tree."
					+ "\nIt takes down a live powerline which gives you a shock!\n");
		}
		if (choice1 == 2 && choice2 == 2) {
			System.out.println(
					"Since your soaking wet the shock takes 2 of your hitpoints!\n");
			hitPoints -= 2;
			System.out.println("You have: ");
		} else {
			System.out.println(
					"That was quite a zap, luckily you were dry and only lose 1 of your hitpoints.\nYou now have: "
							+ --hitPoints);
		}
		
		if (hitPoints == 0) {
			System.out.println("That was your last strike, Game over!");
		} else {
			System.out.println(
					"After a long perilous journey you have arrived at your destination unharmed, you have won!");
		}

	}
}
