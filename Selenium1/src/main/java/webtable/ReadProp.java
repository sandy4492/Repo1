package webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProp {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"D:/Selenium/Projects/Selenium1/src/main/java/webtable/config.properties");

		prop.load(ip);

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else {
			System.out.println("no browswr vale");
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();

	}

}
