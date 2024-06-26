package Qaclearquote_test;



import Qaclearquote_page_objects.HomePage;

import Qaclearquote_page_objects.InspectionPage;
import Qaclearquote_page_objects.LoginPage;
import io.appium.java_client.AppiumDriver;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Qaclearquote_Utility.QaClearquote_baseclass;

import java.net.MalformedURLException;

public class TestClass extends QaClearquote_baseclass {

    private LoginPage loginPage;
    private HomePage homePage;
    private InspectionPage inspectionPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
    	QaClearquote_baseclass.setup();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        inspectionPage = new InspectionPage(driver);
    }

    @Test
    public void testVehicleInspection() {
        loginPage.login("user01", "0987");
        homePage.navigateToInspection();
        inspectionPage.enterLicensePlate("Test123");
        inspectionPage.selectVehicleDetails();
        inspectionPage.captureFrontViewImage();
        inspectionPage.completeInspection();
    }

    @AfterClass
    public void tearDown() {
    	QaClearquote_baseclass qaClearquote_baseclass = new QaClearquote_baseclass();
		qaClearquote_baseclass.teardown();
    }
}