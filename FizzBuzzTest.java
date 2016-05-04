import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void fizzbuzzTest1() {
		assertEquals(FizzBuzz.fizzBuzzMethod(1), "1");
	}
	@Test
	public void fizzbuzzTest2() {
		assertEquals(FizzBuzz.fizzBuzzMethod(2), "2");
	}
	@Test
	public void fizzbuzzTest3() {
		assertEquals(FizzBuzz.fizzBuzzMethod(3), "fizz");
	}
	@Test
	public void fizzbuzzTest4() {
		String returnValue = FizzBuzz.fizzBuzzMethod(5);
		assertEquals(returnValue, "buzz");
	}
	@Test
	public void fizzbuzzTest5() {
		assertEquals(FizzBuzz.fizzBuzzMethod(9), "fizz");
	}
	@Test
	public void fizzbuzzTest6() {
		assertEquals(FizzBuzz.fizzBuzzMethod(10), "buzz");
	}
	@Test
	public void fizzbuzzTest7() {
		assertEquals(FizzBuzz.fizzBuzzMethod(15), "fizzbuzz");
	}
	@Test
	public void fizzbuzzTest8() {
		assertEquals(FizzBuzz.fizzBuzzMethod(30), "fizzbuzz");
	}

}
