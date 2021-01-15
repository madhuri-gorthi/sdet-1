package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	  WebDriverWait wait;
	    AppiumDriver<MobileElement> driver = null;

	    @BeforeTest
	    public void setup() throws MalformedURLException {

	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "pixel 4 Emulator ");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");         
	        caps.setCapability("appActivity", ".ui.TaskListsActivity"); 
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	           wait = new WebDriverWait(driver, 10);
	    }

	    @Test
	    public void GoogletaskAppium() {
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       String[] tasksdetails = {"Complete Activity with Google Keep", "Complete Activity with Google Tasks","Complete the second Activity Google Keep"};
	    	for(String taskstoadd : tasksdetails ) {
	    	driver.findElementByAccessibilityId("Create new task").click();
	    	driver.findElementById("add_task_title").sendKeys(taskstoadd);
	    	driver.findElementById("add_task_done").click();
	    	}
	      List<MobileElement> listitems = driver.findElementsById("task_name");
	    	
	    	for(MobileElement tasks : listitems) {
	    	System.out.println("tasks--"+tasks.getText());
	    	}
	      Assert.assertEquals(listitems.size(),3);
	    
	    }
	    
	    @AfterTest
	    public void tearDown() {
	       driver.quit();
	    }
}
