package prakhar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;

public class AddtoCartSauce {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriverManager.chromedriver().setup();

        
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-password-generation");
        options.addArguments("--disable-features=PasswordLeakDetection");
        options.addArguments("--incognito");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

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
        Thread.sleep(2000);

        driver.findElement(By.id("last-name")).sendKeys("Prakhar");
        Thread.sleep(2000);

        driver.findElement(By.id("postal-code")).sendKeys("123456");
        Thread.sleep(2000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);

        System.out.println("Purchase completed successfully!");

        driver.quit();
    }
}