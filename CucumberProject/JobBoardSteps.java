package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobBoardSteps {

	WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^User is on alchemy job  page$")
    public void openPage() {
        //Create Instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @When("^User enters admin and password$")
    public void userentersusername() throws Throwable {
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
    }
    
    @Then("^User clicks the users menu$")
    public void Adduser() {
    	driver.findElement(By.xpath("//div[@class='wp-menu-name' and text()='Users']")).click();
    	driver.findElement(By.xpath("//li[@id='menu-users']//a[text()='Add New']")).click();
        driver.findElement(By.id("user_login")).sendKeys("tempuser23");
        driver.findElement(By.id("email")).sendKeys("tempuser23@email.com");
        driver.findElement(By.id("first_name")).sendKeys("tempuser23");
        driver.findElement(By.id("last_name")).sendKeys("user");
        driver.findElement(By.xpath("//button[contains(@class ,'button wp-generate-pw')]")).click();
       // driver.findElement(By.id("pass1")).clear();
        //driver.findElement(By.id("pass1")).sendKeys("kefwkegfehfwlei");
        driver.findElement(By.id("createusersub")).click();
          
    }
    
    @Then("^Validate created user$")
    public void Validateuser() {
    	driver.findElement(By.id("user-search-input")).sendKeys("tempuser");
       driver.findElement(By.id("search-submit")).click();
       List<WebElement> userslist= driver.findElements(By.xpath("//table[@class='wp-list-table widefat fixed striped users']/tbody/tr"));
       for(WebElement user : userslist) {
    	   String username = user.findElement(By.xpath("//table[@class='wp-list-table widefat fixed striped users']/tbody/tr/td[contains(@class,'username')]/strong/a")).getText();
    	   if(username.contentEquals("tempuser23")) {
    		    assertEquals("tempuser23", username);
    		    break;
    	   }    
       }      
               
    }
    
    
    @Given("^User is on Jobs page$")
    public void openjobsPage() {
        //Create Instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    
       
    @When("^Click the job page$")
    public void gotojobpage() throws Throwable {    	
        driver.findElement(By.linkText("Jobs")).click();;        
    }
    @Then("^Search using keyword$")
    public void jobsearch() throws Throwable{
    	driver.findElement(By.id("search_keywords")).sendKeys("QA");
    	driver.findElement(By.xpath("//input[contains(@id,'freelance')]")).click();
    	driver.findElement(By.xpath("//input[contains(@id,'internship')]")).click();
    	driver.findElement(By.xpath("//input[contains(@id,'part-time')]")).click();
    	driver.findElement(By.xpath("//input[contains(@id,'temporary')]")).click();
    	driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
    	//ul[@class='job_listings']//h3[text()='SDET Tester3']
    }
    
    @Then("^Select a job and find the details$")
    public void selectjob() throws Throwable{
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='job_listings']//h3[text()='QA']")));
    	driver.findElement(By.xpath("//ul[@class='job_listings']//h3[text()='QA']")).click();
    	
    }
    
    @Then("^Print the title of the job$")
    public void jobtitle() throws Throwable{
      
    	String jobtitle=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
    	System.out.println("Job Title"+jobtitle);
    }
    
    @Then("^Apply for the job$")
    public void applyforjob() throws Throwable{
    
    	driver.findElement(By.xpath("//input[@class='application_button button']")).click();
   }
    
    @When("^Click the postjob page$")
    public void gotopostjobpage() throws Throwable {    	
        driver.findElement(By.linkText("Post a Job")).click();;        
    }
    
    @Then("^Fill the details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")    
    public void Filljobdetails(String Jobname,String Desc,String email,String company) throws Throwable {
        driver.findElement(By.id("create_account_email")).sendKeys(email); 
    	driver.findElement(By.id("job_title")).sendKeys(Jobname);
    	driver.findElement(By.id("job_description_ifr")).sendKeys(Desc);
        driver.findElement(By.id("application")).sendKeys(email);
        driver.findElement(By.id("company_name")).sendKeys(company);
        driver.findElement(By.xpath("//input[@name='submit_job']")).click();
    }
    
    @Then("^Submit the job$")
    public void Submitthejob() throws Throwable{
    
    	driver.findElement(By.id("job_preview_submit_button")).click();
   }
    @Then("^Confirm the posted job \"(.*)\"$")
    public void confirmthejob(String Jobname) throws Throwable{
    
driver.findElement(By.xpath("//a[text()='click here']")).click();
		
		assertEquals(Jobname,driver.findElement(By.className("entry-title")).getText());
   }
    
    @And("^Close  browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
