package Session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://training-support.net/selenium/selects");
        
        WebElement dropdown =driver.findElement(By.xpath("//select[@id='single-select']"));
        
        WebElement option =driver.findElement(By.xpath("//h3[@id='single-value']"));
        
        Select test = new Select(dropdown);
        
        test.selectByVisibleText("Option 2");
        System.out.println(option.getText());
        test.selectByIndex(3);
        System.out.println(option.getText());
        test.selectByValue("4");
        System.out.println(option.getText());
        
        List<WebElement> alloptions = test.getOptions();
        
        for(WebElement item : alloptions)
        	
        	System.out.println("options---"+ item.getText());
        
        driver.close();
        
	}     

}
