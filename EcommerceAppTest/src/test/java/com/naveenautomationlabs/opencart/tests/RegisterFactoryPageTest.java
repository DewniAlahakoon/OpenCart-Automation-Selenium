package com.naveenautomationlabs.opencart.tests;

import com.naveenautomationlabs.opencart.pages.*;
import com.naveenautomationlabs.opencart.utils.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterFactoryPageTest {

    HomeFactoryPage homeFactoryPage;
    UserRegisterFactoryPage registerFactoryPage;
    RegisterSuccessFactoryPage registerSuccessFactoryPage;

    @BeforeMethod
    public void setUp() {

        TestBase.getInstance().openBrowser();
        TestBase.getInstance().navigateToURL();
        homeFactoryPage = PageFactory.initElements(TestBase.getInstance().getDriver(), HomeFactoryPage.class);
        registerFactoryPage = homeFactoryPage.clickOnRegisterLink();
    }

    @Test(description = "Verify that a new user can successfully register an account")
    public void testRegisterNewUser() {

        registerSuccessFactoryPage = registerFactoryPage
                .setFirstName("Ann")
                .setLastName("Ketty")
                .setEmail("demoann62@gmail.com")
                .setTelephone("1234543")
                .setPassword("demo@1")
                .setConfirmPassword("demo@1")
                .clickNo()
                .checkOnPolicy()
                .clickOnContinue();

        Assert.assertEquals(registerSuccessFactoryPage.getSuccessMessage(),"Congratulations! Your new account has been successfully created!","User Registration Failed");
    }

    @AfterMethod
    public void tearDown() {

        TestBase.getInstance().closeBrowser();
    }
}
