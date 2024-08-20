package com.naveenautomationlabs.opencart.pages;

import com.naveenautomationlabs.opencart.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegisterFactoryPage {
    
    //locating  web elements using FindBy annotation
    @FindBy(id = "input-firstname" )
    private WebElement firstNameElement;

    @FindBy(id = "input-lastname" )
    private WebElement lastNameElement;

    @FindBy(id = "input-email" )
    private WebElement emailElement;

    @FindBy(id = "input-telephone" )
    private WebElement telephoneElement;

    @FindBy(id = "input-password" )
    private WebElement passwordElement;

    @FindBy(id = "input-confirm" )
    private WebElement confirmPasswordElement;

    @FindBy(xpath = "//input[@value='0']" )
    private WebElement clickNoElement;

    @FindBy(xpath = "//input[@value='1']" )
    private WebElement clickYesElement;

    @FindBy(name = "agree" )
    private WebElement clickPolicyElement;

    @FindBy(xpath = "//input[@value='Continue']" )
    private WebElement continueButtonElement;


    public UserRegisterFactoryPage setFirstName(String firstName){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-firstname"),10);
        firstNameElement.sendKeys(firstName);
        return this;

    }
    public UserRegisterFactoryPage setLastName(String lastName){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-lastname"),10);
        lastNameElement.sendKeys(lastName);
        return this;

    }
    public UserRegisterFactoryPage setEmail(String email){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-email"),10);
        emailElement.sendKeys(email);
        return this;

    }
    public UserRegisterFactoryPage setTelephone(String telephone){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-telephone"),10);
       telephoneElement.sendKeys(telephone);
        return this;

    }
    public UserRegisterFactoryPage setPassword(String password){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-password"),10);
        passwordElement.sendKeys(password);
        return this;

    }
    public UserRegisterFactoryPage setConfirmPassword(String confirmPassword){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-confirm" ),10);
        confirmPasswordElement.sendKeys(confirmPassword);
        return this;

    }
    public UserRegisterFactoryPage clickNo(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath("//input[@value='0']"),10);
        clickNoElement.click();
        return this;

    }
    public UserRegisterFactoryPage clickYes(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath("//input[@value='1']"),10);
        clickYesElement.click();
        return this;

    }

    public UserRegisterFactoryPage checkOnPolicy(){

        TestBase.getInstance().waitUntilNextElementAppears(By.name("agree"),10);
        clickPolicyElement.click();
        return this;

    }
    public RegisterSuccessFactoryPage clickOnContinue(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath("//input[@value='Continue']"),10);
        continueButtonElement.click();
        return PageFactory.initElements(TestBase.getInstance().getDriver(),RegisterSuccessFactoryPage.class);

    }
}
