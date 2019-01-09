package verifyErrorMsg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start')]")).click();
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'WebDriver')]"));
		boolean status = ele.isDisplayed();
		System.out.println(status);

		if (status)
			System.out.println("ele is displayed");

		else
			System.out.println("ele is not displayed");
	}

}
