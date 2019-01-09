package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example {

	WebDriver driver;

	@Test
	public void test() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//*[@id='sign-in-icon-down']")).click();

		driver.findElement(By.xpath("//*[@id='signInLink']")).click();
		driver.findElement(By.xpath("//*[@id='facebookBtn']/button")).click();
		
		
		driver.switchTo();

	}
}
