package Selenium_Webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWebsiteTest {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
           
            driver.manage().window().maximize();
            
            driver.get("https://www.google.com");
            Thread.sleep(2000);
            
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type text
            searchBox.sendKeys("selenium website");

            // Press Enter
            searchBox.sendKeys(Keys.ENTER);

            // Hold screen for 3 seconds
            Thread.sleep(3000);

            
            driver.findElement(By.partialLinkText("Selenium")).click();
            Thread.sleep(3000);

            System.out.println("Page Title: " + driver.getTitle());
            
            
            Actions actions = new Actions(driver);

            
            Thread.sleep(3000);
            
           
           
            driver.navigate().to("https://www.selenium.dev/downloads/");
            System.out.println("Downloads Page Title: " + driver.getTitle());

            Thread.sleep(3000);
            
          

          
            driver.navigate().to("https://www.selenium.dev/documentation/");
            System.out.println("Documentation Page Title: " + driver.getTitle());

            Thread.sleep(3000);
            
           
            
            driver.navigate().to("https://www.selenium.dev/projects/");
            System.out.println("Projects Page Title: " + driver.getTitle());
            Thread.sleep(3000);
            
           
            

         
            driver.navigate().back();
            Thread.sleep(2000);

          
           

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
