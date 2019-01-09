package verifyErrorMsg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLink {
@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(" total links are " + list.size());

		for (WebElement ele : list) {
			String url = ele.getAttribute("href");
			System.out.println("link are :" + ele.getText());

			verifyLinkActive(url);
		}

	}

	public static void verifyLinkActive(String linkUrl) {

		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnect = (HttpURLConnection) url.openConnection();

			httpUrlConnect.setConnectTimeout(3000);
			httpUrlConnect.connect();

			if (httpUrlConnect.getResponseCode() == 200)
				

			{
				System.out.println(linkUrl + " -" + httpUrlConnect.getResponseMessage());
			}

			if (httpUrlConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(
						linkUrl + "-" + httpUrlConnect.getResponseMessage() + "-" + HttpsURLConnection.HTTP_NOT_FOUND);

			}

		} catch (Exception e) {

		}
	}
}
