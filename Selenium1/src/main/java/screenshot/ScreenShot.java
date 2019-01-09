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

public class ScreenShot {

	WebDriver driver;

	@Test
	public void test1() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();

		 Utility.capturescreenshot(driver, "Started");

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sandeep");

		 Utility.capturescreenshot(driver, "Uname");

		driver.quit();
		System.out.println("Sc taken");

	}

}
