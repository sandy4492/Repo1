package com.Selenium1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript {

	@Test

	public void test() {

		Assert.assertEquals(12, 13);
	}

	@Test
	public void test2() {
		Assert.assertEquals(12, 13, "does not with actual value chk with developer");
	}

	@Test
	public void test3() {
		String str = "sandep";
		Assert.assertTrue(str.contains("sandeep"));
	}
}
