package Qaclearquote_page_objects;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

public class LoginPage {
    @SuppressWarnings("unused")
	private AppiumDriver driver;

    @CacheLookup
    private WebElement userIdField;

    @CacheLookup
    private WebElement passwordField;

    @CacheLookup
    private WebElement loginButton;

    public LoginPage(AppiumDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }

    public void login(String userId, String password) {
        userIdField.sendKeys(userId);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}

