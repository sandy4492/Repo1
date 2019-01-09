package mouseHover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.Highliter;

public class MouseHover {

	WebDriver driver;

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

		WebElement ele = driver.findElement(By.xpath("//*[@id='container']/div/header/div[3]/ul/li[1]/span"));

		Highliter.highLightElement(driver, ele);

		System.out.println(ele.getText());

		Actions action = new Actions(driver);

		action.moveToElement(ele).perform();

		List<WebElement> list = driver.findElements(By.tagName("a"));

		for (WebElement ele1 : list) {

			boolean status = ele1.isEnabled();

			String innerhtml = ele1.getAttribute("innerHTML");

			System.out.println("link is " + innerhtml + " and status is " + status);
			if (innerhtml.contains("Apple Products")) {

				Highliter.highLightElement(driver, ele1);
				ele1.click();

				break;
			}

		}
		// driver.quit();

	}

}
