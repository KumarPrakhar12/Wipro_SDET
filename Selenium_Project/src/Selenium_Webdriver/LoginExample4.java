package Selenium_Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginExample4 {

    public static void main(String[] args) throws InterruptedException {

    	

    	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.saucedemo.com/");

        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000); 
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000); 

       
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(2000);

        
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(3000);

        
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(3000);

        
        driver.findElement(By.id("first-name")).sendKeys("Kumar");
        driver.findElement(By.id("last-name")).sendKeys("Prakhar");
        driver.findElement(By.id("postal-code")).sendKeys("123456");
        Thread.sleep(3000);

        
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);

       
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);

        
        System.out.println(" Purchase completed successfully!");

        driver.quit();
    }
        
}
