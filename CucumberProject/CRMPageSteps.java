package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMPageSteps {
	
	WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^User is on CRM  page$")
    public void openPage() {
        //Create Instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 20);

        //Open browser
        driver.get("https://alchemy.hguy.co/crm");
    }
    
    @When("^User enters CRM$")
    public void userentersusername() throws Throwable {
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
    }
    
    @Then("^Count the number of Dashlets$")
    public void dashletscount() throws Throwable {
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//td[@class='dashlet-title']")));	
      List<WebElement> dashlets= driver.findElements(By.xpath("//td[@class='dashlet-title']"));
        System.out.println("Total number of dashlets--"+dashlets.size());
    }
  
    @Then("^Print the number and title of each Dashlet$")
    public void printdashletscount() throws Throwable {
    	 List<WebElement> dashlets= driver.findElements(By.xpath("//td[@class='dashlet-title']/h3/span[2]"));
    	for(WebElement dashlet : dashlets)
        System.out.println("Title of dashlet--"+dashlet.getText());
      }
    
    
    @Then("^Go to sales tab and select leads$")
    public void selectsalestab() throws Throwable {
        WebElement sales= driver.findElement(By.id("grouptab_0"));
        WebElement lead = driver.findElement(By.id("moduleTab_9_Leads"));
         Actions builder = new Actions(driver);
         builder.moveToElement(sales).click().build().perform();
         builder.moveToElement(lead).click().build().perform();
         
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='actionmenulink' and text()='Create Lead']")));
         driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='Create Lead']")).click();
    	// Select select = new Select(driver.findElement(By.linkText("SALES")));

    	//select.selectByVisibleText("Leads");
      }
    
    @Then("^Fill in the details and save$")
    public void Filltheleaddetails() throws Throwable {
    	wait.until(ExpectedConditions.elementToBeClickable(By.id("first_name")));
    	Select select = new Select(driver.findElement(By.id("salutation")));
    	select.selectByVisibleText("Mr.");
         driver.findElement(By.id("first_name")).sendKeys("newlead2");
         driver.findElement(By.id("last_name")).sendKeys("ibm");
         driver.findElement(By.id("title")).sendKeys("UniqueTitle");
         driver.findElement(By.xpath("//table[@class='dcQuickEdit']//input[@type='submit' and @value='Save']")).click();
         
         driver.findElement(By.xpath("//div[text()='Create Lead']"));
     }
    
    @Then("^Go to view leads$")
    public void viewleaddetails() throws Throwable {
    	
    	driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='View Leads']")).click();
    }
    
    
    @Then("^Go to Activities tab and select meeting$")
    public void activitiestab() throws Throwable {
        WebElement sales= driver.findElement(By.id("grouptab_3"));
        WebElement lead = driver.findElement(By.id("moduleTab_9_Meetings"));
         Actions builder = new Actions(driver);
         builder.moveToElement(sales).click().build().perform();
         builder.moveToElement(lead).click().build().perform();
         
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='actionmenulink' and text()='Schedule Meeting']")));
         driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='Schedule Meeting']")).click();
    	
      }
    
    @Then("^Fill the details of the meeting$")
    public void Fillthemeetingdetails() throws Throwable {
    	wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
    	 driver.findElement(By.id("name")).sendKeys("Discuss on upcoming projects");
         driver.findElement(By.id("date_start_date")).sendKeys("12/12/2021");
         Select select = new Select(driver.findElement(By.id("date_start_hours")));
     	    select.selectByVisibleText("09");
     	  select = new Select(driver.findElement(By.id("date_start_minutes")));
     	   select.selectByVisibleText("30");
     	  driver.findElement(By.id("date_end_date")).sendKeys("12/12/2021");
     	   select = new Select(driver.findElement(By.id("date_end_hours")));
 	        select.selectByVisibleText("10");
 	       select = new Select(driver.findElement(By.id("date_end_minutes")));
 	        select.selectByVisibleText("30");
     }
    
    @Then("^Invite members:$")
    public void Invitemembers(List<String> firstname) throws Throwable {
    	
    	for(String name : firstname) {
    		System.out.println("print name"+name);
    		driver.findElement(By.id("search_first_name")).clear();
    	driver.findElement(By.id("search_first_name")).sendKeys(name);
    	driver.findElement(By.id("invitees_search")).click();
    	//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("window.scrollBy(0,1000)");
    	//js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@id='list_div_win']/table[@class='list view']/tbody/tr/td[2]")));
    	//System.out.println("print name"+driver.findElement(By.xpath("//div[@id='list_div_win']/table[@class='list view']/tbody/tr/td[2]")).getText());
    	Thread.sleep(3000);
			driver.findElement(By.id("invitees_add_1")).click();
    
    	    
    	}
    	 driver.findElement(By.id("SAVE_HEADER")).click();
    //	System.out.println("print name"+firstname.get(1));
     }
    
    @Then("^Go to view Meetings and confirm$")
   	public void navigate_to_view_meetings_page_and_confirm_creation_of_the_meeting() {
   		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionmenulink' and text()='View Meetings']")));
   		driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='View Meetings']")).click();
   		
   		wait.until(ExpectedConditions.textToBe(By.xpath("//h2[contains(@class,'module-title')]")," MEETINGS"));
   		
   		List<WebElement>meetings =driver.findElements(By.xpath("//td[@field='name']"));
   		for(WebElement meeting : meetings) {
   		
   		if(meeting.getText().contentEquals("Discuss on upcoming projects")) {
   			System.out.println("Confirm Meeting"+meeting.getText());
   		 assertEquals(meeting.getText(), "Discuss on upcoming projects");
   		   break;
   		}
   		}
   	}
    
    @Then("^select Products tab$")
    public void Alltab() throws Throwable {
        WebElement All= driver.findElement(By.id("grouptab_5"));
       All.click();
         Actions builder = new Actions(driver);
         builder.moveToElement(All).click().build().perform();
        JavascriptExecutor js = (JavascriptExecutor)driver;
     	js.executeScript("window.scrollBy(0,500)");
     	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[text()='Products']")));
         WebElement products = driver.findElement(By.xpath("//a[text()='Products']"));
         builder.moveToElement(products).click().build().perform();
         
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='actionmenulink' and text()='Create Product']")));
         driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='Create Product']")).click();
    	
      }
    
    @Then("^Fill in the product details \"(.*)\" , \"(.*)\" and save$")
    public void Fillproductdetails(String productname ,String price) throws Throwable {
    	wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
    	 driver.findElement(By.id("name")).sendKeys(productname);
         driver.findElement(By.id("price")).sendKeys(price);
         driver.findElement(By.id("SAVE")).click();
     }
    
    
    @Then("^Go to view products \"(.*)\"$")
   	public void viewproducts(String productname) {
   		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionmenulink' and text()='View Products']")));
   		driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='View Products']")).click();
   		
   		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(@class,'module-title-text') and contains(text(),'Products')]")));
   		
   		List<WebElement>meetings =driver.findElements(By.xpath("//td[@field='name']"));
   		for(WebElement meeting : meetings) {
   		
   		if(meeting.getText().contentEquals(productname)) {
   			System.out.println("Confirm product"+meeting.getText());
   		 assertEquals(meeting.getText(), productname);
   		   break;
   		}
   		}
   	}
     
    
    
    @And("^Close CRM browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }

}
