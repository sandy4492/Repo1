package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void enterdata() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Sandeep");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("singh");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("Singh@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("password");

		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select select = new Select(day);
		select.selectByValue("10");

		WebElement mnth = driver.findElement(By.xpath("//*[@id='month']"));
		Select select1 = new Select(mnth);
		select1.selectByIndex(3);

		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select select2 = new Select(year);
		select2.selectByValue("1994");
		Thread.sleep(3000);

		driver.quit();

	}
}
