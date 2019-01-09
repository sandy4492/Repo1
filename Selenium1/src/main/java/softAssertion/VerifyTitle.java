package softAssertion;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	WebDriver driver;

	@Test

	public void verifyTitles() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		String myTitle = driver.getTitle();

		System.out.println("Title of page is " + myTitle);

		String expectedTitle = "Facebook–log in or sign up";

		// SoftAssert assertion = new SoftAssert();
		// assertion.assertEquals(myTitle, expectedTitle);
		// System.out.println("Title matched");
		// assertion.assertAll();
		Assert.assertTrue(myTitle.contains("Facebook")); 
		System.out.println("Title matched");
		driver.quit();
	}

}
