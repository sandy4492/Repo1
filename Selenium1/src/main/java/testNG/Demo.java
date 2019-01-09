package testNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.Utility;

public class Demo {

	WebDriver driver;

	@Test(dataProvider = "credentials")

	public void setup(String username, String password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);

		//driver.quit();
	}

	@DataProvider(name = "credentials")
	public Object[][] passData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "sandeep";
		data[0][1] = "kumar";

		data[1][0] = "ravi";
		data[1][1] = "singh";

		return data;

	}

	@AfterMethod

	public void teakescreenshot(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			Utility.capturescreenshot(driver, result.getName());
		}
	}

}