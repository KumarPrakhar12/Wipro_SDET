package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

        
        driver.manage().window().maximize();

        
        driver.get("https://www.google.com");

        
        System.out.println("Title: " + driver.getTitle());

        
        try {
            Thread.sleep(2000);   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    
        driver.quit();

	}

}
