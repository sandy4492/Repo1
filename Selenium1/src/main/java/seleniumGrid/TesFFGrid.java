package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TesFFGrid {
	@Test

	public void test() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName("chrome");

		cap.setPlatform(Platform.WIN10);

		ChromeOptions options = new ChromeOptions();
		options.merge(cap);

		URL url = new URL("http://192.168.0.104:4444/wd/hub");

		WebDriver driver = new RemoteWebDriver(url, cap);

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
