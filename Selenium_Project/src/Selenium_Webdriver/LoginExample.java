package Selenium_Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginExample {
	
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        
        driver.findElement(By.name("q"))
              .sendKeys("https://www.saucedemo.com/");
        
        Thread.sleep(4000);

        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        
        driver.findElement(By.partialLinkText("Sauce Labs")).click();

        Thread.sleep(3000);

        
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        driver.quit();
    }

}
