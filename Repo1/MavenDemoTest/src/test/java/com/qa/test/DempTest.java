package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DempTest {

	@Test
	public void sum() {
		int a = 10;
		int b = 20;

		Assert.assertEquals(30, a + b);
	}

	@Test
	public void multi() {
		int a = 10;
		int b = 20;

		Assert.assertEquals(200, a * b);
	}

	@Test
	public void div() {
		int a = 10;
		int b = 20;

		Assert.assertEquals(0, b % a);
	}

}
