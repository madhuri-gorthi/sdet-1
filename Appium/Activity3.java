package Activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 {
    WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "pixel 4 ");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void addcontactAppium() {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.get("https://www.training-support.net/");

        driver.findElementByAccessibilityId("Create new contact");//("//android.widget.ImageButton[@content-desc=\"Create new contact\"]").click();
        System.out.println("Title on Homepage: " + driver.getTitle());
        
      /* driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");
       driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Varma");
       driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("123456789");
       driver.findElementById("com.android.contacts:id/editor_menu_save_button");
       String newPageTitle = driver
                .findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]")
                .getText();

        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
        */
    }

    @AfterTest
    public void tearDown() {
       driver.quit();
    }
}

