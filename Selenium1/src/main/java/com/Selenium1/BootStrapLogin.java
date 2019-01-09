package com.Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapLogin {

	WebDriver driver;

	@Test
	public void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='get_sign_up']")).click();

		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//*[@id='authUsername']")).sendKeys("sandeepgameboy@gmail.com");

		driver.findElement(By.xpath("//*[@id='authPassword']")).sendKeys("09431665256");

		driver.findElement(By.xpath("//*[@id='authExistingUserSignInBtn']")).click();

		List<WebElement> numberOfFrame = driver.findElements(By.tagName("iframe"));

		int number = numberOfFrame.size();
		System.out.println(number);

		driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys("Delhi");

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("scroll(0,400)");

	}

}
