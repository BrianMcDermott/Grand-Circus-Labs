

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner userInput;
		String userContinue = "y";
		userInput = new Scanner(System.in);

		while (userContinue.equalsIgnoreCase("y")) {
			System.out.print("Enter a number from 1 to 20 to find the factorial: ");
			int n = userInput.nextInt();
			long result = factorial(n);
			System.out.println("The factorial of " + n + " is " + result);
			System.out.println("Would you like to continue?(Y/N): ");
			userContinue = userInput.next();
		}
		System.out.println("Thank you for using my program.");
		userInput.close();
	}

	public static long factorial(long n) {
/*   The following commented out lines is my solution using a for loop,
 * followed by the recursion method which I left active in the code.
 */
		// long result = 1;
		// for (int i = 1; i <= n; i++) {
		// result = result * i;
		// }
		// return result;

		long result;

		if (n == 1)
			return 1;

		result = factorial(n - 1) * n;
		return result;
	}
}
