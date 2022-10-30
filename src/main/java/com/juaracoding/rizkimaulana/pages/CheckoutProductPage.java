package com.juaracoding.rizkimaulana.pages;

import com.juaracoding.rizkimaulana.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutProductPage {

    private final WebDriver driver;

    public CheckoutProductPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

}
