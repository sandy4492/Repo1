package multiplewindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindow {
	@Test
	public void test() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='post-body-6170641642826198246']/a[3]")).click();

		Set<String> all_window = driver.getWindowHandles();
		int size = all_window.size();
		System.out.println(size);
		for (String ele : all_window) {

			if (!parent.equalsIgnoreCase(ele)) {

				driver.switchTo().window(ele);

				driver.findElement(By.name("p")).sendKeys("selenium webdriver");
				Thread.sleep(3000);

				driver.close();
			}
		}

		driver.quit();
	}

}
