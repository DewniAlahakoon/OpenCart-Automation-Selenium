package com.naveenautomationlabs.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.naveenautomationlabs.opencart.utils.TestBase;
import com.naveenautomationlabs.opencart.utils.PropertyFileReader;

public class UserRegisterPage {

    //initializing the web driver instance
    WebDriver driver = TestBase.getInstance().getDriver();

    //creating an object from PropertyFileReader class
    PropertyFileReader prop = new PropertyFileReader();

    //accessing locator value of web elements
    String firstNameElement = prop.getProperty("RegisterPage","firstname.element");
    String lastNameElement = prop.getProperty("RegisterPage","lastname.element");
    String emailElement = prop.getProperty("RegisterPage","email.element");
    String telephoneElement = prop.getProperty("RegisterPage","telephone.element");
    String passwordElement = prop.getProperty("RegisterPage","password.element");
    String confirmPasswordElement = prop.getProperty("RegisterPage","confirm.password.element");
    String clickNoElement = prop.getProperty("RegisterPage","no.element");
    String clickYesElement = prop.getProperty("RegisterPage","yes.element");
    String clickPolicyElement = prop.getProperty("RegisterPage","policy.element");
    String continueButtonElement = prop.getProperty("RegisterPage","continue.button.element");


    public UserRegisterPage setFirstName(String firstName){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(firstNameElement),10);
        driver.findElement(By.id(firstNameElement)).sendKeys(firstName);
        return this;

    }
    public UserRegisterPage setLastName(String lastName){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(lastNameElement),10);
        driver.findElement(By.id(lastNameElement)).sendKeys(lastName);
        return this;

    }
    public UserRegisterPage setEmail(String email){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(emailElement),10);
        driver.findElement(By.id(emailElement)).sendKeys(email);
        return this;

    }
    public UserRegisterPage setTelephone(String telephone){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(telephoneElement),10);
        driver.findElement(By.id(telephoneElement)).sendKeys(telephone);
        return this;

    }
    public UserRegisterPage setPassword(String password){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(passwordElement),10);
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        return this;

    }
    public UserRegisterPage setConfirmPassword(String confirmPassword){

        TestBase.getInstance().waitUntilNextElementAppears(By.id(confirmPasswordElement),10);
        driver.findElement(By.id(confirmPasswordElement)).sendKeys(confirmPassword);
        return this;

    }
    public UserRegisterPage clickNo(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath(clickNoElement),10);
        driver.findElement(By.xpath(clickNoElement)).click();
        return this;

    }
    public UserRegisterPage clickYes(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath(clickYesElement),10);
        driver.findElement(By.xpath(clickYesElement)).click();
        return this;

    }

    public UserRegisterPage checkOnPolicy(){

        TestBase.getInstance().waitUntilNextElementAppears(By.name(clickPolicyElement),10);
        driver.findElement(By.name(clickPolicyElement)).click();
        return this;

    }
    public RegisterSuccessPage clickOnContinue(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath(continueButtonElement),10);
        driver.findElement(By.xpath(continueButtonElement)).click();
        return new RegisterSuccessPage();

    }
}
