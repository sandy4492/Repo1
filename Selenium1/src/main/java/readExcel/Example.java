package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ReadingExcel;

public class Example {
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
	public Object[][] passdata() {

		ReadingExcel obj = new ReadingExcel("D:\\Selenium\\ExcelData\\TestData.xlsx");

		int row = obj.getrowcount(0);

		Object[][] data = new Object[row][2];

		for (int i = 0; i < row; i++) {

			data[i][0] = obj.getData(i, 0, 0);
			data[i][1] = obj.getData(i, 0, 0);
		}
		return data;

	}

}
