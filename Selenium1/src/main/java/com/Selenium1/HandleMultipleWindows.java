package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> List_Window = driver.findElements(By.xpath("//a[contains(text(),'start new Tab\')]"));

		for (WebElement ele : List_Window) {

			String Window_List = ele.getAttribute("href");
			
			System.out.println(Window_List);

			if (Window_List.contentEquals("http://www.yahoo.com/")) {

				ele.click();
				break;
			}

		}
	}
}
