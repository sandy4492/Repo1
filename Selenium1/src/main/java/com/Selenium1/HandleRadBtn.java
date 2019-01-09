package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadBtn {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> Radbtn_list = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));

		for (WebElement ele : Radbtn_list) {

			String List_btn = ele.getAttribute("value");

			if (List_btn.contentEquals("RUBY")) {
				ele.click();
				break;
			}
			System.out.println(" the lis of radion button are " + List_btn);
		}

		List<WebElement> Type_chkbox = driver.findElements(By.xpath("//input[ @type='checkbox']"));

		for (WebElement chkbox : Type_chkbox) {

			String List_chkbox = chkbox.getAttribute("id");

			if (List_chkbox.contentEquals("code")) { 

				chkbox.click();
				break;
			}
		}

		// driver.quit();
	}

}
