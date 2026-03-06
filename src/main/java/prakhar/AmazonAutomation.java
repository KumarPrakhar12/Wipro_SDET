package prakhar;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAutomation {
	
	public static void main(String[] args) {

        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--start-maximized");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.7632.46 Safari/537.36");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
           
            driver.get("https://www.amazon.in/");

            
            WebElement accountList = wait.until(d -> d.findElement(By.id("nav-link-accountList")));
            new Actions(driver).moveToElement(accountList).perform();

            
            WebElement signInBtn = wait.until(d -> d.findElement(By.xpath("//span[text()='Sign in']")));
            signInBtn.click();

            
            WebElement emailField;
            try {
                emailField = wait.until(d -> d.findElement(By.id("ap_email")));
            } catch (Exception e) {
                emailField = wait.until(d -> d.findElement(By.xpath("//input[contains(@name,'email') or contains(@id,'email')]")));
            }

            
            String email = "wwwprakharkumar008@gmail.com";
            for (char ch : email.toCharArray()) {
                emailField.sendKeys(Character.toString(ch));
                Thread.sleep(100); 
            }

            driver.findElement(By.id("continue")).click();

           
            WebElement passwordField = wait.until(d -> d.findElement(By.id("ap_password")));
            passwordField.clear();
            String password = "Kprakhar@12";
            for (char ch : password.toCharArray()) {
                passwordField.sendKeys(Character.toString(ch));
                Thread.sleep(100);
            }

            driver.findElement(By.id("signInSubmit")).click();

            
            wait.until(d -> d.findElement(By.id("twotabsearchtextbox")));

          
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("Samsung mobile");
            driver.findElement(By.id("nav-search-submit-button")).click();

        
            WebElement firstProduct = wait.until(d -> d.findElement(By.cssSelector("h2 a")));
            firstProduct.click();

            
            String mainWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(mainWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

          
            WebElement addToCart = wait.until(d -> d.findElement(By.id("add-to-cart-button")));
            addToCart.click();

            
            WebElement cartBtn = wait.until(d -> d.findElement(By.id("nav-cart")));
            cartBtn.click();

           
            WebElement checkoutBtn = wait.until(d -> d.findElement(By.name("proceedToRetailCheckout")));
            checkoutBtn.click();

           
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }

}
