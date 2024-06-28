# QAclearquote Page Objects and Utility
# Overview

This repository contains classes for automating a mobile application using Appium and the Page Object Model (POM) design pattern. The classes include InspectionPage, HomePage, LoginPage, QaClearquote_baseclass, ExtentListenerClass, and TestClass.
Prerequisites

    Java Development Kit (JDK) installed
    Appium installed and running
    Appium Java Client library
    Selenium Java library
    TestNG library

# Classes
# InspectionPage Class

This class represents the page object model for the Inspection page in a mobile application, using Appium for automation.
Methods

    InspectionPage(AppiumDriver driver): Constructor that initializes the elements on the page using AppiumFieldDecorator.
    void enterLicensePlate(String plate): Enters the license plate and clicks the next button.
    void selectVehicleDetails(): Selects vehicle make and model, then clicks the next button.
    void captureFrontViewImage(): Clicks the button to capture an image and confirms the action.
    void completeInspection(): Completes the inspection process by clicking the complete inspection button.

# HomePage Class

This class represents the page object model for the Home page in a mobile application, using Appium for automation.
Methods

    HomePage(AppiumDriver driver): Constructor that initializes the elements on the page using AppiumFieldDecorator.
    void navigateToInspection(): Clicks the inspection icon to navigate to the Inspection page.

# LoginPage Class

This class represents the page object model for the Login page in a mobile application, using Appium for automation.
Methods

    LoginPage(AppiumDriver driver): Constructor that initializes the elements on the page using AppiumFieldDecorator.
    void login(String user, String pass): Enters the user ID and password, then clicks the login button.

# QaClearquote_baseclass

The QaClearquote_baseclass class provides the basic setup and teardown functionalities for running Appium-based automated tests on an Android application.
Methods

    setup(): Initializes the Appium driver with the desired capabilities for the Android emulator and application.
    teardown(): Quits the driver if it is not null, cleaning up the session after the tests.

# ExtentListenerClass

The ExtentListenerClass is a TestNG listener class that implements the ITestListener interface. It provides methods to perform actions at various stages of the test execution lifecycle, such as on test start, success, failure, and finish.
Methods

    onTestStart(ITestResult result): Logs the start of a test.
    onTestSuccess(ITestResult result): Logs the successful execution of a test.
    onTestFailure(ITestResult result): Logs the failure of a test.
    onTestSkipped(ITestResult result): Logs the skipping of a test.
    onTestFailedButWithinSuccessPercentage(ITestResult result): Logs tests that fail but are within the success percentage defined.
    onStart(ITestContext context): Logs the start of a test context.
    onFinish(ITestContext context): Logs the finish of a test context.

# TestClass

The TestClass is a TestNG test class that automates the process of logging in, navigating to the inspection page, and completing a vehicle inspection using Appium. It extends the QaClearquote_baseclass to utilize the setup and teardown methods for initializing and quitting the Appium driver.
Methods

    setUp(): Sets up the Appium driver and initializes the page objects.
    testVehicleInspection(): Automates the process of logging in, navigating to the inspection page, and completing a vehicle inspection.
    tearDown(): Quits the Appium driver to clean up the session after the tests.
