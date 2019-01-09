package softAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void softAssertTest() {

		SoftAssert assertion = new SoftAssert();
		System.out.println("started");
		assertion.assertEquals(12, 13);

		System.out.println("ended");
		assertion.assertAll();
	}

	@Test
	public void testHardAssert() {

		Assert.assertEquals(12, 13);

		System.out.println("started");

		System.out.println("ended");

	}

}
