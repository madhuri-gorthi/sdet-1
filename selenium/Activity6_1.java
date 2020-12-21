package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        
        WebDriverWait wait = new WebDriverWait (driver, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        
       driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
             
        driver.close();
        
        
	}

}
