package Project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity9 {
	   WebDriver driver;
		@BeforeMethod
		    public void beforeMethod() {
		        //Create a new instance of the Firefox driver
		        driver = new FirefoxDriver();
		        
		        //Open browser
		        driver.get("https://alchemy.hguy.co/lms");
		    }

		    @Test		    
		    public void exampleTestCase() {   
		      
		    	
		    	 WebElement button= driver.findElement(By.xpath("//div[@class=\"main-header-bar-navigation\"]//li[5]"));
		      
		        button.click();
		       
		         System.out.println("Page heading is: " +  driver.getTitle());
		      
		             //Assertion for page title
		         Assert.assertEquals("My Account – Alchemy LMS", driver.getTitle());
		         
		         WebElement login= driver.findElement(By.linkText("Login"));
		         login.click();
		         System.out.println("Login Page heading is: " +  driver.getTitle()); 
		         driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
		         driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
		         driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		       
		       button= driver.findElement(By.xpath("//div[@class=\"main-header-bar-navigation\"]//li[2]"));
		            button.click();
		      driver.findElement(By.xpath("//div[@class='ld-course-list-items row']/div[2]")).click();
		      Assert.assertEquals("Email Marketing Strategies – Alchemy LMS",driver.getTitle());
		      driver.findElement(By.xpath("//div[@class='ld-item-list ld-lesson-list']/div[2]/div[2]")).click();
		      System.out.println("Lesson Title "+driver.getTitle());
		      Assert.assertEquals("Improving & Designing Marketing Emails – Alchemy LMS", driver.getTitle());
		      
		      List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='ld-focus-content']//div[@class='ld-content-actions']/div[@class='ld-content-action']"));
		         for(WebElement test : buttons) {
		        	 
		        	 String buttontext = test.getText();
		        	 if(buttontext.contentEquals("Mark Complete")) {
		        		 System.out.println("Mark Complete button enabled");
		        		 driver.findElement(By.xpath("//div[@class='ld-focus-content']//div[@class='ld-content-actions']/div[@class='ld-content-action']//input[@type='submit']")).click();
		        	 }
		        		 else {
		   		    	  System.out.println("Mark Complete button disabled");
		   		      }
		        	 
		         }
		      
		        
		    	  
		              
		    }

		    @AfterMethod
		    public void afterMethod() {
		        //Close the browser
		      driver.quit();
		    }
}
