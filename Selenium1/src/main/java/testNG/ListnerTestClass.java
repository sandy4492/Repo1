package testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.ListnerInTestNG.class)

public class ListnerTestClass {

	int i = 0;

	@Test
	public void test1() {

	}

	@Test
	public void test2() {

		throw new SkipException("This test case is skipped");
	}

	@Test(successPercentage = 60, invocationCount = 5)
	public void test3() {
		i++;

		// System.out.println("Test 3 method , invocation count :" + i);

		if (i == 1 || i == 2) {
			// System.out.println("test 3 got failed");
			Assert.assertEquals(i, 8);
		}

	}

	@Test
	public void test4() {

		Assert.assertTrue(false);
	}
}
