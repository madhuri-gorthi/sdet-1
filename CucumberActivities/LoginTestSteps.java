package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Login page$")
    public void userIsOnloginPage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @When("^User enters username and password$")
    public void userentersusername() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(@class,'ui button')]")).click();
    }
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void userentersusernameandpwd(String username,String pwd) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[contains(@class,'ui button')]")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void showHowManySearchResultsWereShown() throws Throwable {
    	System.out.println("Page title"+driver.getTitle());
    
        String resultStats = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message  " + resultStats);
        
    }

    @And("^Close  browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
