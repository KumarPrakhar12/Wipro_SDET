package prakhar;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InboxYahoo {
	
	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        
        driver.get("https://login.yahoo.com/");

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")))
                .sendKeys("kumarprakhar1234@yahoo.com");

        driver.findElement(By.id("login-signin")).click();

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")))
                .sendKeys("K_Pra_@_12_");

        driver.findElement(By.id("login-signin")).click();

        
        wait.until(ExpectedConditions.urlContains("yahoo.com"));

       
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("login-passwd")));

        
        driver.get("https://mail.yahoo.com/n/inbox/priority?.src=ym&reason=myc");

        
        wait.until(ExpectedConditions.urlContains("mail.yahoo.com"));

        System.out.println("Inbox Opened Successfully");

    }
}
