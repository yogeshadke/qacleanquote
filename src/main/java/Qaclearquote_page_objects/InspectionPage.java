package Qaclearquote_page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InspectionPage {
    AppiumDriver driver;

    public InspectionPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.clearquote.assessment:id/licensePlate")
    WebElement licensePlateField;

    @AndroidFindBy(id = "com.clearquote.assessment:id/next")
     WebElement nextButton;

    @AndroidFindBy(id = "com.clearquote.assessment:id/make")
     WebElement vehicleMakeField;

    @AndroidFindBy(id = "com.clearquote.assessment:id/model")
     WebElement vehicleModelField;

    @AndroidFindBy(id = "com.clearquote.assessment:id/captureFrontView")
     WebElement captureFrontViewButton;

    @AndroidFindBy(id = "com.clearquote.assessment:id/okay")
     WebElement okayButton;

    public void enterLicensePlate(String plate) {
       licensePlateField.sendKeys(plate);
    	
         nextButton.click();
    }

    public void selectVehicleDetails() {
        vehicleMakeField.sendKeys("Maruti Suzuki");
        vehicleModelField.sendKeys("ALTO");
        nextButton.click();
    }

    public void captureFrontView() {
        captureFrontViewButton.click();
        okayButton.click();
        nextButton.click();
    }
}
