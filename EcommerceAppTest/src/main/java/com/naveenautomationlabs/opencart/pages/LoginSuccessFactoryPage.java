package com.naveenautomationlabs.opencart.pages;

import com.naveenautomationlabs.opencart.utils.TestBase;
import org.openqa.selenium.WebDriver;

public class LoginSuccessFactoryPage {

    WebDriver driver = TestBase.getInstance().getDriver();

    public String getActualURL(){

        return  driver.getCurrentUrl();
    }
}
