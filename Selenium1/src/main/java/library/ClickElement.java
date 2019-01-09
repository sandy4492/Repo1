package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	public static void clickElement(WebDriver ldriver, String id) {

		Actions action = new Actions((WebDriver) ldriver);
		action.moveToElement(ldriver.findElement(By.id(id))).click().build().perform();

	}

}
