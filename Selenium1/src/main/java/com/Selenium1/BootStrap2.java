package com.Selenium1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BootStrap2 {

	@Test
	public void enterdata() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		List<String> list = Arrays.asList(new String[] { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"Aug", "Sept", "Oct", "Nov", "Dec" });

		WebElement monthDD = driver.findElement(By.xpath("//*[@id='month']"));

		Select select = new Select(monthDD);
		select.selectByIndex(3);
		
		
		      List<WebElement> list_mnth = select.getOptions();
		
		for (WebElement ele :list_mnth ) {

			String DD_Month = ele.getText();

			if (list_mnth.contains(ele.getText())) {
				System.out.println("matched");
			} else
				System.out.println("failed");

		}
		driver.quit();
	}

}
