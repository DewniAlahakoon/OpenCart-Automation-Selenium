package com.naveenautomationlabs.opencart.pages;

import com.naveenautomationlabs.opencart.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactoryPage {

    //locating  web elements using FindBy annotation
    @FindBy(id = "input-email")
    private WebElement emailElement;

    @FindBy(id = "input-password")
    private WebElement passwordElement;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginElement;

    public LoginFactoryPage setUserName(String userName){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-email"),10);
        emailElement.sendKeys(userName);
        return this;

    }
    public LoginFactoryPage setPassword(String password){

        TestBase.getInstance().waitUntilNextElementAppears(By.id("input-password"),10);
        passwordElement.sendKeys(password);
        return this;

    }
    public LoginSuccessFactoryPage clickOnLogin(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath("//input[@value='Login']"),10);
        loginElement.click();
        return PageFactory.initElements(TestBase.getInstance().getDriver(),LoginSuccessFactoryPage.class);

    }
}
