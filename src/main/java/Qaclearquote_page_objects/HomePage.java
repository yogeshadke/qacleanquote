package Qaclearquote_page_objects;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    AppiumDriver driver;

    @AndroidFindBy(id = "inspection_icon")
    WebElement inspectionIcon;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void navigateToInspection() {
        inspectionIcon.click();
    }
}

