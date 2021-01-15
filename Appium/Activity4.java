package Activities;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Activity4 {

	    AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;

	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "pixel 4 ");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("noReset", true);
	        // Use your own device's messaging app
	        caps.setCapability("appPackage", "com.google.android.apps.messaging");
	        caps.setCapability("appActivity", ".ui.ConversationListActivity");

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 5);
	    }

	    @Test
	    public void smsTest() {
	        // Locate the button to write a new message and click it
	        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Start new conversation\")")).click();

	        // Enter the number to send message to
	     //   String contactBoxLocator = "className(\"android.widget.MultiAutoCompleteTextView\")";
	        // Enter your own phone number
	        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/recipient_text_view\")")).sendKeys("1234567890");

	        // Focus on the message text box
	        String messageBoxLocator = "resourceId(\"com.google.android.apps.messaging:id/contact_picker_create_group\")";
	        driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator)).click();

	        // Type in a message
	        messageBoxLocator = "text(\"Text message\")";
	        MobileElement composeMessageInput = driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator));
	        composeMessageInput.sendKeys("Hello from Appium");

	        // Send the message
	        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/send_message_button_icon\")")).click();

	        // Wait for message to show
	        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("message_text_view")));

	        // Assertion
	        String messageLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/message_text_view\")";
	        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
	        Assert.assertEquals(sentMessageText, "Hello from Appium");
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
	}