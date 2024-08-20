package com.naveenautomationlabs.opencart.pages;

import org.openqa.selenium.WebDriver;
import com.naveenautomationlabs.opencart.utils.TestBase;

public class LoginSuccessPage {

    //initializing the web driver instance
    WebDriver driver = TestBase.getInstance().getDriver();

    public String getActualURL(){

      return   driver.getCurrentUrl();
    }
}
