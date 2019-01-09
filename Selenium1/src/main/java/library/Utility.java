package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	public static void capturescreenshot(WebDriver driver, String screenshotname) {

		try {

			TakesScreenshot ts = (TakesScreenshot) driver;
           System.out.println(ts);
			File source = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(source);

			FileUtils.copyFile(source, new File("./screen shots/" + screenshotname + ".png"));

		}

		catch (Exception e) {

			System.out.println("Exception while taking screenshot" + e.getMessage());

			e.printStackTrace();
		}
	}
}
