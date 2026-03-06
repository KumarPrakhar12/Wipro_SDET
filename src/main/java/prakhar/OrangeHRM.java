package prakhar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {

        
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       
        driver.get("https://opensource-demo.orangehrmlive.com/");
        

        
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);

       
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);

     
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);

        System.out.println("Login Successful");

       
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(5000);

       
        driver.findElement(By.xpath("//button[contains(@class,'oxd-button') and contains(.,'Add')]")).click();
        Thread.sleep(5000);

       
        driver.findElement(By.name("firstName")).sendKeys("Kumar");
        Thread.sleep(2000);

        
        driver.findElement(By.name("middleName")).sendKeys("Test");
        Thread.sleep(2000);

        
        driver.findElement(By.name("lastName")).sendKeys("Automation");
        Thread.sleep(2000);

     
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(7000);

        System.out.println("Employee Added Successfully");

       
        driver.findElement(By.className("oxd-userdropdown-tab")).click();
        Thread.sleep(2000);

       
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(4000);

        System.out.println("Logout Successful");

        driver.quit();
    }

}
