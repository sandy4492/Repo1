package verifyErrorMsg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[contains(text(),'Click me to start')]")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 60);
		Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'WebDriver')]")));

		driver.findElement(By.xpath("//p[contains(text(),'WebDriver')]")).isDisplayed();
		if (true)
			System.out.println("ele is displayed");

		else
			System.out.println("ele is not displayed");

		driver.quit();
	}

}
