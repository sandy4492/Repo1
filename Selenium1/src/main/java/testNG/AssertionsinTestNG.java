package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsinTestNG {
	@Test
	public void test() {

		String str = "sandeep";
		Assert.assertTrue(str.equalsIgnoreCase("SANDEEP"));
	}

	@Test
	public void test1() {

		Assert.assertEquals(true, false, "not matching expected condition");

	}

	@Test
	public void test3() {

		Assert.assertNotEquals("test", "test1");

	}

	@Test
	public void test4() {

		Assert.assertTrue(false);
	}
}
