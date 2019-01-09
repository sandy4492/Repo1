package multiplewindow;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindow2 {
	@Test
	public void test() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String parent = driver.getWindowHandle();

		Set<String> all_window = driver.getWindowHandles();
		int size = all_window.size();
		System.out.println(size);

		ArrayList<String> list = new ArrayList<String>(all_window);

		driver.switchTo().window(list.get(0));
		driver.close();

		driver.switchTo().window(list.get(1));
		driver.close();

	}

}
