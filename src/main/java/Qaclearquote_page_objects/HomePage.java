package Qaclearquote_page_objects;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    AppiumDriver driver;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.clearquote.assessment:id/inspection")
    private WebElement inspectionButton;

    public void startInspection() {
        inspectionButton.click();
    }
}
