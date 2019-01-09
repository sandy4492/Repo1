package verifyErrorMsg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.Utility;

@Test
public class ExampleGmail {
	WebDriver driver;

	public void verifyErrorMsg() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		String ErrorMsg = driver.findElement(By.xpath("//div[contains(text(),'Enter an email')]"))
				.getAttribute("innerHTML");

		String ExpectedErrorMsg = "Enter an email or phone number";
		if (ErrorMsg.contains(ExpectedErrorMsg)) {

			System.out.println("Error msg verified");

			Utility.capturescreenshot(driver, "errormsg");

		} else {

			System.out.println("not matched!!!");
		}

		driver.quit();

		Assert.assertEquals(ExpectedErrorMsg, ErrorMsg);
		
		Assert.assertTrue(ErrorMsg.contains("Enter an email"));
	}
}
