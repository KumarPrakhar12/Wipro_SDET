package Selenium_Webdriver;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {
	public static void main(String[] args) throws Exception
	{
 
		URL gridurl= new URL("http://localhost:4444/wd/hub");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("start-maximized");
		
		RemoteWebDriver driver= new RemoteWebDriver(gridurl, options);
		
		driver.get("htttps://www.google.com");
		
		System.out.println("Page Title: " +driver.getTitle());
		
		driver.quit();
		
		
	}

}
