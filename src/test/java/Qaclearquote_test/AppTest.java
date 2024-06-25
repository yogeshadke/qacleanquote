package Qaclearquote_test;



import Qaclearquote_page_objects.HomePage;
import Qaclearquote_page_objects.InspectionPage;
import Qaclearquote_page_objects.LoginPage;
import io.appium.java_client.AppiumDriver;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Qaclearquote_Utitlity.QaClearquote_baseclass;

import java.net.MalformedURLException;

public class AppTest extends QaClearquote_baseclass {
AppiumDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    @SuppressWarnings("rawtypes")
	InspectionPage inspectionPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        setup();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        inspectionPage = new InspectionPage(driver);
    }

    @Test
    public void testVehicleInspection() {
        loginPage.login("user01", "0987");
        // Wait for configuration download to complete (use explicit waits in real scenario)
        homePage.startInspection();
        inspectionPage.enterLicensePlate("Test123");
        inspectionPage.selectVehicleDetails();
        inspectionPage.captureFrontView();
    }

    @AfterClass
    public void tearDown() {
        super.teardown();
    }
}
