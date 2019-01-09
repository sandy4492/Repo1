package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void test() {

		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "test" })
	public void test1() {
		System.out.println("tes1 pass");
	}

	@Test(dependsOnMethods = { "test", "test1" })
	public void test2() {
		System.out.println("test2 pass");
	}

	@Test
	public void test4() {
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "test4" })
	public void test5() {
		System.out.println("test4 pass");
	}

}
