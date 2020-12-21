package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://www.training-support.net");
		System.out.println(driver.getTitle());	
		driver.findElement(By.xpath("//div/a[@id='about-link']")).click();
		System.out.println("new page heading"+driver.getTitle());
		
		//Close the browser
		driver.close();
	}

}
