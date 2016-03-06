package testng;

import org.testng.annotations.Test;

/*
 * test 1: pass
 * test 2: fail
 */
public class HandlingException {

	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		int i = 1 / 0;
	}

	@Test
	public void test2() {
		int i = 1 / 0;
	}
}