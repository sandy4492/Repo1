package mouseHover;

import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

	public class NewDemo {

		WebDriver driver;

		@Test
		public void test() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/sandy/Desktop/fileupload.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/input")).click();

			Thread.sleep(5000);

			Runtime.getRuntime().exec("C:\\Users\\sandy\\Desktop\\AutoIt\\FileUpload");
			
			

		}

	}

}
