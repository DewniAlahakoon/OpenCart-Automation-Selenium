package com.naveenautomationlabs.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.naveenautomationlabs.opencart.utils.TestBase;
import com.naveenautomationlabs.opencart.utils.PropertyFileReader;

public class HomePage {

    //initializing the web driver instance
    WebDriver driver = TestBase.getInstance().getDriver();

    //creating an object from PropertyFileReader class
    PropertyFileReader prop = new PropertyFileReader();

    //retrieving locator value of my account dropdown
    String accountElement = prop.getProperty("HomePage","account.element");

    //retrieving locator value of register  link
    String regLinkElement = prop.getProperty("HomePage","register.link.element");

    //retrieving locator value of login  link
    String loginElement = prop.getProperty("HomePage","login.link.element");

    public HomePage clickOnMyAccount(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath(accountElement),20);
        driver.findElement(By.xpath(accountElement)).click();
        return this;
    }

    public UserRegisterPage clickOnRegisterLink(){

        clickOnMyAccount();

        TestBase.getInstance().waitUntilNextElementAppears(By.linkText(regLinkElement),20);
        driver.findElement(By.linkText(regLinkElement)).click();
        return new UserRegisterPage();
    }

    public LoginPage clickOnLoginLink(){

        clickOnMyAccount();

        TestBase.getInstance().waitUntilNextElementAppears(By.linkText(loginElement),20);
        driver.findElement(By.linkText(loginElement)).click();
        return new LoginPage();

    }


}
