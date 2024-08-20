package com.naveenautomationlabs.opencart.tests;

import com.naveenautomationlabs.opencart.pages.HomePage;
import com.naveenautomationlabs.opencart.pages.RegisterSuccessPage;
import com.naveenautomationlabs.opencart.pages.UserRegisterPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomationlabs.opencart.utils.TestBase;

public class RegisterPageTest {

    HomePage homePage;
    UserRegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage = null;

    @BeforeMethod
    public void setUp() {

        TestBase.getInstance().openBrowser();
        TestBase.getInstance().navigateToURL();
        homePage = new HomePage();
        registerPage = homePage.clickOnRegisterLink();
    }

    @Test(description = "Verify that a new user can successfully register an account")
    public void testRegisterNewUser() {

        registerSuccessPage = registerPage
                .setFirstName("Ann")
                .setLastName("Ketty")
                .setEmail("demoann47@gmail.com")
                .setTelephone("1234543")
                .setPassword("demo@1")
                .setConfirmPassword("demo@1")
                .clickNo()
                .checkOnPolicy()
                .clickOnContinue();

        Assert.assertEquals(registerSuccessPage.getSuccessMessage(),"Congratulations! Your new account has been successfully created!","User Registration Failed");
    }

    @AfterMethod
    public void tearDown() {

        TestBase.getInstance().closeBrowser();
    }
}
