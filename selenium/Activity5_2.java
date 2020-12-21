package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Boolean display = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println("Check box is visible"+display);
        
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
         display = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println("Check box is visible"+display);
        
        driver.close();
        
        
	}

}
