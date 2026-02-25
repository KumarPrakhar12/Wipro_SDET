package Selenium_Webdriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAutomation {

	public static void main(String[] args) throws InterruptedException {

        
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 1️⃣ Go to Amazon
        driver.get("https://www.amazon.in/");

        // 2️⃣ Ignore location/cookies by clicking search directly
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        searchBox.sendKeys("laptop");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        // 3️⃣ Wait for first product to appear
        WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")));
        firstProduct.click();

        // 4️⃣ Switch to new tab
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }

        // 5️⃣ Add product to cart
        Actions actions = new Actions(driver);
        WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
        actions.moveToElement(addToCartBtn).perform();
        addToCartBtn.click();

        // 6️⃣ Handle optional popup (No Thanks protection plan)
        try {
            WebElement noThanksBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']")));
            noThanksBtn.click();
        } catch (Exception e) {
            // popup not present
        }

        // 7️⃣ Go to Cart
        WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart")));
        actions.moveToElement(cartBtn).perform();
        cartBtn.click();

        // 8️⃣ Proceed to checkout (stopping safely)
        try {
            WebElement proceedToBuyBtn = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceedToRetailCheckout")));
            actions.moveToElement(proceedToBuyBtn).perform();
            proceedToBuyBtn.click();
            System.out.println("Reached checkout page safely.");
        } catch (Exception e) {
            System.out.println("Checkout requires login or button not found. Stopped safely.");
        }

        driver.quit();
    }
}
