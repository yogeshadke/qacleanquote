package Qaclearquote_Utitlity;

import io.appium.java_client.AppiumDriver;


import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class QaClearquote_baseclass {
     
     AppiumDriver driver;

    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pihu");
        caps.setCapability("udid", "465954ab");
        caps.setCapability("appPackage", "io.clearquote.assessment");
        caps.setCapability("appActivity", "io.clearquote.assessment.MainActivity");
        caps.setCapability("automationName", "UiAutomator2");

        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
