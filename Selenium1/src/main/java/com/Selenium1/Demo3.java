package com.Selenium1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void enterdata() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement mnth = driver.findElement(By.xpath("//*[@id='month']"));
		Select month_DD = new Select(mnth);

		WebElement selected_mnth_old = month_DD.getFirstSelectedOption();
		System.out.println("old selected value was " + selected_mnth_old.getText());

		month_DD.selectByIndex(3);

		List<WebElement> selected_mnth_list = month_DD.getOptions();

		int total_mnth_list = selected_mnth_list.size();

		Assert.assertEquals(total_mnth_list, 13);
		List<String> exp = Arrays.asList(new String[] { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
				"Sept", "Oct", "Nov", "Dec" });
		 
		
		System.out.println("Total number of month is " + total_mnth_list);

		for (WebElement ele : selected_mnth_list) {
			System.out.println(ele.getText());
			if (exp.contains(ele.getText()))
				System.out.println("matched!");
			else
				System.out.println("not matched!");
		}

		driver.quit();

	}
}
