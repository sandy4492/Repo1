package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ReadingExcel;

public class DDTExcel {

	WebDriver driver;

	@Test(dataProvider = "credentials")

	public void setup(String username, String password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);

		driver.quit();
	}

	@DataProvider(name = "credentials")
	public Object[][] passData() {

		ReadingExcel obj = new ReadingExcel("D:\\Selenium\\ExcelData\\TestData.xlsx");

		int row = obj.getrowcount(0);

		Object[][] data = new Object[row][2];

		for (int i = 0; i < row; i++) {
			data[i][0] = obj.getData(i, 0, 0);
			data[i][1] = obj.getData(i, 1, 0);
		}

		return data;

	}

}
