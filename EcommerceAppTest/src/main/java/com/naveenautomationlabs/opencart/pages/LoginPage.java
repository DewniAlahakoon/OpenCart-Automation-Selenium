package com.naveenautomationlabs.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.naveenautomationlabs.opencart.utils.TestBase;
import com.naveenautomationlabs.opencart.utils.PropertyFileReader;

public class LoginPage {

    //initializing the web driver instance
    WebDriver driver = TestBase.getInstance().getDriver();

    //creating an object from PropertyFileReader class
    PropertyFileReader prop = new PropertyFileReader();

    //retrieving locator values of each web element
    String emailElement = prop.getProperty("LoginPage","email.element");
    String passwordElement = prop.getProperty("LoginPage","password.element");
    String loginElement = prop.getProperty("LoginPage","login.button.element");


    public LoginPage setUserName(String userName){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(emailElement),10);
        driver.findElement(By.id(emailElement)).sendKeys(userName);
        return this;

    }
    public LoginPage setPassword(String password){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(passwordElement),10);
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        return this;

    }
    public LoginSuccessPage clickOnLogin(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath(loginElement),10);
        driver.findElement(By.xpath(loginElement)).click();
        return new LoginSuccessPage();

    }
}
