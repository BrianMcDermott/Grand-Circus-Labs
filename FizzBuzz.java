/*
 * If a number is divisible by 3 return fizz, by 5 buzz, by 3 and 5 return
 * fizzbuzz otherwise return the input.
 */
public class FizzBuzz {
	/*
	 * fizzbuzz method.
	 */
	public static String fizzBuzzMethod(int input) {
		
		if (input % 3 == 0 && input % 5 == 0) {
			return "fizzbuzz";
		} else if (input % 3 == 0) {
			return "fizz";
		} else if (input % 5 == 0) {
			return "buzz";
		}
		return Integer.toString(input);
	}
}
