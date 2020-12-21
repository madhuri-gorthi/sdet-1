package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
	       
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
			
		//Open the browser
		driver.get("https://www.training-support.net");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
		Boolean userName = driver.findElement(By.id("about-link")).isEnabled();
		System.out.println("username"+userName);
		
		System.out.println(driver.findElement(By.className("green")).getText());
		
		System.out.println(driver.findElement(By.cssSelector(".green")).getText());
		driver.findElement(By.linkText("About Us"));
		//Close the browser
		driver.close();
	 

    }
}
