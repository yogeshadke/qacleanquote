package Qaclearquote_Utility;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class QaClearquote_baseclass {
    protected static AppiumDriver driver;

    public static void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("appPackage", "io.clearquote.assessment");
        caps.setCapability("appActivity", "io.MainActivity");
        caps.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver(new URL("driver = webdriver.Remote('http://127.0.0.1:4723/wd/hub', desired_caps)"), caps);
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

	
}
