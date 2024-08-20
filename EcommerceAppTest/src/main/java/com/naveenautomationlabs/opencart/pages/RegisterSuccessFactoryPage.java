package com.naveenautomationlabs.opencart.pages;

import com.naveenautomationlabs.opencart.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterSuccessFactoryPage {

    //retrieving locator value of register success message
    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been success')]")
    private WebElement successMessageElement;

    public String getSuccessMessage(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]"),20);
        return successMessageElement.getText();
    }
}
