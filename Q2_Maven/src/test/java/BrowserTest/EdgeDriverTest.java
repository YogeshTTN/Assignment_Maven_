package BrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Softwares\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
	}

}
