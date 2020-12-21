package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
        driver.findElement(By.xpath("//input[contains(@class,'username-')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class,'password-')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        
        driver.close();
        
	
	
	}
	
}
