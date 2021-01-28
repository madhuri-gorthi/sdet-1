package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
	WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "pixel 4 ");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 50);
    }

    @Test
    public void todolistAppium() {
        driver.get("https://www.training-support.net/selenium");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View")));
       // driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()..scrollTextIntoView(text(\"To-Do List\"))")).click();
        //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).getChildByText(UiSelector().className(\"android.view.View\"), \"To-Do List\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollToEnd(4).scrollIntoView(UiSelector().textContains(\"To-Do List\"))")).click();
       // driver.findElement(MobileBy.AndroidUIAutomator("text(\"To-Do List \")"));
        
        String[] tasksdetails = {"Add tasks to list", "Get number of tasks"};
    	for(int i=0;i<tasksdetails.length;i++ ) {
    		String task = tasksdetails[i];
    	System.out.println("task"+tasksdetails[i]);
        driver.findElement(MobileBy.AndroidUIAutomator("className(\"android.widget.EditText\")")).sendKeys(task);
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Add Task\")")).click();
        //driver.findElement(MobileBy.AndroidUIAutomator("className(\"android.widget.EditText\")")).clear();
    	}
        List<MobileElement> tasks =driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");
             System.out.println("number of tasks added"+tasks.size()); 
             
             for(int i=0;i<tasksdetails.length;i++ ) {   
             driver.findElementByXPath("//android.view.View[@resource-id='tasksList']//android.view.View[@text='"+tasksdetails[i]+"']").click();
             }
             
             driver.findElementByXPath("//android.view.View[contains(@text,'Clear List')]").click();
    		 Reporter.log("Clear List Button is clicked | ");
    		 
    		 List<MobileElement> noOfTasks = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");
    		 System.out.println("number of tasks after clearing"+noOfTasks.size());
    		 Assert.assertEquals(noOfTasks.size(), 0);
    		    
		
       
    }

    @AfterTest
    public void tearDown() {
        //driver.quit();
    }
}

