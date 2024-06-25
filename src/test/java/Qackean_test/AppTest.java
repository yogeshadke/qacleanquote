package Qackean_test;

import Qaclearquote_Utility.QaClearquote_baseclass;
import Qaclearquote_page_objects.HomePage;
import Qaclearquote_page_objects.InspectionPage;
import Qaclearquote_page_objects.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppTest extends QaClearquote_baseclass {

    LoginPage loginPage;
    HomePage homePage;
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
