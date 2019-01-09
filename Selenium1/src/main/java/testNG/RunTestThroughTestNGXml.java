package testNG;

import org.testng.annotations.Test;

public class RunTestThroughTestNGXml {

	@Test(priority =2)
	public void test() {

		System.out.println("test");
	}

	@Test(priority=0)
	public void test1() {
		System.out.println("test1");
	}

}
