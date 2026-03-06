package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class chromeToEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		
		driver.quit();
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		driver.quit();

	}

}
