package Qaclearquote_page_objects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;


public class LoginPage {
    AppiumDriver driver;

    @AndroidFindBy(id = "user_id")
    WebElement userId;

    @AndroidFindBy(id = "password")
     WebElement password;

    @AndroidFindBy(id = "login_button")
     WebElement loginButton;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void login(String user, String pass) {
        userId.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
        
    }
}
