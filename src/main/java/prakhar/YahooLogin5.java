package prakhar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin5 {
	
	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Yahoo login page
        driver.get("https://login.yahoo.com/");

        Thread.sleep(3000);

        // Enter Email
        driver.findElement(By.id("login-username"))
              .sendKeys("kumarprakhar1234@yahoo.com");

        Thread.sleep(2000);

        // Click Next
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(3000);

        // Enter Password
        driver.findElement(By.id("login-passwd"))
              .sendKeys("K_Pra_@_12_");

        Thread.sleep(2000);

        // Click Sign In
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(10000); // Wait for login to complete

        // Switch to new tab if mail opens in new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        Thread.sleep(5000);

        // Click Inbox icon (stable XPath)
        driver.findElement(By.xpath("//a[@data-test-folder-name='Inbox']")).click();

        Thread.sleep(8000);
        
        System.out.println("Yahoo Login and Inbox Opened Successfully");

        driver.quit();


}
}
