package mouseHover;

import java.lang.invoke.SwitchPoint;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.ClickElement;

public class Yahoomail {

	WebDriver driver;

	@Test
	public void test() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
	

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		ClickElement.clickElement(driver, "persistent");
	}
}
