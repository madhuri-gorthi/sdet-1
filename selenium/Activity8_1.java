package Session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://training-support.net/selenium/tables");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
       // Get cols
        
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
    	
        //Get rows
	
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        
        //Get third row values and print them
    	
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
	
        for(WebElement cellValue : thirdRow) {
	
            System.out.println("Cell Value: " + cellValue.getText());
        }
        
        WebElement  secondrow = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("scecondrow"+secondrow.getText());
        
        driver.close();
	}

}
