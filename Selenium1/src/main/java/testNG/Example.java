package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example {

	WebDriver driver;

	@Test(dataProvider = "passdata")
	public void logig(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.quit();

	}

	@DataProvider(name = "passdata")
	public Object[][] credentials() throws Exception {

		File src = new File("D:\\Selenium\\ExcelData\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rownum = sheet.getLastRowNum();

		Object[][] data = new Object[rownum][2];
		for (int i = 0; i < rownum; i++) {

			data[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();

		}

		return data;

	} 

}
