# qacleanquote
# QAclearquote Page Objects
# InspectionPage Class

This class represents the page object model for the Inspection page in a mobile application, using Appium for automation.
Prerequisites

    Java Development Kit (JDK) installed
    Appium installed and running
    Appium Java Client library
    Selenium Java library

Class Overview

The InspectionPage class encapsulates the elements and actions on the Inspection page of the mobile application. It uses the Page Object Model (POM) design pattern to create a clean and maintainable automation framework.
# Methods

    InspectionPage(AppiumDriver driver): Constructor that initializes the elements on the page using AppiumFieldDecorator.
    void enterLicensePlate(String plate): Enters the license plate and clicks the next button.
    void selectVehicleDetails(): Selects vehicle make and model, then clicks the next button.
    void captureFrontViewImage(): Clicks the button to capture an image and confirms the action.
    void completeInspection(): Completes the inspection process by clicking the complete inspection button.
# HomePage Class

This class represents the page object model for the Home page in a mobile application, using Appium for automation.
Prerequisites

    Java Development Kit (JDK) installed
    Appium installed and running
    Appium Java Client library
    Selenium Java library

Class Overview

The HomePage class encapsulates the elements and actions on the Home page of the mobile application. It uses the Page Object Model (POM) design pattern to create a clean and maintainable automation framework.
# Methods

    HomePage(AppiumDriver driver): Constructor that initializes the elements on the page using AppiumFieldDecorator.
    void navigateToInspection(): Clicks the inspection icon to navigate to the Inspection page.
# LoginPage Class

This class represents the page object model for the Login page in a mobile application, using Appium for automation.
Prerequisites

    Java Development Kit (JDK) installed
    Appium installed and running
    Appium Java Client library
    Selenium Java library

Class Overview

The LoginPage class encapsulates the elements and actions on the Login page of the mobile application. It uses the Page Object Model (POM) design pattern to create a clean and maintainable automation framework.
# Methods

    LoginPage(AppiumDriver driver): Constructor that initializes the elements on the page using AppiumFieldDecorator.
    void login(String user, String pass): Enters the user ID and password, then clicks the login button.
