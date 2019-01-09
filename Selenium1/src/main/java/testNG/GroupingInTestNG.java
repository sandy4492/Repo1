package testNG;

import org.testng.annotations.Test;

public class GroupingInTestNG {
	@Test(groups = "sanity")
	public void test() {

		System.out.println("test");
	}

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = { "regression" })
	public void test2() {
		System.out.println("test2");
	} 

}
