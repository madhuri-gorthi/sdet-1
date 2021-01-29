package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMPageSteps{
	WebDriver driver;
    WebDriverWait wait;
    Alert alert;
	@Given("^I navigate to Alchemy HRM System and login to the application$")
	public void i_navigate_to_alchemy_hrm_system_and_login_to_the_application() {
		
		driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 20);
		 
		
		driver.get("http://alchemy.hguy.co/orangehrm");		
		
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");	
		
		driver.findElement(By.id("btnLogin")).click();
	}


	@Given("^Navigate to Recruitment Page$")
	public void navigate_to_recruitment_page() {
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
	}
	
	@Given("^Click on Vacancies Menu$")
	public void click_on_vacancies_menu() {
		driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
	}
	
	@Then("^Vacancies Page should be displayed$")
	public void vacancies_page_should_be_displayed() {
		assertEquals(driver.findElement(By.xpath("//div[@id='srchVacancy']/div/h1")).getText(),"Vacancies");
	}
	
	@When("^Add Button is clicked$")
	public void add_button_is_clicked() {
		driver.findElement(By.id("btnAdd")).click();
	}
	
	@When("^Job Vacancy Form is filled and saved - job title \"(.*)\", vacancy name \"(.*)\", hiring manager \"(.*)\"$")
	public void job_vacancy_form_is_filled_and_saved(String jobTitleL,String vacancyName,String hiringManager) {
		Select jobTitle = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
		jobTitle.selectByVisibleText(jobTitleL);
		
		driver.findElement(By.id("addJobVacancy_name")).sendKeys(vacancyName);
		
		driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys(hiringManager);
		
		driver.findElement(By.id("btnSave")).click();
	}
	
	@Then("^Vacancy should be created - job title \"(.*)\", vacancy name \"(.*)\", hiring manager \"(.*)\"$")
	public void vacancy_should_be_created(String jobTitleL,String vacancyName,String hiringManagerL) {
		driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
		
		Select jobTitle = new Select(driver.findElement(By.id("vacancySearch_jobTitle")));
		jobTitle.selectByVisibleText(jobTitleL);
		
		Select jobVacancy = new Select(driver.findElement(By.id("vacancySearch_jobVacancy")));
		jobVacancy.selectByVisibleText(vacancyName);
		
		Select hiringManager = new Select(driver.findElement(By.id("vacancySearch_hiringManager")));
		hiringManager.selectByVisibleText(hiringManagerL);
		
		driver.findElement(By.id("btnSrch")).click();
		

		assertEquals(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a")).getText(),vacancyName);		
		assertEquals(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]")).getText(),jobTitleL);
		assertEquals(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[4]")).getText(),hiringManagerL);
		
		
	}
	
	@Given("^Click on Add Button$")
	public void click_add_button() {
		driver.findElement(By.id("btnAdd")).click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("addCandidateHeading")));
	}

	@Then("^Fill in the details of the candidate$")
	public void fill_in_the_details_of_the_candidate() {
		driver.findElement(By.id("addCandidate_firstName")).sendKeys("Kalesh");
        driver.findElement(By.id("addCandidate_lastName")).sendKeys("Singh");
        
        driver.findElement(By.id("addCandidate_email")).sendKeys("kaleshsingh@test.com");
	}
	@Then("^Upload a resume to the form$")
	public void upload_a_resume_to_the_form() {
		 File file = new File("Sample Resume.docx");
		  WebElement uploadInput = driver.findElement(By.id("addCandidate_resume"));
		    uploadInput.sendKeys(file.getAbsolutePath());
		    

	}
	@Then("^Save Button is clicked$")
	public void save_button_is_clicked() {
	   
	    driver.findElement(By.id("btnSave")).click();

	}
	@Then("^Confirm Candidate Entry in Recruitments Page$")
	public void confirm_candidate_entry_in_recruitments_page() {
		
			
		driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("candidateSearch_candidateName")));
		
		driver.findElement(By.id("candidateSearch_candidateName")).sendKeys("Kalesh Singh");
		
		driver.findElement(By.id("btnSrch")).click();
		
		
		assertEquals(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td[3]/a")).getText(),"Kalesh Singh");

	}
	
	String empId="";
	@Given("^Click on the PIM option in the menu$")
	public void click_on_the_pim_option_in_the_menu() {
		WebElement PIMOptions = driver.findElement(By.id("menu_pim_viewPimModule"));
		PIMOptions.click();
		PIMOptions = driver.findElement(By.id("menu_pim_viewPimModule"));
		PIMOptions.click();

		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Employee Information')]"))));

		assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Employee Information");
		System.out.println("Employee Information Page is displayed");
	}
	
	@Given("^Click on Add Employee Button$")
	public void click_on_add_button() {
		
		driver.findElement(By.id("btnAdd")).click();
		System.out.println("Add Button is clicked");

	}
	

	@When("^All required fields are filled in the Add Employee form \"(.*)\", \"(.*)\"$")
	public void all_required_fields_are_filled_in_the_add_employee_form(String firstName,String lastName) {
	
		
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		System.out.println("Employee Details are entered");

		empId = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Employee Id : " + empId);
		
		driver.findElement(By.id("chkLogin")).click();
		driver.findElement(By.id("user_name")).sendKeys(firstName+lastName);

		driver.findElement(By.id("btnSave")).click();
		System.out.println("Save Button is clicked");

	}

	@Then("Verify Employee is created {string}, {string}")
	public void verify_employee_is_created(String firstName,String lastName) {
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Employee Information')]"))));
		System.out.println("Navigated to Admin Page");

		driver.findElement(By.id("empsearch_id")).clear();
		driver.findElement(By.id("empsearch_id")).sendKeys(empId);

		driver.findElement(By.id("searchBtn")).click();
		System.out.println("The new employee created is searched");

		assertEquals(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]")).getText(), empId);
		System.out.println("Employee id is displayed correctly");

		assertEquals(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]")).getText(), firstName);
		System.out.println("First Name is displayed correctly");

		assertEquals(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[4]")).getText(), lastName);
		System.out.println("Last Name is displayed correctly");
		
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]/input")).click();
		driver.findElement(By.id("btnDelete")).click();
		
		driver.findElement(By.id("dialogDeleteBtn")).click();

	}

	@And("^Close the Browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }


}