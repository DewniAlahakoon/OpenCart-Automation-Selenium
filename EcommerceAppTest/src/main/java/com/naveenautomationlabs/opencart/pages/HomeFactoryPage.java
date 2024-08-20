package com.naveenautomationlabs.opencart.pages;

import com.naveenautomationlabs.opencart.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFactoryPage {

    //locating  web elements using FindBy annotation
    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement myAccountElement;

    @FindBy(linkText = "Register")
    private WebElement regLinkElement;

    @FindBy(linkText = "Login")
    private WebElement loginElement;

    public HomeFactoryPage clickOnMyAccount(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath("//a[@title='My Account']"),20);
        myAccountElement.click();
        return this;
    }

    public UserRegisterFactoryPage clickOnRegisterLink(){

        clickOnMyAccount();

        TestBase.getInstance().waitUntilNextElementAppears(By.linkText("Register"),20);
        regLinkElement.click();
        return PageFactory.initElements(TestBase.getInstance().getDriver(),UserRegisterFactoryPage.class);

    }

    public LoginFactoryPage clickOnLoginLink(){

        clickOnMyAccount();

        TestBase.getInstance().waitUntilNextElementAppears(By.linkText("Login"),20);
        loginElement.click();
        return PageFactory.initElements(TestBase.getInstance().getDriver(),LoginFactoryPage.class);

    }

}
