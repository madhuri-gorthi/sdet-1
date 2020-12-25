package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    @Parameters({"username", "password"})
    public void exampleTestCase(String username, String password) {
        // Check the title of the page
        String title = driver.getTitle();
       
       WebElement button= driver.findElement(By.xpath("//div[@class=\"main-header-bar-navigation\"]//li[5]"));
        //Print the title of the page
       button.click();
      
        System.out.println("Page heading is: " +  driver.getTitle());
     
            //Assertion for page title
        Assert.assertEquals("My Account – Alchemy LMS", driver.getTitle());
        
        WebElement login= driver.findElement(By.linkText("Login"));
        login.click();
        System.out.println("Login Page heading is: " +  driver.getTitle()); 
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@id='wp-admin-bar-top-secondary']/li[@id='wp-admin-bar-my-account']/a[contains(text(),\"Howdy\")]")).isDisplayed());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
