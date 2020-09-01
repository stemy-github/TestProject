package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript {
	public static String browser;
	static WebDriver driver;
	public static void main(String[] args) {
//		setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();

	}
	//	setBrowser
	//	setBrowserConfig
	//	runTest
	
	public static void setBrowser() {
		browser="chrome";
	}

	public static void setBrowserConfig() {


		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium java\\eclipse-workspace\\selenium first\\lib\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		}
		if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium java\\eclipse-workspace\\selenium first\\lib\\chromedriver\\chromedriver.exe"); 
			driver = new ChromeDriver();

		}
	}
	public static void runTest() {
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
