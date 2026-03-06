package prakhar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {
	
	public static void main(String[] args) {

        
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://login.yahoo.com/");

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        
        WebElement emailField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
        emailField.sendKeys("kumarprakhar1234@yahoo.com");

        
        driver.findElement(By.id("login-signin")).click();

        
        WebElement passwordField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
        passwordField.sendKeys("K_Pra_@_12_");

        
        driver.findElement(By.id("login-signin")).click();

        System.out.println("Login  Successfully");

        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

}
