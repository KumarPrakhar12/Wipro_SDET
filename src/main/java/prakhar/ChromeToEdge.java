package prakhar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeToEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();

	}

}
