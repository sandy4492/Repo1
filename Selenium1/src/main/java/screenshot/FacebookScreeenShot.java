package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class FacebookScreeenShot {

	WebDriver driver;

	@Test
	public void capturescreenshot() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sandeep");

		System.out.println("Sc taken");

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {

			Utility.capturescreenshot(driver, result.getName());
		}

		driver.quit();
	}

}
