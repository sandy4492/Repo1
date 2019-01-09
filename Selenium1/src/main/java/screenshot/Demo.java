package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

@Test
public class Demo {

	WebDriver driver;

	public void google() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();
		driver.findElement(By.xpath(""));
	}

	@AfterMethod
	public void takescreenShot(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {

			Utility.capturescreenshot(driver, result.getName());
		}
		driver.quit();
	}

}
