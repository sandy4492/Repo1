package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BootStrap {

	@Test
	public void enterdata() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		List<WebElement> DD_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));

		for (WebElement ele : DD_menu) {

			String innerhtml = ele.getAttribute("innerHTML");

			     if (innerhtml.contentEquals("JavaScript")) {

				   ele.click();
				   break;
			}
			System.out.println("value of drpdwn is" + innerhtml);

		}	

		
	}

}