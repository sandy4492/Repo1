package com.Selenium1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Generic {

	WebDriver driver;

	@Test

	public void GmailLoin() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/header/div[3]/ul/li[1]/span")))
				.perform();
		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println("the total links are " + list.size());
		for (WebElement ele : list) {
			String ActiveLink = ele.getAttribute("innerHTML");
			if (ActiveLink.contains("Philips")) {
				ele.click();
				break;
			}
		}

	}
}