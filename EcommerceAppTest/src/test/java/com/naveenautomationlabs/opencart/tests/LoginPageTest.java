package com.naveenautomationlabs.opencart.tests;

import com.naveenautomationlabs.opencart.pages.HomePage;
import com.naveenautomationlabs.opencart.pages.LoginPage;
import com.naveenautomationlabs.opencart.pages.LoginSuccessPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomationlabs.opencart.utils.TestBase;

public class LoginPageTest {

    HomePage homePage;
    LoginPage loginPage;
    LoginSuccessPage loginSuccessPage = null;

    @BeforeMethod
    public void setUp() {
        TestBase.getInstance().openBrowser();
        TestBase.getInstance().navigateToURL();
        homePage = new HomePage();
        loginPage = homePage.clickOnLoginLink();

    }

    @Test(description = "Verify that a user can login to the application using the correct credentials")
    public void testValidLogin() {

        loginSuccessPage =  loginPage
                .setUserName("demoann1@gmail.com")
                .setPassword("demo@1")
                .clickOnLogin();

        String expectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
        Assert.assertEquals(loginSuccessPage.getActualURL(),expectedURL ,"Login Failed with valid credentials");

    }

    @Test(description = "Verify that a user can't login to the application using the correct credentials")
    public void testInvalidLogin() {

        loginSuccessPage =  loginPage
                .setUserName("demoann1@gmail.com")
                .setPassword("demo@12")
                .clickOnLogin();

        String expectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
        Assert.assertEquals(loginSuccessPage.getActualURL(),expectedURL ,"Login succeeded with invalid credentials");

    }

    @AfterMethod
    public void tearDown() {

        TestBase.getInstance().closeBrowser();
    }
}
