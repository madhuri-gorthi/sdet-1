package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Boolean display = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
        System.out.println("Check box is visible"+display);
        
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
         display = driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
        System.out.println("Check box is visible"+display);
        
        driver.close();
        
        
	}
}
