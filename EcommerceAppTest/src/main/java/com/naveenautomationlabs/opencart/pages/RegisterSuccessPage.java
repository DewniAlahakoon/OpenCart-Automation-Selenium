package com.naveenautomationlabs.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.naveenautomationlabs.opencart.utils.TestBase;
import com.naveenautomationlabs.opencart.utils.PropertyFileReader;

public class RegisterSuccessPage {

    //initializing the web driver instance
    WebDriver driver = TestBase.getInstance().getDriver();

    //creating an object from PropertyFileReader class
    PropertyFileReader prop = new PropertyFileReader();

    //retrieving locator value of register success message
    String successMessageElement = prop.getProperty("RegisterSuccessPage","register.success.message.element");


    public String getSuccessMessage(){

        TestBase.getInstance().waitUntilNextElementAppears(By.xpath(successMessageElement),20);
        return driver.findElement(By.xpath(successMessageElement)).getText();
    }
}
