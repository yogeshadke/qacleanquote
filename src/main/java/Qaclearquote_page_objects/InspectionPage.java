package Qaclearquote_page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InspectionPage {
     AppiumDriver driver;

    @AndroidFindBy(id = "license_plate")
     WebElement licensePlate;

    @AndroidFindBy(id = "next_button")
     WebElement nextButton;

    @AndroidFindBy(id = "vehicle_make")
     WebElement vehicleMake;

    @AndroidFindBy(id = "vehicle_model")
     WebElement vehicleModel;

    @AndroidFindBy(id = "capture_image_button")
     WebElement captureImageButton;

    @AndroidFindBy(id = "ok_button")
     WebElement okButton;

    @AndroidFindBy(id = "complete_inspection_button")
     WebElement completeInspectionButton;

    public InspectionPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterLicensePlate(String plate) {
        licensePlate.sendKeys(plate);
        nextButton.click();
    }

    public void selectVehicleDetails() {
        vehicleMake.sendKeys("Maruti Suzuki");
        vehicleModel.sendKeys("ALTO");
        nextButton.click();
    }

    public void captureFrontViewImage() {
        captureImageButton.click();
        okButton.click();
    }

    public void completeInspection() {
        completeInspectionButton.click();
    }
}
