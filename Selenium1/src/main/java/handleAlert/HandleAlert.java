package handleAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert {

	@Test
	public void test() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div[1]/div/div[2]/div[3]/button")).click();
		String txt = driver.switchTo().alert().getText();

		System.out.println(txt);
		
		String exp ="Please select start place.";
		
		
		Assert.assertEquals(txt, exp);
		driver.switchTo().alert().accept();
		// alt.accept();
		driver.quit();

	}
}