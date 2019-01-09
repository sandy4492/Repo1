package mouseHover;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class MyTest1 {
	@Test
	public void test() {

		int a = 10;
		int b = 1;
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(b, a);
		System.out.println("======test done=====");
		softassert.assertAll();
		
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Test Started");
	}

	@AfterMethod
	public void afterClass(ITestResult result) throws EmailException {

		if (result.getStatus() == ITestResult.FAILURE) {

			NewDemo.sendEmail();
			System.out.println("Test case failed and e-mail sent");
		}

	}

}
