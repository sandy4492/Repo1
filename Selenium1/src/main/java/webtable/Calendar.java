package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Calendar {

	WebDriver driver;

	@Test
	public void login() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Tours')]")).click();

		driver.findElement(By.xpath("//*[@id='tchkin']/div/input")).click();

		while (true) {
			String month = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][3]//table//th[2]"))
					.getText();
			if (month.equals("March 2019")) {
				break;
			} else {
				driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(3000);
			}

		}
		List<WebElement> list = driver
				.findElements(By.xpath("//div[@class='datepicker dropdown-menu'][3]//tbody//td[@class='day ']"));

		for (WebElement ele1 : list) {

			String date = ele1.getText();

			System.out.println(date);

			if (date.equals("31")) {
				ele1.click();
				System.out.println("done");
				break;
			}

		}

	}

}