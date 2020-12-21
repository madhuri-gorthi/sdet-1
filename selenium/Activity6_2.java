package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://training-support.net/selenium/ajax");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
        driver.findElement(By.xpath("//button[text()='Change Content']")).click();
        
        WebDriverWait wait = new WebDriverWait (driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']"),"HELLO!"));
       System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']")).getText());
       
     
       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']"),"I'm late!"));
      System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']")).getText());
       
       driver.close();
        
        
	}

}
