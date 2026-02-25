package Selenium_Webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);

        
       
        File file = new File("C:/Users/HP/Desktop/Dummyresume.pdf");
        String filePath = file.getAbsolutePath();

        
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        Thread.sleep(2000);

        
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);

        
        String successMessage = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Upload Status: " + successMessage);

        driver.quit();
    }

}
