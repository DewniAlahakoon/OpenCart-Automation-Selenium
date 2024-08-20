package com.naveenautomationlabs.opencart.tests;

import com.naveenautomationlabs.opencart.pages.*;
import com.naveenautomationlabs.opencart.utils.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFactoryPageTest {

    HomeFactoryPage homeFactoryPage;
    LoginFactoryPage loginFactoryPage;
    LoginSuccessFactoryPage loginSuccessFactoryPage = null;

    @BeforeMethod
    public void setUp() {
        TestBase.getInstance().openBrowser();
        TestBase.getInstance().navigateToURL();
        homeFactoryPage = PageFactory.initElements(TestBase.getInstance().getDriver(), HomeFactoryPage.class);
        loginFactoryPage = homeFactoryPage.clickOnLoginLink();

    }

    @Test(description = "Verify that a user can login to the application using the correct credentials")
    public void testValidLogin() {

       loginSuccessFactoryPage = loginFactoryPage
                .setUserName("demoann1@gmail.com")
                .setPassword("demo@1")
                .clickOnLogin();

        String expectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
        Assert.assertEquals(loginSuccessFactoryPage.getActualURL(),expectedURL ,"Login Failed with valid credentials");

    }

    @Test(description = "Verify that a user can't login to the application using the correct credentials")
    public void testInvalidLogin() {

    loginSuccessFactoryPage = loginFactoryPage
                .setUserName("demoann1@gmail.com")
                .setPassword("demo@12")
                .clickOnLogin();

        String expectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
        Assert.assertEquals(loginSuccessFactoryPage.getActualURL(),expectedURL ,"Login succeeded with invalid credentials");

    }

    @AfterMethod
    public void tearDown() {

        TestBase.getInstance().closeBrowser();
    }
}
