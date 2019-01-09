package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	public void enterdata() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();

		
		List<WebElement> List_Window = driver.findElements(By.xpath("//a[contains(text(),' start new Tab ')]"));

		for (WebElement ele : List_Window) {

			String Window_List = ele.getAttribute("href");

			if (Window_List.contentEquals("http://www.yahoo.com/")) {
				ele.click();
				break;
			}
			System.out.println(" the values are " + Window_List);

		}

		//driver.quit();

	}
}