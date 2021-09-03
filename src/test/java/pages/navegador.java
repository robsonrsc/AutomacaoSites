package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navegador {
	
	private static WebDriver driver;
	
	public static WebDriver adriver () {
		
		return driver;
	}
	
	public void abrir (String url) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
