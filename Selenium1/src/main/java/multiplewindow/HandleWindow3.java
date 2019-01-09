package multiplewindow;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindow3 {
	@Test
	public void test() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='post-body-6170641642826198246']/a[1]")).click();

		Set<String> all_window = driver.getWindowHandles();

		ArrayList<String> list = new ArrayList<String>(all_window);

		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//*[@id='post-body-6170641642826198246']/a[2]")).click();

		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//*[@id='post-body-6170641642826198246']/a[3]")).click();

		Set<String> all_window1 = driver.getWindowHandles();

		System.out.println(all_window1.size());
		ArrayList<String> list1 = new ArrayList<String>(all_window1);

		Thread.sleep(5000);

		driver.switchTo().window(list1.get(2));
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sandeep");
		driver.close();
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.name("q")).sendKeys("sandeep");
		driver.close();

		driver.switchTo().window(list1.get(3));
		driver.findElement(By.name("p")).sendKeys("sandeep");
		driver.close();

	}  

}
