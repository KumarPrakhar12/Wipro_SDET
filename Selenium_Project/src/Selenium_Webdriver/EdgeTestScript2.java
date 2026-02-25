package Selenium_Webdriver;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class EdgeTestScript2 {
	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	
	try {
		driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    
	    String title =driver.getTitle();
	    System.out.println("Page Title: " + title);
	
	    if(title.contains("Facebook"))
	    {
	    	System.out.println("Test Pass");
	    }
	    else
	    {
	    	System.out.println("Test Fail");
	    }
	} catch(Exception e)
	{
	System.out.println("Exception occured : " + e.getMessage());
	}
	finally
	{
		driver.quit();
	}
	}

}
