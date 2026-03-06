package prakhar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin2 {
	
	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        
        driver.get("https://login.yahoo.com/");

        Thread.sleep(3000);

        
        driver.findElement(By.id("login-username"))
              .sendKeys("kumarprakhar1234@yahoo.com");

        Thread.sleep(2000);

        
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(3000);

       
        driver.findElement(By.id("login-passwd"))
              .sendKeys("K_Pra_@_12_");

        Thread.sleep(2000);

        
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//a[contains(@href,'/n/inbox')]")).click();

        Thread.sleep(8000);
        
        Actions actions = new Actions(driver);

        for(int i = 0; i < 5; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(1000);
        }

        Thread.sleep(3000);
        
        for(int i = 0; i < 5; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
            Thread.sleep(1000);
        }

        Thread.sleep(5000);

        System.out.println("Yahoo Login Completed Successfully");

        driver.quit();
    }

}
