package prakhar;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriResume {
	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            
            driver.get("https://www.naukri.com");

            
            wait.until(ExpectedConditions.elementToBeClickable(By.id("login_Layer"))).click();

           
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='Enter your active Email ID / Username']")))
                    .sendKeys("kumarprakhar012@gmail.com");

            
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']"))
                    .sendKeys("Kprakhar@12");

            
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            System.out.println("Login submitted");

           
            wait.until(ExpectedConditions.urlContains("mnjuser"));
            System.out.println("Dashboard loaded");

           
            try {

                WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

                
                WebElement popup = wait1.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//div[@role='dialog']")));

                System.out.println("Popup detected");

                
                WebElement closeBtn = popup.findElement(By.xpath(".//button | .//span | .//*[name()='svg']"));

                closeBtn.click();

                System.out.println("Popup closed");

            } catch (Exception e) {
                System.out.println("Popup not present");
            }

            
            Set<String> windows = driver.getWindowHandles();
            if (windows.size() > 1) {
                for (String window : windows) {
                    driver.switchTo().window(window);
                }
                System.out.println("Switched to new window");
            }

           
            WebElement profileBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//div[contains(text(),'View profile')]")));

            profileBtn.click();
            System.out.println("Profile opened");

          
            WebElement uploadInput = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//input[@type='file']")));

            uploadInput.sendKeys("\"C:\\Users\\HP\\Desktop\\Dummyresume.pdf\"");

            System.out.println("Resume uploaded successfully");

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        driver.quit();
    }
}
